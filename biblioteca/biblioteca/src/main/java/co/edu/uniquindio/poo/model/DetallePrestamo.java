package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class DetallePrestamo {
    private String subtotal;
    private String cantidad;
    private LinkedList <Libro> libroPrestamo;
    //Constructor
    public DetallePrestamo(String subtotal, String cantidad) {
        this.subtotal = subtotal;
        this.cantidad = cantidad;
        this.libroPrestamo = new LinkedList<Libro>();
    }
    
    /**
     * getters y setters
     * @return
     */
    public String getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }
    public String getCantidad() {
        return cantidad;
    }
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public LinkedList<Libro> getLibroPrestamo() {
        return libroPrestamo;
    }

    public void setLibroPrestamo(LinkedList<Libro> libroPrestamo) {
        this.libroPrestamo = libroPrestamo;
    }

    
    

}
