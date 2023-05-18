package main.java.com.app.venta;

import java.util.ArrayList;

import main.java.com.app.cliente.Cliente;
import main.java.com.app.libro.Libro;

public class Venta {
    /*
     * crear atributos privados: cliente, fecha, monto, librosComprados
     * crear atributos set y get
     * constructor
     * mostrar venta
     */

     private String fecha;
     private Cliente cliente;
     private double monto;
     private ArrayList < Libro > librosVendidos;
 
     
     public Venta(String fecha, Cliente cliente, ArrayList < Libro > librosVendidos) {
         this.fecha = fecha;
         this.cliente = cliente;
         this.librosVendidos = librosVendidos;
         double total = 0;
         for (Libro libro : librosVendidos) {
            total += libro.getPrecio();
         }
         this.monto = total;
     }

     public Cliente getCliente() {
         return cliente;
     }

     public void setFecha(String fecha) {
         this.fecha = fecha;
     }

     public String getFecha() {
         return fecha;
     }

     public void setMonto(double monto) {
         this.monto = monto;
     }

     public double getMonto() {
         return monto;
     }

     public void mostrarVenta() {{
        System.out.println("Fecha: " + fecha);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Monto: " + monto);
        System.out.println("Libros vendidos: ");
        for (Libro libro : librosVendidos) {
            System.out.println(libro.getTitulo());
        }
     }}
}
