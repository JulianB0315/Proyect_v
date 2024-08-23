package Ventanas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
        public static Connection getConnection() throws SQLException {
        String url = ""; // Cambia el URL de acuerdo a tu configuración
        String user = "";// Usuario
        String password = "";// Contraseña

        try {
            Class.forName("oracle.jdbc.OracleDriver"); // Cargar el driver
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Conectado");
        }

        return DriverManager.getConnection(url, user, password);
    }
}
