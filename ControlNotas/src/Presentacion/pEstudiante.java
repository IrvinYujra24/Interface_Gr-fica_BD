package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Datos.dEstudiante;
import Logica.Estudiante;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pEstudiante extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tbxNombre;
	private JTextField tbxApellidos;
	private JTextField tbxCI;
	private JTextField tbxCarrera;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pEstudiante frame = new pEstudiante();
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
	public pEstudiante() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEstudiante = new JLabel("Nuevo Estudiante");
		lblEstudiante.setBounds(10, 11, 102, 14);
		contentPane.add(lblEstudiante);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 50, 95, 14);
		contentPane.add(lblNombre);
		
		tbxNombre = new JTextField();
		tbxNombre.setBounds(115, 47, 222, 20);
		contentPane.add(tbxNombre);
		tbxNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellidos");
		lblApellido.setBounds(10, 86, 95, 14);
		contentPane.add(lblApellido);
		
		tbxApellidos = new JTextField();
		tbxApellidos.setColumns(10);
		tbxApellidos.setBounds(115, 83, 222, 20);
		contentPane.add(tbxApellidos);
		
		JLabel lblCi = new JLabel("CI");
		lblCi.setBounds(10, 123, 95, 14);
		contentPane.add(lblCi);
		
		tbxCI = new JTextField();
		tbxCI.setColumns(10);
		tbxCI.setBounds(115, 120, 222, 20);
		contentPane.add(tbxCI);
		
		JLabel lblCarrera = new JLabel("Carrera");
		lblCarrera.setBounds(10, 155, 95, 14);
		contentPane.add(lblCarrera);
		
		tbxCarrera = new JTextField();
		tbxCarrera.setColumns(10);
		tbxCarrera.setBounds(115, 152, 222, 20);
		contentPane.add(tbxCarrera);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Estudiante est=new Estudiante();
				est.setNombre(tbxNombre.getText());
				est.setApellido(tbxApellidos.getText());
				est.setCi(tbxCI.getText());
				est.setCarrera(tbxCarrera.getText());
				est.insertar();
			}
		});
		btnGuardar.setBounds(335, 227, 89, 23);
		contentPane.add(btnGuardar);

	}
}
