package com.fpmislata.estudiando.persistence.repository.impl;

import com.fpmislata.estudiando.domain.entity.Author;
import com.fpmislata.estudiando.domain.entity.Book;
import com.fpmislata.estudiando.persistence.dao.AuthorDao;
import com.fpmislata.estudiando.persistence.dao.BookDao;
import com.fpmislata.estudiando.persistence.dao.entity.AuthorEntity;
import com.fpmislata.estudiando.persistence.dao.entity.BookEntity;
import com.fpmislata.estudiando.persistence.dao.impl.AuthorDaoImpl;
import com.fpmislata.estudiando.persistence.dao.impl.BookDaoImpl;
import com.fpmislata.estudiando.persistence.repository.AuthorRepository;
import com.fpmislata.estudiando.persistence.repository.mapper.AuthorMapper;
import com.fpmislata.estudiando.persistence.repository.mapper.BookMapper;

import java.util.ArrayList;
import java.util.List;

public class AuthorRepositoryImpl implements AuthorRepository {

    private AuthorDao authorDao = new AuthorDaoImpl();



    @Override
    public List<Author> findAll() {
        List<AuthorEntity> authorEntityList = authorDao.findAll();
        List<Author> authorList = new ArrayList<>();
        for (AuthorEntity authorEntity : authorEntityList){
            Author author = AuthorMapper.toAuthor(authorEntity);
            authorList.add(author);
        }
        return authorList;
    }
}
