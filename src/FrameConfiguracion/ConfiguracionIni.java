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

/**
 *
 * @author Adriel Chavarría B
 */
public class ConfiguracionIni {

    public JTextField Ip;
    public JTextField NomBaD;
    public JTextField NomUsuario;
    public JTextField contraseña;
    private Connection conexion;
    private Statement sentencias;
    public JTextField getIp() {
        return Ip;
    }

    public void setIp(JTextField Ip) {
        this.Ip = Ip;
    }

    public JTextField getNomBaD() {
        return NomBaD;
    }

    public void setNomBaD(JTextField NomBaD) {
        this.NomBaD = NomBaD;
    }

    public JTextField getNomUsuario() {
        return NomUsuario;
    }

    public void setNomUsuario(JTextField NomUsuario) {
        this.NomUsuario = NomUsuario;
    }

    public JTextField getContraseña() {
        return contraseña;
    }

    public void setContraseña(JTextField contraseña) {
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
                crea.write(this.Ip.getText()+ " Nombre de la IP \n");
                crea.write( this.NomBaD.getText() + " Nombre de la base de datos \n");
                crea.write(this.NomUsuario.getText()+ " Nombre de Usuario \n");
                crea.write(this.contraseña.getText() +" Contraseña \n");
                crea.close();
                crea.flush();
                
            } catch (IOException e) {
            }
        }
    }
    
 

}
