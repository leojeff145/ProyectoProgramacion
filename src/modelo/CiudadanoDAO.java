
package modelo;

import com.mongodb.BasicDBObject;


public class CiudadanoDAO {
    public void insertarCiudadano(Ciudadano ciu)
    {
        
        ConexionCiudadano conx= new ConexionCiudadano();
        BasicDBObject documento=new BasicDBObject();
        documento.put("Cedula", ciu.getNumeroCedula());
        documento.put("Nombre", ciu.getNombre());
        documento.put("Apellido", ciu.getApellido());
        documento.put("Telefono", ciu.getNumTelefono());
        documento.put("Correo Electronico", ciu.getCorreoElectronico());
        documento.put("Contraseña", ciu.getContraseña());
        conx.coleccion.insert(documento); 
    }
}
