/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Citas;

/**
 *
 * @author Maria Paula
 */
public class Citas {
    private int ID;
    private int fecha;
    private int hora;
    private String paciente;
    private String MedicoEspe;

    public Citas(int ID, int fecha, int hora, String paciente, String MedicoEspe) {
        this.ID = ID;
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.MedicoEspe = MedicoEspe;
    }

    public int getID() {
        return ID;
    }

    public int getFecha() {
        return fecha;
    }

    public int getHora() {
        return hora;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getMedicoEspe() {
        return MedicoEspe;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public void setMedicoEspe(String MedicoEspe) {
        this.MedicoEspe = MedicoEspe;
    }
    
    
}
