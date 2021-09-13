package modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Archivo {

    ArrayList<Agente> listAgente = new ArrayList();
    ArrayList<Ciudadano> listCiudadano = new ArrayList();

    //Getters-Setters
    public ArrayList<Agente> getListAgente() {
        return listAgente;
    }

    public void setListAgente(ArrayList<Agente> listAgente) {
        this.listAgente = listAgente;
    }

    public ArrayList<Ciudadano> getListCiudadano() {
        return listCiudadano;
    }

    public void setListCiudadano(ArrayList<Ciudadano> listCiudadano) {
        this.listCiudadano = listCiudadano;
    }

    public void guardarArchivoAgente(Agente u) {
        try {
            FileWriter fw = new FileWriter("Agentes.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(u.getId());
            pw.println(u.nombre);
            pw.println(u.apellido);
            pw.println(u.correoElectronico);
            pw.println(u.contraseña);
            pw.println();
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void leerArchivoAgente() {
        File archivo = new File("Agentes.txt");
        try {
            FileReader fr = new FileReader(archivo);
            Scanner ingreso = new Scanner(fr);
            ingreso.useLocale(Locale.ENGLISH);
            while (ingreso.hasNext()) {
                Agente agente = new Agente(ingreso.nextLong(), ingreso.next(), ingreso.next(), ingreso.next(), ingreso.next());
                listAgente.add(agente);
            }
        } catch (IOException o) {
        }
    }

    public void mostrarAgente() {
        Agente aux = new Agente();
        Iterator it = listAgente.iterator();
        while (it.hasNext()) {
            aux = (Agente) it.next();
            System.out.println(aux.getNombre());
        }

    }

    public void guardarArchivoCiudadano(Ciudadano c) {
        try {
            FileWriter fw = new FileWriter("Ciudadano.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(c.getNumeroCedula());
            pw.println(c.getNumTelefono());
            pw.println(c.nombre);
            pw.println(c.apellido);
            pw.println(c.correoElectronico);
            pw.println(c.contraseña);
            pw.println();
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void leerArchivoCiudadano() {
        File archivo = new File("Ciudadano.txt");
        try {
            FileReader fr = new FileReader(archivo);
            Scanner ingreso = new Scanner(fr);
            ingreso.useLocale(Locale.ENGLISH);
            while (ingreso.hasNext()) {
                Ciudadano ciudadano = new Ciudadano(ingreso.nextLong(), ingreso.nextLong(), ingreso.next(), ingreso.next(), ingreso.next(), ingreso.next());
                listCiudadano.add(ciudadano);
            }
        } catch (IOException o) {
        }
    }

    public void guardarArchivoIncidente(Incidente inc) {
        try {
            FileWriter fw = new FileWriter("Incidentes.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(inc.incidente);
            pw.println(inc.callePri);
            pw.println(inc.calleSec);
            pw.println(inc.barrio);
            pw.println(inc.descripcionIncidente);
            pw.println(inc.fechaIncidente);            
            pw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void leerArchivoIncidentes(){
        File archivo=new File("Incidentes.txt");
        try
        {
            FileReader fr=new FileReader(archivo);
            Scanner ingresar = new Scanner(fr);            
            while(ingresar.hasNext())
            {
                Incidente incidente= new Incidente(ingresar.nextLine(),ingresar.nextLine(),ingresar.nextLine(),ingresar.nextLine(),ingresar.nextLine(),ingresar.nextLine());
                HistorialDeIncidentes.getInsatance().adicionarIncidente(incidente);
            }
        }catch(IOException o){            
        }       
    }
}
