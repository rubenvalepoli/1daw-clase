package ejercicios.tema09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Product> productList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        initialize();
        //showProducts(1);


        System.out.println("1- Mostrar todo");
        System.out.println("2- Mostrar ropa");
        System.out.println("3- Mostrar libros");
        System.out.println("4- Mostrar ordenadores");
        System.out.println("Elije una opcion:");
        int option = scanner.nextInt();
        showProducts(option);




        // ENUMS

        HD hd1 =new HD(HDType.SDD_25,20);

        System.out.println(hd1);

        CPU cpu1 = new CPU(CPUType.CORE_I7_12700KF);

        System.out.println(cpu1);





    }

    private static void initialize(){
        Clothes clothes1 = new Clothes(1234,20,"camiseta","xxl","red");
        Clothes clothes2 = new Clothes(4567,50,"pantalon","xs","negro");
        Books books1 = new Books(7891,35,"Pepe","El amor");
        Books books2 = new Books(1122,10,"Antonio","Patomima");
        Computer computer1 = new Computer(2233,500,"memoria 100","4gb","100g");

        productList.add(clothes1);
        productList.add(clothes2);
        productList.add(books1);
        productList.add(books2);
        productList.add(computer1);
    }

    public static void showProducts(int option) {
        for (Product product: productList) {
            if(option == 1) {
                System.out.println(product);
            }
            else if(option == 2 && product.getClass().equals(Clothes.class)) {
                System.out.println(product);
            } else if(option == 3 && product.getClass().equals(Books.class)) {
                System.out.println(product);
            } else if(option == 4 && product.getClass().equals(Computer.class)) {
                System.out.println(product);
            }
        }
    }



}
