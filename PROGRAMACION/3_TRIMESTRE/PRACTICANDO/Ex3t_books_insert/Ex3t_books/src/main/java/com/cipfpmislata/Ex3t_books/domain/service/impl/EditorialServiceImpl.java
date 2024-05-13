package com.cipfpmislata.Ex3t_books.domain.service.impl;

import com.cipfpmislata.Ex3t_books.domain.entity.Editorial;
import com.cipfpmislata.Ex3t_books.domain.service.EditorialService;
import com.cipfpmislata.Ex3t_books.persistence.repository.EditorialRepository;

import java.util.List;

public class EditorialServiceImpl implements EditorialService {
    EditorialRepository editorialRepository;

    public EditorialServiceImpl(EditorialRepository editorialRepository) {
        this.editorialRepository = editorialRepository;
    }

    @Override
    public Editorial findById(Integer id) {
        Editorial editorial = editorialRepository.findById(id);
        if (editorial == null) {
            throw new RuntimeException("No existe la editorial");
        }
        return editorial;
    }

    @Override
    public List<Editorial> findAll() {
        return editorialRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        editorialRepository.delete(id);
    }

    @Override
    public void insert(Editorial editorial) {
        editorialRepository.insert(editorial);
    }
}
