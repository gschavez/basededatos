package org.example.dao;

import org.example.model.Autores;

import java.util.List;

public interface AutorDAO {
    void agregarAutor(Autores autor);
    List<Autores> obtenerTodos();
    }


