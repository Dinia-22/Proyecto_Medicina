/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import static Conectar.Conectar.conexion;
import static Conectar.Conectar.datos;
import static Conectar.Conectar.sentencias;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Usuario {

    private int Id;
    private int cedula;
    private String FechaNacimiento;
    private String txtTel;
    private String txtCorreo;
    private String NomUsuario;
    private String contraseña;
    private String tipo;
    private String txtNombre;

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCedula() {
        return cedula;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public void setTxtTel(String txtTel) {
        this.txtTel = txtTel;
    }

    public void setTxtCorreo(String txtCorreo) {
        this.txtCorreo = txtCorreo;
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

    public void setTxtNombre(String txtNombre) {
        this.txtNombre = txtNombre;
    }

    public int getId() {
        return Id;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public String getTxtTel() {
        return txtTel;
    }

    public String getTxtCorreo() {
        return txtCorreo;
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

    public String getTxtNombre() {
        return txtNombre;
    }
    
    
    public void create() {
        try {

            PreparedStatement sentencia;
            sentencia = conexion.prepareStatement("insert usuarios values(null,?,?,?,?,?,?,?,?)");
          
            sentencia.setInt(1, cedula);
            sentencia.setString(2, txtNombre);
            sentencia.setString(3, this.FechaNacimiento);
            sentencia.setString(4, this.txtTel);
            sentencia.setString(5, this.txtCorreo);
            sentencia.setString(6, this.NomUsuario);
            sentencia.setString(7, this.contraseña);
            sentencia.setString(8, this.tipo);

            sentencia.execute();

            JOptionPane.showMessageDialog(null, "Se agregaron los datos");

        } catch (SQLException e) {
            if(e.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "La cedula ya existe ", "", JOptionPane.ERROR_MESSAGE);
            }
           
        }
    }

    public void update() {

        try {
            sentencias.executeUpdate("update usuarios set NombreCompleto='" + this.txtNombre + "',FechaNacimiento='" + this.FechaNacimiento + "',Telefono='" + this.txtTel + "',CorreoElectronico='" + this.txtCorreo + "',NombredeUsuario='" + this.NomUsuario + "',TipodeUsuario='" + this.tipo + "' where Cedula=" + this.cedula);
            JOptionPane.showMessageDialog(null, "Se actualizaron los datos");

        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateContraseña() {
        try {

            sentencias.executeUpdate("update usuarios set contraseña='" + this.contraseña + "' where cedula=" + this.cedula);
            JOptionPane.showMessageDialog(null, "Se actualizo la contraseña");

        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void delete() { /// controlar que siempre quede un usuario registrado al momento de eliminar
        try {
            sentencias.executeUpdate("delete from usuarios where cedula=" + this.cedula);

            JOptionPane.showMessageDialog(null, "dato eliminado");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar");
        }

    }

    ///////////////////////////// para buscar la informacion del usuario///////////////////////////////////////////////////
    public void Read_Cedula() {

        try {

            datos = sentencias.executeQuery("select * from usuarios where cedula='" + this.cedula + "'");
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

    public void readNombre() {
        try {

            datos = sentencias.executeQuery("select * from usuarios where NombreCompleto='" + this.txtNombre + "'");
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

    public void readFecha() {
        try {

            datos = sentencias.executeQuery("select * from usuarios where FechaNacimiento='" + this.FechaNacimiento + "'");
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

    public void readTel() {
        try {

            datos = sentencias.executeQuery("select * from usuarios where Telefono='" + this.txtTel + "'");
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

    public void readCorreo() {
        try {

            datos = sentencias.executeQuery("select * from usuarios where CorreoElectronico='" + this.txtCorreo + "'");
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

    public void readUsuario() {
        try {

            datos = sentencias.executeQuery("select * from usuarios where NombredeUsuario='" + this.NomUsuario + "'");
            if (datos.next()) {
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

    public void readTipo() {
        try {

            datos = sentencias.executeQuery("select * from usuarios where TipodeUsuario='" + this.tipo + "'");
            if (datos.next()) {
                System.out.println(datos.getInt(1));
                JOptionPane.showMessageDialog(null, "Dato Encontrado " + datos.getString(9));
                System.out.println(datos.getString(3));
            } else {
                JOptionPane.showMessageDialog(null, "No hay mas registros");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el read");
        }

    }


}
