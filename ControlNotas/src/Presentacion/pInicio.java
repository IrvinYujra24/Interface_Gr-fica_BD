package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Point;

public class pInicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pInicio frame = new pInicio();
					frame.setLocation(500,200);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public pInicio() {
		setAlwaysOnTop(true);
		setLocation(new Point(200, 300));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inicio");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnEstudiante = new JButton("Nuevo Estudiante");
		btnEstudiante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pEstudiante ventana=new pEstudiante();
				ventana.setVisible(true);
			}
		});
		btnEstudiante.setBounds(21, 48, 149, 23);
		contentPane.add(btnEstudiante);
		
		JButton btnMateria = new JButton("Nueva Materia");
		btnMateria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pMateria ventana=new pMateria();
				ventana.setVisible(true);
			}
		});
		btnMateria.setBounds(21, 119, 149, 23);
		contentPane.add(btnMateria);
		
		JButton btnNota = new JButton("Nueva Nota");
		btnNota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pNota ventana =new pNota();
				ventana.setVisible(true);
			}
		});
		btnNota.setBounds(21, 190, 149, 23);
		contentPane.add(btnNota);
		
		JButton btnMostrarE = new JButton("Listar");
		btnMostrarE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pListarEstudiantes ventana=new pListarEstudiantes();
				ventana.setVisible(true);
			}
		});
		btnMostrarE.setBounds(275, 48, 149, 23);
		contentPane.add(btnMostrarE);
		
		JButton btnListaMateria = new JButton("Listar");
		btnListaMateria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pListarMaterias ventana=new pListarMaterias();
				ventana.setVisible(true);
			}
		});
		btnListaMateria.setBounds(275, 119, 149, 23);
		contentPane.add(btnListaMateria);

	}
}
