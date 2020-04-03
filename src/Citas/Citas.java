/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Citas;

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
public class Citas {

    private int ID;
    private int fecha;
    private int hora;
    private String paciente;
    private String MedicoEspe;
    private Connection conexion;
    private Statement sentencias;

    public Citas(int ID, int fecha, int hora, String paciente, String MedicoEspe) {
        this.ID = ID;
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.MedicoEspe = MedicoEspe;
    }

    public int getID() {
        return ID;
    }

    public int getFecha() {
        return fecha;
    }

    public int getHora() {
        return hora;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getMedicoEspe() {
        return MedicoEspe;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public void setMedicoEspe(String MedicoEspe) {
        this.MedicoEspe = MedicoEspe;
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
            sentencia = conexion.prepareStatement("insert citas values(null,?,?,?,?)");
            sentencia.setInt(1, 5);
            sentencia.setInt(2, 2);
            sentencia.setString(3, "Carlos");
            sentencia.setString(4, "Juan");
            sentencia.execute();

        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Citas p = new Citas(0, 0, 0, "", "");
        p.conectar();
        p.create();
        System.out.println("");
        

    }

}
