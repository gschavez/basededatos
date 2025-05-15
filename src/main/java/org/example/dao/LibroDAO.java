package org.example.dao;

import org.example.model.Libros;

import java.util.List;

public interface LibroDAO {
    void insertar(Libros libro);
    List<Libros> listarTodos();

    List<Libros> obtenerTodos();
}
