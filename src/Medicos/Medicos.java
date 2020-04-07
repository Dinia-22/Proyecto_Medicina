/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medicos;

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
public class Medicos {
//
//    public int ID;
//    public String Nombre;
//    public int FechaNacimiento;
//    public int tel;
//    public String correo;
//    public int Codigo;
//    public String especialidad;
//    public float salario;

    public JTextField ID;
    public JTextField Nombre;
    public JDateChooser FechaNacimiento;
    public JTextField tel;
    public JTextField correo;
    public JTextField Codigo;
    public JTextField especialidad;
    public JTextField salario;

    private Statement sentencias;
    private Connection conexion;
    private ResultSet datos;

    public JTextField getID() {
        return ID;
    }

    public JTextField getNombre() {
        return Nombre;
    }

    public JTextField getTel() {
        return tel;
    }

    public JTextField getCorreo() {
        return correo;
    }

    public JTextField getCodigo() {
        return Codigo;
    }

    public JTextField getEspecialidad() {
        return especialidad;
    }

    public JTextField getSalario() {
        return salario;
    }

    public void setID(JTextField ID) {
        this.ID = ID;
    }

    public void setNombre(JTextField Nombre) {
        this.Nombre = Nombre;
    }

    public void setTel(JTextField tel) {
        this.tel = tel;
    }

    public void setCorreo(JTextField correo) {
        this.correo = correo;
    }

    public void setCodigo(JTextField Codigo) {
        this.Codigo = Codigo;
    }

    public void setEspecialidad(JTextField especialidad) {
        this.especialidad = especialidad;
    }

