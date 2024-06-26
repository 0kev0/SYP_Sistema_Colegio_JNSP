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
    private int idActividad;
    private int idTipoActividad;

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

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public int getIdTipoActividad() {
        return idTipoActividad;
    }

    public void setIdTipoActividad(int idTipoActividad) {
        this.idTipoActividad = idTipoActividad;
    }

    public Modelo_Asignacion_Actividades(Connection conexionDB, Statement statement, ClaseConexion claseConectar, PreparedStatement pstm,
            int id, String nombre, String password, String tipo_usuario, String Descripcion, Double Ponderacion, int idActividad, int idTipoActividad) {
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
        this.idActividad = idActividad;
        this.idTipoActividad = idTipoActividad;

    }

    public Modelo_Asignacion_Actividades() {
        this.claseConectar = new ClaseConexion();
    }

    /**
     * @param grado
     * @return
     * *******************************************************************************************************************
     */
    public ArrayList<Modelo_Asignacion_Actividades> GetActividades(int grado) {
        try {
            conexionDB = claseConectar.iniciarConexion();//iniciamos una coneccion 
            statement = conexionDB.createStatement();//crear consulta

            String sql = """
SELECT Act.id ,Act."Periodo_id", Act."Nombre_Actividad" , Mat."Nombre",TAct."TipoActividad", TAct."id_Act", Act."Descripcion" , TAct."Ponderacion"
FROM public."Tbl_Actividades" AS Act 
		INNER JOIN "Tbl_Materias" AS Mat ON Mat.id = Act."Materia_id"
		INNER JOIN "Tbl_TipoActividad" AS TAct ON TAct."id_Act" = Act."TipoActividad_id"
			WHERE Mat.id = ? """;

            pstm = conexionDB.prepareStatement(sql);
            pstm.setInt(1, grado);

            ResultSet consulta = pstm.executeQuery(); // Ejecutamos la consulta

            ArrayList<Modelo_Asignacion_Actividades> DataActividades = new ArrayList<>();
            while (consulta.next()) {

                Modelo_Asignacion_Actividades Actividades = new Modelo_Asignacion_Actividades();
                Actividades.setIdTipoActividad(consulta.getInt("id_Act"));
                Actividades.setIdActividad(consulta.getInt("id"));
                Actividades.setPeriodo(consulta.getInt("Periodo_id"));

                Actividades.setNombreActividad(consulta.getString("Nombre_Actividad"));
                Actividades.setMateria(consulta.getString("Nombre"));
                Actividades.setTipoActividad(consulta.getString("TipoActividad"));
                Actividades.setDescripcion(consulta.getString("Descripcion"));
                Actividades.setPonderacion(consulta.getDouble("Ponderacion"));

                System.out.println("###" + Actividades.getNombreActividad());

                DataActividades.add(Actividades);
            }
            System.out.println("$$$ " + DataActividades.size());
            conexionDB.close();
            return DataActividades;

        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Asignacion_Actividades.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Modelo_Asignacion_Actividades GetActividad(int grado, int id) {
        try {
            conexionDB = claseConectar.iniciarConexion();//iniciamos una coneccion 
            statement = conexionDB.createStatement();//crear consulta

            String sql = """
SELECT Act.id , Act."Nombre_Actividad" , Mat."Nombre",TAct."TipoActividad",TAct."id_Act",  Act."Descripcion" , TAct."Ponderacion"
FROM public."Tbl_Actividades" AS Act 
		INNER JOIN "Tbl_Materias" AS Mat ON Mat.id = Act."Materia_id"
		INNER JOIN "Tbl_TipoActividad" AS TAct ON TAct."id_Act" = Act."TipoActividad_id"
			WHERE Mat.id = ? AND Act.id = ? ;""";

            pstm = conexionDB.prepareStatement(sql);
            pstm.setInt(1, grado);
            pstm.setInt(2, id);

            ResultSet consulta = pstm.executeQuery(); // Ejecutamos la consulta

            Modelo_Asignacion_Actividades Actividad = new Modelo_Asignacion_Actividades();
            while (consulta.next()) {
                Actividad.setIdTipoActividad(consulta.getInt("id_Act"));
                Actividad.setIdActividad(consulta.getInt("id"));
                Actividad.setNombreActividad(consulta.getString("Nombre_Actividad"));
                Actividad.setMateria(consulta.getString("Nombre"));
                Actividad.setTipoActividad(consulta.getString("TipoActividad"));
                Actividad.setDescripcion(consulta.getString("Descripcion"));
                Actividad.setPonderacion(consulta.getDouble("Ponderacion"));

                System.out.println("###" + Actividad.getNombreActividad());

            }
            conexionDB.close();
            return Actividad;

        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Asignacion_Actividades.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Modelo_Asignacion_Actividades ComprobarCant_Actividades(int grado, int id, int tipoActividad) {
        try {
            conexionDB = claseConectar.iniciarConexion();//iniciamos una coneccion 
            statement = conexionDB.createStatement();//crear consulta

            String sql = """
SELECT 

    SUM(CASE WHEN TAct."Ponderacion" = 0.10 THEN 1 ELSE 0 END) AS "Tareas",
    SUM(CASE WHEN TAct."Ponderacion" = 0.05 THEN 1 ELSE 0 END) AS "autoevaluacion",
    SUM(CASE WHEN TAct."Ponderacion" = 0.60 THEN 1 ELSE 0 END) AS "parcial"
	
FROM public."Tbl_Actividades" AS Act
INNER JOIN "Tbl_Materias" AS Mat ON Mat.id = Act."Materia_id"
INNER JOIN "Tbl_TipoActividad" AS TAct ON TAct."id_Act" = Act."TipoActividad_id"
INNER JOIN "Tbl_Personal" AS TbPer ON TbPer."Materia_id" = Mat.id

WHERE Mat.id = ? AND Act."Periodo_id" = ?
	
""";

            pstm = conexionDB.prepareStatement(sql);
            pstm.setInt(1, grado);
            pstm.setInt(2, id);

            ResultSet consulta = pstm.executeQuery(); // Ejecutamos la consulta

            Modelo_Asignacion_Actividades Actividad = new Modelo_Asignacion_Actividades();
            int parcial = 0;
            int tarea = 0;
            int autoE = 0;

            while (consulta.next()) {

                parcial += consulta.getInt("parcial");
                tarea += consulta.getInt("Tareas");
                autoE += consulta.getInt("autoevaluacion");

                System.out.println("""
                                   actividades: 
                                   Tareas : """ + tarea + " parcial : " + parcial + " autoE : " + autoE);

            }

            switch (tipoActividad) {
                case 0 -> {
                    if (parcial == 1) {
                        System.out.println("NO SE PUEDE AGREGAR OTRO PARCIAL, FALSE");
                    }
                }
                case 1 -> {
                    if (tarea == 4) {
                        System.out.println("NO SE PUEDE AGREGAR OTRA TAREA, FALSE");
                    }
                }
                case 2 -> {
                    if (autoE == 1) {
                        System.out.println("NO SE PUEDE AGREGAR OTRA AUTOEVALUACION, FALSE");
                    }
                }
                default -> throw new AssertionError();
            }
            conexionDB.close();
            return Actividad;

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

    public int Edit_Actividad(Modelo_Asignacion_Actividades ActividadaEditar) {
        try {

            String sql = """
UPDATE public."Tbl_Actividades"
                         	SET  "Nombre_Actividad"= ?,  "TipoActividad_id"=?, "Descripcion"=?
                         	WHERE id = ?;""";

            conexionDB = claseConectar.iniciarConexion();
            pstm = conexionDB.prepareStatement(sql);

            System.out.println("id a modificar" + ActividadaEditar.getIdActividad());
            pstm.setString(1, ActividadaEditar.getNombreActividad());
            pstm.setInt(2, ActividadaEditar.getIdTipoActividad());
            pstm.setString(3, ActividadaEditar.getDescripcion());
            pstm.setInt(4, ActividadaEditar.getIdActividad());

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
