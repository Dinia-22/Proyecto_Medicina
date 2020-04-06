/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paciente;

import Usuarios.Usuario;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Maria Paula
 */
public class Paciente {

    public JTextField ID;
    public JTextField Nombre;
    public JDateChooser FechaNacimiento;
    public JTextField correo;
    public JTextField edad;
    public JTextField Telefono;

    private Connection conexion;
    private Statement sentencias;
    private ResultSet datos;

    public JTextField getID() {
        return ID;
    }

    public JTextField getEdad() {
        return edad;
    }

    public JTextField getTelefono() {
        return Telefono;
    }

    public JTextField getNombre() {
        return Nombre;
    }

    public JTextField getCorreo() {
        return correo;
    }

    public void create() {
        try {
            this.conexion = DriverManager.getConnection("jdbc:mysql://localhost/medicina?useServerPrepStmts=true", "root", "");
            this.sentencias = this.conexion.createStatement();
            PreparedStatement sentencia;
            sentencia = conexion.prepareStatement("insert pacientes values(null,?,?,?,?)");
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            sentencia.setString(1, this.Nombre.getText());
            sentencia.setString(2, date.format(FechaNacimiento.getDate()));
            sentencia.setString(3, this.Telefono.getText());
            sentencia.setString(4, correo.getText());
            sentencia.execute();

        } catch (SQLException ex) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update() {// Cambiar
        try {
            SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
            this.sentencias.executeUpdate("update paciente were Cedula='" + this.ID.getText() + "'Nombre='" + this.Nombre.getText() + "',fecha='" + dt.format(this.FechaNacimiento.getDate()) + "',telefono='" + this.Telefono.getText() + "',correo='" + this.correo.getText());

        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(int Id) {
        try {
            this.sentencias.executeUpdate("delete from pacientes where id=" + Id);
        } catch (SQLException ex) {
            System.out.println("Error en delete");
        }
    }

    public void edad() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse("15/08/1993", fmt);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);
        System.out.printf("Tu edad es: %s años, %s meses y %s días", periodo.getYears(), periodo.getMonths(), periodo.getDays());
    }

    ///////////////////////////// BUSCAR ///////////////////////////////////////
    public void Read_Cedula() {

        try {
            this.datos = this.sentencias.executeQuery("select * from paciente where Cedula='" + this.ID.getText() + "'");
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

    public void Read_Nombre() {

        try {
            this.datos = this.sentencias.executeQuery("select * from pacientes where Nombre='" + this.Nombre.getText() + "'");
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

    public void Read_Fecha() {
        try {
            SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
            this.datos = this.sentencias.executeQuery("select * from pacientes where Fecha='" + dt.format(this.FechaNacimiento.getDate()) + "'");
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

    public void Read_Correo() {
        try {
            this.datos = this.sentencias.executeQuery("select * from pacientes where Correo='" + this.correo.getText() + "'");
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

    public void Read_Telefono() {

        try {
            this.datos = this.sentencias.executeQuery("select * from pacientes where Telefono='" + this.Telefono.getText() + "'");
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
//        Paciente p = new Paciente();
//        p.conectar();
//        p.create();
//        p.edad();
        //p.delete(504270426);
    }

}
