
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jefry Hernandez
 */
public class Usuario {

    private String usuario;
    private String contrase;
    private String fecha;
    private String numero;
    private String email;
    private String nombre;
    private String genero;

    public Usuario(String usuario, String contrase, String fecha, String numero, String email, String nombre, String genero) {
        this.usuario = usuario;
        this.contrase = contrase;
        this.fecha = fecha;
        this.numero = numero;
        this.email = email;
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrase() {
        return contrase;
    }

    public void setContrase(String contrase) {
        this.contrase = contrase;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", contrase=" + contrase + ", fecha=" + fecha + ", numero=" + numero + ", email=" + email + ", nombre=" + nombre + ", genero=" + genero + '}';
    }
    
}
