/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medicos;

import static Conectar.Conectar.conexion;
import static Conectar.Conectar.datos;
import static Conectar.Conectar.sentencias;
import Usuarios.Usuario;
import com.toedter.calendar.JDateChooser;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Medicos {

    private int id;
    private String nombre;
    private JDateChooser FechaNacimiento;
    private String tel;
    private String correo;
    private int codigo;
    private String especialidad;
    public double salario;

    public JDateChooser getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(JDateChooser FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTel() {
        return tel;
    }

    public String getCorreo() {
        return correo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCodigo(int Codigo) {
        this.codigo = Codigo;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void create() {
        try {

            PreparedStatement sentencia;
            sentencia = conexion.prepareStatement("insert medicos values(null,?,?,?,?,?,?,?)");
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            sentencia.setString(1, nombre);
            sentencia.setString(2, date.format(FechaNacimiento.getDate()));
            sentencia.setString(3, tel);
            sentencia.setString(4, correo);
            sentencia.setInt(5, codigo);
            sentencia.setString(6, especialidad);
            sentencia.setDouble(7, salario);
            JOptionPane.showMessageDialog(null, "Se agregaron los datos");
            sentencia.execute();

        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    ////////////////////////////////////////Buscar////////////////////////////////////////
    public void readCedula() {
        try {
            if (this.id <= 999) {
                datos = sentencias.executeQuery("select * from medicos where ID=" + this.id + "");
                if (datos.next()) {
                    System.out.println(datos.getInt(1));
                    JOptionPane.showMessageDialog(null, "Dato Encontrado " + datos.getString(1));
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

    public void readNombre() {
        try {
            datos = sentencias.executeQuery("select * from medicos where NombreCompleto='" + this.nombre + "'");
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

    public void readDate() {
        try {
            SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");

            datos = sentencias.executeQuery("select * from medicos where FechaNacimiento='" + dt.format(this.FechaNacimiento.getDate()) + "'");
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
            datos = sentencias.executeQuery("select * from medicos where Telefono='" + tel + "'");
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

    public void readCorreo() {
        try {

            datos = sentencias.executeQuery("select * from medicos where CorreoElectronico='" + this.correo + "'");
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

    public void readCodigo() {
        try {
            datos = sentencias.executeQuery("select * from medicos where Codigo='" + this.codigo + "'");
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

    public void readEspecialidad() {
        try {
            datos = sentencias.executeQuery("select * from medicos where especialidad='" + this.especialidad + "'");
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

    public void readSalario() {
        try {
            datos = sentencias.executeQuery("select * from medicos where Salario='" + this.salario + "'");
            if (datos.next()) {
                System.out.println(datos.getInt(1));
                JOptionPane.showMessageDialog(null, "Dato Encontrado " + datos.getString(8));
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
            sentencias.executeUpdate("delete from medicos where id=" + this.id);
            JOptionPane.showMessageDialog(null, "Usuario Eliminado");
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al Eliminar");
        }

    }

    ////////////////////////////////////////Metodos de Actualizar////////////////////////////////////////
    public void update() {

        try {

            SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
            sentencias.executeUpdate("update medicos set NombreCompleto='" + this.nombre + "',FechaNacimiento='" + dt.format(this.FechaNacimiento.getDate()) + "',Telefono='" + this.tel + "',CorreoElectronico='" + this.correo + "',Codigo='" + this.codigo + "',Especialidad='" + this.especialidad + "',Salario='" + this.salario + "' where id=" + this.id);
            JOptionPane.showMessageDialog(null, "Se actualizaron los datos");

        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    ////////////////////////////////////////Metodos de Impuestos////////////////////////////////////////
    public double impuestoEMaternidad(double salario) {

        double impuestos = (5.5 * salario) / 100;
        double total = impuestos + salario;
        double resta = salario - impuestos;
        System.out.println("el 5.5% de Enfermedad y maternidad es de :" + impuestos);
        System.out.println("el impuesto aplicado al salario es de :" + total);
        System.out.println("el salario neto descontando los impuestos es de :" + resta);
        JOptionPane.showMessageDialog(null, "el salario neto descontando los impuestos de Enfermedad y maternidad 5.5% es de :" + resta);
        return resta;
    }

    public double impuestoInvalidezM(double salario) {

        double impuestos = (3.84 * salario) / 100;
        double total = impuestos + salario;
        double resta = salario - impuestos;
        System.out.println("el 3.84% de invalidez y muerte es de :" + impuestos);
        System.out.println("el impuesto aplicado al salario es de :" + total);
        System.out.println("el salario neto descontando los impuestos es de :" + resta);
        JOptionPane.showMessageDialog(null, "el salario neto descontando los impuestos de Invalidez y Muerte 3.84% es de :" + resta);
        return resta;
    }

    public double impuestoTrabajador(double salario) {

        double impuestos = (1.0 * salario) / 100;
        double total = impuestos + salario;
        double resta = salario - impuestos;
        System.out.println("el 1% de aporte del trabajador es de :" + impuestos);
        System.out.println("el impuesto aplicado al salario es de :" + total);
        System.out.println("el salario neto descontando los impuestos es de :" + resta);
        JOptionPane.showMessageDialog(null, "el salario neto descontando los impuestos de Aporte del trabajador 1% es de :" + resta);
        return resta;
    }

    public double impuestoAsolidarista(double salario) {

        double impuestos = (3.3 * salario) / 100;
        double total = impuestos + salario;
        double resta = salario - impuestos;
        System.out.println("el 3.3% de asociacion solidarista es de :" + impuestos);
        System.out.println("el impuesto aplicado al salario es de :" + total);
        System.out.println("el salario neto descontando los impuestos es de :" + resta);
        JOptionPane.showMessageDialog(null, "el salario neto descontando los impuestos de Aporte a la asociación solidarista 3.3% es de :" + resta);
        return resta;
    }

    public double impuestoRenta(double salario) {

        if (salario >= 817001 && salario <= 1226000) {
            double impuesto = (10 * salario) / 100;
            double total = impuesto + salario;
            double resta = salario - impuesto;
            System.out.println("el 10% de impuesto a la renta es de :" + impuesto);
            System.out.println("el impuesto aplicado al salario es de :" + total);
            System.out.println("el salario neto descontando los impuestos es de :" + resta);
            JOptionPane.showMessageDialog(null, "el salario neto descontando los impuestos de Impuesto sobre la renta 10% es de :" + resta);
            return resta;
        } else if (salario >= 1226001) {
            double impu = (15 * salario) / 100;
            double totalimpuesto = impu + salario;
            double restados = salario - impu;
            System.out.println("el 15% de impuesto a la renta es de :" + impu);
            System.out.println("el impuesto aplicado al salario es de :" + totalimpuesto);
            System.out.println("el salario neto descontando los impuestos es de :" + restados);
            JOptionPane.showMessageDialog(null, "el salario neto descontando los impuestos de Impuesto sobre la renta 15% es de :" + restados);
            return restados;
        }
        return 0;
    }

    public double impuestosAplicados(double salario) {

        double im1 = (5.5 * salario) / 100;
        double im2 = (3.84 * salario) / 100;
        double im3 = (1 * salario) / 100;
        double im4 = (3.3 * salario) / 100;
        double suma = im1 + im2 + im3 + im4;
        double resta = salario - suma;
        System.out.println("la suma de los impuestos es de " + suma);
        System.out.println("el salario neto descontando los impuestos del la \n"
                + " Enfermedad y maternidad 5.5%.  \n"
                + " tambien Invalidez y Muerte 3.84%. \n"
                + "Ademas de Aporte del trabajador 1% \n"
                + "y tambien Aporte a la asociación solidarista 3.3%  da un salario neto de :" + resta);
        JOptionPane.showMessageDialog(null, "el salario neto descontando los impuestos del la \n"
                + " Enfermedad y maternidad 5.5%.  \n"
                + " tambien Invalidez y Muerte 3.84%. \n"
                + "A demas de Aporte del trabajador 1% \n"
                + "y tambien Aporte a la asociación solidarista 3.3% y tambien el impuesto \n"
                + "Impuesto sobre la renta de un 10% da un salario neto de :" + resta);
        return resta;
    }

    public double impuestosAplicadosMontoM(double salario) {

        double im1 = (5.5 * salario) / 100;
        double im2 = (3.84 * salario) / 100;
        double im3 = (1 * salario) / 100;
        double im4 = (3.3 * salario) / 100;
        if (salario >= 817001 && salario <= 1226000) {
            double impuesto = (10 * salario) / 100;
            double suma = im1 + im2 + im3 + im4 + impuesto;
            double resta = salario - suma;
            JOptionPane.showMessageDialog(null, "el salario neto descontando los impuestos del la \n"
                    + " Enfermedad y maternidad 5.5%.  \n"
                    + " tambien Invalidez y Muerte 3.84%. \n"
                    + "A demas de Aporte del trabajador 1% \n"
                    + "y tambien Aporte a la asociación solidarista 3.3% y tambien el impuesto \n"
                    + "Impuesto sobre la renta de un 10% da un salario neto de :" + resta);
            return resta;
        } else if (salario >= 1226001) {
            double impu = (15 * salario) / 100;
            double suma = im1 + im2 + im3 + im4 + impu;
            double restados = salario - suma;
            JOptionPane.showMessageDialog(null, "el salario neto descontando los impuestos del la \n"
                    + " Enfermedad y maternidad 5.5%.  \n"
                    + " tambien Invalidez y Muerte 3.84%. \n"
                    + "A demas de Aporte del trabajador 1% \n"
                    + "y tambien Aporte a la asociación solidarista 3.3% y tambien el impuesto \n"
                    + "Impuesto sobre la renta de un 15% da un salario neto de :" + restados);
            return restados;
        }
        return 0;
    }

}
