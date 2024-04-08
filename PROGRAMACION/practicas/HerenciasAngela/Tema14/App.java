package Ejercicios.Tema14;

import Ejercicios.Tema14_1.Exception.DomaineException;
import Ejercicios.Tema14.controller.MainController;
import Ejercicios.Tema14.domaine.entity.Author;
import Ejercicios.Tema14.domaine.entity.Book;
import Ejercicios.Tema14.domaine.entity.Library;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opt=-1;
        int id;
        MainController controller = new MainController();
        do {
        System.out.println("\nSelecciona una opcion:" +
                "\n1-Listado de todos los libros" +
                "\n2-Listado de todos los autores" +
                "\n3-Buscar un libro por su id" +
                "\n4-Buscar un libro por su id" +
                "\n5-Añadir un libro" +
                "\n6-Añadir un autor" +
                "\n7-Borrar un libro" +
                "\n8-Borrar un autor" +
                "\n9-Listado de libros pertenecientes a un autor" +
                "\n0-Salir");
        Scanner reader = new Scanner(System.in);
        try {
        opt = reader.nextInt();
            switch (opt) {
                case 0:
                    break;
                case 1:
                    List<Library> bookList = controller.findAllBook();
                    System.out.println("Listado de todos los libros: ");
                    for (Library book : bookList) {
                        System.out.println(book);
                    }
                    break;
                case 2:
                    List<Library> authorList = controller.findAllAuthor();
                    System.out.println("Listado de todos los autores");
                    for (Library author : authorList) {
                        System.out.println(author);
                    }
                    break;
                case 3:
                    System.out.print("Introduce el ID del libro que quieres buscar: ");
                    id = reader.nextInt();
                    System.out.println(controller.findbyIdBook(id));
                    break;
                case 4:
                    System.out.print("Introduce el ID del autor que quieres buscar: ");
                    id = reader.nextInt();
                    System.out.println(controller.findbyIdAuthor(id));
                    break;
                case 5:
                    System.out.println("Añade el titulo del libro: ");
                    String title = reader.next();
                    reader.next();
                    Book newbook = new Book(null, title, null);
                    System.out.print("Introduce el ID del autor: ");
                    id = reader.nextInt();
                    controller.addBook(newbook, id);
                    break;
                case 6:
                    System.out.println("Añade el nombre del autor: ");
                    String name = reader.next();
                    Library newAuthor = new Author(null, name);
                    System.out.print("Introduce el ID del autor: ");
                    id = reader.nextInt();
                    controller.addAuthor(newAuthor, id);
                    break;
                case 7:
                    System.out.println("Introduce el ID del autor que quieres eliminar");
                    id = reader.nextInt();
                    controller.deleteAuthor(id);
                    break;
                case 8:
                    System.out.println("Introduce el ID del libro que quieres eliminar");
                    id = reader.nextInt();
                    controller.deleteBook(id);
                    break;
                case 9:
                    System.out.println("Introduce el ID del autor que quieres buscar: ");
            }
        }catch(DomaineException e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("El valor intoducido no es valido");
        }
        }while(opt!=0);
    }
}
