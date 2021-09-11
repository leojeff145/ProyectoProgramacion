/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Leonardo Obando
 */
public class HistorialDeIncidentes {
    private static HistorialDeIncidentes historialInciden= new HistorialDeIncidentes();  
    private ArrayList <Incidente> listIncidentes = new ArrayList();

    private HistorialDeIncidentes() {
    }
    
    public static HistorialDeIncidentes getInsatance(){
        return historialInciden;
    }
    
    public void adicionarIncidente(Incidente i){
        listIncidentes.add(i);
    }
    
    public void eliminarIncidente(Incidente i){
        listIncidentes.remove(i);
    }
    
    
    

    
    
    
    
}
