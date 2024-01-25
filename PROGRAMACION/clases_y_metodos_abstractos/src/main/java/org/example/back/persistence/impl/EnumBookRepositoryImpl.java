package org.example.back.persistence.impl;

import org.example.back.business.entity.Book;
import org.example.back.persistence.BookEnum;
import org.example.back.persistence.BookRepository;

import java.util.ArrayList;
import java.util.List;

public class EnumBookRepositoryImpl implements BookRepository {

    private static List<Book> bookList = new ArrayList<>();


    BookEnum bookEnum = new BookEnum();
    BookEnum book = new BookEnum(BookEnum.libro2);

//            EJERCICIO7 ENUM CREADO FALTA METERLO EN UNA LISTA Y MOSTRARLO DESDE LA OTRA CLASE





    public List<Book> all(){
        return null;
    }
}
