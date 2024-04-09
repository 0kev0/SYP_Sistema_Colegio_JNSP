package Modelos.Docente;

import Conexion.ClaseConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Modelo_RegistroAsistencia {

    private Connection conexionDB;
    private Statement statement;
    private ClaseConexion claseConectar;
    private PreparedStatement pstm;

//lado Servidor
    private int idDocente;
    private int idEstado;
    private int idEstadoAsistencia;

//lado escritorio
    private int NIE;
    private String NombreEstudiante;
    private String ApellidoEstudiante;
    private Date Fecha;
    private int CantAsistencias;
    private int CantAusencias;
    private int CantAusenciaJustificadas;
    private String Justificacion;

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

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public int getIdEstadoAsistencia() {
        return idEstadoAsistencia;
    }

    public void setIdEstadoAsistencia(int idEstadoAsistencia) {
        this.idEstadoAsistencia = idEstadoAsistencia;
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

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public int getCantAsistencias() {
        return CantAsistencias;
    }

    public void setCantAsistencias(int CantAsistencias) {
        this.CantAsistencias = CantAsistencias;
    }

    public String getJustificacion() {
        return Justificacion;
    }

    public void setJustificacion(String Justificacion) {
        this.Justificacion = Justificacion;
    }

    public int getCantAusencias() {
        return CantAusencias;
    }

    public void setCantAusencias(int CantAusencias) {
        this.CantAusencias = CantAusencias;
    }

    public int getCantAusenciaJustificadas() {
        return CantAusenciaJustificadas;
    }

    public void setCantAusenciaJustificadas(int CantAusenciaJustificadas) {
        this.CantAusenciaJustificadas = CantAusenciaJustificadas;
    }

    public Modelo_RegistroAsistencia(int CantAusencias, int CantAusenciaJustificadas) {
        this.CantAusencias = CantAusencias;
        this.CantAusenciaJustificadas = CantAusenciaJustificadas;
    }

    public Modelo_RegistroAsistencia(Connection conexionDB, Statement statement, ClaseConexion claseConectar, PreparedStatement pstm,
            int id, String ApellidoEstudiante, String NombreEstudiante, int CantAsistencias, String Justificacion, Date Fecha,
            int idEstadoAsistencia, int idDocente, int idEstado, int CantAusencias, int CantAusenciaJustificadas) {
        this.conexionDB = conexionDB;
        this.statement = statement;
        this.claseConectar = new ClaseConexion();
        this.pstm = pstm;
        ////////////////////////////////////////////////
        this.NIE = id;
        this.Fecha = Fecha;
        this.idDocente = idDocente;
        this.idEstado = idEstado;
        this.NombreEstudiante = NombreEstudiante;
        this.ApellidoEstudiante = ApellidoEstudiante;
        this.CantAsistencias = CantAsistencias;
        this.Justificacion = Justificacion;
        this.idEstadoAsistencia = idEstadoAsistencia;
        this.CantAusencias = CantAusencias;
        this.CantAusenciaJustificadas = CantAusenciaJustificadas;

    }

    public Modelo_RegistroAsistencia() {
        this.claseConectar = new ClaseConexion();
    }

    /**
     * @param grado
     * @return
     * *******************************************************************************************************************
     */
    
    public ArrayList<Modelo_RegistroAsistencia> GetListado(int grado) {
        try {
            conexionDB = claseConectar.iniciarConexion(); // Iniciamos una conexión
            String sql = """
SELECT
    tbEst."NIE", tbEst."Nombres", tbEst."Apellidos",
    SUM(CASE WHEN TbAsi."Estado_id" = 1 THEN 1 ELSE 0 END) AS "Numero_Asistencias",
    SUM(CASE WHEN TbAsi."Estado_id" = 2 THEN 1 ELSE 0 END) AS "Numero_Fallas",
    SUM(CASE WHEN TbAsi."Estado_id" = 3 THEN 1 ELSE 0 END) AS "Numero_Fallas_Justificadas"
	
FROM public."Tbl_Asistencias" AS TbAsi
INNER JOIN "tbl_Estudiante" AS tbEst ON tbEst."NIE" = TbAsi."Estudiante_id"

AND tbEst."Grado_id" = ?

GROUP BY tbEst."NIE", tbEst."Nombres", tbEst."Apellidos";""";

            pstm = conexionDB.prepareStatement(sql);
            pstm.setInt(1, grado);

            ResultSet consulta = pstm.executeQuery(); // Ejecutamos la consulta

            ArrayList<Modelo_RegistroAsistencia> DataListado = new ArrayList<>();
            while (consulta.next()) {
                Modelo_RegistroAsistencia Estudiante = new Modelo_RegistroAsistencia();

                Estudiante.setNIE(consulta.getInt("NIE"));
                Estudiante.setNombreEstudiante(consulta.getString("Nombres"));
                Estudiante.setApellidoEstudiante(consulta.getString("Apellidos"));
                Estudiante.setCantAsistencias(consulta.getInt("Numero_Asistencias"));
                Estudiante.setCantAusencias(consulta.getInt("Numero_Fallas"));
                Estudiante.setCantAusenciaJustificadas(consulta.getInt("Numero_Fallas_Justificadas"));

                DataListado.add(Estudiante);
            }

            conexionDB.close();
            return DataListado;

        } catch (SQLException ex) {
            Logger.getLogger(Modelo_RegistroAsistencia.class.getName()).log(Level.SEVERE, "Error al obtener el listado", ex);
        }
        return null;
    }

    public ArrayList<Modelo_RegistroAsistencia> GetListadoCustom(int Grado, int Mes, int Year) {
        try {
            conexionDB = claseConectar.iniciarConexion(); // Iniciamos una conexión
            String sql = """
SELECT
    tbEst."NIE", tbEst."Nombres", tbEst."Apellidos",
    SUM(CASE WHEN TbAsi."Estado_id" = 1 THEN 1 ELSE 0 END) AS "Numero_Asistencias",
    SUM(CASE WHEN TbAsi."Estado_id" = 2 THEN 1 ELSE 0 END) AS "Numero_Fallas",
    SUM(CASE WHEN TbAsi."Estado_id" = 3 THEN 1 ELSE 0 END) AS "Numero_Fallas_Justificadas"
	
FROM public."Tbl_Asistencias" AS TbAsi
INNER JOIN "tbl_Estudiante" AS tbEst ON tbEst."NIE" = TbAsi."Estudiante_id"

WHERE EXTRACT(MONTH FROM TbAsi."Fecha") = ?
AND EXTRACT(YEAR FROM TbAsi."Fecha") = ?
AND tbEst."Grado_id" = ?

GROUP BY tbEst."NIE", tbEst."Nombres", tbEst."Apellidos";""";

            pstm = conexionDB.prepareStatement(sql);
            pstm.setInt(1, Mes);
            pstm.setInt(2, Year);
            pstm.setInt(3, Grado);

            ResultSet consulta = pstm.executeQuery(); // Ejecutamos la consulta

            ArrayList<Modelo_RegistroAsistencia> DataListado = new ArrayList<>();

            while (consulta.next()) {
                Modelo_RegistroAsistencia Estudiante = new Modelo_RegistroAsistencia();

                Estudiante.setNIE(consulta.getInt("NIE"));
                Estudiante.setNombreEstudiante(consulta.getString("Nombres"));
                Estudiante.setApellidoEstudiante(consulta.getString("Apellidos"));
                Estudiante.setCantAsistencias(consulta.getInt("Numero_Asistencias"));
                Estudiante.setCantAusencias(consulta.getInt("Numero_Fallas"));
                Estudiante.setCantAusenciaJustificadas(consulta.getInt("Numero_Fallas_Justificadas"));

                DataListado.add(Estudiante);
            }

            conexionDB.close();
            return DataListado;

        } catch (SQLException ex) {
            Logger.getLogger(Modelo_RegistroAsistencia.class.getName()).log(Level.SEVERE, "Error al obtener el listado", ex);
        }
        return null;
    }

    public int RegistrarAsistencia(Modelo_RegistroAsistencia asistenciaInsert) {
        try {
            String sql = """
    INSERT INTO public."Tbl_Asistencias" 
                         ("Docente_id", "Estudiante_id", "Fecha", "Estado_id", "Justificacion")
                         	VALUES (?, ?, ?, ?, ?);""";

            conexionDB = claseConectar.iniciarConexion();
            pstm = conexionDB.prepareCall(sql);

            pstm.setInt(1, asistenciaInsert.getIdDocente());
            pstm.setInt(2, asistenciaInsert.getNIE());
// Suponiendo que asistenciaInsert.getFecha() devuelve un java.util.Date
            java.util.Date fechaUtil = asistenciaInsert.getFecha();
            java.sql.Date fechaSQL = new java.sql.Date(fechaUtil.getTime());

            pstm.setDate(3, fechaSQL);

            pstm.setInt(4, asistenciaInsert.getIdEstadoAsistencia());
            pstm.setString(5, asistenciaInsert.getJustificacion());

            int respuesta = pstm.executeUpdate();

            System.out.println(">> se registro asistencia del NIE " + asistenciaInsert.getNIE());

            return respuesta;

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Modelo_RegistroAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int editPersonas(Modelo_RegistroAsistencia PersonasEdit) {
        try {

            String sql = """
                         UPDATE public."Tbl_Cliente"
                         	SET  nombre=?, "apellido paterno"=?, "apellido materno"=?, tipo_documneto=?, num_documento=?, direccion=?, telefono=?, email=?, "Password"=?, "id_Membresia"=?
                         	WHERE idpersona=?;""";

            conexionDB = claseConectar.iniciarConexion();
            pstm = conexionDB.prepareStatement(sql);

            //   System.out.println("id a modificar" + PersonasEdit.getNIE());
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
//            pstm.setInt(11, PersonasEdit.getNIE());
            int respuesta = pstm.executeUpdate();

            return respuesta;

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Modelo_RegistroAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Modelo_RegistroAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Modelo_RegistroAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

}
