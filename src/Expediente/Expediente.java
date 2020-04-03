/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expediente;


import Usuarios.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maria Paula
 */
public class Expediente {
    private int Fecha;
    private int hora;
    private String medico;
    private String Descrip;
    private Connection conexion;
    private Statement sentencias;

    public Expediente(int Fecha, int hora, String medico, String Descrip) {
        this.Fecha = Fecha;
        this.hora = hora;
        this.medico = medico;
        this.Descrip = Descrip;
    }

    public int getFecha() {
        return Fecha;
    }

    public int getHora() {
        return hora;
    }

    public String getMedico() {
        return medico;
    }

    public String getDescrip() {
        return Descrip;
    }

    public void setFecha(int Fecha) {
        this.Fecha = Fecha;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public void setDescrip(String Descrip) {
        this.Descrip = Descrip;
    }
    
    public void conectar() {
        try {
            this.conexion = DriverManager.getConnection("jdbc:mysql://localhost/medicina?useServerPrepStmts=true", "root", "");
            this.sentencias = this.conexion.createStatement();

        } catch (SQLException ex) {

            System.out.println(" Error al conectar");
        }
    }

    public void create() {
        try {
            PreparedStatement sentencia;
            sentencia = conexion.prepareStatement("insert expediente values(null,?,?,?,?)");
            sentencia.setInt(1, 5);
            sentencia.setInt(2, 2);
            sentencia.setString(3,"Carlos");
            sentencia.setString(4,"pierna rota");
            sentencia.execute();

        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Expediente p = new Expediente(0,0,"","");
        p.conectar();
        p.create();
    
    }
    
    
}
