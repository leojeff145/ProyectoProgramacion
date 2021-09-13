/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mongodb.BasicDBObject;

/**
 *
 * @author WISTAR
 */
public class IncidenteDAO {
    public void insertarIncidente(Incidente inc)
    {
        
        ConexionIncidentes conx= new ConexionIncidentes();
        BasicDBObject documento=new BasicDBObject();
        documento.put("Incidente", inc.getIncidente());
        documento.put("Barrio", inc.getBarrio());
        documento.put("Calle Principal", inc.getCallePri());
        documento.put("Calle Secundaria", inc.getCalleSec());
        documento.put("Fecha", inc.getFechaIncidente());
        documento.put("Descripcion", inc.getDescripcionIncidente());
        conx.coleccion.insert(documento); 
    }
}
