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

    public void create() {
        try {
            this.conexion = DriverManager.getConnection("jdbc:mysql://localhost/medicina?useServerPrepStmts=true", "root", "");
            this.sentencias = this.conexion.createStatement();
            PreparedStatement sentencia;
            sentencia = conexion.prepareStatement("insert medicos values(null,?,?,?,?,?,?,?)");
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            sentencia.setString(1, ID.getText());
            sentencia.setString(2, Nombre.getText());
            sentencia.setString(3, date.format(FechaNacimiento.getDate()));
            sentencia.setString(4, correo.getText());
            sentencia.setString(5, Codigo.getText());
            sentencia.setString(6, especialidad.getText());
            sentencia.setString(7, salario.getText());
            sentencia.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void impuestoEMaternidad(float salario) {
        double impuestos = 5.5 * salario;
        double resultado = impuestos / 100;
        double total = resultado + salario;
        double resta = salario - resultado;
        System.out.println("el 5.5% de Enfermedad y maternidad es de :" + resultado);
        System.out.println("el impuesto aplicado al salario es de :" + total);
        System.out.println("el salario neto descontando los impuestos es de :" + resta);
    }

    public void impuestoInvalidezM(float salario) {
        double impuestos = 3.84 * salario;
        double resultado = impuestos / 100;
        double total = resultado + salario;
        double resta = salario - resultado;
        System.out.println("el 3.84% de invalidez y muerte es de :" + resultado);
        System.out.println("el impuesto aplicado al salario es de :" + total);
        System.out.println("el salario neto descontando los impuestos es de :" + resta);
    }

    public void impuestoTrabajador(float salario) {
        double impuestos = 1.0 * salario;
        double resultado = impuestos / 100;
        double total = resultado + salario;
        double resta = salario - resultado;
        System.out.println("el 1% de aporte del trabajador es de :" + resultado);
        System.out.println("el impuesto aplicado al salario es de :" + total);
        System.out.println("el salario neto descontando los impuestos es de :" + resta);
    }

    public void impuestoAsolidarista(float salario) {
        double impuestos = 3.3 * salario;
        double resultado = impuestos / 100;
        double total = resultado + salario;
        double resta = salario - resultado;
        System.out.println("el 3.3% de asociacion solidarista es de :" + resultado);
        System.out.println("el impuesto aplicado al salario es de :" + total);
        System.out.println("el salario neto descontando los impuestos es de :" + resta);
    }

    public void impuestoRenta(float salario) {
        if (salario >= 817001 && salario <= 1226000) {
            double impuesto = 10 * salario;
            double resultado = impuesto / 100;
            double total = resultado + salario;
            double resta = salario - resultado;
            System.out.println("el 10% de impuesto a la renta es de :" + resultado);
            System.out.println("el impuesto aplicado al salario es de :" + total);
            System.out.println("el salario neto descontando los impuestos es de :" + resta);
        } else if (salario >= 1226001) {
            double impu = 15 * salario;
            double impuresultado = impu / 100;
            double totalimpuesto = impuresultado + salario;
            double restados = salario - impuresultado;
            System.out.println("el 15% de impuesto a la renta es de :" + impuresultado);
            System.out.println("el impuesto aplicado al salario es de :" + totalimpuesto);
            System.out.println("el salario neto descontando los impuestos es de :" + restados);
        }
    }

//    public static void main(String[] args) {
//        // TODO code application logic here
//        Medicos p = new Medicos(0, " ", 2, 0, "", 0, "", 0);
//        p.conectar();
//        p.create();
//
//        System.out.println("metodos de impuesto de medicina ");
//        p.impuestoEMaternidad(250000);
//        p.impuestoInvalidezM(250000);
//        p.impuestoTrabajador(250000);
//        p.impuestoAsolidarista(250000);
//        p.impuestoRenta(900000);
//    }
}
