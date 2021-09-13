/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
    protected String fechaIncidente;
    
    //Constructores

    public Incidente(String incidente, String callePri, String calleSec, String barrio, String descripcionIncidente, String fechaIncidente) {
        this.incidente = incidente;
        this.callePri = callePri;
        this.calleSec = calleSec;
        this.barrio = barrio;
        this.descripcionIncidente = descripcionIncidente;
        this.fechaIncidente = fechaIncidente;
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

    public void setCallePri(String callePri) {
        this.callePri = callePri;
    }

    public String getCalleSec() {
        return calleSec;
    }

    public void setCalleSec(String calleSec) {
        this.calleSec = calleSec;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDescripcionIncidente() {
        return descripcionIncidente;
    }

    public void setDescripcionIncidente(String descripcionIncidente) {
        this.descripcionIncidente = descripcionIncidente;
    }

    public String getFechaIncidente() {
        return fechaIncidente;
    }

    public void setFechaIncidente(String fechaIncidente) {
        this.fechaIncidente = fechaIncidente;
    }

         
    
    //funciones   

    @Override
    public String toString() {
        return "Incidente{" + "incidente=" + incidente + ", callePri=" + callePri + ", calleSec=" + calleSec + ", barrio=" + barrio + ", descripcionIncidente=" + descripcionIncidente + ", fechaIncidente=" + fechaIncidente + '}';
    }
    
        
}
