package com.cipfpmislata.Ex3t_books.persistence.repository.impl;

import com.cipfpmislata.Ex3t_books.domain.entity.Editorial;
import com.cipfpmislata.Ex3t_books.persistence.repository.EditorialRepository;
import com.cipfpmislata.Ex3t_books.persistence.dao.EditorialDao;

import java.util.List;

public class EditorialRepositoryImpl implements EditorialRepository {
    EditorialDao editorialDao;

    public EditorialRepositoryImpl(EditorialDao editorialDao) {
        this.editorialDao = editorialDao;
    }

    @Override
    public Editorial findById(Integer id) {
        return editorialDao.findById(id);
    }

    @Override
    public List<Editorial> findAll() {
        return editorialDao.findAll();
    }

    @Override
    public void delete(Integer id) {
        editorialDao.delete(id);
    }

    @Override
    public void insert(Editorial editorial) {
        editorialDao.insert(editorial);
    }
}
