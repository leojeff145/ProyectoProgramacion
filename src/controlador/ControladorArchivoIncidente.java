/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Archivo;
import modelo.HistorialDeIncidentes;
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
        objetoIncidente.setFechaIncidente(objetoVista.txtFechaIncidente.getText());         
        objetoIncidente.setDescripcionIncidente(objetoVista.txtDescripcion.getText());        
        objArchivoI.guardarArchivoIncidente(objetoIncidente);
        HistorialDeIncidentes.getInsatance().adicionarIncidente(objetoIncidente);
        //System.out.println(objetoIncidente.toString());
    }
    
    
    
}
