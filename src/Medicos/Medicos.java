/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medicos;

import Conectar.Conectar;
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

    public void create() {
        try {
            if (this.Nombre.getText().length() < 25 || this.tel.getText().length() < 10 || this.correo.getText().length() < 30 || this.Codigo.getText().length() < 7 || this.especialidad.getText().length() < 15) {
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
                JOptionPane.showMessageDialog(null, "Se agregaron los datos");
                sentencia.execute();
            } else {
                JOptionPane.showMessageDialog(null, "Paso el limite de caracteres");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    ////////////////////////////////////////Buscar////////////////////////////////////////
    public void readCedula() {
        try {
            if (this.ID.getText().length() <= 1) {
                this.datos = this.sentencias.executeQuery("select * from medicos where ID='" + this.ID.getText() + "'");
                if (this.datos.next()) {
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

    public void readNombre() {
        try {
            if (this.Nombre.getText().length() <= 25) {
                this.datos = this.sentencias.executeQuery("select * from medicos where NombreCompleto='" + this.Nombre.getText() + "'");
                if (this.datos.next()) {
                    System.out.println(datos.getInt(1));
                    JOptionPane.showMessageDialog(null, "Dato Encontrado " + datos.getString(3));
                    System.out.println(datos.getString(3));
                } else {
                    JOptionPane.showMessageDialog(null, "No hay mas registros");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Paso el limte de caracteres");

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
            if (this.tel.getText().length() <= 10) {
                this.datos = this.sentencias.executeQuery("select * from medicos where Telefono='" + this.tel.getText() + "'");
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

    public void readCorreo() {
        try {
            if (correo.getText().length() <= 30) {
                this.datos = this.sentencias.executeQuery("select * from medicos where CorreoElectronico='" + this.correo.getText() + "'");
                if (this.datos.next()) {
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

    public void readCodigo() {
        try {
            if (this.Codigo.getText().length() < 7) {
                this.datos = this.sentencias.executeQuery("select * from medicos where Codigo='" + this.Codigo.getText() + "'");
                if (this.datos.next()) {
                    System.out.println(datos.getInt(1));
                    JOptionPane.showMessageDialog(null, "Dato Encontrado " + datos.getString(7));
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

    public void readEspecialidad() {
        try {
            if (this.especialidad.getText().length() < 15) {
                this.datos = this.sentencias.executeQuery("select * from medicos where especialidad='" + this.especialidad.getText() + "'");
                if (this.datos.next()) {
                    System.out.println(datos.getInt(1));
                    JOptionPane.showMessageDialog(null, "Dato Encontrado " + datos.getString(8));
                    System.out.println(datos.getString(3));
                } else {
                    JOptionPane.showMessageDialog(null, "No hay mas registros");
                }

            }else{
                JOptionPane.showMessageDialog(null, "Paso el limite de caracteres");
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
                JOptionPane.showMessageDialog(null, "Dato Encontrado " + datos.getString(9));
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
            if (this.Nombre.getText().length() < 25 || this.tel.getText().length() < 10 || this.correo.getText().length() < 30 || this.Codigo.getText().length() < 7 || this.especialidad.getText().length() < 15) {
                SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
                this.sentencias.executeUpdate("update medicos set NombreCompleto='" + this.Nombre.getText() + "',FechaNacimiento='" + dt.format(this.FechaNacimiento.getDate()) + "',Telefono='" + this.tel.getText() + "',CorreoElectronico='" + this.correo.getText() + "',Codigo='" + this.Codigo.getText() + "',Especialidad='" + this.especialidad.getText() + "',Salario='" + this.salario.getText() + "' where id=" + this.ID.getText());
                JOptionPane.showMessageDialog(null, "Se actualizaron los datos");

            } else {
                JOptionPane.showMessageDialog(null, "Paso el limite de caracteres");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    ////////////////////////////////////////Metodos de Impuestos////////////////////////////////////////
    public double impuestoEMaternidad() {
        Double salario = Double.valueOf(this.salario.getText());
        double impuestos = (5.5 * salario) / 100;
        double total = impuestos + salario;
        double resta = salario - impuestos;
        System.out.println("el 5.5% de Enfermedad y maternidad es de :" + impuestos);
        System.out.println("el impuesto aplicado al salario es de :" + total);
        System.out.println("el salario neto descontando los impuestos es de :" + resta);
        JOptionPane.showMessageDialog(null, "el salario neto descontando los impuestos de Enfermedad y maternidad 5.5% es de :" + resta);
        return resta;
    }

    public double impuestoInvalidezM() {
        Double salario = Double.valueOf(this.salario.getText());
        double impuestos = (3.84 * salario) / 100;
        double total = impuestos + salario;
        double resta = salario - impuestos;
        System.out.println("el 3.84% de invalidez y muerte es de :" + impuestos);
        System.out.println("el impuesto aplicado al salario es de :" + total);
        System.out.println("el salario neto descontando los impuestos es de :" + resta);
        JOptionPane.showMessageDialog(null, "el salario neto descontando los impuestos de Invalidez y Muerte 3.84% es de :" + resta);
        return resta;
    }

    public double impuestoTrabajador() {
        Double salario = Double.valueOf(this.salario.getText());
        double impuestos = (1.0 * salario) / 100;
        double total = impuestos + salario;
        double resta = salario - impuestos;
        System.out.println("el 1% de aporte del trabajador es de :" + impuestos);
        System.out.println("el impuesto aplicado al salario es de :" + total);
        System.out.println("el salario neto descontando los impuestos es de :" + resta);
        JOptionPane.showMessageDialog(null, "el salario neto descontando los impuestos de Aporte del trabajador 1% es de :" + resta);
        return resta;
    }

    public double impuestoAsolidarista() {
        Double salario = Double.valueOf(this.salario.getText());
        double impuestos = (3.3 * salario) / 100;
        double total = impuestos + salario;
        double resta = salario - impuestos;
        System.out.println("el 3.3% de asociacion solidarista es de :" + impuestos);
        System.out.println("el impuesto aplicado al salario es de :" + total);
        System.out.println("el salario neto descontando los impuestos es de :" + resta);
        JOptionPane.showMessageDialog(null, "el salario neto descontando los impuestos de Aporte a la asociación solidarista 3.3% es de :" + resta);
        return resta;
    }

    public double impuestoRenta() {
        Double salario = Double.valueOf(this.salario.getText());
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

    public double impuestosAplicados() {
        Double salario = Double.valueOf(this.salario.getText());
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

    public double impuestosAplicadosMontoM() {
        Double salario = Double.valueOf(this.salario.getText());
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
            double impu2 = (10 * salario) / 100;
            double suma = im1 + im2 + im3 + im4 + impu2 + impu;
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
    
//    public static void main(String[] args) {
//        Conectar p = new Conectar();
//        p.conectar();
//    }
}
