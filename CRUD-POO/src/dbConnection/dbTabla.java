package dbConnection;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.*;
import javax.swing.*;
import dbConnection.ConexionCrud;

public class dbTabla extends JFrame{
	
	public static void main(String[] args) {
		JFrame tmarco = new dbTabla();
		tmarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tmarco.setVisible(true);
		JTable tablaAlumnos;
		tablaAlumnos = new JTable();
		tablaAlumnos.setBounds(300,300,400,200);
	}

	public dbTabla() {	
		setTitle("Alumnos");
		setBounds(300,300,400,200);
	}
	
	private void Principal() {
	}
}

class datosTabla extends JFrame{
	
	ConexionCrud enlace = new ConexionCrud();
	Connection connect = enlace.conectar();
	
	
	public datosTabla(){
		System.out.println("select * from datos_alumnos");
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Cedula");
		model.addColumn("Nombre");
		model.addColumn("Apellido");
		model.addColumn("Direccion");
		model.addColumn("Telefono");
		int ci[] = new int[1];
		String datos[] = new String[4];
		Statement stmt;
		try {
			stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery("select * from datos_alumnos");
			while (rs.next()) {
				ci[0] = rs.getInt(1);
				datos[0] = rs.getString(2);
				datos[1] = rs.getString(3);
				datos[2] = rs.getString(4);
				datos[3] = rs.getString(5);
				model.setRowCount(5);
				}
		}catch (SQLException e) {e.printStackTrace();}
	}
}
