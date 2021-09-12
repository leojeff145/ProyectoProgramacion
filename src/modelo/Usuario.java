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
    protected long numeroCedula;
    protected long numTelefono;
    protected String correoElectronico;
    protected String contraseña;
    protected long id;
    protected HistorialDeIncidentes historial;

    public Usuario(String nombre, String apellido, long numeroCedula, long numTelefono, String correoElectronico, String contraseña, long id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCedula = numeroCedula;
        this.numTelefono = numTelefono;
        this.correoElectronico = correoElectronico;
        this.contraseña = contraseña;
        this.id = id;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public long getNumeroCedula() {
        return numeroCedula;
    }

    public long getNumTelefono() {
        return numTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getContraseña() {
        return contraseña;
    }

    public long getId() {
        return id;
    }

    public HistorialDeIncidentes getHistorial() {
        return historial;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumeroCedula(long numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public void setNumTelefono(long numTelefono) {
        this.numTelefono = numTelefono;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setHistorial(HistorialDeIncidentes historial) {
        this.historial = historial;
    }
    
    
    
}
