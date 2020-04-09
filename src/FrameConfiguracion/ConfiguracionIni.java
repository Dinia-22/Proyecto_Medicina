package FrameConfiguracion;

import java.io.BufferedWriter;
import java.io.File;
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

    public ConfiguracionIni(JTextField Ip, JTextField NomBaD, JTextField NomUsuario, JTextField contraseña) {
        this.Ip = Ip;
        this.NomBaD = NomBaD;
        this.NomUsuario = NomUsuario;
        this.contraseña = contraseña;
    }

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
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar");
            
        }        
    }

    public void archIni() {
        File archIni = new File("C:\\Users\\Adriel Chavarría B\\Documents\\NetBeansProjects\\Proyecto_Medicina-master\\Fichero.ini");
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
                crea.write("Ip servidor: "+this.getIp());
                crea.write("Nombre de la Base de Datos: "+this.getNomBaD());
                crea.write("Nombre de Usuario: "+this.getNomUsuario());
                crea.write("Contraseña de Usuario: "+this.getContraseña());
                crea.close();
                
            } catch (IOException e) {
            }
        }
    }
}
