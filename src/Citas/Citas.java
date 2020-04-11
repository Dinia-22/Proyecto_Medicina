/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Citas;

import Usuarios.Usuario;
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
public class Citas {

    public JTextField ID;
    public JDateChooser fecha;
    public JTextField hora;
    public JTextField paciente;
    public JTextField MedicoEspe;
    private Connection conexion;
    private Statement sentencias;
    private ResultSet datos;

    public JTextField getID() {
        return ID;
    }

    public JDateChooser getFecha() {
        return fecha;
    }

    public JTextField getHora() {
        return hora;
    }

    public JTextField getPaciente() {
        return paciente;
    }

    public JTextField getMedicoEspe() {
        return MedicoEspe;
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
            if (this.hora.getText().length() < 10 || this.MedicoEspe.getText().length() < 15 || paciente.getText().length() < 25) {
                PreparedStatement sentencia;
                sentencia = conexion.prepareStatement("insert citas values(null,?,?,?,?)");
                SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
                sentencia.setString(1, dt.format(this.fecha.getDate()));
                sentencia.setString(2, this.hora.getText());
                sentencia.setString(3, this.paciente.getText());
                sentencia.setString(4, this.MedicoEspe.getText());
                sentencia.execute();
                JOptionPane.showMessageDialog(null, "Se agregaron los datos");
            } else {
                JOptionPane.showMessageDialog(null, "Paso el limite de caracteres");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void update() {
        try {
            if (this.hora.getText().length() < 10 || this.MedicoEspe.getText().length() < 15 || paciente.getText().length() < 25) {
                SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
                this.sentencias.executeUpdate("update citas set Fecha='" + dt.format(this.fecha.getDate()) + "',Hora='" + this.hora.getText() + "',Paciente='" + this.paciente.getText() + "',Medico='" + this.MedicoEspe.getText() + "' where Id=" + this.ID.getText());
                JOptionPane.showMessageDialog(null, "Se actualizaron los datos");
            } else {
                JOptionPane.showMessageDialog(null, "Paso el limite de caracteres");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void delete() {
        try {
            this.sentencias.executeUpdate("delete from citas where id=" + this.ID.getText());
            JOptionPane.showMessageDialog(null, "Usuario Eliminado");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar");
        }

    }

    ///////////////////////////// para buscar la informacion del usuario///////////////////////////////////////////////////
    public void readFecha() {
        try {
            SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
            this.datos = this.sentencias.executeQuery("select * from citas where Fecha='" + dt.format(this.fecha.getDate()) + "'");
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

    public void readCedula() {
        try {
            if (this.ID.getText().length() <= 1) {
                this.datos = this.sentencias.executeQuery("select * from citas where Id='" + this.ID.getText() + "'");
                if (this.datos.next()) {

                    System.out.println(datos.getInt(1));
                    JOptionPane.showMessageDialog(null, "Dato Encontrado " + datos.getString(4));
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

    public void readHora() {
        try {
            if (this.hora.getText().length() <= 7) {
                this.datos = this.sentencias.executeQuery("select * from citas where Hora='" + this.hora.getText() + "'");
                if (this.datos.next()) {
                    System.out.println(datos.getInt(1));
                    JOptionPane.showMessageDialog(null, "Dato Encontrado " + datos.getString(3));
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

    public void readPaciente() {
        try {
            if (this.paciente.getText().length() <= 25) {
                this.datos = this.sentencias.executeQuery("select * from citas where Paciente='" + this.paciente.getText() + "'");
                if (this.datos.next()) {
                    System.out.println(datos.getInt(1));
                    JOptionPane.showMessageDialog(null, "Dato Encontrado " + datos.getString(4));
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

    public void readMedico() {
        try {
            if (MedicoEspe.getText().length() <= 25) {
                this.datos = this.sentencias.executeQuery("select * from citas where Medico='" + this.MedicoEspe.getText() + "'");
                if (this.datos.next()) {
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

}
