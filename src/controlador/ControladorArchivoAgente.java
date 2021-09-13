/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Agente;
import modelo.Archivo;
import vista.FrmPrincipal;
import vista.FrmRegistraUsuarioAgente;

/**
 *
 * @author Leonardo Obando
 */
public class ControladorArchivoAgente implements ActionListener {
    
    Agente objetoAgente =new Agente();
    Archivo objArchivoAg = new Archivo();
    FrmRegistraUsuarioAgente objetoVista= new FrmRegistraUsuarioAgente();
    FrmPrincipal objetoVistaPrin = new FrmPrincipal();
    
    public ControladorArchivoAgente(FrmRegistraUsuarioAgente v)
    {
        this.objetoVista=v;
        this.objetoVista.btnRegistrarA.addActionListener(this);
    }
    
//    public ControladorArchivoAgente(FrmPrincipal v)
//    {
//        this.objetoVistaPrin=v;        
//    }

    @Override
    public void actionPerformed(ActionEvent ae) {
//        recuperarAgenteAr();
        agregarAgenteAr();        
    }
    
    public void agregarAgenteAr(){
        objetoAgente.setId(Long.parseLong(objetoVista.txtRegIdA.getText()));
        objetoAgente.setNombre(objetoVista.txtregNombreA.getText());
        objetoAgente.setApellido(objetoVista.txtregApellidoA.getText());
        objetoAgente.setCorreoElectronico(objetoVista.txtRegCorreoA.getText());
        objetoAgente.setContraseña(objetoVista.txtRegContraA.getText());
        objArchivoAg.guardarArchivoAgente(objetoAgente);
        objArchivoAg.getListAgente().add(objetoAgente);
    }
    
//    public void recuperarAgenteAr(){
//        objArchivoAg.leerArchivoAgente();        
//    }    
    
}
