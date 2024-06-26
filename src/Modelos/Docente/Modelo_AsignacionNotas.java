package Modelos.Docente;

import Conexion.ClaseConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Modelo_AsignacionNotas {

////////////////////////////////////////////////////lado Servidor
    private Connection conexionDB;
    private Statement statement;
    private ClaseConexion claseConectar;
    private PreparedStatement pstm;

///////////////////////////////////////////////////lado escritorio
    private int NIE;
    private String NombreEstudiante;
    private String ApellidoEstudiante;
    private String EstadoActividad;
    private String NombreActividad;
    private Double Nota;
    private Double Ponderacion;

    
    ///////////////////////////////////////////////////GETTERS Y SETTERS
  
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

    public String getNombreEstudiante() {
        return NombreEstudiante;
    }

    public void setNombreEstudiante(String NombreEstudiante) {
        this.NombreEstudiante = NombreEstudiante;
    }

    public String getApellidoEstudiante() {
        return ApellidoEstudiante;
    }

    public void setApellidoEstudiante(String ApellidoEstudiante) {
        this.ApellidoEstudiante = ApellidoEstudiante;
    }

    public String getEstadoActividad() {
        return EstadoActividad;
    }

    public void setEstadoActividad(String EstadoActividad) {
        this.EstadoActividad = EstadoActividad;
    }

    public String getNombreActividad() {
        return NombreActividad;
    }

    public void setNombreActividad(String NombreActividad) {
        this.NombreActividad = NombreActividad;
    }

    public Double getNota() {
        return Nota;
    }

    public void setNota(Double Nota) {
        this.Nota = Nota;
    }

    public Double getPonderacion() {
        return Ponderacion;
    }

    public void setPonderacion(Double Ponderacion) {
        this.Ponderacion = Ponderacion;
    }
    
    ///////////////////////////////////////////////////CONSTRUCTORES
    public Modelo_AsignacionNotas(Connection conexionDB, Statement statement, ClaseConexion claseConectar, PreparedStatement pstm,
            int NIE, String NombreActividad, String NombreEstudiante, String ApellidoEstudiante, String EstadoActividad, Double Nota, Double Ponderacion) {
        this.conexionDB = conexionDB;
        this.statement = statement;
        this.claseConectar = new ClaseConexion();
        this.pstm = pstm;
        ////////////////////////////////////////////////
        this.NIE = NIE;
        this.NombreActividad = NombreActividad;
        this.NombreEstudiante = NombreEstudiante;
        this.ApellidoEstudiante = ApellidoEstudiante;
        this.EstadoActividad = EstadoActividad;
        this.Nota = Nota;
        this.Ponderacion = Ponderacion;

    }

    public Modelo_AsignacionNotas() {
        this.claseConectar = new ClaseConexion();
    }

    /**
     * @param grado
     * @return
     * *******************************************************************************************************************
     */
    public ArrayList<Modelo_AsignacionNotas> getListadoActividades(int grado) {
        try {
            conexionDB = claseConectar.iniciarConexion();//iniciamos una coneccion 
            statement = conexionDB.createStatement();//crear consulta
            System.out.println("###BUSQUEDA GENERAL");
            String sql = """
SELECT Tb_Est."NIE",Tb_Est."Nombres",Tb_Est."Apellidos", 
                Tb_Act."Nombre_Actividad", Tb_Tact."Ponderacion",Tb_EsAc."EstadoActividad",
                 Tbl_NAct."NotaObtenida"
                           FROM public."Tbl_Nota_Actividad" AS Tbl_NAct
      INNER JOIN "Tbl_EstadoActividad" AS Tb_EsAc ON  Tb_EsAc.id = Tbl_NAct."EstadoActividad_id"
      INNER JOIN "Tbl_Actividades" AS Tb_Act ON Tb_Act.id = Tbl_NAct."Actividad_id"
      INNER JOIN "Tbl_TipoActividad" AS Tb_Tact ON Tb_Tact."id_Act" = Tb_Act."TipoActividad_id"
      INNER JOIN "tbl_Estudiante" AS Tb_Est ON Tb_Est."NIE" = Tbl_NAct."Estudiante_id"
      INNER JOIN "Tbl_Grados" AS TbGr ON TbGr.id = Tb_Est."Grado_id"
      WHERE TbGr.id = ? ;""";

            pstm = conexionDB.prepareStatement(sql);
            pstm.setInt(1, grado);

            ResultSet consulta = pstm.executeQuery(); // Ejecutamos la consulta

            ArrayList<Modelo_AsignacionNotas> DataActividades = new ArrayList<>();
            while (consulta.next()) {

                Modelo_AsignacionNotas Actividades = new Modelo_AsignacionNotas();

                Actividades.setNIE(consulta.getInt("NIE"));
                Actividades.setNombreEstudiante(consulta.getString("Nombres"));
                Actividades.setApellidoEstudiante(consulta.getString("Apellidos"));
                Actividades.setNombreActividad(consulta.getString("Nombre_Actividad"));
                Actividades.setEstadoActividad(consulta.getString("EstadoActividad"));
                Actividades.setPonderacion(consulta.getDouble("Ponderacion"));
                Actividades.setNota(consulta.getDouble("NotaObtenida"));

                DataActividades.add(Actividades);
            }

            conexionDB.close();
            return DataActividades;

        } catch (SQLException ex) {
            Logger.getLogger(Modelo_AsignacionNotas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<Modelo_AsignacionNotas> get_ListadoActividades_Filtrada(int Criterio, String Parametro) {
        try {
            conexionDB = claseConectar.iniciarConexion();//iniciamos una coneccion 
            statement = conexionDB.createStatement();//crear consulta
            System.out.println("###BUSQUEDA FILTRADA\n criterio de busqueda : " + Parametro + "\n Id del criterio  " + Criterio);

            String sql = """
      SELECT Tb_Est."NIE",Tb_Est."Nombres",Tb_Est."Apellidos", 
                              			Tb_Act."Nombre_Actividad", Tb_Tact."Ponderacion",Tb_EsAc."EstadoActividad",
                              			Tbl_NAct."NotaObtenida"
                                                  FROM public."Tbl_Nota_Actividad" AS Tbl_NAct
                                                  INNER JOIN "Tbl_EstadoActividad" AS Tb_EsAc ON  Tb_EsAc.id = Tbl_NAct."EstadoActividad_id"
                                                  INNER JOIN "Tbl_Actividades" AS Tb_Act ON Tb_Act.id = Tbl_NAct."Actividad_id"
                  								INNER JOIN "Tbl_TipoActividad" AS Tb_Tact ON Tb_Tact.id = Tb_Act."TipoActividad_id"
                                                  INNER JOIN "tbl_Estudiante" AS Tb_Est ON Tb_Est."NIE" = Tbl_NAct."Estudiante_id"
            					
            					WHERE """ + Parametro;

            pstm = conexionDB.prepareStatement(sql);
            pstm.setInt(1, Criterio);

            ResultSet consulta = pstm.executeQuery(); // Ejecutamos la consulta

            ArrayList<Modelo_AsignacionNotas> DataActividades = new ArrayList<>();
            while (consulta.next()) {

                Modelo_AsignacionNotas Actividades = new Modelo_AsignacionNotas();

                Actividades.setNIE(consulta.getInt("NIE"));
                Actividades.setNombreEstudiante(consulta.getString("Nombres"));
                Actividades.setApellidoEstudiante(consulta.getString("Apellidos"));
                Actividades.setNombreActividad(consulta.getString("Nombre_Actividad"));
                Actividades.setEstadoActividad(consulta.getString("EstadoActividad"));
                Actividades.setPonderacion(consulta.getDouble("Ponderacion"));
                Actividades.setNota(consulta.getDouble("NotaObtenida"));

                DataActividades.add(Actividades);
            }

            conexionDB.close();
            return DataActividades;

        } catch (SQLException ex) {
            Logger.getLogger(Modelo_AsignacionNotas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<Modelo_AsignacionNotas> GetInforme() {
        try {
            conexionDB = claseConectar.iniciarConexion();//iniciamos una coneccion 
            statement = conexionDB.createStatement();//crear consulta

            String sql = """
                        
                         """;

            ResultSet consulta = statement.executeQuery(sql);//ejecutamos la consulta

            ArrayList<Modelo_AsignacionNotas> DataPersonas = new ArrayList<>();
            while (consulta.next()) {

                Modelo_AsignacionNotas Persona = new Modelo_AsignacionNotas();

                DataPersonas.add(Persona);
            }

            conexionDB.close();
            return DataPersonas;

        } catch (SQLException ex) {
            Logger.getLogger(Modelo_AsignacionNotas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Modelo_AsignacionNotas GetPersona(int id) {
        try {
            conexionDB = claseConectar.iniciarConexion(); // initiate a connection

            String sql = " ";  
            pstm = conexionDB.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet consulta = pstm.executeQuery(); // execute the query

            Modelo_AsignacionNotas Persona = null;
            if (consulta.next()) {
                Persona = new Modelo_AsignacionNotas();

            }

            conexionDB.close();
            return Persona;

        } catch (SQLException ex) {
            Logger.getLogger(Modelo_AsignacionNotas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int insertNuevoCliente(Modelo_AsignacionNotas PersonasInsert) {
        try {
            String sql = """
                         INSERT INTO public."Tbl_Cliente"( nombre, "apellido paterno", "apellido materno", tipo_documneto, num_documento, direccion, telefono, email, "Password", "id_Membresia")
                         \tVALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);""";

            conexionDB = claseConectar.iniciarConexion();
            pstm = conexionDB.prepareCall(sql);

//            pstm.setString(1, PersonasInsert.getNombre());
//            pstm.setString(2, PersonasInsert.getApellido_paterno());
//            pstm.setString(3, PersonasInsert.getApellido_materno());
//            pstm.setString(4, PersonasInsert.getTipo_doc());
//            pstm.setString(5, PersonasInsert.getNum_doc());
//            pstm.setString(6, PersonasInsert.getDireccion());
//            pstm.setString(7, PersonasInsert.getTelefono());
//            pstm.setString(8, PersonasInsert.getEmail());
//            pstm.setString(9, PersonasInsert.getPassword());
//            pstm.setInt(10, PersonasInsert.getIdMembresia());//Sin membresia
            int respuesta = pstm.executeUpdate();

            System.out.println(">>" + respuesta);

            return respuesta;

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Modelo_AsignacionNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int editPersonas(Modelo_AsignacionNotas PersonasEdit) {
        try {

            String sql = """
                         UPDATE public."Tbl_Cliente"
                         	SET  nombre=?, "apellido paterno"=?, "apellido materno"=?, tipo_documneto=?, num_documento=?, direccion=?, telefono=?, email=?, "Password"=?, "id_Membresia"=?
                         	WHERE idpersona=?;""";

            conexionDB = claseConectar.iniciarConexion();
            pstm = conexionDB.prepareStatement(sql);

            //   System.out.println("id a modificar" + PersonasEdit.getId());
//            pstm.setString(1, PersonasEdit.getNombre());
//            pstm.setString(2, PersonasEdit.getApellido_paterno());
//            pstm.setString(3, PersonasEdit.getApellido_materno());
//            pstm.setString(4, PersonasEdit.getTipo_doc());
//            pstm.setString(5, PersonasEdit.getNum_doc());
//            pstm.setString(6, PersonasEdit.getDireccion());
//            pstm.setString(7, PersonasEdit.getTelefono());
//            pstm.setString(8, PersonasEdit.getEmail());
//            pstm.setString(9, PersonasEdit.getPassword());
//            pstm.setInt(10, PersonasEdit.getIdMembresia());
//            pstm.setInt(11, PersonasEdit.getId());
            int respuesta = pstm.executeUpdate();

            return respuesta;

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Modelo_AsignacionNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int CambioMembresia(int id, int id_membresia) {
        try {

            String sql = """
                         UPDATE public."Tbl_Cliente"SET   "id_Membresia"=?
                              WHERE idpersona=?;""";

            conexionDB = claseConectar.iniciarConexion();
            pstm = conexionDB.prepareCall(sql);

            pstm.setInt(1, id_membresia);
            pstm.setInt(2, id);

            int respuesta = pstm.executeUpdate();
            //  System.out.println("cambio->> el ID: " + NIE + " membresia " + idMembresia + " >? " + respuesta);
            return respuesta;

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Modelo_AsignacionNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int deletePersonas(int id) {
        try {
            String sql = "DELETE FROM public.personas WHERE idpersona=? ;";

            conexionDB = claseConectar.iniciarConexion();
            pstm = conexionDB.prepareCall(sql);

            pstm.setInt(1, id);

            int respuesta = pstm.executeUpdate();

            return respuesta;

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Modelo_AsignacionNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

}
