/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expediente;

/**
 *
 * @author Maria Paula
 */
public class Expediente {
    private int Fecha;
    private int hora;
    private String medico;
    private String Descrip;

    public Expediente(int Fecha, int hora, String medico, String Descrip) {
        this.Fecha = Fecha;
        this.hora = hora;
        this.medico = medico;
        this.Descrip = Descrip;
    }

    public int getFecha() {
        return Fecha;
    }

    public int getHora() {
        return hora;
    }

    public String getMedico() {
        return medico;
    }

    public String getDescrip() {
        return Descrip;
    }

    public void setFecha(int Fecha) {
        this.Fecha = Fecha;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public void setDescrip(String Descrip) {
        this.Descrip = Descrip;
    }
    
    
}
