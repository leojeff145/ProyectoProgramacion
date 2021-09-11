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
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Incidente;
import modelo.IncidenteDAO;
import vista.IFrmRegistrarIncidentes;

/**
 *
 * @author WISTAR
 */
public class ControladorIncidentes implements ActionListener {
    IncidenteDAO objetoDAO= new IncidenteDAO();
    Incidente objetoIncidente =new Incidente();
    IFrmRegistrarIncidentes objetoVista= new IFrmRegistrarIncidentes();
    
    public ControladorIncidentes(IFrmRegistrarIncidentes v)
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
       /* objetoIncidente.setPrecioInicial(Integer.parseInt(objetoVista.txtPrecioInicial.getText()));
        objetoIncidente.setPuja(Integer.parseInt(objetoVista.txtPuja.getText()));
        objetoIncidente.setNombre(objetoVista.txtNombre.getText());*/
        objetoIncidente.setCallePri(objetoVista.txtCalleP.getText());
        objetoIncidente.setCalleSec(objetoVista.txtCalleP.getText());
        objetoIncidente.setBarrio(objetoVista.txtCalleP.getText());
        
        SimpleDateFormat formato= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String fecha = formato.parse(objetoVista.txtFecha.getText());
        
        objetoIncidente.setFechaIncidente(objetoVista.txtFecha.getText());
        objetoIncidente.setCallePri(objetoVista.txtCalleP.getText());
        
        objetoDAO.insertarIncidente(objetoCliente);
    }
}
