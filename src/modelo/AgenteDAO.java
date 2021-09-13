
package modelo;

import com.mongodb.BasicDBObject;

public class AgenteDAO {
    public void insertarAgente(Agente ag)
    {
        
        ConexionAgente conx= new ConexionAgente();
        BasicDBObject documento=new BasicDBObject();
        documento.put("Id", ag.getId());
        documento.put("Correo Electronico", ag.getCorreoElectronico());
        documento.put("Contraseña", ag.getContraseña());
        documento.put("Nombre", ag.getNombre());
        documento.put("Apellido", ag.getApellido());
        conx.coleccion.insert(documento); 
    }
}
