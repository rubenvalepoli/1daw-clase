package Ejercicios.Tema14.persistence.impl;

import Ejercicios.Tema14.domaine.entity.Author;
import Ejercicios.Tema14.domaine.entity.Library;
import Ejercicios.Tema14.persistence.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AuthorRepositoryImpl implements Repository{
    List<Library> authorList = new ArrayList<>(Arrays.asList(
            new Author(1,"Umberto Eco"),
            new Author(2,"J.R.R. Tolkien"),
            new Author(3,"Isaac Asimov"),
            new Author(4,"Alejandro Dumas")));

    @Override
    public List<Library> findAll() {
        return authorList;
    }

    @Override
    public Library findbyId(Integer idAuthor){
        for (Library author:authorList){
            if (author.getId() == idAuthor){
                return author;
            }
        }
        return null;
    }

    @Override
    public void insert(Library newAuthor, Integer author){
        newAuthor.setId(author);
        authorList.add(newAuthor);
    }

    @Override
    public void delete(Integer idAuthor) {
        Library book = findbyId(idAuthor);
        authorList.remove(book);
    }
}
