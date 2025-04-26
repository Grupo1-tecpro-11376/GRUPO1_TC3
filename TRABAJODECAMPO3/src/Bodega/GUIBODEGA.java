package Bodega;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.JButton;

public class GUIBODEGA extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_IDp;
	private JTextField txt_Descri;
	private JTextField txtMarca;
	private JTextField txt_Categ;
	private JTextField txt_Cantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIBODEGA frame = new GUIBODEGA();
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
	public GUIBODEGA() {
		setTitle("SISTEMA GESTIÓN DE BODEGA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 461);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PRODUCTOS");
		lblNewLabel.setBounds(10, 10, 102, 13);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		contentPane.add(lblNewLabel);
		
		JLabel ID_producto = new JLabel("ID_producto:");
		ID_producto.setBounds(10, 57, 72, 13);
		ID_producto.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		contentPane.add(ID_producto);
		
		JLabel lblDescripcin = new JLabel("Descripción:");
		lblDescripcin.setBounds(10, 80, 62, 13);
		lblDescripcin.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		contentPane.add(lblDescripcin);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(10, 104, 62, 13);
		lblMarca.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		contentPane.add(lblMarca);
		
		JLabel lblCategora = new JLabel("Categoría:");
		lblCategora.setBounds(10, 130, 62, 13);
		lblCategora.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		contentPane.add(lblCategora);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setBounds(10, 153, 62, 13);
		lblCantidad.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		contentPane.add(lblCantidad);
		
		txt_IDp = new JTextField();
		txt_IDp.setBounds(92, 54, 119, 19);
		contentPane.add(txt_IDp);
		txt_IDp.setColumns(10);
		
		txt_Descri = new JTextField();
		txt_Descri.setBounds(92, 77, 119, 19);
		txt_Descri.setColumns(10);
		contentPane.add(txt_Descri);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(92, 101, 119, 19);
		txtMarca.setColumns(10);
		contentPane.add(txtMarca);
		
		txt_Categ = new JTextField();
		txt_Categ.setBounds(92, 127, 119, 19);
		txt_Categ.setColumns(10);
		contentPane.add(txt_Categ);
		
		txt_Cantidad = new JTextField();
		txt_Cantidad.setBounds(92, 150, 119, 19);
		txt_Cantidad.setColumns(10);
		contentPane.add(txt_Cantidad);
		
		JLabel lblNewLabel_1 = new JLabel("* CAMPOS OBLIGATORIOS");
		lblNewLabel_1.setBounds(78, 179, 133, 13);
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 197, 587, 217);
		contentPane.add(scrollPane);
		
		JTextArea txtLista = new JTextArea();
		scrollPane.setViewportView(txtLista);
		
		JButton btnAgregar = new JButton("AGREGAR PRODUCTO");
		btnAgregar.setBounds(272, 53, 224, 21);
		contentPane.add(btnAgregar);
		
		JButton btnEditarProducto = new JButton("EDITAR PRODUCTO");
		btnEditarProducto.setBounds(272, 76, 224, 21);
		contentPane.add(btnEditarProducto);
		
		JButton btnBUSCAR = new JButton("BUSCAR PRODUCTO");
		btnBUSCAR.setBounds(272, 100, 224, 21);
		contentPane.add(btnBUSCAR);
		
		JButton btnELIMINAR = new JButton("ELIMINAR PRODUCTO");
		btnELIMINAR.setBounds(272, 126, 224, 21);
		contentPane.add(btnELIMINAR);
		
		JButton btnActualizar = new JButton("ACTUALIZAR");
		btnActualizar.setBounds(495, 175, 102, 21);
		contentPane.add(btnActualizar);
	}
}
