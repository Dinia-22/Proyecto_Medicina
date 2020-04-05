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
import javax.swing.JOptionPane;

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


        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void update() {
        try {
            SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd"); 
            this.sentencias.executeUpdate("update usuario set nombre='" + this.txtNombre.getText() + "',fecha='" + dt.format(this.FechaNacimiento.getDate()) + "',correo='" + this.txtCorreo.getText() + "',usuario='" + this.NomUsuario.getText() + "',tipo='" + this.tipo.getText() + "',telefono='" + this.txtTel.getText() + "' where id=" + this.ID.getText());

        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
      public void updateContraseña() {
        try {
           
            this.sentencias.executeUpdate("update usuario set contraseña='" + this.contraseña.getText() + "' where id=" + this.ID.getText());

        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void delete() { /// controlar que siempre quede un usuario registrado al momento de eliminar
        try {
            this.sentencias.executeUpdate("delete from usuario where id=" + this.ID.getText());
            JOptionPane.showMessageDialog(null, "Usuario Eliminado");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar");
        }
    }
    
 ///////////////////////////// para buscar la informacion del usuario///////////////////////////////////////////////////
    public void readNombre() {
        try {
            this.datos = this.sentencias.executeQuery("select * from usuario where Nombre='" + this.txtNombre.getText() + "'");
            if (this.datos.next()) {
                System.out.println(datos.getInt(1));
                JOptionPane.showMessageDialog(null, "Dato Encontrado " + datos.getString(2));
                System.out.println(datos.getString(3));
            } else {
                JOptionPane.showMessageDialog(null, "No hay mas registros");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el read");
        }

    }

    public void readFecha() {
        try {
            SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");   
            this.datos = this.sentencias.executeQuery("select * from usuario where Fecha='" + dt.format(this.FechaNacimiento.getDate()) + "'");
            if (this.datos.next()) {
               
                System.out.println(datos.getInt(1));
                JOptionPane.showMessageDialog(null, "Dato Encontrado " + datos.getString(3));
                System.out.println(datos.getString(3));
            } else {
                JOptionPane.showMessageDialog(null, "No hay mas registros");
               
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el read" );
            
        }

    }

    public void readCorreo() {
        try {
            this.datos = this.sentencias.executeQuery("select * from usuario where Correo='" + this.txtCorreo.getText() + "'");
            if (this.datos.next()) {
                System.out.println(datos.getInt(1));
                JOptionPane.showMessageDialog(null, "Dato Encontrado " + datos.getString(4));
                System.out.println(datos.getString(3));
            } else {
                JOptionPane.showMessageDialog(null, "No hay mas registros");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el read" );
        }

    }

    public void readUsuario() {
        try {
            this.datos = this.sentencias.executeQuery("select * from usuario where Usuario='" + this.NomUsuario.getText() + "'");
            if (this.datos.next()) {
                System.out.println(datos.getInt(1));
                JOptionPane.showMessageDialog(null, "Dato Encontrado " + datos.getString(5));
                System.out.println(datos.getString(3));
            } else {
                 JOptionPane.showMessageDialog(null, "No hay mas registros");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el read" );
        }

    }

    public void readTipo() {
        try {
            this.datos = this.sentencias.executeQuery("select * from usuario where Tipo='" + this.tipo.getText() + "'");
            if (this.datos.next()) {
                System.out.println(datos.getInt(1));
                JOptionPane.showMessageDialog(null, "Dato Encontrado " + datos.getString(6));
                System.out.println(datos.getString(3));
            } else {
                JOptionPane.showMessageDialog(null, "No hay mas registros");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el read");
        }

    }

    public void readTel() {
        try {
            this.datos = this.sentencias.executeQuery("select * from usuario where Telefono='" + this.txtTel.getText() + "'");
            if (this.datos.next()) {
                System.out.println(datos.getInt(1));
                JOptionPane.showMessageDialog(null, "Dato Encontrado " + datos.getString(7));
                System.out.println(datos.getString(3));
            } else {
                JOptionPane.showMessageDialog(null, "No hay mas registros");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el read");
        }

    }
    
  
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario p = new Usuario();
        p.conectar();
//        p.readNombre("paula");
//        p.readCorreo("");
//        p.readFecha(0);
//        p.readTel(0);
//        p.readTipo("");
//        p.readUsuario("");  
//        //p.delete(1);
//        //p.update(1, "maria", 4, "hotmail", "p123", "secretaria", 01234);
//        //p.create();
       
   
    }

}
