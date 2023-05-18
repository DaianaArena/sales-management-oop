package main.java.com.app.autor;

import java.util.ArrayList;

import main.java.com.app.libro.Libro;

public class Autor {
    
    private String nombre;
    private String fechaNacimiento;
    private ArrayList < Libro > librosEscritos;
  

    public Autor(String nombre, String fechaNacimiento ) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.librosEscritos = new ArrayList<    Libro   >();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void addLibro (Libro libro){
        this.librosEscritos.add(libro);

    }
   

    public void mostrarAutor() {
        System.out.println("Nombre: " + nombre + "\nFecha de nacimiento: " + fechaNacimiento );

        /*
        // validar si la lista de libros comprados no esta vacia
        if (this.librosEscritos.size() > 0) {
            System.out.println("Libros Escritos: ");
            for (Libro libro : librosEscritos) {
                libro.mostrarLibro();
            }
        } else {
            System.out.println("Este Autor no tiene agregado ningun libro en el sistema.");
        }
        */
    }

    public void mostrarLibros(){
        if (this.librosEscritos.size() > 0) {
            System.out.println("Libros Escritos por "+ nombre + ":");
            for (Libro libro : librosEscritos) {
                libro.mostrarLibro();
            }
        } else {
            System.out.println("Este Autor no tiene agregado ningun libro en el sistema.");
        }
    }

}
