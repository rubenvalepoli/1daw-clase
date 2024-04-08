package Ejercicios.Tema14.domaine.service;

import Ejercicios.Tema14_1.Exception.DomaineException;
import Ejercicios.Tema14.domaine.entity.Library;

import java.util.List;

public interface Service {
    public List<Library> findAll() throws DomaineException;

    public Library findbyId(Integer idBook) throws DomaineException;

    public void insert(Library newLibrary, Integer author) throws DomaineException;

    public void delete(Integer idAuthor) throws DomaineException;
}
