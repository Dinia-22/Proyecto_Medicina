/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import static Conectar.Conectar.conexion;
import static Conectar.Conectar.datos;
import static Conectar.Conectar.sentencias;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.JTextField;


public class Usuario {

    public JTextField ID;
    public JDateChooser FechaNacimiento;
    public JTextField txtTel;
    public JTextField txtCorreo;
    public JTextField NomUsuario;
    public JTextField contraseña;
    public JTextField tipo;
    public JTextField txtNombre;

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

    public void create() {
        try {
            if (this.txtNombre.getText().length() < 25 || this.contraseña.getText().length() < 7 || this.txtCorreo.getText().length() < 30 || this.txtTel.getText().length() < 9 || this.tipo.getText().length() < 20) {
                PreparedStatement sentencia;
                sentencia = conexion.prepareStatement("insert usuarios values(null,?,?,?,?,?,?,?)");
                SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
                sentencia.setString(1, txtNombre.getText());
                sentencia.setString(2, dt.format(FechaNacimiento.getDate()));
                sentencia.setString(3, this.txtTel.getText());
                sentencia.setString(4, this.txtCorreo.getText());
                sentencia.setString(5, this.NomUsuario.getText());
                sentencia.setString(6, this.contraseña.getText());
                sentencia.setString(7, this.tipo.getText());

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
            if (this.txtNombre.getText().length() < 25 || this.contraseña.getText().length() < 7 || this.txtCorreo.getText().length() < 30 || this.txtTel.getText().length() < 9 || this.tipo.getText().length() < 10) {
                SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
                sentencias.executeUpdate("update usuarios set NombreCompleto='" + this.txtNombre.getText() + "',FechaNacimiento='" + dt.format(this.FechaNacimiento.getDate()) + "',Telefono='" + this.txtTel.getText() + "',CorreoElectronico='" + this.txtCorreo.getText() + "',NombredeUsuario='" + this.NomUsuario.getText() + "',TipodeUsuario='" + this.tipo.getText() + "' where ID=" + this.ID.getText());
                JOptionPane.showMessageDialog(null, "Se actualizaron los datos");

            } else {
                JOptionPane.showMessageDialog(null, "Paso el limite de caracteres");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateContraseña() {
        try {
            if (this.contraseña.getText().length() < 15) {
                sentencias.executeUpdate("update usuarios set contraseña='" + this.contraseña.getText() + "' where id=" + this.ID.getText());
                JOptionPane.showMessageDialog(null, "Se actualizo la contraseña");

            } else {
                JOptionPane.showMessageDialog(null, "Paso el limite de caracteres");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void delete() { /// controlar que siempre quede un usuario registrado al momento de eliminar
        try {
            sentencias.executeUpdate("delete from usuarios where ID=" + this.ID.getText());

            JOptionPane.showMessageDialog(null, "dato eliminado");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar");
        }

    }

    ///////////////////////////// para buscar la informacion del usuario///////////////////////////////////////////////////
    public void Read_Cedula() {

        try {
            if (this.ID.getText().length() <= 11) {
                datos = sentencias.executeQuery("select * from usuarios where id='" + this.ID.getText() + "'");
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

    public void readNombre() {
        try {
            if (this.txtNombre.getText().length() <= 25) {
                datos = sentencias.executeQuery("select * from usuarios where NombreCompleto='" + this.txtNombre.getText() + "'");
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

    public void readFecha() {
        try {
            SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");

            datos = sentencias.executeQuery("select * from usuarios where FechaNacimiento='" + dt.format(this.FechaNacimiento.getDate()) + "'");
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

    public void readTel() {
        try {
            if (this.txtTel.getText().length() <= 9) {
                datos = sentencias.executeQuery("select * from usuarios where Telefono='" + this.txtTel.getText() + "'");
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

    public void readCorreo() {
        try {
            if (this.txtCorreo.getText().length() <= 30) {
                datos = sentencias.executeQuery("select * from usuarios where CorreoElectronico='" + this.txtCorreo.getText() + "'");
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

    public void readUsuario() {
        try {
            if (this.NomUsuario.getText().length() <= 15) {
                datos = sentencias.executeQuery("select * from usuarios where NombredeUsuario='" + this.NomUsuario.getText() + "'");
                if (datos.next()) {
                    System.out.println(datos.getInt(1));
                    JOptionPane.showMessageDialog(null, "Dato Encontrado " + datos.getString(6));
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

    public void readTipo() {
        try {
            if (this.tipo.getText().length() <= 10) {
                datos = sentencias.executeQuery("select * from usuarios where TipodeUsuario='" + this.tipo.getText() + "'");
                if (datos.next()) {
                    System.out.println(datos.getInt(1));
                    JOptionPane.showMessageDialog(null, "Dato Encontrado " + datos.getString(8));
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
