/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Iterator;

/**
 *
 * @author Leonardo Obando
 */
public class MostrarDetalleGeneral implements MostrarIncidentes{
    
    

    @Override
    public void mostarInformacion() {
        Incidente aux = new Incidente();        
        Iterator it = HistorialDeIncidentes.getInsatance().getListIncidentes().iterator();
        while(it.hasNext()){
            aux= (Incidente)it.next();
            System.out.println(aux.toString());
        }   
        
        
    }

    @Override
    public void mostarInformacion2(String valor) {        
    }
    
    
}
