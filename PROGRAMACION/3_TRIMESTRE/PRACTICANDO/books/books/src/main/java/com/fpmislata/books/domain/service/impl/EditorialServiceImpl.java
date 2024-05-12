package com.fpmislata.books.domain.service.impl;

import com.fpmislata.books.domain.entity.Book;
import com.fpmislata.books.domain.entity.Editorial;
import com.fpmislata.books.domain.service.EditorialService;
import com.fpmislata.books.persistence.repository.EditorialRepository;

import java.util.List;

public class EditorialServiceImpl implements EditorialService {
    EditorialRepository editorialRepository;

    public EditorialServiceImpl(EditorialRepository editorialRepository) {
        this.editorialRepository = editorialRepository;
    }

    @Override
    public List<Editorial> findAll() {
        return editorialRepository.findAll();
    }

    @Override
    public void insert(Editorial editorial){
        editorialRepository.insert(editorial);
    }
}
