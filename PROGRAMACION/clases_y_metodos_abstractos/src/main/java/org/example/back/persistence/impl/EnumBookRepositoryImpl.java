package org.example.back.persistence.impl;

import org.example.back.business.entity.Book;
import org.example.back.persistence.BookEnum;
import org.example.back.persistence.BookRepository;

import java.util.List;

public class EnumBookRepositoryImpl implements BookRepository {

    BookEnum book;
    List<Book> booken = List.of(
            new Book(BookEnum.libro1),
            new Book(BookEnum.)
//            EJERCICIO7 ENUM CREADO FALTA METERLO EN UNA LISTA Y MOSTRARLO DESDE LA OTRA CLASE
    );


    public List<Book> all(){
        return null;
    }
}
