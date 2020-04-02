/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Maria Paula
 */
public class Usuario {

    private int ID;
    private String Nombre;
    private int FechaNacimiento;
    private int Tel;
    private String correo;
    private String NomUsuario;
    private String contraseña;
    private String tipo;
    private Connection conexion;
    private Statement sentencias;
    private ResultSet datos;

    public Usuario(int ID, String Nombre, int FechaNacimiento, int Tel, String NomUsuario, String contraseña, String tipo, String correo) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.Tel = Tel;
        this.NomUsuario = NomUsuario;
        this.contraseña = contraseña;
        this.tipo = tipo;
        this.correo= correo;
    }

  

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getFechaNacimiento() {
        return FechaNacimiento;
    }

    public int getTel() {
        return Tel;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNomUsuario() {
        return NomUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getTipo() {
        return tipo;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setFechaNacimiento(int FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public void setTel(int Tel) {
        this.Tel = Tel;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNomUsuario(String NomUsuario) {
        this.NomUsuario = NomUsuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void conectar() {
        try {
            this.conexion = DriverManager.getConnection("jdbc:mysql://localhost/medicna?useServerPrepStmts=true", "root", "");
            this.sentencias = this.conexion.createStatement();

        } catch (SQLException ex) {

            System.out.println(" Error al conectar");
        }
    }

    public void create(String nombre,int fecha,int tel,String correo,String usuario,String contraseña,String tipo) {
        try {    
            this.sentencias.executeUpdate("insert into usuarios values(null,'" + nombre +"','" + fecha +"','"+ tel +"','"+ correo +"','"+ usuario +"','"+ contraseña +"','"+ tipo +"')", Statement.RETURN_GENERATED_KEYS);

            this.datos = this.sentencias.getGeneratedKeys();
            if (datos.next()) {
                System.out.println(datos.getInt(1));
            }
        } catch (SQLException ex) {
            System.out.println("Error al agregar");
        }

    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario p = new Usuario(0,"",0,0,"","","","");
        p.conectar();
        p.create("juancarlos",2,72031679,"maripahzu@hotmailcom","juan23","12345","medico");
        System.out.println("");
        
        
    }

}
