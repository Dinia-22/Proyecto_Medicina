/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Citas;

import static Conectar.Conectar.conexion;
import static Conectar.Conectar.datos;
import static Conectar.Conectar.sentencias;
import Paciente.Paciente;
import Usuarios.Usuario;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Citas extends Paciente {

    private int Id;
    private int cedula;
    private String fecha;
    private String hora;
    private String paciente;
    private String MedicoEspe;

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public void setMedicoEspe(String MedicoEspe) {
        this.MedicoEspe = MedicoEspe;
    }

    public int getId() {
        return Id;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getMedicoEspe() {
        return MedicoEspe;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCedula() {
        return cedula;
    }

    public void create() {
        try {

            PreparedStatement sentencia;
            sentencia = conexion.prepareStatement("insert citas values(null,?,?,?,?,?)");
            sentencia.setInt(1, cedula);
            sentencia.setString(2, this.fecha);
            sentencia.setString(3, this.hora);
            sentencia.setString(4, this.paciente);
            sentencia.setString(5, this.MedicoEspe);
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Se agregaron los datos");

        } catch (SQLException e) {
            if (e.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "La hora ya existe ", "La cedula ya existe", JOptionPane.ERROR_MESSAGE);

            }

        }

    }

    public void update() {
        try {
            sentencias.executeUpdate("update citas set Fecha='" + this.fecha + "',Hora='" + this.hora + "',Paciente='" + this.paciente + "',Medico='" + this.MedicoEspe + "' where Cedula=" + this.cedula);
            JOptionPane.showMessageDialog(null, "Se actualizaron los datos");

        } catch (SQLException e) {
           
        }

    }

    public void delete() {
        try {
            sentencias.executeUpdate("delete from citas where cedula=" + this.cedula);
            JOptionPane.showMessageDialog(null, "Usuario Eliminado");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar");
        }

    }

    ///////////////////////////// para buscar la informacion del usuario///////////////////////////////////////////////////
    public void readFecha() {
        try {

            datos = sentencias.executeQuery("select * from citas where Fecha='" + this.fecha + "'");
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

    public void readCedula() {
        try {
            datos = sentencias.executeQuery("select * from citas where cedula='" + this.cedula + "'");
            if (datos.next()) {

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

    public void readHora() {
        try {

            datos = sentencias.executeQuery("select * from citas where Hora='" + this.hora + "'");
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

    public void readPaciente() {
        try {

            datos = sentencias.executeQuery("select * from citas where Paciente='" + this.paciente + "'");
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

    public void readMedico() {
        try {

            datos = sentencias.executeQuery("select * from citas where Medico='" + this.MedicoEspe + "'");
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

}
