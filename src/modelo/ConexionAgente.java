
package modelo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;


public class ConexionAgente {
    DB baseDatos;
    DBCollection coleccion;
    BasicDBObject documento= new BasicDBObject();
    public ConexionAgente()
    {
        try
        {
            MongoClient mongo=new MongoClient("localhost",27017);
            baseDatos= mongo.getDB("ZonasInsegurasQuito");
            coleccion=baseDatos.getCollection("agente");
            System.out.println("conexion a base de datos exitoso...");
        }
        catch(Exception e)
        {
                    
        }
    }
}
