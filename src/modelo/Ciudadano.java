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
    private long numeroCedula;
    private long numTelefono;
    private ArrayList <Incidente> listIncidente= new ArrayList();

    public Ciudadano(long numeroCedula, long numTelefono, String nombre, String apellido, String correoElectronico, String contraseña) {
        super(nombre, apellido, correoElectronico, contraseña);
        this.numeroCedula = numeroCedula;
        this.numTelefono = numTelefono;
    } 

    public Ciudadano() {
    }

    public long getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(long numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public long getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(long numTelefono) {
        this.numTelefono = numTelefono;
    }

    public ArrayList<Incidente> getListIncidente() {
        return listIncidente;
    }

    public void setListIncidente(ArrayList<Incidente> listIncidente) {
        this.listIncidente = listIncidente;
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
