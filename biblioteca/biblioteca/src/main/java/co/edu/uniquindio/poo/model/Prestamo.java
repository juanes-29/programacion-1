package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedList;

public class Prestamo {
    private LocalDate fechaPrestamo;
    private LocalDate fechaEntrega;
    private String codigo;
    private double total;
    private HashMap<String, DetallePrestamo> listaDetallePrestamos;
    private LinkedList<Bibliotecario> bibliotecarioPrestamo;
    private LinkedList<Estudiante> estudiantePrestamo;
    public Prestamo(LocalDate fechaPrestamo, LocalDate fechaEntrega, String codigo, double total) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.codigo = codigo;
        this.total = total;
        this.listaDetallePrestamos = new HashMap< String, DetallePrestamo>();
        this.bibliotecarioPrestamo = new LinkedList<Bibliotecario>();
        this.estudiantePrestamo = new LinkedList<Estudiante>();
    }
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }
    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }
    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public HashMap<String, DetallePrestamo> getListaDetallePrestamos() {
        return listaDetallePrestamos;
    }
    public void setListaDetallePrestamos(HashMap<String, DetallePrestamo> listaDetallePrestamos) {
        this.listaDetallePrestamos = listaDetallePrestamos;
    }
    public LinkedList<Bibliotecario> getBibliotecarioPrestamo() {
        return bibliotecarioPrestamo;
    }
    public void setBibliotecarioPrestamo(LinkedList<Bibliotecario> bibliotecarioPrestamo) {
        this.bibliotecarioPrestamo = bibliotecarioPrestamo;
    }
    public LinkedList<Estudiante> getEstudiantePrestamo() {
        return estudiantePrestamo;
    }
    public void setEstudiantePrestamo(LinkedList<Estudiante> estudiantePrestamo) {
        this.estudiantePrestamo = estudiantePrestamo;
    }

    

    



}
