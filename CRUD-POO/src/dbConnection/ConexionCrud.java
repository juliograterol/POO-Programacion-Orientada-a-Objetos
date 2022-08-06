package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ConexionCrud {

	public Connection conectar() {
		Connection connection = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection ("jdbc:postgresql://localhost:5432/data","postgres","julio130603");
			}catch(Exception e) { e.printStackTrace(); }
		return connection;
	}
    
}