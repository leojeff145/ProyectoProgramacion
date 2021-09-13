/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Archivo;
import modelo.Incidente;
import vista.FrmRegistraIncidenteC;

/**
 *
 * @author Leonardo Obando
 */
public class ControladorArchivoIncidente implements ActionListener {
    Archivo objArchivoI = new Archivo();
    Incidente objetoIncidente= new Incidente();
    FrmRegistraIncidenteC objetoVista= new FrmRegistraIncidenteC();
    
    public ControladorArchivoIncidente(FrmRegistraIncidenteC v)
    {
        this.objetoVista=v;
        this.objetoVista.btnEnviar.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objetoVista.btnEnviar)
        {
            agregarIncidenteAr();
        }
    }

    public void agregarIncidenteAr()
    {
        String barrio=(String)objetoVista.cmbBarrios.getSelectedItem();
        String incidente=(String)objetoVista.cmbTipoIncidente.getSelectedItem();
       
        objetoIncidente.setIncidente(incidente);
        objetoIncidente.setBarrio(barrio);
        objetoIncidente.setCallePri(objetoVista.txtCalleP.getText());
        objetoIncidente.setCalleSec(objetoVista.txtCalleS.getText());
        
        try {
            Date fecha = new Date();
            SimpleDateFormat formato= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            fecha= formato.parse(objetoVista.txtFechaIncidente.getText()); 
            objetoIncidente.setFechaIncidente(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(Incidente.class.getName()).log(Level.SEVERE, null, ex);
        } 
        objetoIncidente.setDescripcionIncidente(objetoVista.txtDescripcion.getText());        
        objArchivoI.guardarArchivoIncidente(objetoIncidente);
        System.out.println(objetoIncidente.toString());
    }
    
}
