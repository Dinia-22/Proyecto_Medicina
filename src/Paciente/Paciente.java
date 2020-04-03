/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paciente;

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
public class Paciente {

    private int ID;
    private String Nomnre;
    private int FechaNacimiento;
    private String correro;
    private int edad;
    private Connection conexion;
    private Statement sentencias;

    public Paciente(int ID, String Nomnre, int FechaNacimiento, String correro, int edad) {
        this.ID = ID;
        this.Nomnre = Nomnre;
        this.FechaNacimiento = FechaNacimiento;
        this.correro = correro;
        this.edad = edad;
    }

    public int getID() {
        return ID;
    }

    public String getNomnre() {
        return Nomnre;
    }

    public int getFechaNacimiento() {
        return FechaNacimiento;
    }

    public String getCorrero() {
        return correro;
    }

    public int getEdad() {
        return edad;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public void setNomnre(String Nomnre) {
        this.Nomnre = Nomnre;
    }
    
    public void setFechaNacimiento(int FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }
    
    public void setCorrero(String correro) {
        this.correro = correro;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
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
            sentencia = conexion.prepareStatement("insert pacientes values(null,?,?,?,?)");
            sentencia.setString(1, "paula herrera");
            sentencia.setInt(2,1996);
            sentencia.setInt(3,72031697);
            sentencia.setString(4, "maripa96-h-zu@hotmail.com");
            sentencia.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Paciente p = new Paciente(0,"",0,"",0);
        p.conectar();
        p.create();

    }

}
