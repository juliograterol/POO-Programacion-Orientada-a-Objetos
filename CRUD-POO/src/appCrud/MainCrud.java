package appCrud;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import dbConnection.ConexionCrud;
import dbConnection.dbTabla;

public class MainCrud extends JFrame implements ActionListener {
	
	ConexionCrud enlace = new ConexionCrud();
	Connection connect = enlace.conectar();
	
	public static void main(String[] args) {
		MainCrud crud = new MainCrud(); 
	}

	JLabel titulo, lblci, lblnombre, lblapellido, lbldir, lblphone;
	JTextField txtci, txtnombre, txtapellido, txtdir, txtphone;
	JLabel resultci, resultnom, resultapll, resultdir, resultphon;
	JButton btnmostrar, btnbuscar, btninsert, btneliminar;
	JTable tablaAlumnos;
	JPanel panel;
	
	MainCrud(){
		
		setTitle("Datos de los Alumnos");
		
		//Mensaje de bienvenida
		titulo = new JLabel("¡Bienvenido a los datos de Alumnos!");
		titulo.setBounds(355, 20, 2000, 20);
		titulo.setFont(new java.awt.Font("Arial Black", 0, 15));
		
		//Nombres de cada Casilla
		
		lblci = new JLabel("Cedula");
		lblci.setBounds(40, 40, 180, 30);
		txtci = new JTextField();
		txtci.setBounds(40, 65, 180, 20);
		
		lblnombre = new JLabel("Nombre");
		lblnombre.setBounds(225, 40, 180, 30);
		txtnombre = new JTextField();
		txtnombre.setBounds(225, 65, 180, 20);
		
		lblapellido = new JLabel("Apellido");
		lblapellido.setBounds(410, 40, 180, 30);
		txtapellido = new JTextField();
		txtapellido.setBounds(410, 65, 180, 20);
		
		lbldir = new JLabel("Direccion");
		lbldir.setBounds(595, 40, 180, 30);
		txtdir = new JTextField();
		txtdir.setBounds(595, 65, 180, 20);
		
		lblphone = new JLabel("Telefono");
		lblphone.setBounds(780, 40, 180, 30);
		txtphone = new JTextField();
		txtphone.setBounds(780, 65, 180, 20);
		
		btnmostrar = new JButton("Mostrar");
		btnmostrar.setBounds(300, 240, 80, 20);
		btnbuscar = new JButton("Buscar");
		btnbuscar.setBounds(400, 240, 80, 20);
		btninsert = new JButton("Insertar");
		btninsert.setBounds(500, 240, 80, 20);
		btneliminar = new JButton("Eliminar");
		btneliminar.setBounds(600, 240, 80, 20);
		
		resultci = new JLabel();
		resultci.setBounds(300, 85, 180, 20);
		resultnom = new JLabel();
		resultnom.setBounds(300, 100, 180, 20);
		resultapll = new JLabel();
		resultapll.setBounds(300, 125, 180, 20);
		resultdir = new JLabel();
		resultdir.setBounds(300, 145, 180, 20);
		resultphon = new JLabel();
		resultphon.setBounds(300, 165, 180, 20);
		
		tablaAlumnos = new JTable();
		tablaAlumnos.setBounds(20, 100, 960, 80);
		tablaAlumnos.setVisible(false);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		panel.add(titulo); //Titulo
		panel.add(lblci); //Cedula
		panel.add(txtci);
		panel.add(resultci);
		panel.add(lblnombre); //Nombre
		panel.add(txtnombre);
		panel.add(resultnom);
		panel.add(lblapellido); //Apellido
		panel.add(txtapellido);
		panel.add(resultapll);
		panel.add(lbldir); //Direccion
		panel.add(txtdir);
		panel.add(resultdir);
		panel.add(lblphone); //Telefono
		panel.add(txtphone);
		panel.add(resultphon);
		panel.add(btnmostrar); //Botones
		panel.add(btnbuscar);
		panel.add(btninsert);
		panel.add(btneliminar);
		panel.add(tablaAlumnos);
		
		add(panel);
		setSize(1020,310);
		setVisible(true);
		
		ActionListener mostrar = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tablaAlumnos.setVisible(true);
			}
		};
		btnmostrar.addActionListener(mostrar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
