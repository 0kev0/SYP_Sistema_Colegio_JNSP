/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Director;

import Conexion.ClaseConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Modelo_Gestion_Personal {
    private Connection conexionDB;
    private Statement statement;
    private ClaseConexion claseConectar;
    private PreparedStatement pstm;

    private int NIE;
    private String Nombres;
    private String Apellidos;
    private int Rol_id;
    private int Grado_id;
    private int Materia_id;

    public Connection getConexionDB() {
        return conexionDB;
    }

    public void setConexionDB(Connection conexionDB) {
        this.conexionDB = conexionDB;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ClaseConexion getClaseConectar() {
        return claseConectar;
    }

    public void setClaseConectar(ClaseConexion claseConectar) {
        this.claseConectar = claseConectar;
    }

    public PreparedStatement getPstm() {
        return pstm;
    }

    public void setPstm(PreparedStatement pstm) {
        this.pstm = pstm;
    }

    public int getNIE() {
        return NIE;
    }

    public void setNIE(int NIE) {
        this.NIE = NIE;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getRol_id() {
        return Rol_id;
    }

    public void setRol_id(int Rol_id) {
        this.Rol_id = Rol_id;
    }

    public int getGrado_id() {
        return Grado_id;
    }

    public void setGrado_id(int Grado_id) {
        this.Grado_id = Grado_id;
    }

    public int getMateria_id() {
        return Materia_id;
    }

    public void setMateria_id(int Materia_id) {
        this.Materia_id = Materia_id;
    }

    public Modelo_Gestion_Personal(Connection conexionDB, Statement statement, ClaseConexion claseConectar, PreparedStatement pstm, int NIE, String Nombres, String Apellidos, int Rol_id, int Grado_id, int Materia_id) {
        this.conexionDB = conexionDB;
        this.statement = statement;
        this.claseConectar = claseConectar;
        this.pstm = pstm;
        this.NIE = NIE;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Rol_id = Rol_id;
        this.Grado_id = Grado_id;
        this.Materia_id = Materia_id;
    }

  

    
   public Modelo_Gestion_Personal() {
        claseConectar = new ClaseConexion();
    }

    // DEVUELVE LISTA DE FILAS PARA MOSTRAR EN TABLA
    public ArrayList<Modelo_Gestion_Personal> get_Personal() {
        ArrayList<Modelo_Gestion_Personal> Data_Personal = new ArrayList<>();
        try {
            conexionDB = claseConectar.iniciarConexion(); // Iniciamos una conexión 
            System.out.println("###BUSQUEDA GENERAL");

            String sql = """
                SELECT "NIE", "Nombres", "Apellidos", "Rol_id", "Grado_id", "Materia_id"
                FROM public."Tbl_Personal";""";

            pstm = conexionDB.prepareStatement(sql);
            ResultSet consulta = pstm.executeQuery(); // Ejecutamos la consulta

            while (consulta.next()) {
                Modelo_Gestion_Personal personal = new Modelo_Gestion_Personal();

                personal.setNIE(consulta.getInt("NIE"));
                personal.setNombres(consulta.getString("Nombres"));
                personal.setApellidos(consulta.getString("Apellidos"));
                personal.setRol_id(consulta.getInt("Rol_id"));
                personal.setGrado_id(consulta.getInt("Grado_id"));
                personal.setMateria_id(consulta.getInt("Materia_id"));

                System.out.println("Personal: " + personal.getNIE() + ", " + personal.getNombres() + ", " + personal.getApellidos() + ", " + personal.getRol_id() + ", " + personal.getGrado_id() + ", " + personal.getMateria_id());

                Data_Personal.add(personal);
            }

            consulta.close();
            pstm.close();
            conexionDB.close();
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Gestion_Personal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Data_Personal;
    }
}
    



