package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexion {

    private static String url = "jdbc:mysql://localhost:3306/transversal?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static String usuario = "root";
    private static String password = "";
    private static Conexion conexion=null;

    private Conexion() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase Conexion: Error al cargar Driver");
        }
    }

    public static Connection getConexion() {
        
        Connection conn=null;
        
        if (conexion == null) {
            conexion=new Conexion();
         }
        
        try {
            conn = DriverManager.getConnection(url + "&user=" + usuario + "&password=" + password);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Clase Conexion: Error de Conexion");
        }
      
      return conn;
    }

    public PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
