package main.java.com.app.cliente;

import java.util.ArrayList;

import main.java.com.app.libro.Libro;

public class Cliente {
    /*
     * agregar los atributos privados nombre, documento y un ArrayList lista_De_Libros_Comprados
     * agregar los respectivos get, set y el constructor
     * agregar un metodo mostrarCliente
     */
    private String nombre;
    private String documento;
    private ArrayList < Libro > librosComprados;

    public Cliente(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
        this.librosComprados = new ArrayList<   Libro   >();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDocumento() {
        return documento;
    }

    public void addLibrosComprados (Libro libro){
        this.librosComprados.add(libro);

    }
    
    public void mostrarCliente() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Documento: " + documento);
        
        // validar si la lista de libros comprados no esta vacia
        if (this.librosComprados.size() > 0) {
            System.out.println("Libros Comprados: ");
            for (Libro libro : librosComprados) {
                libro.mostrarLibro();
            }
        } else {
            System.out.println("Este cliente aun no hizo una compra.");
        }

    }
}
