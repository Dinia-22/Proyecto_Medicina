/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrameConfiguracion;

import static Conectar.Conectar.conexion;
import static Conectar.Conectar.sentencias;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author Maria Paula
 */
public class ConfIni {

    public static Connection conexion;
    public static Statement sentencias;

    private String Ip = "localhost";
    private String Nom = "medicina?useServerPrepStmts=true";
    private String Usuario = "root";
    private String contra = "";

    public String getIp() {
        return Ip;
    }

    public String getNom() {
        return Nom;
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public static void main(String[] args) {
        ConfIni con = new ConfIni();

        File archivo = new File("C:\\Users\\juan1\\Desktop\\UTN\\UTN I CUATRIMESTRE 2020\\Proyecto Progra\\Proyecto_Medicina-master\\archivo.ini");
        try {
            System.out.println("\tCreando el flujo de escritura a archivo");

            try (OutputStream outputStream = new FileOutputStream(archivo)) {
                System.out.println("\tCreando el objeto Properties");
                Properties prop = new Properties();

                System.out.println("\tCreamos las claves del archivo properties y sus valores");
                // set key and value
                prop.setProperty("db.url", con.getIp());
                prop.setProperty("db.nombre", con.getNom());
                prop.setProperty("db.usuario", con.getUsuario());
                prop.setProperty("db.password", con.getContra());

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
        con.conectar();

    }

    public void conectar() {
        ConfIni confi = new ConfIni();
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://" + confi.getIp() + "/" + confi.getNom(), confi.getUsuario(), "");
            sentencias = conexion.createStatement();
            System.out.println("Conectado");

        } catch (SQLException ex) {

            System.out.println(" Error al conectar");
        }
    }

}
