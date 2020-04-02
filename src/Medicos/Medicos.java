/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medicos;

/**
 *
 * @author Maria Paula
 */
public class Medicos {
    private int ID;
    private int Nombre;
    private int FechaNacimiento;
    private int tel;
    private String correo;
    private int Codigo;
    private String especialidad;
    private float salario;

    public int getID() {
        return ID;
    }

    public int getNombre() {
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

    public void setNombre(int Nombre) {
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

    public Medicos(int ID, int Nombre, int FechaNacimiento, int tel, String correo, int Codigo, String especialidad, float salario) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.tel = tel;
        this.correo = correo;
        this.Codigo = Codigo;
        this.especialidad = especialidad;
        this.salario = salario;
    }
    
    
}
