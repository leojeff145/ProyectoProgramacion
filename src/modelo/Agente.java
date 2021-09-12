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
    
    
    public Agente(String nombre, String apellido, long numeroCedula, long numTelefono, String correoElectronico, String contraseña, long id) {
        super(nombre, apellido, numeroCedula, numTelefono, correoElectronico, contraseña, id);
    }
    
    public void eliminarIncidente(Incidente i){
        HistorialDeIncidentes.getInsatance().eliminarIncidente(i);
    }
    
    public void ordenarIncidente(){
        Collections.sort(HistorialDeIncidentes.getInsatance().getListIncidentes(),new CompararIncidentes());
    }
    
    
     

    

    
    
    
    
}
