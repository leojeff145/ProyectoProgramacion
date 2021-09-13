/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Obando
 */
public class ArchivoAgente {
    
    public void guardarArchivoAgente(Agente u){
        try{
            FileWriter fw= new FileWriter("Agentes.txt",true);
            BufferedWriter bw= new BufferedWriter(fw);
            PrintWriter pw= new PrintWriter(bw);
            pw.println(u.getId());
            pw.println(u.nombre);
            pw.println(u.apellido);            
            pw.println(u.correoElectronico);
            pw.println(u.contraseña);
            pw.println();
            pw.close();            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }       
    }
    
}
