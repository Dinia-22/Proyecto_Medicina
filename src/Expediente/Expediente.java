/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expediente;

import Usuarios.Usuario;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
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
public class Expediente {

    private String Fecha;
    private String hora;
    private String medico;
    private String Descrip;
    private String paciente;
    private Connection conexion;
    private Statement sentencias;

//    public Expediente(int Fecha, int hora, String medico, String Descrip, String paciente, Connection conexion, Statement sentencias) {
//        this.Fecha = Fecha;
//        this.hora = hora;
//        this.medico = medico;
//        this.Descrip = Descrip;
//        this.paciente = paciente;
//        this.conexion = conexion;
//        this.sentencias = sentencias;
//    }

    public Expediente() {
       this.Fecha = Fecha;
        this.hora = hora;
        this.medico = medico;
        this.Descrip = Descrip;
        this.paciente = paciente;
        this.conexion = conexion;
        this.sentencias = sentencias;
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
    
    
     public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
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
            sentencia = conexion.prepareStatement("insert expediente values(null,?,?,?,?)");
            sentencia.setInt(1, 5);
            sentencia.setInt(2, 2);
            sentencia.setString(3, "Carlos");
            sentencia.setString(4, "pierna rota");
            sentencia.execute();

        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
//"C:\\Users\\Adriel Chavarría B\\Desktop"
    public void xmlconfig() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();

            Document documento = implementation.createDocument(null, "consultorio.xml",null);
            documento.setXmlVersion("1.0");
            
            Element archxml = documento.createElement("Consulta");
            Element arch = documento.createElement("Consulta");
            
            Element hora = documento.createElement("Hora");
            Text texHora=documento.createTextNode(""+this.getHora());
            hora.appendChild(texHora);
            archxml.appendChild(hora);
            
            Element fecha = documento.createElement("Fecha");
            Text texFecha=documento.createTextNode(""+this.getFecha());
            fecha.appendChild(texFecha);
            archxml.appendChild(fecha);

            Element medicos = documento.createElement("Medico");
            Text textMedico;
            textMedico = documento.createTextNode(""+this.getMedico());
            medicos.appendChild(textMedico);
            archxml.appendChild(medicos);
            
            Element pacientes = documento.createElement("Paciente");
            Text texPaciente=documento.createTextNode(""+this.getPaciente());
            pacientes.appendChild(texPaciente);
            archxml.appendChild(pacientes);
            
            Element descripcion = documento.createElement("Descripcion");
            Text texDescripcion=documento.createTextNode(""+this.getDescrip());
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
