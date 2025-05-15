package org.example.dao;

import org.example.model.Prestamos;

import java.util.List;

public interface PrestamoDAO {
    void insertar(Prestamos prestamo);
    List<Prestamos> obtenerTodos();

}
