/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paciente;

import static Conectar.Conectar.conexion;
import static Conectar.Conectar.datos;
import static Conectar.Conectar.sentencias;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Paciente {

    private int id;
    private int cedula;
    private String nombre;
    private String fechaNacimiento;
    private String correo;
    private int edad;
    private String telefono;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void create() {
        try {

            PreparedStatement sentencia;
            sentencia = conexion.prepareStatement("insert pacientes values(null,?,?,?,?,?)");

            sentencia.setInt(1, cedula);
            sentencia.setString(2, this.nombre);
            sentencia.setString(3, this.fechaNacimiento);
            sentencia.setString(4, this.telefono);
            sentencia.setString(5, this.correo);
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Se agregaron los datos");
        } catch (SQLException e) {
            if (e.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "Error al ingresar", "La cedula ya existe", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    public void update() {// Actualizar Informacion
        try {
            sentencias.executeUpdate("update pacientes set NombreCompleto='" + this.nombre + "',FechaNacimiento='" + this.fechaNacimiento + "',Telefono='" + this.telefono + "',CorreoElectronico='" + this.correo + "' where Cedula=" + this.cedula);
            JOptionPane.showMessageDialog(null, "Se actualizaron los datos");

        } catch (SQLException ex) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete_Cedula() {
        try {
            sentencias.executeUpdate("delete from pacientes where Cedula=" + this.cedula);
            JOptionPane.showMessageDialog(null, "Usuario Eliminado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar");
            System.out.println("Error en delete");
        }
    }

    ///////////////////////////// BUSCAR ///////////////////////////////////////
    public void Read_Cedula() {

        try {

            datos = sentencias.executeQuery("select * from pacientes where Cedula='" + this.cedula + "'");
            if (datos.next()) {
                System.out.println(datos.getInt(1));
                JOptionPane.showMessageDialog(null, "Dato Encontrado " + datos.getString(2));
                System.out.println(datos.getString(3));

            } else {
                JOptionPane.showMessageDialog(null, "Se paso del limite de caracteres");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el read");
        }
    }

    public void Read_Nombre() {

        try {

            datos = sentencias.executeQuery("select * from pacientes where NombreCompleto='" + this.nombre + "'");
            if (datos.next()) {
                System.out.println(datos.getInt(1));
                JOptionPane.showMessageDialog(null, "Dato Encontrado " + datos.getString(3));
                System.out.println(datos.getString(3));
            } else {
                JOptionPane.showMessageDialog(null, "No hay mas registros");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el read");
        }
    }

    public void Read_Fecha() {
        try {
            SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
            datos = sentencias.executeQuery("select * from pacientes where FechaNacimiento='" + this.fechaNacimiento + "'");
            if (datos.next()) {
                System.out.println(datos.getInt(1));
                JOptionPane.showMessageDialog(null, "Dato Encontrado " + datos.getString(4));
                System.out.println(datos.getString(3));
            } else {
                JOptionPane.showMessageDialog(null, "No hay mas registros");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el read");
        }
    }

    public void Read_Telefono() {

        try {

            datos = sentencias.executeQuery("select * from pacientes where Telefono='" + this.telefono + "'");
            if (datos.next()) {
                System.out.println(datos.getInt(1));
                JOptionPane.showMessageDialog(null, "Dato Encontrado " + datos.getString(5));
                System.out.println(datos.getString(3));
            } else {
                JOptionPane.showMessageDialog(null, "No hay mas registros");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el read");
        }

    }

    public void Read_Correo() {
        try {

            datos = sentencias.executeQuery("select * from pacientes where CorreoElectronico='" + this.correo + "'");
            if (datos.next()) {
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

//    public static void main(String[] args) {
//        Conectar p = new Conectar();
//        p.conectar();
//    }
}