    public void setSalario(JTextField salario) {
        this.salario = salario;
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
            sentencia = conexion.prepareStatement("insert medicos values(null,?,?,?,?,?,?,?)");
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            //sentencia.setString(1, ID.getText());
            sentencia.setString(1, Nombre.getText());
            sentencia.setString(2, date.format(FechaNacimiento.getDate()));
            sentencia.setString(3, this.tel.getText());
            sentencia.setString(4, correo.getText());
            sentencia.setString(5, Codigo.getText());
            sentencia.setString(6, especialidad.getText());
            sentencia.setString(7, salario.getText());
            sentencia.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    ////////////////////////////////////////Buscar////////////////////////////////////////
    public void readCedula() {
        try {
            this.datos = this.sentencias.executeQuery("select * from medicos where ID='" + this.ID.getText() + "'");
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

    public void readNombre() {
        try {
            this.datos = this.sentencias.executeQuery("select * from medicos where NombreCompleto='" + this.Nombre.getText() + "'");
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

    public void readDate() {
        try {
            SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
            this.datos = this.sentencias.executeQuery("select * from medicos where FechaNacimiento='" + dt.format(this.FechaNacimiento.getDate()) + "'");
            if (this.datos.next()) {
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
            this.datos = this.sentencias.executeQuery("select * from medicos where Telefono='" + this.tel.getText() + "'");
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

    public void readCorreo() {
        try {
            this.datos = this.sentencias.executeQuery("select * from medicos where CorreoElectronico='" + this.correo.getText() + "'");
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

    public void readCodigo() {
        try {
            this.datos = this.sentencias.executeQuery("select * from medicos where Codigo='" + this.Codigo.getText() + "'");
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

    public void readEspecialidad() {
        try {
            this.datos = this.sentencias.executeQuery("select * from medicos where especialidad='" + this.especialidad.getText() + "'");
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

    public void readSalario() {
        try {
            this.datos = this.sentencias.executeQuery("select * from medicos where Salario='" + this.salario.getText() + "'");
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

    ////////////////////////////////////////Metodos de Eliminar////////////////////////////////////////
    public void delete() {
        try {
            this.sentencias.executeUpdate("delete from medicos where id=" + this.ID.getText());
            JOptionPane.showMessageDialog(null, "Usuario Eliminado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar");
        }

    }

    ////////////////////////////////////////Metodos de Actualizar////////////////////////////////////////
    public void update() {
        try {
            SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
            this.sentencias.executeUpdate("update medicos set NombreCompleto='" + this.Nombre.getText() + "',FechaNacimiento='" + dt.format(this.FechaNacimiento.getDate()) + "',Telefono='" + this.tel.getText() + "',CorreoElectronico='" + this.correo.getText() + "',Codigo='" + this.Codigo.getText() + "',Especialidad='" + this.especialidad.getText() + "',Salario='" + this.salario.getText() + "' where id=" + this.ID.getText());
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    ////////////////////////////////////////Metodos de Impuestos////////////////////////////////////////
    public void impuestoEMaternidad() {
        Double salario = Double.valueOf(this.salario.getText());
        double impuestos = 5.5 * salario;
        double resultado = impuestos / 100;
        double total = resultado + salario;
        double resta = salario - resultado;
        System.out.println("el 5.5% de Enfermedad y maternidad es de :" + resultado);
        System.out.println("el impuesto aplicado al salario es de :" + total);
        System.out.println("el salario neto descontando los impuestos es de :" + resta);
        JOptionPane.showMessageDialog(null,"el salario neto descontando los impuestos de Enfermedad y maternidad 5.5% es de :" + resta);

    }

    public void impuestoInvalidezM() {
        Double salario = Double.valueOf(this.salario.getText());
        double impuestos = 3.84 * salario;
        double resultado = impuestos / 100;
        double total = resultado + salario;
        double resta = salario - resultado;
        System.out.println("el 3.84% de invalidez y muerte es de :" + resultado);
        System.out.println("el impuesto aplicado al salario es de :" + total);
        System.out.println("el salario neto descontando los impuestos es de :" + resta);
        JOptionPane.showMessageDialog(null,"el salario neto descontando los impuestos de Invalidez y Muerte 3.84% es de :" + resta);
    }

    public void impuestoTrabajador() {
        Double salario = Double.valueOf(this.salario.getText());
        double impuestos = 1.0 * salario;
        double resultado = impuestos / 100;
        double total = resultado + salario;
        double resta = salario - resultado;
        System.out.println("el 1% de aporte del trabajador es de :" + resultado);
        System.out.println("el impuesto aplicado al salario es de :" + total);
        System.out.println("el salario neto descontando los impuestos es de :" + resta);
        JOptionPane.showMessageDialog(null,"el salario neto descontando los impuestos de Aporte del trabajador 1% es de :" + resta);
    }

    public void impuestoAsolidarista() {
        Double salario = Double.valueOf(this.salario.getText());
        double impuestos = 3.3 * salario;
        double resultado = impuestos / 100;
        double total = resultado + salario;
        double resta = salario - resultado;
        System.out.println("el 3.3% de asociacion solidarista es de :" + resultado);
        System.out.println("el impuesto aplicado al salario es de :" + total);
        System.out.println("el salario neto descontando los impuestos es de :" + resta);
        JOptionPane.showMessageDialog(null,"el salario neto descontando los impuestos de Aporte a la asociación solidarista 3.3% es de :" + resta);
    }

    public void impuestoRenta() {
        Double salario = Double.valueOf(this.salario.getText());
        if (salario >= 817001 && salario <= 1226000) {
            double impuesto = 10 * salario;
            double resultado = impuesto / 100;
            double total = resultado + salario;
            double resta = salario - resultado;
            System.out.println("el 10% de impuesto a la renta es de :" + resultado);
            System.out.println("el impuesto aplicado al salario es de :" + total);
            System.out.println("el salario neto descontando los impuestos es de :" + resta);
            JOptionPane.showMessageDialog(null,"el salario neto descontando los impuestos de Impuesto sobre la renta 10% es de :" + resta);
        } else if (salario >= 1226001) {
            double impu = 15 * salario;
            double impuresultado = impu / 100;
            double totalimpuesto = impuresultado + salario;
            double restados = salario - impuresultado;
            System.out.println("el 15% de impuesto a la renta es de :" + impuresultado);
            System.out.println("el impuesto aplicado al salario es de :" + totalimpuesto);
            System.out.println("el salario neto descontando los impuestos es de :" + restados);
            JOptionPane.showMessageDialog(null,"el salario neto descontando los impuestos de Impuesto sobre la renta 15% es de :" + restados);
        }
    }

}
