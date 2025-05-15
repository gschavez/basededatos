package org.example.model;

import java.util.Date;

public class Prestamos {
    private int prestamosId;
    private int libroId;
    private int miembroId;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    public Prestamos (int prestamoId, int libroId, int miembroId, java.sql.Date fechaPrestamo, java.sql.Date fechaDevolucion){
    }

    public Prestamos(Date fechaDevolucion, Date fechaPrestamo, int libroId, int miembroId, int prestamosId) {
        this.fechaDevolucion = fechaDevolucion;
        this.fechaPrestamo = fechaPrestamo;
        this.libroId = libroId;
        this.miembroId = miembroId;
        this.prestamosId = prestamosId;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public int getLibroId() {
        return libroId;
    }

    public void setLibroId(int libroId) {
        this.libroId = libroId;
    }

    public int getMiembroId() {
        return miembroId;
    }

    public void setMiembroId(int miembroId) {
        this.miembroId = miembroId;
    }

    public int getPrestamosId() {
        return prestamosId;
    }

    public void setPrestamosId(int prestamosId) {
        this.prestamosId = prestamosId;
    }

    @Override
    public String toString() {
        return "Prestamos{" +
                "fechaDevolucion=" + fechaDevolucion +
                ", prestamosId=" + prestamosId +
                ", libroId=" + libroId +
                ", miembroId=" + miembroId +
                ", fechaPrestamo=" + fechaPrestamo +
                '}';
    }
}
