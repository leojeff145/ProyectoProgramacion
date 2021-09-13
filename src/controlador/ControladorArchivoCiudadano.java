/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Archivo;
import modelo.Ciudadano;
import vista.FrmRegistraUsuarioAgente;
import vista.FrmRegistroUsuarioCiudadano;

/**
 *
 * @author Leonardo Obando
 */
public class ControladorArchivoCiudadano implements ActionListener {
    Ciudadano objetoCiudadano =new Ciudadano();
    Archivo objArchivoC = new Archivo();
    FrmRegistroUsuarioCiudadano objetoVista= new FrmRegistroUsuarioCiudadano();
    
    public ControladorArchivoCiudadano(FrmRegistroUsuarioCiudadano v)
    {
        this.objetoVista=v;
        this.objetoVista.btnRegistrarC.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        agregarCiudadanoAr();
    }
    
    public void agregarCiudadanoAr(){
        
        objetoCiudadano.setNumeroCedula(Long.parseLong(objetoVista.txtRegCedulaC.getText()));
        objetoCiudadano.setNombre(objetoVista.txtRegNombreC.getText());
        objetoCiudadano.setApellido(objetoVista.txtRegApellidoC.getText());
        objetoCiudadano.setCorreoElectronico(objetoVista.txtRegCorreoC.getText());
        objetoCiudadano.setContraseña(objetoVista.txtRegContraC.getText());
        objetoCiudadano.setNumTelefono(Long.parseLong(objetoVista.txtRegTelfC.getText()));
        objArchivoC.guardarArchivoCiudadano(objetoCiudadano);
        objArchivoC.getListCiudadano().add(objetoCiudadano);
    }
    
    
    
}
