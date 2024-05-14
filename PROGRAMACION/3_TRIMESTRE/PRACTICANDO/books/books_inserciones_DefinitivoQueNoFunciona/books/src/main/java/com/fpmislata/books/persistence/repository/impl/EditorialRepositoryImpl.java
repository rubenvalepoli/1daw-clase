package com.fpmislata.books.persistence.repository.impl;

import com.fpmislata.books.domain.entity.Book;
import com.fpmislata.books.domain.entity.Editorial;
import com.fpmislata.books.persistence.Dao.EditorialDao;
import com.fpmislata.books.persistence.repository.EditorialRepository;

import java.util.List;

public class EditorialRepositoryImpl implements EditorialRepository {

    EditorialDao editorialDao;

    public EditorialRepositoryImpl(EditorialDao editorialDao) {
        this.editorialDao = editorialDao;
    }

    @Override
    public List<Editorial> findAll(){
        List<Editorial> editorialList = editorialDao.findAll();
        return editorialList;
    }

    @Override
    public void insert(Editorial editorial){
        editorialDao.insert(editorial);
    }

    @Override
    public Editorial findEditorialByName (String name){
        return editorialDao.findEditorialByName(name);
    }
}
