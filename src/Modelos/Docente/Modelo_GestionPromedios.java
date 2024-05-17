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

public class Modelo_GestionPromedios {
    
    private Connection conexionDB;
    private Statement statement;
    private ClaseConexion claseConectar;
    private PreparedStatement pstm;

//lado Servidor
//lado escritorio
    private int NIE;
    
    private int Grado;
    private String Nombre;
    private Double Act1;
    private Double Act2;
    private Double Act3;
    private Double Act4;
    
    private Double Nota1;
    private Double Nota2;
    private Double Nota3;
    private Double Nota4;
    
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
    
    public Double getNota1() {
        return Nota1;
    }
    
    public void setNota1(Double Nota1) {
        this.Nota1 = Nota1;
    }
    
    public Double getNota2() {
        return Nota2;
    }
    
    public void setNota2(Double Nota2) {
        this.Nota2 = Nota2;
    }
    
    public Double getNota3() {
        return Nota3;
    }
    
    public void setNota3(Double Nota3) {
        this.Nota3 = Nota3;
    }
    
    public Double getNota4() {
        return Nota4;
    }
    
    public void setNota4(Double Nota4) {
        this.Nota4 = Nota4;
    }
    
    public List<Double> getNotas() {
        return notas;
    }
    
    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }
    
    public int getGrado() {
        return Grado;
    }
    
    public void setGrado(int Grado) {
        this.Grado = Grado;
    }
    
    public Double getAct1() {
        return Act1;
    }
    
    public void setAct1(Double Act1) {
        this.Act1 = Act1;
    }
    
    public Double getAct2() {
        return Act2;
    }
    
    public void setAct2(Double Act2) {
        this.Act2 = Act2;
    }
    
    public Double getAct3() {
        return Act3;
    }
    
    public void setAct3(Double Act3) {
        this.Act3 = Act3;
    }
    
    public Double getAct4() {
        return Act4;
    }
    
    public void setAct4(Double Act4) {
        this.Act4 = Act4;
    }
    
    public Modelo_GestionPromedios(Double Act1, Double Act2, Double Act3, Double Act4) {
        this.Act1 = Act1;
        this.Act2 = Act2;
        this.Act3 = Act3;
        this.Act4 = Act4;
    }
    
    public Modelo_GestionPromedios(Connection conexionDB, Statement statement, ClaseConexion claseConectar, PreparedStatement pstm,
            int NIE, String Nombre, Double Nota, List<Double> notas) {

        //LADO DEL SERVIDOR
        this.conexionDB = conexionDB;
        this.statement = statement;
        this.claseConectar = new ClaseConexion();
        this.pstm = pstm;

        //LADO APLICAION ESCRITORIO
        this.NIE = NIE;
        this.Nombre = Nombre;
        
        this.Nota1 = Nota;
        this.notas = notas;
        
    }
    
    public Modelo_GestionPromedios() {
        this.claseConectar = new ClaseConexion();
    }

    /**
     * @param NIE
     * @param Grado
     * @return
     * *******************************************************************************************************************
     */
    public ArrayList<Modelo_GestionPromedios> Get_Promedio(int NIE, int Grado, int periodo) {
        try {
            System.out.println("---CARGAR NOTAS PROMEDIO ");
            conexionDB = claseConectar.iniciarConexion(); // Iniciamos una conexión
            statement = conexionDB.createStatement(); // Creamos la consulta
///////////////////////////////////
            String ConsultaNotasPorMateria = """
SELECT "Estudiante_id", TipAct."TipoActividad", "NotaObtenida", Tmat."Nombre"
FROM public."Tbl_Nota_Actividad"
INNER JOIN "Tbl_Actividades" AS Tact ON Tact.id = "Tbl_Nota_Actividad"."Actividad_id"
INNER JOIN "Tbl_Materias" AS Tmat ON Tmat.id = Tact."Materia_id"
INNER JOIN "Tbl_TipoActividad" AS TipAct ON TipAct."id_Act" = Tact."TipoActividad_id"
WHERE "Estudiante_id" = ? AND Tact."Materia_id" = 1
ORDER BY Tact."TipoActividad_id" ASC;
            """;
            
            PreparedStatement preparedStatement1 = conexionDB.prepareStatement(ConsultaNotasPorMateria);
            preparedStatement1.setInt(1, NIE);
            
            ResultSet Consulta_notasActividades = preparedStatement1.executeQuery();
            
            String ConsultaNotasPorNIE = """
    SELECT Tb_Np."NIE", Tb_Mat."Nombre" , Tb_Np."Promedio_1", Tb_Np."Promedio_2", Tb_Np."Promedio_3", Tb_Np."Promedio_4"
	FROM public."Tbl_NotasPromediadas" AS Tb_Np
		INNER JOIN "Tbl_Materias" AS Tb_Mat ON Tb_Mat.id = Tb_Np."Materia_id"
		INNER JOIN "Tbl_Grados" AS Tb_Gr oN Tb_Gr.id = Tb_Mat."Grado_id"
		WHERE Tb_Np."NIE" = ?  AND Tb_Gr.id = ? ;
            """;
            
            PreparedStatement preparedStatement2 = conexionDB.prepareStatement(ConsultaNotasPorNIE);
            preparedStatement2.setInt(1, NIE);
            preparedStatement2.setInt(2, Grado);
            
            ResultSet Consulta_Promedios = preparedStatement2.executeQuery(); // Ejecutamos la consulta

            TiemSql();
            
            ArrayList<Modelo_GestionPromedios> NotasAlumno = new ArrayList<>(); // Lista para almacenar las notas del estudiante
            
            ArrayList<Double> notasActividades = new ArrayList<>();
            
            while (Consulta_Promedios.next()) {
                Modelo_GestionPromedios NotasMateria = new Modelo_GestionPromedios();
                
                NotasMateria.setNombre(Consulta_Promedios.getString("Nombre"));
                System.out.println(NotasMateria.getNombre());
                NotasMateria.setNota1(Consulta_Promedios.getDouble("Promedio_1"));
                System.out.println("nota 1 " + NotasMateria.getNota1());
                NotasMateria.setNota2(Consulta_Promedios.getDouble("Promedio_2"));
                System.out.println("nota 2 " + NotasMateria.getNota2());
                
                NotasMateria.setNota3(Consulta_Promedios.getDouble("Promedio_3"));
                System.out.println("nota 3 " + NotasMateria.getNota3());
                
                NotasMateria.setNota4(Consulta_Promedios.getDouble("Promedio_4"));
                System.out.println("nota 4 " + NotasMateria.getNota4());
                
                while (Consulta_notasActividades.next()) {
                    notasActividades.add(Consulta_notasActividades.getDouble("NotaObtenida"));
                    System.out.println("agregado nota  : " + Consulta_notasActividades.getDouble("NotaObtenida") + "\t de actividad : " + Consulta_notasActividades.getString("Nombre"));
                    
                }
                NotasMateria.setNotas(notasActividades);
                NotasAlumno.add(NotasMateria);
            }
            
            System.out.println("\t-> Agregados: " + NotasAlumno.size());
            conexionDB.close();
            
            return NotasAlumno;
            
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_GestionPromedios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<Integer> Get_ListadoNIES() throws SQLException {
        System.out.println("---CARGAR NIES");
        conexionDB = claseConectar.iniciarConexion(); // Iniciamos una conexión
        statement = conexionDB.createStatement(); // Creamos la consulta
        String sql_lista = """
            SELECT "NIE" FROM public."tbl_Estudiante"
            WHERE "Grado_id" = 1;
        """;
        
        ArrayList<Integer> ListaNies = new ArrayList<>(); // Lista para almacenar los NIE de los estudiantes del grado

        ResultSet ConsultaListaNies = statement.executeQuery(sql_lista); // Ejecutamos la consulta con la query dada

        while (ConsultaListaNies.next()) {
            ListaNies.add(ConsultaListaNies.getInt("NIE"));
        }
        return ListaNies;
    }
    
    public ArrayList<Modelo_GestionPromedios> getBusqueda(String Palabra, String ParametroBusqueda, int Periodo, int grado) {
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
                
                ArrayList<Modelo_GestionPromedios> BusquedaNota = new ArrayList<>(); // Lista para almacenar los datos de actividades

                for (Integer nie : ListaNies) {
                    String ConsultaNotasPorNIE = """
SELECT TbEst."NIE", TbEst."Apellidos", TbEst."Nombres" ,
tna."NotaObtenida",
tbA."Nombre_Actividad"
                	FROM public."Tbl_Nota_Actividad" AS tna
                	INNER JOIN "tbl_Estudiante" AS TbEst ON TbEst."NIE" = tna."Estudiante_id"
                	INNER JOIN "Tbl_Actividades" AS tbA ON tbA.id = tna."Actividad_id"
                	INNER JOIN "Tbl_TipoActividad" AS tbtA ON tbtA.id = tbA."TipoActividad_id"
                                                                     
               	WHERE TbEst."NIE" = ? AND tbA."Periodo_id" = ? ;""";
                    
                    PreparedStatement preparedStatement = conexionDB.prepareStatement(ConsultaNotasPorNIE);
                    preparedStatement.setInt(1, nie);
                    preparedStatement.setInt(2, Periodo);
                    
                    System.out.println("consulta:  " + pstm.toString());
                    
                    ResultSet consulta_Notas = preparedStatement.executeQuery(); // Ejecutamos la consulta
                    TiemSql();
                    
                    ArrayList<Double> notas = new ArrayList<>(); // Lista para almacenar las notas del estudiante
                    Modelo_GestionPromedios NotaAlumno = new Modelo_GestionPromedios();
                    
                    while (consulta_Notas.next()) {
                        System.out.println("agregando nota de: " + consulta_Notas.getString("Nombres"));
                        notas.add(consulta_Notas.getDouble("NotaObtenida"));
                        NotaAlumno.setNIE(nie);
                        NotaAlumno.setNombre(consulta_Notas.getString("Nombres"));
                        NotaAlumno.setNotas(notas); // Asignar la lista de notas al estudiante

                    }
                    
                    while (notas.size() < 6) {
                        notas.add(0.0);
                    }
                    
                    NotaAlumno.setNotas(notas); // Asignar la lista de notas al estudiante

                    NotaAlumno.setNotas(notas); // Asignar la lista de notas al estudiante

                    if (NotaAlumno.getNIE() != 0) {
                        BusquedaNota.add(NotaAlumno); // Agregar el estudiante a la lista de actividades

                    }
                }
                
                System.out.println("                        -> Agregados: " + BusquedaNota.size());
                conexionDB.close();
                
                return BusquedaNota;
            } else {
                System.out.println("====>BUSQUEDA POR " + ParametroBusqueda);
                
                String BusquedaGeneral = """
SELECT TbEst."NIE", TbEst."Apellidos", TbEst."Nombres" ,
tna."NotaObtenida",
tbA."Nombre_Actividad"
                	FROM public."Tbl_Nota_Actividad" AS tna
                	INNER JOIN "tbl_Estudiante" AS TbEst ON TbEst."NIE" = tna."Estudiante_id"
                	INNER JOIN "Tbl_Actividades" AS tbA ON tbA.id = tna."Actividad_id"
                	INNER JOIN "Tbl_TipoActividad" AS tbtA ON tbtA.id = tbA."TipoActividad_id"
                                                                                                          
                                                    	WHERE tbA."Periodo_id" = ? AND """;
                
                BusquedaGeneral += " unaccent( " + ParametroBusqueda + " ) " + " LIKE unaccent( ? ) ;";
                
                pstm = conexionDB.prepareStatement(BusquedaGeneral);
                
                pstm.setInt(1, Periodo);
                pstm.setString(2, Palabra + "%");
                
                System.out.println("consulta:  " + pstm.toString());
                
                ArrayList<Modelo_GestionPromedios> BusquedaNota = new ArrayList<>(); // Lista para almacenar los datos de actividades

                ResultSet consulta_Notas = pstm.executeQuery(); // execute the query
                TiemSql();
                
                ArrayList<Double> notas = new ArrayList<>(); // Lista para almacenar las notas del estudiante
                Modelo_GestionPromedios NotaAlumno = new Modelo_GestionPromedios();
                
                int i = 1;
                while (consulta_Notas.next()) {
                    System.out.println(i + "agregando nota de: " + consulta_Notas.getString("Nombres"));
                    notas.add(consulta_Notas.getDouble("NotaObtenida"));
                    NotaAlumno.setNIE(consulta_Notas.getInt("NIE"));
                    NotaAlumno.setNombre(consulta_Notas.getString("Nombres"));
                    NotaAlumno.setNotas(notas); // Asignar la lista de notas al estudiante
                    i++;
                }
                
                try {
                    while (notas.size() < 6) {
                        notas.add(0.0);
                    }
                    
                } catch (NullPointerException ex) {
                    System.out.println("La lista NotaAlumno.getNotas() está vacía.");
                }
                
                NotaAlumno.setNotas(notas); // Asignar la lista de notas al estudiante

                if (NotaAlumno.getNIE() != 0) {
                    BusquedaNota.add(NotaAlumno); // Agregar el estudiante a la lista de actividades

                }
                System.out.println("-> Agregados: " + BusquedaNota.size());
                conexionDB.close();
                
                return BusquedaNota;
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_GestionPromedios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
//adaprar los dos tipos de busquyeda

    public ArrayList<Modelo_GestionPromedios> getBusquedaNombres(String Palabra, String ParametroBusqueda, int Periodo, int grado) {
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
            
            ArrayList<Modelo_GestionPromedios> NotaBuscar = new ArrayList<>(); // Lista para almacenar los datos de actividades

            ResultSet consulta_Notas = pstm.executeQuery(); // execute the query

            ArrayList<Double> notas = new ArrayList<>(); // Lista para almacenar las notas del estudiante
            Modelo_GestionPromedios NotaAlumno = new Modelo_GestionPromedios();
            
            int i = 1;
            while (consulta_Notas.next()) {
                System.out.println(i + "\nagregando nota de: " + consulta_Notas.getString("Nombres"));
                notas.add(consulta_Notas.getDouble("Nota "));
                NotaAlumno.setNIE(consulta_Notas.getInt("NIE"));
                NotaAlumno.setNombre(consulta_Notas.getString("Nombres"));
                NotaAlumno.setNotas(notas); // Asignar la lista de notas al estudiante
                i++;
            }
            
            while (NotaAlumno.getNotas().size() < 6) {
                notas.add(0.0);
            }
            
            NotaAlumno.setNotas(notas); // Asignar la lista de notas al estudiante

            if (NotaAlumno.getNIE() != 0) {
                NotaBuscar.add(NotaAlumno); // Agregar el estudiante a la lista de actividades

            }
            System.out.println("                        -> Agregados: " + NotaBuscar.size());
            conexionDB.close();
            
            return NotaBuscar;
            
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_GestionPromedios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<Modelo_GestionPromedios> GetInforme() {
        try {
            conexionDB = claseConectar.iniciarConexion();//iniciamos una coneccion 
            statement = conexionDB.createStatement();//crear consulta

            String sql = """
                         SELECT *,TM."Descuento",TM."Membresia",TR."Consumo",TR."Consumo_Final"  
                         FROM public."Tbl_Cliente"  
                         INNER JOIN "Tbl_Membresias" AS TM on TM."id_Membresia" = "Tbl_Cliente"."id_Membresia"
                         INNER JOIN "Tbl_RegistroConsumo" AS TR ON TR."id_Cliente" = "Tbl_Cliente".idpersona""";
            
            ResultSet consulta = statement.executeQuery(sql);//ejecutamos la consulta

            ArrayList<Modelo_GestionPromedios> DataPersonas = new ArrayList<>();
            while (consulta.next()) {
                
                Modelo_GestionPromedios Persona = new Modelo_GestionPromedios();

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
            Logger.getLogger(Modelo_GestionPromedios.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Modelo_GestionPromedios GetPersona(int id) {
        try {
            conexionDB = claseConectar.iniciarConexion(); // initiate a connection

            String sql = "SELECT *,TM.\"Descuento\",TM.\"Membresia\"  FROM public.\"Tbl_Cliente\" INNER JOIN \"Tbl_Membresias\" AS TM on TM.\"id_Membresia\" = \"Tbl_Cliente\".\"id_Membresia\" WHERE idpersona = ?";
            pstm = conexionDB.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet consulta = pstm.executeQuery(); // execute the query

            Modelo_GestionPromedios Persona = null;
            if (consulta.next()) {
                Persona = new Modelo_GestionPromedios();
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
            Logger.getLogger(Modelo_GestionPromedios.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public int insertNuevoCliente(Modelo_GestionPromedios PersonasInsert) {
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
            java.util.logging.Logger.getLogger(Modelo_GestionPromedios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public int editPersonas(Modelo_GestionPromedios PersonasEdit) {
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
            java.util.logging.Logger.getLogger(Modelo_GestionPromedios.class
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
            java.util.logging.Logger.getLogger(Modelo_GestionPromedios.class
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
            java.util.logging.Logger.getLogger(Modelo_GestionPromedios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }
    
}
