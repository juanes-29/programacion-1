package co.edu.uniquindio.poo.model;

import java.util.HashMap;
import java.util.LinkedList;

public class Biblioteca {
    private String nombre;
    private LinkedList<Bibliotecario> listaBibliotecario;
    private HashMap<String, Estudiante> listaEstudiante;
    private LinkedList<Libro> listaLibros;
    private HashMap<String, Prestamo> listaPrestamos;
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.listaBibliotecario = new LinkedList<Bibliotecario>();
        this.listaEstudiante = new HashMap<String, Estudiante>();
        this.listaLibros = new LinkedList<Libro>();
        this.listaPrestamos = new HashMap<String, Prestamo>();
    }

    public String añadirLibro(Libro libro){
        String mensaje = "No se ha encontrado el libro";
        if(!listaLibros.contains(libro)){
            listaLibros.add(libro);
            mensaje = "El libro se ha añadido correctamente";
        }
        return mensaje;
    }

    public String eliminarLibro(Libro libro){
        String mensaje = "No se ha encontrado el libro";
        if(!listaLibros.contains(libro)){
            listaLibros.remove(libro);
            mensaje = "El libro se ha eliminado correctamente";
        }
        return mensaje;
    }

    public Libro buscarLibro(Libro libro){
        for (int i = 0; i < listaLibros.size(); i++) {
            if(listaLibros.get(i).equals(libro)){
                return libro;
            }
        }
        return null;    
    }

    public String eliminarLibro(Libro libro, Libro libroNuevo){
        String mensaje ="No se encontró el libro";
        if(buscarLibro(libro)!= null){
            listaLibros.set(listaLibros.indexOf(libro),libroNuevo);
            mensaje = "El libro ha sido editado";
        }
        return mensaje;
    }

    public String añadirBibliotecrio(Bibliotecario bibliotecario) {
        String mensaje = "Bibliotecario ya existe";
        if (!listaBibliotecario.contains(bibliotecario)) {
            listaBibliotecario.add(bibliotecario);
            mensaje = "Bibliotecario añadido correctamente";
        }
        return mensaje;
    }

    public String eliminarBibliotecrio(Bibliotecario bibliotecario) {
        String mensaje = "Bibliotecario no existe";
        if (listaBibliotecario.contains(bibliotecario)) {
            listaBibliotecario.remove(bibliotecario);
            mensaje = "Bibliotecario eliminado correctamente";
        }

        return mensaje;
    }

    public Bibliotecario buscarBibliotecario(Bibliotecario bibliotecario) {
        for (int i = 0; i < listaBibliotecario.size(); i++) {
            if (listaBibliotecario.get(i).equals(bibliotecario)) {
                return bibliotecario;
            }
        }
        return null;
    }

    public String editarBibliotecario(Bibliotecario bibliotecario, Bibliotecario bibliotecarioNuevo) {
        String mensaje = "No se encontró el elemento";
        if (buscarBibliotecario(bibliotecario) != null) {
            listaBibliotecario.set(listaBibliotecario.indexOf(bibliotecario), bibliotecarioNuevo);
        }
        return mensaje;
    }

    public String añadirEstudiante(Estudiante estudiante) {
        String mensaje = "Estudiante ya existe";
        if (listaEstudiante.containsValue(estudiante) == false) {
            listaEstudiante.put(estudiante.getId(), estudiante);
            mensaje = "Estudiante añadido exitosamente";
        }

        return mensaje;
    }

    public String eliminarEstudiante(String id) {
        String mensaje = "Estudiante no existe";
        if (listaEstudiante.get(id) != null) {
            listaEstudiante.remove(id);
            mensaje = "Estudiante eliminado correctamente";
        }

        return mensaje;
    }

    public Estudiante buscarEstudianteId(String id) {
        return listaEstudiante.get(id);
    }

    public String editarEstudiante(String id, Estudiante estudianteNuevo) {
        String mensaje = "No se encontró";
        if (buscarEstudianteId(id) != null) {
            listaEstudiante.put(id, estudianteNuevo);
            mensaje = "Elemento editado correctamente";
        }
        return mensaje;
    }

    public String añadirPrestamo(Prestamo prestamo) {
        String mensaje = "Prestamo ya existe";
        if (!listaPrestamos.containsValue(prestamo)) {
            listaPrestamos.put(prestamo.getCodigo(), prestamo);
            mensaje = "Prestamo añadido exitosamente";
        }

        return mensaje;
    }

    public String eliminarPrestamo(String codigo) {
        String mensaje = "Prestamo no existe";
        if (listaPrestamos.get(codigo) == null) {
            listaPrestamos.remove(codigo);
            mensaje = "Prestamo eliminado correctamente";
        }

        return mensaje;
    }

    public Prestamo buscarPrestamoCodigo(String codigo) {
        return listaPrestamos.get(codigo);
    }

    public String editarPrestamo(String codigo, Prestamo prestamoNuevo) {
        String mensaje = "No se encontró";
        if (buscarEstudianteId(codigo) != null) {
            listaPrestamos.put(codigo, prestamoNuevo);
            mensaje = "Elemento editado correctamente";
        }
        return mensaje;
    }

    

    /**
     * setters and getters
     * @return
     */
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LinkedList<Bibliotecario> getListaBibliotecario() {
        return listaBibliotecario;
    }
    public void setListaBibliotecario(LinkedList<Bibliotecario> listaBibliotecario) {
        this.listaBibliotecario = listaBibliotecario;
    }
    public HashMap<String, Estudiante> getListaEstudiante() {
        return listaEstudiante;
    }
    public void setListaEstudiante(HashMap<String, Estudiante> listaEstudiante) {
        this.listaEstudiante = listaEstudiante;
    }
    public LinkedList<Libro> getListaLibros() {
        return listaLibros;
    }
    public void setListaLibros(LinkedList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }
    public HashMap<String, Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }
    public void setListaPrestamos(HashMap<String, Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    

    
    
}
