/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expediente;

import static Conectar.Conectar.conexion;
import static Conectar.Conectar.datos;
import static Conectar.Conectar.sentencias;
import Usuarios.Usuario;

import java.io.File;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/**
 *
 * @author Maria Paula
 */
public class Expediente extends Thread {

    private String Fecha;
    private String hora;
    private String medico;
    private String Descrip;
    private String paciente;
    private int ID;
    private int cedula;
    

    public Expediente() {
        this.Fecha = Fecha;
        this.hora = hora;
        this.medico = medico;
        this.Descrip = Descrip;
        this.paciente = paciente;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getMedico() {
        return medico;
    }

    public String getDescrip() {
        return Descrip;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getID() {
        return ID;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public void setDescrip(String Descrip) {
        this.Descrip = Descrip;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    

    public void create() {
        try {

            PreparedStatement sentencia;
            sentencia = conexion.prepareStatement("insert expediente values(null,?,?,?,?,?,?)");
            sentencia.setInt(1, cedula);
            sentencia.setString(2, this.Fecha);
            sentencia.setString(3, this.hora);
            sentencia.setString(4, this.medico);
            sentencia.setString(5, this.Descrip);
            sentencia.setString(6, this.paciente);
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Se agregaron los datos");

        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void update() {
        try {

            sentencias.executeUpdate("update expediente set fecha='" + this.Fecha + "',hora='" + this.hora + "',medico='" + this.medico + "',descripcion='" + this.Descrip + "',paciente='" + this.paciente + "' where cedula=" + this.cedula);
            JOptionPane.showMessageDialog(null, "Se actualizaron los datos");

        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Read_Cedula() {

        try {

            datos = sentencias.executeQuery("select * from expediente where cedula='" + cedula + "'");
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

    public void readFecha() {
        try {
            datos = sentencias.executeQuery("select * from expediente where Fecha='" + this.Fecha + "'");
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

    public void readHora() {
        try {

            datos = sentencias.executeQuery("select * from expediente where Hora='" + this.hora + "'");
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

    public void readMedico() {
        try {

            datos = sentencias.executeQuery("select * from expediente where Medico='" + this.medico + "'");
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



    public void readPaciente() {
        try {

            datos = sentencias.executeQuery("select * from expediente where Paciente='" + this.paciente + "'");
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

    public void delete() { /// controlar que siempre quede un usuario registrado al momento de eliminar
        try {
            sentencias.executeUpdate("delete from expediente where cedula=" + cedula);
            JOptionPane.showMessageDialog(null, "Usuario Eliminado");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar");
        }

    }

    public void xmlconfig() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();

            Document documento = implementation.createDocument(null, "consultorio.xml", null);
            documento.setXmlVersion("1.0");

            Element archxml = documento.createElement("Consulta");
            Element arch = documento.createElement("Consulta");

            Element hora = documento.createElement("Hora");
            Text texHora = documento.createTextNode("" + this.hora);
            hora.appendChild(texHora);
            archxml.appendChild(hora);

            Element fecha = documento.createElement("Fecha");
            Text texFecha = documento.createTextNode("" + this.Fecha);
            fecha.appendChild(texFecha);
            archxml.appendChild(fecha);

            Element medicos = documento.createElement("Medico");
            Text textMedico;
            textMedico = documento.createTextNode("" + this.medico);
            medicos.appendChild(textMedico);
            archxml.appendChild(medicos);

            Element pacientes = documento.createElement("Paciente");
            Text texPaciente = documento.createTextNode("" + this.paciente);
            pacientes.appendChild(texPaciente);
            archxml.appendChild(pacientes);

            Element descripcion = documento.createElement("Descripcion");
            Text texDescripcion = documento.createTextNode("" + this.Descrip);
            descripcion.appendChild(texDescripcion);
            archxml.appendChild(descripcion);

            arch.appendChild(archxml);

            documento.getDocumentElement().appendChild(arch);

            Source source = new DOMSource(documento);
            Result result = new StreamResult(new File("consultorio.xml"));

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);

        } catch (ParserConfigurationException | TransformerException | DOMException e) {
            //System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Ah sido efectuada");
        }
    }

    ///////////////////////////////////metodo Hilo clase Thread///////////////////////////////////
    @Override
    public void run() {
        xmlconfig();
        System.out.println("Hola soy un Hilo");

    }
}
