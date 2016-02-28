package conexion;

import java.sql.*;

public class Conexion {

    public static Connection conectar() {
        Connection con = null;
        try {
            // cargamos el driver de conexion
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // conseguimos conexion a la BD
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Supermercado", "sa", "123");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}