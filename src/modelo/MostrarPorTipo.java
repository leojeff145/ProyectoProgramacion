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
public class MostrarPorTipo implements MostrarIncidentes{

    @Override
    public void mostarInformacion() {
        
    }

    @Override
    public void mostarInformacion2(String valor) {
        Incidente aux = new Incidente();               
        int i=0;
        Iterator it = HistorialDeIncidentes.getInsatance().getListIncidentes().iterator();
        while(it.hasNext()){
            aux= (Incidente)it.next();
            if(HistorialDeIncidentes.getInsatance().getListIncidentes().get(i).incidente.equalsIgnoreCase(valor)){
                System.out.println(HistorialDeIncidentes.getInsatance().getListIncidentes().get(i).incidente);
                
            }
        }
    }
    
    
}
