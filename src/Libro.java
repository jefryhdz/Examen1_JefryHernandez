/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jefry Hernandez
 */
public class Libro {
    private String titulo;
    private String descripcion;
    private String genero;
    private int puntaje;
    private String fecha;
    private int valor;
    private String edicion;
    private String autor;

    public Libro(String titulo, String descripcion, String genero, int puntaje, String fecha, int valor, String edicion, String autor) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.genero = genero;
        this.puntaje = puntaje;
        this.fecha = fecha;
        this.valor = valor;
        this.edicion = edicion;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return titulo + " Autor:" + autor  +"\n" + descripcion + "\n genero " + genero + "\n puntaje " + puntaje + "\n fecha de publicacion \n" + fecha + "\n valor " + valor + "n edicion Nº " + edicion ;
    }
    
    
}
