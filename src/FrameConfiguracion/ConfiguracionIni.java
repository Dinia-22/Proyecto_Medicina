package FrameConfiguracion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class ConfiguracionIni {

    private String Ip;
    private String NomBaD;
    private String NomUsuario;
    private String contraseña;
    private Connection conexion;
    private Statement sentencias;

    public String getIp() {
        return Ip;
    }

    public String getNomBaD() {
        return NomBaD;
    }

    public String getNomUsuario() {
        return NomUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    public void setNomBaD(String NomBaD) {
        this.NomBaD = NomBaD;
    }

    public void setNomUsuario(String NomUsuario) {
        this.NomUsuario = NomUsuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
   
  

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public Statement getSentencias() {
        return sentencias;
    }

    public void setSentencias(Statement sentencias) {
        this.sentencias = sentencias;
    }
    
    public void conectar() {
        try {
            this.conexion = DriverManager.getConnection("jdbc:mysql://localhost/medicina?useServerPrepStmts=true", "root", "");
            this.sentencias = this.conexion.createStatement();
            JOptionPane.showMessageDialog(null, "Se conecto de manera exitosa");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar");
            
        }        
    }

    public void archIni() {
        File archIni = new File("C:\\Users\\Maria Paula\\OneDrive - Universidad Técnica Nacional\\Trabajos maria\\Pogramacion2\\ Fichero.ini");
        if (!archIni.exists()) {
            try {
                archIni.createNewFile();
                
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al crear el Fichero.ini");
            }

        } else {
            try {
                
                FileWriter LeeS = new FileWriter(archIni, true);
                BufferedWriter crea = new BufferedWriter(LeeS);
                crea.write(this.Ip+ " Nombre de la IP \n");
                crea.write( this.NomBaD + " Nombre de la base de datos \n");
                crea.write(this.NomUsuario+ " Nombre de Usuario \n");
                crea.write(this.contraseña +" Contraseña \n");
                crea.close();
                crea.flush();
                
            } catch (IOException e) {
            }
        }
    }
    
 

}
