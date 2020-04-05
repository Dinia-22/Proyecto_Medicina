/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medicos;

import Usuarios.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maria Paula
 */
public class Medicos {

    private int ID;
    private String Nombre;
    private int FechaNacimiento;
    private int tel;
    private String correo;
    private int Codigo;
    private String especialidad;
    private float salario;
    private Statement sentencias;
    private Connection conexion;

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getFechaNacimiento() {
        return FechaNacimiento;
    }

    public int getTel() {
        return tel;
    }

    public String getCorreo() {
        return correo;
    }

    public int getCodigo() {
        return Codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public float getSalario() {
        return salario;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setFechaNacimiento(int FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Medicos(int ID, String Nombre, int FechaNacimiento, int tel, String correo, int Codigo, String especialidad, float salario) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.tel = tel;
        this.correo = correo;
        this.Codigo = Codigo;
        this.especialidad = especialidad;
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

            sentencia.setString(1, "Enrique");
            sentencia.setInt(2, 1980);
            sentencia.setInt(3, 17234569);
            sentencia.setString(4, "enri@hotmail.com");
            sentencia.setInt(5, 0102);
            sentencia.setString(6, "cirujano");
            sentencia.setFloat(7, 500000);
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

    public static void main(String[] args) {
        // TODO code application logic here
        Medicos p = new Medicos(0, " ", 2, 0, "", 0, "", 0);
        p.conectar();
        p.create();

        System.out.println("metodos de impuesto de medicina ");
        p.impuestoEMaternidad(250000);
        p.impuestoInvalidezM(250000);
        p.impuestoTrabajador(250000);
        p.impuestoAsolidarista(250000);
        p.impuestoRenta(900000);
    }

}
