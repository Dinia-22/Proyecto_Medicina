/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paciente;

/**
 *
 * @author Maria Paula
 */
public class Paciente {
    private int ID;
    private String Nomnre;
    private int FechaNacimiento;
    private String correro;
    private int edad;

    public Paciente(int ID, String Nomnre, int FechaNacimiento, String correro, int edad) {
        this.ID = ID;
        this.Nomnre = Nomnre;
        this.FechaNacimiento = FechaNacimiento;
        this.correro = correro;
        this.edad = edad;
    }

    public int getID() {
        return ID;
    }

    public String getNomnre() {
        return Nomnre;
    }

    public int getFechaNacimiento() {
        return FechaNacimiento;
    }

    public String getCorrero() {
        return correro;
    }

    public int getEdad() {
        return edad;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNomnre(String Nomnre) {
        this.Nomnre = Nomnre;
    }

    public void setFechaNacimiento(int FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public void setCorrero(String correro) {
        this.correro = correro;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
