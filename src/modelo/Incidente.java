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
    protected String incidente;
    protected String callePri;    
    protected String calleSec;
    protected String barrio;
    protected String descripcionIncidente;
    protected Date fechaIncidente;
    
    //Constructores
    
    public Incidente(String incidente, String callePri, String calleSec, String barrio, String descripcionIncidente) {
        this.incidente = "Prueba";
        this.callePri = callePri;
        this.calleSec = calleSec;
        this.barrio = barrio;
        this.descripcionIncidente = descripcionIncidente;
//        try {
//            SimpleDateFormat formato= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//            this.fechaIncidente = formato.parse("");            
//        } catch (ParseException ex) {
//            Logger.getLogger(Incidente.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    public Incidente() {
    }
    
    
    //Getters and Stters

    public String getIncidente() {
        return incidente;
    }

    public void setIncidente(String incidente) {
        this.incidente = incidente;
    }
    

    public String getCallePri() {
        return callePri;
    }

    public String getCalleSec() {
        return calleSec;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getDescripcionIncidente() {
        return descripcionIncidente;
    }

    public Date getFechaIncidente() {
        return fechaIncidente;
    }

    public void setCallePri(String callePri) {
        this.callePri = callePri;
    }

    public void setCalleSec(String calleSec) {
        this.calleSec = calleSec;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void setDescripcionIncidente(String descripcionIncidente) {
        this.descripcionIncidente = descripcionIncidente;
    }

    public void setFechaIncidente(Date fechaIncidente) {
        this.fechaIncidente = fechaIncidente;
    }      
    
    //funciones   

    @Override
    public String toString() {
        return "Incidente{" + "incidente=" + incidente + ", callePri=" + callePri + ", calleSec=" + calleSec + ", barrio=" + barrio + ", descripcionIncidente=" + descripcionIncidente + ", fechaIncidente=" + fechaIncidente + '}';
    }
    
        
}
