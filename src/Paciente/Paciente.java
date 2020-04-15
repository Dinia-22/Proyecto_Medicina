/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paciente;

import static Conectar.Conectar.conexion;
import static Conectar.Conectar.datos;
import static Conectar.Conectar.sentencias;
import com.toedter.calendar.JDateChooser;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
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

    public JDateChooser getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void create() {
        try {
            if (this.Nombre.getText().length() < 25 || this.Telefono.getText().length() < 10 || this.correo.getText().length() < 30) {
                PreparedStatement sentencia;
                sentencia = conexion.prepareStatement("insert pacientes values(null,?,?,?,?)");
                SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
                sentencia.setString(1, this.Nombre.getText());
                sentencia.setString(2, date.format(FechaNacimiento.getDate()));
                sentencia.setString(3, this.Telefono.getText());
                sentencia.setString(4, correo.getText());
                sentencia.execute();
                JOptionPane.showMessageDialog(null, "Se agregaron los datos");
            } else {
                JOptionPane.showMessageDialog(null, "Paso el limite de caracteres");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update() {// Actualizar Informacion
        try {
            if (this.Nombre.getText().length() < 25 || this.Telefono.getText().length() < 10 || this.correo.getText().length() < 30) {
                SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
                sentencias.executeUpdate("update pacientes set NombreCompleto='" + this.Nombre.getText() + "',FechaNacimiento='" + dt.format(this.FechaNacimiento.getDate()) + "',Telefono='" + this.Telefono.getText() + "',CorreoElectronico='" + this.correo.getText() + "' where id=" + this.ID.getText());
                JOptionPane.showMessageDialog(null, "Se actualizaron los datos");
            } else {
                JOptionPane.showMessageDialog(null, "Paso el limite de caracteres");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete() {
        try {
            sentencias.executeUpdate("delete from pacientes where id=" + ID.getText());
        } catch (SQLException ex) {
            System.out.println("Error en delete");
        }
    }

    ///////////////////////////// BUSCAR ///////////////////////////////////////
    public void Read_Cedula() {

        try {
            if (this.ID.getText().length() <= 11) {
                datos = sentencias.executeQuery("select * from pacientes where id='" + this.ID.getText() + "'");
                if (datos.next()) {
                    System.out.println(datos.getInt(1));
                    JOptionPane.showMessageDialog(null, "Dato Encontrado " + datos.getString(1));
                    System.out.println(datos.getString(3));
                } else {
                    JOptionPane.showMessageDialog(null, "No hay mas registros");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Se paso del limite de caracteres");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el read");
        }
    }

    public void Read_Nombre() {

        try {
            if (this.Nombre.getText().length() <= 25) {
                datos = sentencias.executeQuery("select * from pacientes where NombreCompleto='" + this.Nombre.getText() + "'");
                if (datos.next()) {
                    System.out.println(datos.getInt(1));
                    JOptionPane.showMessageDialog(null, "Dato Encontrado " + datos.getString(2));
                    System.out.println(datos.getString(3));
                } else {
                    JOptionPane.showMessageDialog(null, "No hay mas registros");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Paso el limite de caracteres");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el read");
        }
    }

    public void Read_Fecha() {
        try {
            SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
            datos = sentencias.executeQuery("select * from pacientes where FechaNacimiento='" + dt.format(this.FechaNacimiento.getDate()) + "'");
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

    public void Read_Correo() {
        try {
            if (correo.getText().length() <= 30) {
                datos = sentencias.executeQuery("select * from pacientes where CorreoElectronico='" + this.correo.getText() + "'");
                if (datos.next()) {
                    System.out.println(datos.getInt(1));
                    JOptionPane.showMessageDialog(null, "Dato Encontrado " + datos.getString(4));
                    System.out.println(datos.getString(3));
                } else {
                    JOptionPane.showMessageDialog(null, "No hay mas registros");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Paso el limite de caracteres");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el read");
        }
    }

    public void Read_Telefono() {

        try {
            if (this.Telefono.getText().length() < 7) {
                datos = sentencias.executeQuery("select * from pacientes where Telefono='" + this.Telefono.getText() + "'");
                if (datos.next()) {
                    System.out.println(datos.getInt(1));
                    JOptionPane.showMessageDialog(null, "Dato Encontrado " + datos.getString(5));
                    System.out.println(datos.getString(3));
                } else {
                    JOptionPane.showMessageDialog(null, "No hay mas registros");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Paso el limite de caracteres");
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
