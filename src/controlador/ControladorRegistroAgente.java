
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Agente;

import vista.FrmRegistraIncidenteC;
import vista.FrmRegistraUsuarioAgente;

public class ControladorRegistroAgente implements ActionListener{
    IncidenteDAO objetoDAO= new IncidenteDAO();
    Agente objetoIncidente =new Incidente();    
    FrmRegistraUsuarioAgente objetoVista= new FrmRegistraUsuarioAgente();
    
    
    public ControladorRegistroAgente(FrmRegistraUsuarioAgente v)
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
       /* objetoIncidente.setPrecioInicial(Integer.parseInt(objetoVista.txtPrecioInicial.getText()));
        objetoIncidente.setPuja(Integer.parseInt(objetoVista.txtPuja.getText()));
        objetoIncidente.setNombre(objetoVista.txtNombre.getText());*/
       
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
        objetoDAO.insertarIncidente(objetoIncidente);
    }
}
