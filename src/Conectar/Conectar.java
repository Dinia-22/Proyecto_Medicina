/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conectar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.JOptionPane;

public class Conectar {

    public static Connection conexion;
    public static Statement sentencias;
    public static ResultSet datos;
    private String ip="localhost" ;
    private String nom ="medicina";
    private String usuario="root";
    private String contra = "";
    

   

    public String getIp() {
        return ip;
    }

    public String getNom() {
        return nom;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setIp(String Ip) {
        this.ip =ip;
    }

    public void setNom(String Nom) {
        this.nom = Nom;
    }

    public void setUsuario(String Usuario) {
        this.usuario = Usuario;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public void conectar() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://" + this.getIp() + "/" + this.getNom(), this.getUsuario(), this.contra);
            sentencias = conexion.createStatement();
            JOptionPane.showMessageDialog(null,"Conectado");
       

        } catch (SQLException ex) {

           JOptionPane.showMessageDialog(null, "Error al conectar", null, JOptionPane.ERROR_MESSAGE);
        }
        
        
        File archivo = new File("C:\\Users\\juan1\\Desktop\\UTN\\UTN I CUATRIMESTRE 2020\\Proyecto Progra\\Proyecto_Medicina-master\\archivo.ini");
        try {
            System.out.println("\tCreando el flujo de escritura a archivo");

            try (OutputStream outputStream = new FileOutputStream(archivo)) {
                System.out.println("\tCreando el objeto Properties");
                Properties prop = new Properties();

                System.out.println("\tCreamos las claves del archivo properties y sus valores");
                // set key and value
                prop.setProperty("db.url", this.getIp());
                prop.setProperty("db.nombre", this.getNom());
                prop.setProperty("db.usuario", this.getUsuario());
                prop.setProperty("db.password", this.getContra());

                System.out.println("\tAlmacenamos el arhivo");
                System.out.println("\tCon un comentario al inicio");
                prop.store(outputStream, "Config");

                System.out.println("\tEl archivo se cierra en este punto gracias al Try-catch con recursos");
            }

            System.out.println("");
            System.out.println("");
            System.out.println("Leemos el archivo de configuracion");
            System.out.println("\tCreando el flujo de lectura a archivo");

            try (InputStream inputStream = new FileInputStream(archivo)) {
                Properties prop = new Properties();
                prop.load(inputStream);
                System.out.println("\tLeemos el valor de las claves");
                // get value by key
                System.out.println(prop.getProperty("db.url"));
                System.out.println(prop.getProperty("db.nombre"));
                System.out.println(prop.getProperty("db.usuario"));
                System.out.println(prop.getProperty("db.password"));
            }

            System.out.println("");
            System.out.println("");

        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado!");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error de entrada salida!");
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Conectar conec = new Conectar();

        conec.conectar();
    }

}
