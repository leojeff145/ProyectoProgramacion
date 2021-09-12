
package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Archivos {
    
   public void escribir(Incidente i)
    {
        File archivo;
        FileOutputStream fos;
        ObjectOutputStream salida;
        
        archivo= new File("Incidentes.bin");
        try
        {
            fos = new FileOutputStream(archivo);
            salida = new ObjectOutputStream(fos);
            salida.writeObject(i);
        }
        catch(FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
        catch(IOException es)
        {
            
        }
    }
    
    public void leer()
    {
        File archivo;
        FileInputStream fis;
        ObjectInputStream entrada;
        
        archivo= new File("Incidentes.bin");
        try
        {
           fis = new FileInputStream(archivo);
           entrada = new ObjectInputStream(fis);
           while(true)
           {
               Object dato = entrada.readObject();
               Incidente aux=(Incidente)dato;      
               
           }
        }
        catch(FileNotFoundException ex)
        {
            
        }
        catch(IOException ex)
        {
            
        }
        catch(ClassNotFoundException ex)
        {
            
        }
    } 
}
