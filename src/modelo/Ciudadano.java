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
public class Ciudadano extends Usuario{
    private Incidente incidente;
    
    public Ciudadano(String nombre, String apellido, long numeroCedula, long numTelefono, String correoElectronico, String contraseña, long id) {
        super(nombre, apellido, numeroCedula, numTelefono, correoElectronico, contraseña, id);
    }
    
}
