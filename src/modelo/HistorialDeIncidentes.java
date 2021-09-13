/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Leonardo Obando
 */
public class HistorialDeIncidentes {
    private static HistorialDeIncidentes historialInciden= new HistorialDeIncidentes();  
    private ArrayList <Incidente> listIncidentes = new ArrayList();

    private HistorialDeIncidentes() {
    }

    public ArrayList<Incidente> getListIncidentes() {
        return listIncidentes;
    }

    public void setListIncidentes(ArrayList<Incidente> listIncidentes) {
        this.listIncidentes = listIncidentes;
    }    
    
    public static HistorialDeIncidentes getInsatance(){
        return historialInciden;
    }
    
    public void adicionarIncidente(Incidente i){
        listIncidentes.add(i);
    }
    
    public void eliminarIncidente(int i){
        listIncidentes.remove(i);
    } 
    
        
    
    
    
}
