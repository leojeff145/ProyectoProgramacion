/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Comparator;

/**
 *
 * @author Leonardo Obando
 */
public class CompararIncidentes implements Comparator <Incidente>{

    @Override
    public int compare(Incidente t, Incidente t1) {
        return t.incidente.compareToIgnoreCase(t1.incidente);
    }
    
}
