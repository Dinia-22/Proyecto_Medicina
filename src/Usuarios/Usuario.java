/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import com.toedter.calendar.JDateChooser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JTextField;

/**
 *
 * @author Maria Paula
 */
public class Usuario {

    public JTextField ID;
    public JDateChooser FechaNacimiento;
    public JTextField txtTel;
    public JTextField txtCorreo;
    public JTextField NomUsuario;
    public JTextField contraseña;
    public JTextField tipo;
    public JTextField txtNombre;
    private Connection conexion;
    private Statement sentencias;
    private ResultSet datos;

    public JTextField getID() {
        return ID;
    }

    public JTextField getNombre() {
        return txtNombre;
    }

    public JDateChooser getFechaNacimiento() {
        return FechaNacimiento;
    }

    public JTextField getTel() {
        return txtTel;
    }

    public JTextField getCorreo() {
        return txtCorreo;
    }

    public JTextField getNomUsuario() {
        return NomUsuario;
    }

    public JTextField getContraseña() {
        return contraseña;
    }

    public JTextField getTipo() {
        return tipo;
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
            Connection conex = DriverManager.getConnection("jdbc:mysql://localhost/medicina?useServerPrepStmts=true", "root", "");
            PreparedStatement sentencia;
            sentencia = conex.prepareStatement("insert usuario values(null,?,?,?,?,?,?,?)");
            SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
            sentencia.setString(1,txtNombre.getText());
            sentencia.setString(2, dt.format(FechaNacimiento.getDate()));
            sentencia.setString(3, this.txtCorreo.getText());
            sentencia.setString(4, this.NomUsuario.getText());
            sentencia.setString(5, this.contraseña.getText());
            sentencia.setString(6, this.tipo.getText());
            sentencia.setString(7, this.txtTel.getText());
            sentencia.execute();

//            sentencia.setString(1,txtNombre.getText());
//            sentencia.setString(2, dt.format(FechaNacimiento.getDate()));
//            sentencia.setString(3, this.txtCorreo.getText());
//            sentencia.setString(4, this.NomUsuario.getText());
//            sentencia.setString(5, this.contraseña.getText());
//            sentencia.setString(6, this.tipo.getText());
//            sentencia.setString(7, this.txtTel.getText());
//            sentencia.execute();

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
    
    public void updateContraseña(int Id, String Contraseña) { // modificar
        try {
            this.sentencias.executeUpdate("update usuario set nombre='" +Contraseña+ "' where id=" + Id);

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
       // Usuario p = new Usuario(0, "", 0, 0, "", "", "", "");
//        p.conectar();
//        p.readNombre("paula");
//        p.readCorreo("");
//        p.readFecha(0);
//        p.readTel(0);
//        p.readTipo("");
//        p.readUsuario("");  
//        //p.delete(1);
//        //p.update(1, "maria", 4, "hotmail", "p123", "secretaria", 01234);
//        //p.create();
//        p.updateContraseña(1,"");

    }

}
