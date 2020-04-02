/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

/**
 *
 * @author Maria Paula
 */
public class Usuario {
    
    private int ID;
    private String Nombre;
    private int FechaNacimiento;
    private int Tel;
    private String correo;
    private String NomUsuario;
    private String contraseña;
    private String tipo;

    public Usuario(int ID, String Nombre, int FechaNacimiento, int Tel, String NomUsuario, String contraseña, String tipo) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.Tel = Tel;
        this.NomUsuario = NomUsuario;
        this.contraseña = contraseña;
        this.tipo = tipo;
    }

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
        return Tel;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNomUsuario() {
        return NomUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getTipo() {
        return tipo;
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

    public void setTel(int Tel) {
        this.Tel = Tel;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNomUsuario(String NomUsuario) {
        this.NomUsuario = NomUsuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    
}
