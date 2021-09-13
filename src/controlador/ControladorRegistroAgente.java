
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Agente;
import modelo.AgenteDAO;

import vista.FrmRegistraIncidenteC;
import vista.FrmRegistraUsuarioAgente;

public class ControladorRegistroAgente implements ActionListener{
    AgenteDAO objetoDAO= new AgenteDAO();
    Agente objetoAgente =new Agente();    
    FrmRegistraUsuarioAgente objetoVista= new FrmRegistraUsuarioAgente();
    
    
    public ControladorRegistroAgente(FrmRegistraUsuarioAgente v)
    {
        this.objetoVista=v;
        this.objetoVista.btnRegistrarA.addActionListener(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objetoVista.btnRegistrarA)
        {
            agregarAgente();
        }
    }
    
    public void agregarAgente()
    {
        
       
        objetoAgente.setId(Long.parseLong(objetoVista.txtRegIdA.getText()));
        objetoAgente.setCorreoElectronico(objetoVista.txtRegCorreoA.getText());
        objetoAgente.setContraseña(objetoVista.txtRegContraA.getText());
        objetoAgente.setNombre(objetoVista.txtregNombreA.getText());
        objetoAgente.setApellido(objetoVista.txtregApellidoA.getText());        
        objetoDAO.insertarAgente(objetoAgente);
    }
}
