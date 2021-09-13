/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Leonardo Obando
 */
public class Usuario {
    protected String nombre;
    protected String apellido;    
    protected String correoElectronico;
    protected String contraseña;      

    public Usuario(String nombre, String apellido, String correoElectronico, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.contraseña = contraseña;
    }   

    

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }    

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getContraseña() {
        return contraseña;
    }   

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }    

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }    

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", correoElectronico=" + correoElectronico + ", contrase\u00f1a=" + contraseña + '}';
    }
    
    
    
    
}
