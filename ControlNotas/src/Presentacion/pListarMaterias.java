package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Datos.dEstudiante;
import Logica.Estudiante;
import Logica.Materia;

import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class pListarMaterias extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tbxBuscar;
	private JTable jtLista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pListarMaterias frame = new pListarMaterias();					
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
	public pListarMaterias() {
		setResizable(false);
		setSize(new Dimension(606, 346));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 542, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel jpCabecera = new JPanel();
		contentPane.add(jpCabecera, BorderLayout.NORTH);
		jpCabecera.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblTitulo = new JLabel("Lista de estudiantes");
		lblTitulo.setHorizontalAlignment(SwingConstants.LEFT);
		jpCabecera.add(lblTitulo);
		
		JLabel lblUsuario = new JLabel("Usuario: ...");
		lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		jpCabecera.add(lblUsuario);
		
		JPanel jpBarraEstado = new JPanel();
		contentPane.add(jpBarraEstado, BorderLayout.SOUTH);
		jpBarraEstado.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblHora = new JLabel("Hora Actual");
		jpBarraEstado.add(lblHora);
		
		JPanel jpCuerpo = new JPanel();
		contentPane.add(jpCuerpo, BorderLayout.CENTER);
		jpCuerpo.setLayout(null);
		
		JLabel lblBuscar = new JLabel("Buscar");
		lblBuscar.setBounds(10, 11, 46, 14);
		jpCuerpo.add(lblBuscar);
		
		tbxBuscar = new JTextField();
		tbxBuscar.setBounds(66, 8, 188, 20);
		jpCuerpo.add(tbxBuscar);
		tbxBuscar.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 36, 496, 200);
		jpCuerpo.add(scrollPane);
		
		jtLista = new JTable();
		scrollPane.setViewportView(jtLista);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				Materia mat=new Materia();					
				DefaultTableModel modelo = mat.obtenerMateria(tbxBuscar.getText());			
	            jtLista.setModel(modelo);		

			}
		});
		btnBuscar.setBounds(294, 7, 89, 23);
		jpCuerpo.add(btnBuscar);

	}
}
