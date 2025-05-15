package org.example.model;

public class Autores {
     private int autorId;
     private String nombre;
     private String apellido;
     private String nacionalidad;

     public Autores() {
     }

     public Autores(String apellido, int autorId, String nacionalidad, String nombre) {
          this.apellido = apellido;
          this.autorId = autorId;
          this.nacionalidad = nacionalidad;
          this.nombre = nombre;
     }

     public Autores(String nombre, String apellido, String nacionalidad, int autorId) {
     }

     public String getApellido() {
          return apellido;
     }

     public void setApellido(String apellido) {
          this.apellido = apellido;
     }

     public int getAutorId() {
          return autorId;
     }

     public void setAutorId(int autorId) {
          this.autorId = autorId;
     }

     public String getNacionalidad() {
          return nacionalidad;
     }

     public void setNacionalidad(String nacionalidad) {
          this.nacionalidad = nacionalidad;
     }

     public String getNombre() {
          return nombre;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     @Override
     public String toString() {
          return "Autores{" +
                  "apellido='" + apellido + '\'' +
                  ", autorId=" + autorId +
                  ", nombre='" + nombre + '\'' +
                  ", nacionalidad='" + nacionalidad + '\'' +
                  '}';
     }


}
