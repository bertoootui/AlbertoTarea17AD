package ui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Point;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuUI window = new MenuUI();
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
	public MenuUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(100, 149, 237));
		frame.setBounds(100, 100, 706, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton butconsulta = new JButton("CONSULTA");
		butconsulta.setBackground(new Color(255, 255, 255));
		butconsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		butconsulta.setBounds(58, 457, 127, 58);
		frame.getContentPane().add(butconsulta);
		
		JButton butañadir = new JButton("A\u00D1ADIR");
		butañadir.setBackground(new Color(255, 255, 255));
		butañadir.setBounds(281, 457, 127, 58);
		frame.getContentPane().add(butañadir);
		
		JButton butmod = new JButton("MODIFICAR");
		butmod.setBackground(new Color(255, 255, 255));
		butmod.setBounds(496, 457, 127, 58);
		frame.getContentPane().add(butmod);
		
		JTextArea dtrpnGrupoAceimarn = new JTextArea();
		dtrpnGrupoAceimarn.setForeground(new Color(255, 255, 255));
		dtrpnGrupoAceimarn.setBackground(new Color(30, 144, 255));
		dtrpnGrupoAceimarn.setMargin(new Insets(166, 14, 3, 3));

		dtrpnGrupoAceimarn.setFont(new Font("Corbel", Font.PLAIN, 45));
		
		dtrpnGrupoAceimarn.setEditable(false);
		dtrpnGrupoAceimarn.setText("GRUPO ACEIMAR \r\nCOLEGIO MARCOTE");
		dtrpnGrupoAceimarn.setBounds(58, 26, 565, 421);
		frame.getContentPane().add(dtrpnGrupoAceimarn);
	}
}
