/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Agente;
import modelo.ArchivoAgente;
import vista.FrmRegistraUsuarioAgente;

/**
 *
 * @author Leonardo Obando
 */
public class ControladorAgente implements ActionListener {
    
    ArchivoAgente objArchivoAg = new ArchivoAgente();
    Agente objAgente= new Agente();
    FrmRegistraUsuarioAgente objVistaAgente = new FrmRegistraUsuarioAgente();

    
    
    

    public ControladorAgente(FrmRegistraUsuarioAgente a) {
        this.objVistaAgente= a;
        this.objVistaAgente.btnRegistrarA.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objVistaAgente.btnRegistrarA)
        {
            agregarAgente();
        }
    }
    
    
    public void agregarAgente(){
        objAgente.setId(Long.parseLong(objVistaAgente.txtRegIdA.getText()));
        objAgente.setNombre(objVistaAgente.txtregNombreA.getText());
        objAgente.setApellido(objVistaAgente.txtregApellidoA.getText());
        objAgente.setCorreoElectronico(objVistaAgente.txtRegCorreoA.getText());
        objAgente.setContraseña(objVistaAgente.txtRegContraA.getText());
        objArchivoAg.guardarArchivoAgente(objAgente);
    }
    
    
}
