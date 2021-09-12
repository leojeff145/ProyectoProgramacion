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
public class Ciudadano extends Usuario{
    private ArrayList <Incidente> listIncidente= new ArrayList();
    
    public Ciudadano(String nombre, String apellido, long numeroCedula, long numTelefono, String correoElectronico, String contraseña, long id) {
        super(nombre, apellido, numeroCedula, numTelefono, correoElectronico, contraseña, id);        
    }
    
    
    public void adicionarIncidente(Incidente i){
        listIncidente.add(i);
        HistorialDeIncidentes.getInsatance().adicionarIncidente(i);
    }
    
    public void eliminarIncidente(Incidente i){
        listIncidente.remove(i);
    }
    
    public int numeroIncidentes(){
        return listIncidente.size();
    }
    
   
}
