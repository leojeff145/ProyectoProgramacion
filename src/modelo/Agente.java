/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Collections;



/**
 *
 * @author Leonardo Obando
 */
public class Agente extends Usuario{ 
    private long id;    

    public Agente(long id, String nombre, String apellido, String correoElectronico, String contraseña) {
        super(nombre, apellido, correoElectronico, contraseña);
        this.id = id;
    }
    
    public Agente() {
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
    
    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }    
       
    
    public void eliminarIncidente(Incidente i){
        HistorialDeIncidentes.getInsatance().eliminarIncidente(i);
    }
    
    public void ordenarIncidente(){
        Collections.sort(HistorialDeIncidentes.getInsatance().getListIncidentes(),new CompararIncidentes());
    }   
    
    
}
