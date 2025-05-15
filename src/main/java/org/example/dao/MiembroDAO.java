package org.example.dao;

import org.example.model.Miembros;

import java.util.List;

public interface MiembroDAO {
    void insertar(Miembros miembro);
    List<Miembros> obtenerTodos();

}
