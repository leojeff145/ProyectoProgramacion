/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leonardo Obando
 */
public class Incidente {
    protected String callePri;    
    protected String calleSec;
    protected String barrio;
    protected String descripcionIncidente;
    protected Date fechaIncidente;

    public Incidente(String callePri, String calleSec, String barrio, String descripcionIncidente, String fecha) {
        this.callePri = callePri;
        this.calleSec = calleSec;
        this.barrio = barrio;
        this.descripcionIncidente = descripcionIncidente;
        try {
            SimpleDateFormat formato= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            this.fechaIncidente = formato.parse(fecha);            
        } catch (ParseException ex) {
            Logger.getLogger(Incidente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        
}
