
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Ciudadano;
import modelo.CiudadanoDAO;
import vista.FrmRegistroUsuarioCiudadano;


public class ControladorRegistroCiudadano implements ActionListener {
    CiudadanoDAO objetoDAO= new CiudadanoDAO();
    Ciudadano objetoAgente =new Ciudadano();    
    FrmRegistroUsuarioCiudadano objetoVista= new FrmRegistroUsuarioCiudadano();
    
    
    public ControladorRegistroCiudadano(FrmRegistroUsuarioCiudadano v)
    {
        this.objetoVista=v;
        this.objetoVista.btnRegistrarC.addActionListener(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objetoVista.btnRegistrarC)
        {
            agregarAgente();
        }
    }
    
    public void agregarAgente()
    {
        
       
        objetoAgente.setNumeroCedula(Long.parseLong(objetoVista.txtRegCedulaC.getText()));
        objetoAgente.setNombre(objetoVista.txtRegNombreC.getText());
        objetoAgente.setApellido(objetoVista.txtRegApellidoC.getText());
        objetoAgente.setNumTelefono(Long.parseLong(objetoVista.txtRegCedulaC.getText()));
        objetoAgente.setCorreoElectronico(objetoVista.txtRegCorreoC.getText());
        objetoAgente.setContraseña(objetoVista.txtRegContraC.getText());
                
        objetoDAO.insertarCiudadano(objetoAgente);
    }

}
