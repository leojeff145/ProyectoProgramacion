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
