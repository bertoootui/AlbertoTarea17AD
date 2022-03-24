package ui;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;

public class ConsultaUI {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaUI window = new ConsultaUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConsultaUI() {
		initialize();
		
	}

	private void showtable() {
		
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(new Object[] {"NOMBRE","APELLIDO"});
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","8860012");
			Statement statement = con.createStatement();
		
			ResultSet rs = statement.executeQuery("SELECT * FROM ACTOR");
			
			String[] regis = new String[3];
			
			
			while(rs.next())
			{
				regis[0] = rs.getString("FIRST_NAME");
			}
			model.addRow(regis);
			table.setModel(model);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("ERR--No se ha establecido la conexión con la base de datos");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(100, 149, 237));
		frame.setBounds(100, 100, 925, 803);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(30, 144, 255));
		separator.setBounds(10, 243, 899, 27);
		frame.getContentPane().add(separator);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(new Color(135, 206, 250));
		toolBar.setBounds(10, 10, 899, 223);
		frame.getContentPane().add(toolBar);
		
		table = new JTable();
		table.setBounds(32, 782, 814, -509);
		frame.getContentPane().add(table);
		showtable();
	}
}
