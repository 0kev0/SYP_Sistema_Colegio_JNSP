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

public class Modelo_Asignacion_Actividades {

    private Connection conexionDB;
    private Statement statement;
    private ClaseConexion claseConectar;
    private PreparedStatement pstm;

//lado Servidor
//lado escritorio
    private int Periodo;
    private String TipoActividad;
    private String Materia;
    private String NombreActividad;
    private String Descripcion;
    private Double Ponderacion;

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

    public int getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(int Periodo) {
        this.Periodo = Periodo;
    }

    public String getTipoActividad() {
        return TipoActividad;
    }

    public void setTipoActividad(String TipoActividad) {
        this.TipoActividad = TipoActividad;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }

    public String getNombreActividad() {
        return NombreActividad;
    }

    public void setNombreActividad(String NombreActividad) {
        this.NombreActividad = NombreActividad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Double getPonderacion() {
        return Ponderacion;
    }

    public void setPonderacion(Double Ponderacion) {
        this.Ponderacion = Ponderacion;
    }

    public Modelo_Asignacion_Actividades(Connection conexionDB, Statement statement, ClaseConexion claseConectar, PreparedStatement pstm, int id, String nombre, String password, String tipo_usuario, String Descripcion, Double Ponderacion) {
        this.conexionDB = conexionDB;
        this.statement = statement;
        this.claseConectar = new ClaseConexion();
        this.pstm = pstm;
        ////////////////////////////////////////////////
        this.Periodo = id;
        this.NombreActividad = nombre;
        this.TipoActividad = password;
        this.Materia = tipo_usuario;
        this.Descripcion = Descripcion;
        this.Ponderacion = Ponderacion;

    }

    public Modelo_Asignacion_Actividades() {
        this.claseConectar = new ClaseConexion();
    }

    /**
     * @return
     * *******************************************************************************************************************
     */
    public ArrayList<Modelo_Asignacion_Actividades> GetActividades() {
        try {
            conexionDB = claseConectar.iniciarConexion();//iniciamos una coneccion 
            statement = conexionDB.createStatement();//crear consulta

            String sql = """
            SELECT Act.id , Act."Nombre_Actividad" ,Mat."Nombre" , TAct."Nombre", Act."Ponderacion", Act."Descripcion"
                                     	FROM public."Tbl_Actividades" AS Act 
                                     	INNER JOIN "Tbl_Materias" AS Mat ON Mat.id = Act."Materia_id"
                                     	INNER JOIN "Tbl_TipoActividad" AS TAct ON TAct.id = Act."TipoActividad_id"
            							;""";

            ResultSet consulta = statement.executeQuery(sql);//ejecutamos la consulta

            ArrayList<Modelo_Asignacion_Actividades> DataActividades = new ArrayList<>();
            while (consulta.next()) {

                Modelo_Asignacion_Actividades Actividades = new Modelo_Asignacion_Actividades();

                Actividades.setNombreActividad(consulta.getString("Nombre_Actividad"));
                Actividades.setMateria(consulta.getString("Nombre"));
                Actividades.setTipoActividad(consulta.getString("Nombre"));
                Actividades.setPonderacion(consulta.getDouble("Ponderacion"));
                Actividades.setDescripcion(consulta.getString("Descripcion"));

                DataActividades.add(Actividades);
            }

            conexionDB.close();
            return DataActividades;

        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Asignacion_Actividades.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<Modelo_Asignacion_Actividades> GetInforme() {
        try {
            conexionDB = claseConectar.iniciarConexion();//iniciamos una coneccion 
            statement = conexionDB.createStatement();//crear consulta

            String sql = """
                         SELECT *,TM."Descuento",TM."Membresia",TR."Consumo",TR."Consumo_Final"  
                         FROM public."Tbl_Cliente"  
                         INNER JOIN "Tbl_Membresias" AS TM on TM."id_Membresia" = "Tbl_Cliente"."id_Membresia"
                         INNER JOIN "Tbl_RegistroConsumo" AS TR ON TR."id_Cliente" = "Tbl_Cliente".idpersona""";

            ResultSet consulta = statement.executeQuery(sql);//ejecutamos la consulta

            ArrayList<Modelo_Asignacion_Actividades> DataPersonas = new ArrayList<>();
            while (consulta.next()) {

                Modelo_Asignacion_Actividades Persona = new Modelo_Asignacion_Actividades();

//                Persona.setId(consulta.getInt("idpersona"));
//                Persona.setNombre(consulta.getString("NombreActividad"));
//                Persona.setApellido_paterno(consulta.getString("apellido paterno"));
//                Persona.setApellido_materno(consulta.getString("apellido materno"));
//                Persona.setTipo_doc(consulta.getString("tipo_documneto"));
//                Persona.setNum_doc(consulta.getString("num_documento"));
//                Persona.setDireccion(consulta.getString("direccion"));
//                Persona.setTelefono(consulta.getString("telefono"));
//                Persona.setEmail(consulta.getString("email"));
//                Persona.setPassword(consulta.getString("Password"));
//                Persona.setMembresia(consulta.getDouble("Descuento"));
//                Persona.setTierMembresia(consulta.getString("Membresia"));
//                Persona.setConsumo(consulta.getDouble("Consumo"));
//                Persona.setConsumoFinal(consulta.getDouble("Consumo_Final"));
                DataPersonas.add(Persona);
            }

            conexionDB.close();
            return DataPersonas;

        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Asignacion_Actividades.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Modelo_Asignacion_Actividades GetPersona(int id) {
        try {
            conexionDB = claseConectar.iniciarConexion(); // initiate a connection

            String sql = "SELECT *,TM.\"Descuento\",TM.\"Membresia\"  FROM public.\"Tbl_Cliente\" INNER JOIN \"Tbl_Membresias\" AS TM on TM.\"id_Membresia\" = \"Tbl_Cliente\".\"id_Membresia\" WHERE idpersona = ?";
            pstm = conexionDB.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet consulta = pstm.executeQuery(); // execute the query

            Modelo_Asignacion_Actividades Persona = null;
            if (consulta.next()) {
                Persona = new Modelo_Asignacion_Actividades();
//
//                Persona.setId(consulta.getInt("idpersona"));
//                Persona.setNombre(consulta.getString("NombreActividad"));
//                Persona.setApellido_paterno(consulta.getString("apellido paterno"));
//                Persona.setApellido_materno(consulta.getString("apellido materno"));
//                Persona.setTipo_doc(consulta.getString("tipo_documneto"));
//                Persona.setNum_doc(consulta.getString("num_documento"));
//                Persona.setDireccion(consulta.getString("direccion"));
//                Persona.setTelefono(consulta.getString("telefono"));
//                Persona.setEmail(consulta.getString("email"));
//                Persona.setPassword(consulta.getString("Password"));
//                Persona.setMembresia(consulta.getDouble("Descuento"));
//                Persona.setTierMembresia(consulta.getString("Membresia"));
            }

            conexionDB.close();
            return Persona;

        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Asignacion_Actividades.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int insertNuevoCliente(Modelo_Asignacion_Actividades PersonasInsert) {
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
            java.util.logging.Logger.getLogger(Modelo_Asignacion_Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int editPersonas(Modelo_Asignacion_Actividades PersonasEdit) {
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
            java.util.logging.Logger.getLogger(Modelo_Asignacion_Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            //  System.out.println("cambio->> el ID: " + Periodo + " membresia " + idMembresia + " >? " + respuesta);
            return respuesta;

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Modelo_Asignacion_Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Modelo_Asignacion_Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }


}
