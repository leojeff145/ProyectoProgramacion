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

    public Usuario(String nombre, String apellido, long numeroCedula, long numTelefono, String correoElectronico, String contraseña, long id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCedula = numeroCedula;
        this.numTelefono = numTelefono;
        this.correoElectronico = correoElectronico;
        this.contraseña = contraseña;
        this.id = id;
    }
    
    
}
