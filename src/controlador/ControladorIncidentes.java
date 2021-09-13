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
import modelo.Incidente;
import modelo.IncidenteDAO;
import vista.FrmRegistraIncidenteC;


/**
 *
 * @author WISTAR
 */
public class ControladorIncidentes implements ActionListener {
    IncidenteDAO objetoDAO= new IncidenteDAO();
    Incidente objetoIncidente =new Incidente();    
    FrmRegistraIncidenteC objetoVista= new FrmRegistraIncidenteC();
    
    
    public ControladorIncidentes(FrmRegistraIncidenteC v)
    {
        this.objetoVista=v;
        this.objetoVista.btnEnviar.addActionListener(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objetoVista.btnEnviar)
        {
            agregarIncidente();
        }
    }
    
    public void agregarIncidente()
    {
        String barrio=(String)objetoVista.cmbBarrios.getSelectedItem();
        String incidente=(String)objetoVista.cmbTipoIncidente.getSelectedItem();
       
        objetoIncidente.setIncidente(incidente);
        objetoIncidente.setBarrio(barrio);
        objetoIncidente.setCallePri(objetoVista.txtCalleP.getText());
        objetoIncidente.setCalleSec(objetoVista.txtCalleS.getText());
        objetoIncidente.setFechaIncidente(objetoVista.txtFechaIncidente.getText());
        objetoIncidente.setDescripcionIncidente(objetoVista.txtDescripcion.getText());        
        objetoDAO.insertarIncidente(objetoIncidente);
    }
}
