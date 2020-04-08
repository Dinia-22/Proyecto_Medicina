/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expediente;

import Usuarios.Usuario;
import com.toedter.calendar.JDateChooser;
import java.io.File;
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
public class Expediente {

    public JDateChooser Fecha;
    public JTextField hora;
    public JTextField medico;
    public JTextField Descrip;
    public JTextField paciente;
    public JTextField ID;
    private ResultSet datos;
    private Connection conexion;
    private Statement sentencias;
    SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");

    public Expediente() {
        this.Fecha = Fecha;
        this.hora = hora;
        this.medico = medico;
        this.Descrip = Descrip;
        this.paciente = paciente;
        this.conexion = conexion;
        this.sentencias = sentencias;
    }

    public JDateChooser getFecha() {
        return Fecha;
    }

    public JTextField getDescrip() {
        return Descrip;
    }

    public JTextField getPaciente() {
        return paciente;
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
            sentencia = conexion.prepareStatement("insert expediente values(null,?,?,?,?,?)");
            sentencia.setString(1, dt.format(this.Fecha.getDate()));
            sentencia.setString(2, this.hora.getText());
            sentencia.setString(3, this.medico.getText());
            sentencia.setString(4, this.Descrip.getText());
            sentencia.setString(5, this.paciente.getText());
            sentencia.execute();

        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void update() {
        try {

            this.sentencias.executeUpdate("update expediente set fecha='" + dt.format(this.Fecha.getDate()) + "',hora='" + this.hora.getText() + "',medico='" + this.medico.getText() + "',descripcion='" + this.Descrip.getText() + "',paciente='" + this.paciente.getText() + "' where id=" + this.ID.getText());

        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void readFecha() {
        try {
            this.datos = this.sentencias.executeQuery("select * from expediente where Fecha='" + dt.format(this.Fecha.getDate()) + "'");
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

    public void readHora() {
        try {
            this.datos = this.sentencias.executeQuery("select * from expediente where Hora='" + this.hora.getText() + "'");
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

    public void readMedico() {
        try {
            this.datos = this.sentencias.executeQuery("select * from expediente where Medico='" + this.medico.getText() + "'");
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

    public void readDescripcion() {
        try {
            this.datos = this.sentencias.executeQuery("select * from expediente where Descripcion='" + this.Descrip.getText() + "'");
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

    public void readPaciente() {
        try {
            this.datos = this.sentencias.executeQuery("select * from expediente where Paciente='" + this.paciente.getText() + "'");
            if (this.datos.next()) {
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

    public void delete() { /// controlar que siempre quede un usuario registrado al momento de eliminar
        try {
            this.sentencias.executeUpdate("delete from expediente where id=" + this.ID.getText());
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
            Text texHora = documento.createTextNode("" + this.hora.getText());
            hora.appendChild(texHora);
            archxml.appendChild(hora);

            Element fecha = documento.createElement("Fecha");
            Text texFecha = documento.createTextNode("" + dt.format(this.Fecha.getDate()));
            fecha.appendChild(texFecha);
            archxml.appendChild(fecha);

            Element medicos = documento.createElement("Medico");
            Text textMedico;
            textMedico = documento.createTextNode("" + this.medico.getText());
            medicos.appendChild(textMedico);
            archxml.appendChild(medicos);

            Element pacientes = documento.createElement("Paciente");
            Text texPaciente = documento.createTextNode("" + this.paciente.getText());
            pacientes.appendChild(texPaciente);
            archxml.appendChild(pacientes);

            Element descripcion = documento.createElement("Descripcion");
            Text texDescripcion = documento.createTextNode("" + this.Descrip.getText());
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

//    public static void main(String[] args) {
//        // TODO code application logic here
//        Expediente p = new Expediente();
//        p.conectar();
//        p.create();
//        p.xmlconfig();
//
//    }
}
