/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conectar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Conectar {

    public static Connection conexion;
    public static Statement sentencias;
    public static ResultSet datos;

    public void conectar() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/medicina?useServerPrepStmts=true", "root", "");
            sentencias = conexion.createStatement();
            System.out.println("Conectado");

        } catch (SQLException ex) {

            System.out.println(" Error al conectar");
        }
    }
}
