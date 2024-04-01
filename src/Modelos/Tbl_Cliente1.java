package Modelos;

import Conexion.ClaseConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tbl_Cliente1 {

    private Connection conexionDB;
    private Statement statement;
    private ClaseConexion claseConectar;
    private PreparedStatement pstm;

    private int id;
    private String nombre;
    private String password;
    private String tipo_usuario;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public Tbl_Cliente1(Connection conexionDB, Statement statement, ClaseConexion claseConectar, PreparedStatement pstm, int id, String nombre, String password,String tipo_usuario) {
        this.conexionDB = conexionDB;
        this.statement = statement;
        this.claseConectar = new ClaseConexion();
        this.pstm = pstm;
        ////////////////////////////////////////////////
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.tipo_usuario = tipo_usuario;

    }

    public Tbl_Cliente1() {
        this.claseConectar = new ClaseConexion();
    }

    /**
     * @return
     * *******************************************************************************************************************
     */
    public ArrayList<Tbl_Cliente1> getClientesRegistrados() {
        try {
            conexionDB = claseConectar.iniciarConexion();//iniciamos una coneccion 
            statement = conexionDB.createStatement();//crear consulta

            String sql = "SELECT * FROM public.\"Tbl_Cliente\";";

            ResultSet consulta = statement.executeQuery(sql);//ejecutamos la consulta

            ArrayList<Tbl_Cliente1> DataPersonas = new ArrayList<>();
            while (consulta.next()) {

//                Tbl_Cliente1 Persona = new Tbl_Cliente1();
//
//                Persona.setId(consulta.getInt("idpersona"));
//                Persona.setNombre(consulta.getString("nombre"));
//                Persona.setApellido_paterno(consulta.getString("apellido paterno"));
//                Persona.setApellido_materno(consulta.getString("apellido materno"));
//                Persona.setTipo_doc(consulta.getString("tipo_documneto"));
//                Persona.setNum_doc(consulta.getString("num_documento"));
//                Persona.setDireccion(consulta.getString("direccion"));
//                Persona.setTelefono(consulta.getString("telefono"));
//                Persona.setEmail(consulta.getString("email"));
//                Persona.setPassword(consulta.getString("Password"));
//
//                DataPersonas.add(Persona);
            }

            conexionDB.close();
            return DataPersonas;

        } catch (SQLException ex) {
            Logger.getLogger(Tbl_Cliente1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<Tbl_Cliente1> GetInforme() {
        try {
            conexionDB = claseConectar.iniciarConexion();//iniciamos una coneccion 
            statement = conexionDB.createStatement();//crear consulta

            String sql = """
                         SELECT *,TM."Descuento",TM."Membresia",TR."Consumo",TR."Consumo_Final"  
                         FROM public."Tbl_Cliente"  
                         INNER JOIN "Tbl_Membresias" AS TM on TM."id_Membresia" = "Tbl_Cliente"."id_Membresia"
                         INNER JOIN "Tbl_RegistroConsumo" AS TR ON TR."id_Cliente" = "Tbl_Cliente".idpersona""";

            ResultSet consulta = statement.executeQuery(sql);//ejecutamos la consulta

            ArrayList<Tbl_Cliente1> DataPersonas = new ArrayList<>();
            while (consulta.next()) {

                Tbl_Cliente1 Persona = new Tbl_Cliente1();

//                Persona.setId(consulta.getInt("idpersona"));
//                Persona.setNombre(consulta.getString("nombre"));
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
            Logger.getLogger(Tbl_Cliente1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Tbl_Cliente1 GetPersona(int id) {
        try {
            conexionDB = claseConectar.iniciarConexion(); // initiate a connection

            String sql = "SELECT *,TM.\"Descuento\",TM.\"Membresia\"  FROM public.\"Tbl_Cliente\" INNER JOIN \"Tbl_Membresias\" AS TM on TM.\"id_Membresia\" = \"Tbl_Cliente\".\"id_Membresia\" WHERE idpersona = ?";
            pstm = conexionDB.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet consulta = pstm.executeQuery(); // execute the query

            Tbl_Cliente1 Persona = null;
            if (consulta.next()) {
                Persona = new Tbl_Cliente1();
//
//                Persona.setId(consulta.getInt("idpersona"));
//                Persona.setNombre(consulta.getString("nombre"));
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
            Logger.getLogger(Tbl_Cliente1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int insertNuevoCliente(Tbl_Cliente1 PersonasInsert) {
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
            java.util.logging.Logger.getLogger(Tbl_Cliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int editPersonas(Tbl_Cliente1 PersonasEdit) {
        try {

            String sql = """
                         UPDATE public."Tbl_Cliente"
                         	SET  nombre=?, "apellido paterno"=?, "apellido materno"=?, tipo_documneto=?, num_documento=?, direccion=?, telefono=?, email=?, "Password"=?, "id_Membresia"=?
                         	WHERE idpersona=?;""";

            conexionDB = claseConectar.iniciarConexion();
            pstm = conexionDB.prepareStatement(sql);

            System.out.println("id a modificar" + PersonasEdit.getId());

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
            java.util.logging.Logger.getLogger(Tbl_Cliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            //  System.out.println("cambio->> el ID: " + id + " membresia " + idMembresia + " >? " + respuesta);
            return respuesta;

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Tbl_Cliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Tbl_Cliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    public Tbl_Cliente1 ValidLogin(String[] list) {
        try {
            String sql = """
                         SELECT id, "Nombre", "Contrase\u00f1a", "Tipo_usuario"
                         \tFROM public."Tbl_Usuarios"
                         \tWHERE "Nombre" = ?  AND "Contrase\u00f1a" = ? ;""";

            System.out.println("\n->VALIDANDO USUARIO ");

            conexionDB = claseConectar.iniciarConexion();
            pstm = conexionDB.prepareCall(sql);

            pstm.setString(1, list[0]);
            pstm.setString(2, list[1]);

            ResultSet rs = pstm.executeQuery();

            Tbl_Cliente1 Persona = new Tbl_Cliente1();
            while (rs.next()) {


                Persona.setNombre(rs.getString("Nombre"));
                Persona.setTipo_usuario(rs.getString("Tipo_usuario"));

            }

            System.out.println("se conto al servidor neon e inicio sesion : " + Persona.nombre + " Tipo de usuario : " + Persona.tipo_usuario);
            conexionDB.close();

            return Persona;

        } catch (SQLException ex) {
            Logger.getLogger(Tbl_Cliente1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
