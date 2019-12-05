package finalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro da Fonte
 */
public class DbConnection {
    
    Connection conn = null;
    
    public static Connection ConnectDb(){
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:CheckersProject.db");
            System.out.println("Connected");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
