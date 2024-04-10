package Modelos.Docente;

import Conexion.ClaseConexion;
import static Funciones.Funciones.TiemSql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Modelo_GestionNotas {

    private Connection conexionDB;
    private Statement statement;
    private ClaseConexion claseConectar;
    private PreparedStatement pstm;

//lado Servidor
//lado escritorio
    private int NIE;
    private int NIES;
    private int Grado;
    private String Nombre;
    private String Apellido;
    private Double Promedio;
    private Double Nota;
    private List<Double> notas;

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

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Materia) {
        this.Apellido = Materia;
    }

    public Double getPromedio() {
        return Promedio;
    }

    public void setPromedio(Double Promedio) {
        this.Promedio = Promedio;
    }

    public Double getNota() {
        return Nota;
    }

    public void setNota(Double Nota) {
        this.Nota = Nota;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public int getNIES() {
        return NIES;
    }

    public void setNIES(int NIES) {
        this.NIES = NIES;
    }

    public int getGrado() {
        return Grado;
    }

    public void setGrado(int Grado) {
        this.Grado = Grado;
    }

    public Modelo_GestionNotas(Connection conexionDB, Statement statement, ClaseConexion claseConectar, PreparedStatement pstm,
            int NIE, String Nombre, String Apellido, Double Nota, List<Double> notas, Double Promedio) {

        //LADO DEL SERVIDOR
        this.conexionDB = conexionDB;
        this.statement = statement;
        this.claseConectar = new ClaseConexion();
        this.pstm = pstm;

        //LADO APLICAION ESCRITORIO
        this.NIE = NIE;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Promedio = Promedio;
        this.Nota = Nota;
        this.notas = notas;

    }

    public Modelo_GestionNotas() {
        this.claseConectar = new ClaseConexion();
    }

    /**
     * @param grado
     * @return
     * *******************************************************************************************************************
     */
    public ArrayList<Modelo_GestionNotas> GetRegistroNotas(int grado, int periodo) {
        try {
            System.out.println("            ---CARGAR NOTAS");
            conexionDB = claseConectar.iniciarConexion(); // Iniciamos una conexión
            statement = conexionDB.createStatement(); // Creamos la consulta

            ArrayList<Integer> ListaNies = new ArrayList<>(); // Lista para almacenar los NIE de los estudiantes del grado

            String sql_lista = """
            SELECT "NIE" FROM public."tbl_Estudiante"
            WHERE "Grado_id" = 1;
        """;

            ResultSet ConsultaListaNies = statement.executeQuery(sql_lista); // Ejecutamos la consulta con la query dada

            while (ConsultaListaNies.next()) {
                ListaNies.add(ConsultaListaNies.getInt("NIE"));
            }

            ArrayList<Modelo_GestionNotas> ListadoNotas = new ArrayList<>(); // Lista para almacenar los datos de actividades

            for (Integer nie : ListaNies) {

                String ConsultaNotasPorNIE = """
SELECT TbEst."NIE", TbEst."Apellidos", TbEst."Nombres" ,
tna."Nota ",
tbA."Nombre_Actividad"
                	FROM public."Tbl_Nota_Actividad" AS tna
                	INNER JOIN "tbl_Estudiante" AS TbEst ON TbEst."NIE" = tna."Estudiante_id"
                	INNER JOIN "Tbl_Actividades" AS tbA ON tbA.id = tna."Actividad_id"
                	INNER JOIN "Tbl_TipoActividad" AS tbtA ON tbtA.id = tbA."TipoActividad_id"
                	
                	WHERE TbEst."NIE" = ? AND tbA."Periodo_id" = ?;
            """;

                PreparedStatement preparedStatement = conexionDB.prepareStatement(ConsultaNotasPorNIE);
                preparedStatement.setInt(1, nie);
                preparedStatement.setInt(2, periodo);

                ResultSet consulta_Notas = preparedStatement.executeQuery(); // Ejecutamos la consulta
                TiemSql();

                ArrayList<Double> notas = new ArrayList<>(); // Lista para almacenar las notas del estudiante
                Modelo_GestionNotas NotaAlumno = new Modelo_GestionNotas();

                while (consulta_Notas.next()) {
                    System.out.print(">agregando nota de: " + consulta_Notas.getString("Nombres"));
                    notas.add(consulta_Notas.getDouble("Nota "));
                    NotaAlumno.setNIE(nie);
                    NotaAlumno.setApellido(consulta_Notas.getString("Apellidos"));
                    NotaAlumno.setNombre(consulta_Notas.getString("Nombres"));
                    NotaAlumno.setNotas(notas); // Asignar la lista de notas al estudiante

                }

                while (NotaAlumno.getNotas().size() < 6) {
                    notas.add(0.0);
                }

                NotaAlumno.setNotas(notas); // Asignar la lista de notas al estudiante

                ListadoNotas.add(NotaAlumno); // Agregar el estudiante a la lista de actividades

            }

            System.out.println("\t-> Agregados: " + ListadoNotas.size());
            conexionDB.close();

            return ListadoNotas;

        } catch (SQLException ex) {
            Logger.getLogger(Modelo_GestionNotas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<Modelo_GestionNotas> getBusqueda(String Palabra, String ParametroBusqueda, int Periodo, int grado) {
        try {
            conexionDB = claseConectar.iniciarConexion(); // Iniciamos una conexión
            statement = conexionDB.createStatement(); // Creamos la consulta

            ArrayList<Integer> ListaNies = new ArrayList<>(); // Lista para almacenar los NIE de los estudiantes

            if (ParametroBusqueda.equalsIgnoreCase(" TbEst.\"NIE\" ")) {
                System.out.println("====>BUSQUEDA NIE");

                String BUsquedaPorNIE = """
                SELECT "NIE" FROM public."tbl_Estudiante"
                        WHERE "Grado_id" = 1 AND "NIE" = ?;
                        """;
                int nieBUscar = Integer.parseInt(Palabra);

                pstm = conexionDB.prepareStatement(BUsquedaPorNIE);
                pstm.setInt(1, nieBUscar);

                ResultSet ConsultaListaNies = pstm.executeQuery(); // Ejecutamos la consulta con la query dada
                TiemSql();

                while (ConsultaListaNies.next()) {
                    ListaNies.add(ConsultaListaNies.getInt("NIE"));
                }

                ArrayList<Modelo_GestionNotas> DataBuscar = new ArrayList<>(); // Lista para almacenar los datos de actividades

                for (Integer nie : ListaNies) {
                    String ConsultaNotasPorNIE = """
SELECT TbEst."NIE", TbEst."Apellidos", TbEst."Nombres" ,
tna."Nota ",
tbA."Nombre_Actividad"
                	FROM public."Tbl_Nota_Actividad" AS tna
                	INNER JOIN "tbl_Estudiante" AS TbEst ON TbEst."NIE" = tna."Estudiante_id"
                	INNER JOIN "Tbl_Actividades" AS tbA ON tbA.id = tna."Actividad_id"
                	INNER JOIN "Tbl_TipoActividad" AS tbtA ON tbtA.id = tbA."TipoActividad_id"
                                                                     
               	WHERE TbEst."NIE" = ? AND tbA."Periodo_id" = ? ;""";

                    PreparedStatement preparedStatement = conexionDB.prepareStatement(ConsultaNotasPorNIE);
                    preparedStatement.setInt(1, nie);
                    preparedStatement.setInt(2, Periodo);

                    ResultSet consulta_Notas = preparedStatement.executeQuery(); // Ejecutamos la consulta
                    TiemSql();

                    ArrayList<Double> notas = new ArrayList<>(); // Lista para almacenar las notas del estudiante
                    Modelo_GestionNotas NotaAlumno = new Modelo_GestionNotas();

                    while (consulta_Notas.next()) {
                        System.out.println("agregando nota de: " + consulta_Notas.getString("Nombres"));
                        notas.add(consulta_Notas.getDouble("Nota "));
                        NotaAlumno.setNIE(nie);
                        NotaAlumno.setApellido(consulta_Notas.getString("Apellidos"));
                        NotaAlumno.setNombre(consulta_Notas.getString("Nombres"));
                        NotaAlumno.setNotas(notas); // Asignar la lista de notas al estudiante

                    }

                    while (NotaAlumno.getNotas().size() < 6) {
                        notas.add(0.0);
                    }

                    NotaAlumno.setNotas(notas); // Asignar la lista de notas al estudiante

                    DataBuscar.add(NotaAlumno); // Agregar el estudiante a la lista de actividades

                }

                System.out.println("                        -> Agregados: " + DataBuscar.size());
                conexionDB.close();

                return DataBuscar;
            } else {
                System.out.println("====>BUSQUEDA POR " + ParametroBusqueda);

                String BusquedaGeneral = """
SELECT TbEst."NIE", TbEst."Apellidos", TbEst."Nombres" ,
tna."Nota ",
tbA."Nombre_Actividad"
                	FROM public."Tbl_Nota_Actividad" AS tna
                	INNER JOIN "tbl_Estudiante" AS TbEst ON TbEst."NIE" = tna."Estudiante_id"
                	INNER JOIN "Tbl_Actividades" AS tbA ON tbA.id = tna."Actividad_id"
                	INNER JOIN "Tbl_TipoActividad" AS tbtA ON tbtA.id = tbA."TipoActividad_id"
                                                                                                          
                                                    	WHERE tbA."Periodo_id" = ? AND """;

                BusquedaGeneral += ParametroBusqueda + " LIKE ? ;";

                System.out.println("consulta:  " + BusquedaGeneral);
                pstm = conexionDB.prepareStatement(BusquedaGeneral);
                pstm.setInt(1, Periodo);
                pstm.setString(2, Palabra + "%");

                ArrayList<Modelo_GestionNotas> DataBuscar = new ArrayList<>(); // Lista para almacenar los datos de actividades

                ResultSet consulta_Notas = pstm.executeQuery(); // execute the query
                TiemSql();

                ArrayList<Double> notas = new ArrayList<>(); // Lista para almacenar las notas del estudiante
                Modelo_GestionNotas NotaAlumno = new Modelo_GestionNotas();

                int i = 1;
                while (consulta_Notas.next()) {
                    System.out.println(i + "agregando nota de: " + consulta_Notas.getString("Nombres"));
                    notas.add(consulta_Notas.getDouble("Nota "));
                    NotaAlumno.setNIE(consulta_Notas.getInt("NIE"));
                    NotaAlumno.setApellido(consulta_Notas.getString("Apellidos"));
                    NotaAlumno.setNombre(consulta_Notas.getString("Nombres"));
                    NotaAlumno.setNotas(notas); // Asignar la lista de notas al estudiante
                    i++;
                }

                try {
                    while (NotaAlumno.getNotas().size() < 6) {
                        notas.add(0.0);
                    }
                } catch (NullPointerException ex) {
                    System.out.println("La lista NotaAlumno.getNotas() está vacía.");
                }

                NotaAlumno.setNotas(notas); // Asignar la lista de notas al estudiante

                DataBuscar.add(NotaAlumno); // Agregar el estudiante a la lista de actividades

                System.out.println("                        -> Agregados: " + DataBuscar.size());
                conexionDB.close();

                return DataBuscar;

            }

        } catch (SQLException ex) {
            Logger.getLogger(Modelo_GestionNotas.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
//adaprar los dos tipos de busquyeda

    public ArrayList<Modelo_GestionNotas> getBusquedaNombres(String Palabra, String ParametroBusqueda, int Periodo, int grado) {
        try {
            conexionDB = claseConectar.iniciarConexion(); // Iniciamos una conexión
            statement = conexionDB.createStatement(); // Creamos la consulta

            System.out.println("====>BUSQUEDA POR " + ParametroBusqueda);

            String BusquedaGeneral = """
SELECT TbEst."NIE", TbEst."Apellidos", TbEst."Nombres" ,
tna."Nota ",
tbA."Nombre_Actividad"
                	FROM public."Tbl_Nota_Actividad" AS tna
                	INNER JOIN "tbl_Estudiante" AS TbEst ON TbEst."NIE" = tna."Estudiante_id"
                	INNER JOIN "Tbl_Actividades" AS tbA ON tbA.id = tna."Actividad_id"
                	INNER JOIN "Tbl_TipoActividad" AS tbtA ON tbtA.id = tbA."TipoActividad_id"
                                                                                                          
                                                    	WHERE  """;

            BusquedaGeneral += ParametroBusqueda + " LIKE ? ;";

            pstm = conexionDB.prepareStatement(BusquedaGeneral);
            pstm.setString(1, Palabra + "%");

            ArrayList<Modelo_GestionNotas> DataBuscar = new ArrayList<>(); // Lista para almacenar los datos de actividades

            ResultSet consulta_Notas = pstm.executeQuery(); // execute the query

            ArrayList<Double> notas = new ArrayList<>(); // Lista para almacenar las notas del estudiante
            Modelo_GestionNotas NotaAlumno = new Modelo_GestionNotas();

            int i = 1;
            while (consulta_Notas.next()) {
                System.out.println(i + "\nagregando nota de: " + consulta_Notas.getString("Nombres"));
                notas.add(consulta_Notas.getDouble("Nota "));
                NotaAlumno.setNIE(consulta_Notas.getInt("NIE"));
                NotaAlumno.setApellido(consulta_Notas.getString("Apellidos"));
                NotaAlumno.setNombre(consulta_Notas.getString("Nombres"));
                NotaAlumno.setNotas(notas); // Asignar la lista de notas al estudiante
                i++;
            }

            while (NotaAlumno.getNotas().size() < 6) {
                notas.add(0.0);
            }

            NotaAlumno.setNotas(notas); // Asignar la lista de notas al estudiante

            DataBuscar.add(NotaAlumno); // Agregar el estudiante a la lista de actividades

            System.out.println("                        -> Agregados: " + DataBuscar.size());
            conexionDB.close();

            return DataBuscar;

        } catch (SQLException ex) {
            Logger.getLogger(Modelo_GestionNotas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<Modelo_GestionNotas> GetInforme() {
        try {
            conexionDB = claseConectar.iniciarConexion();//iniciamos una coneccion 
            statement = conexionDB.createStatement();//crear consulta

            String sql = """
                         SELECT *,TM."Descuento",TM."Membresia",TR."Consumo",TR."Consumo_Final"  
                         FROM public."Tbl_Cliente"  
                         INNER JOIN "Tbl_Membresias" AS TM on TM."id_Membresia" = "Tbl_Cliente"."id_Membresia"
                         INNER JOIN "Tbl_RegistroConsumo" AS TR ON TR."id_Cliente" = "Tbl_Cliente".idpersona""";

            ResultSet consulta = statement.executeQuery(sql);//ejecutamos la consulta

            ArrayList<Modelo_GestionNotas> DataPersonas = new ArrayList<>();
            while (consulta.next()) {

                Modelo_GestionNotas Persona = new Modelo_GestionNotas();

//                Persona.setId(consulta.getInt("idpersona"));
//                Persona.setNombre(consulta.getString("Actividad"));
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
            Logger.getLogger(Modelo_GestionNotas.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Modelo_GestionNotas GetPersona(int id) {
        try {
            conexionDB = claseConectar.iniciarConexion(); // initiate a connection

            String sql = "SELECT *,TM.\"Descuento\",TM.\"Membresia\"  FROM public.\"Tbl_Cliente\" INNER JOIN \"Tbl_Membresias\" AS TM on TM.\"id_Membresia\" = \"Tbl_Cliente\".\"id_Membresia\" WHERE idpersona = ?";
            pstm = conexionDB.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet consulta = pstm.executeQuery(); // execute the query

            Modelo_GestionNotas Persona = null;
            if (consulta.next()) {
                Persona = new Modelo_GestionNotas();
//
//                Persona.setId(consulta.getInt("idpersona"));
//                Persona.setNombre(consulta.getString("Actividad"));
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
            Logger.getLogger(Modelo_GestionNotas.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int insertNuevoCliente(Modelo_GestionNotas PersonasInsert) {
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
            java.util.logging.Logger.getLogger(Modelo_GestionNotas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int editPersonas(Modelo_GestionNotas PersonasEdit) {
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
            java.util.logging.Logger.getLogger(Modelo_GestionNotas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Modelo_GestionNotas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Modelo_GestionNotas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

}
