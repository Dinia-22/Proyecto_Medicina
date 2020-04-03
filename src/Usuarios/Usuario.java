/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        this.correo = correo;
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
            this.conexion = DriverManager.getConnection("jdbc:mysql://localhost/medicina?useServerPrepStmts=true", "root", "");
            this.sentencias = this.conexion.createStatement();

        } catch (SQLException ex) {

            System.out.println(" Error al conectar");
        }
    }

    public void create() {

        try {
            PreparedStatement sentencia;
            sentencia = conexion.prepareStatement("insert usuario values(null,?,?,?,?,?,?,?)");
            sentencia.setString(1, "paula");
            sentencia.setInt(2, 2);
            sentencia.setString(3, "@");
            sentencia.setString(4, "pau");
            sentencia.setString(5, "1234");
            sentencia.setString(6, "medico");
            sentencia.setInt(7, 72031697);
            sentencia.execute();

            sentencia.setString(1, "Katty");
            sentencia.setInt(2, 4);
            sentencia.setString(3, "Katty@hotmail.com");
            sentencia.setString(4, "ka56");
            sentencia.setString(5, "19967");
            sentencia.setString(6, "secretaria");
            sentencia.setInt(7, 234510);
            sentencia.execute();

        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void update(int Id, String Nombre, int Fecha, String Correo, String Usuario, String Tipo, int Tel) {
        try {
            this.sentencias.executeUpdate("update usuario set nombre='" + Nombre + "',fecha='" + Fecha + "',correo='" + Correo + "',usuario='" + Usuario + "',tipo='" + Tipo + "',telefono='" + Tel + "' where id=" + Id);

        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void delete(int Id) { /// controlar que siempre quede un usuario registrado al momento de eliminar
        try {
            this.sentencias.executeUpdate("delete from usuario where id=" + Id);
        } catch (SQLException ex) {
            System.out.println("Error en delete");
        }
    }
 ///////////////////////////// para buscar la informacion del usuario///////////////////////////////////////////////////
    public void readNombre(String Nombre) {
        try {
            this.datos = this.sentencias.executeQuery("select * from usuario where Nombre='" + Nombre + "'");
            if (this.datos.next()) {
                System.out.println(datos.getInt(1));
                System.out.println(datos.getString(2));
                System.out.println(datos.getString(3));
            } else {
                System.out.println(" No hay mas registros ");
            }
        } catch (SQLException ex) {
            System.out.println(" Error en el read");
        }

    }

    public void readFecha(int Fecha) {
        try {
            this.datos = this.sentencias.executeQuery("select * from usuario where Nombre='" + Fecha + "'");
            if (this.datos.next()) {
                System.out.println(datos.getInt(1));
                System.out.println(datos.getString(2));
                System.out.println(datos.getString(3));
            } else {
                System.out.println(" No hay mas registros ");
            }
        } catch (SQLException ex) {
            System.out.println(" Error en el read");
        }

    }

    public void readCorreo(String Correo) {
        try {
            this.datos = this.sentencias.executeQuery("select * from usuario where Nombre='" + Correo + "'");
            if (this.datos.next()) {
                System.out.println(datos.getInt(1));
                System.out.println(datos.getString(2));
                System.out.println(datos.getString(3));
            } else {
                System.out.println(" No hay mas registros ");
            }
        } catch (SQLException ex) {
            System.out.println(" Error en el read");
        }

    }

    public void readUsuario(String Usuario) {
        try {
            this.datos = this.sentencias.executeQuery("select * from usuario where Nombre='" + Usuario + "'");
            if (this.datos.next()) {
                System.out.println(datos.getInt(1));
                System.out.println(datos.getString(2));
                System.out.println(datos.getString(3));
            } else {
                System.out.println(" No hay mas registros ");
            }
        } catch (SQLException ex) {
            System.out.println(" Error en el read");
        }

    }

    public void readTipo(String Tipo) {
        try {
            this.datos = this.sentencias.executeQuery("select * from usuario where Nombre='" + Tipo + "'");
            if (this.datos.next()) {
                System.out.println(datos.getInt(1));
                System.out.println(datos.getString(2));
                System.out.println(datos.getString(3));
            } else {
                System.out.println(" No hay mas registros ");
            }
        } catch (SQLException ex) {
            System.out.println(" Error en el read");
        }

    }

    public void readTel(int Tel) {
        try {
            this.datos = this.sentencias.executeQuery("select * from usuario where Nombre='" + Tel + "'");
            if (this.datos.next()) {
                System.out.println(datos.getInt(1));
                System.out.println(datos.getString(2));
                System.out.println(datos.getString(3));
            } else {
                System.out.println(" No hay mas registros ");
            }
        } catch (SQLException ex) {
            System.out.println(" Error en el read");
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Usuario p = new Usuario(0, "", 0, 0, "", "", "", "");
        p.conectar();
        p.readNombre("paula");
        p.readCorreo("");
        p.readFecha(0);
        p.readTel(0);
        p.readTipo("");
        p.readUsuario("");  
        //p.delete(1);
        //p.update(1, "maria", 4, "hotmail", "p123", "secretaria", 01234);
        //p.create();

    }

}
