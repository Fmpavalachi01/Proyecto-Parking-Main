package Ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Entrada_Ui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Entrada_Ui frame = new Entrada_Ui();
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
	public Entrada_Ui() {
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 902, 568);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u00A1Bienvenido! :D");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 139, 139));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 44));
		lblNewLabel.setBounds(10, 11, 881, 114);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Introduce tu matricula :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(71, 136, 320, 58);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(340, 159, 223, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Aceptar\r\n");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(278, 205, 192, 58);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Label de posible error");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(278, 299, 299, 20);
		contentPane.add(lblNewLabel_2);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSalir.setBounds(82, 399, 192, 58);
		contentPane.add(btnSalir);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEntrar.setBounds(600, 399, 192, 58);
		contentPane.add(btnEntrar);
	}
}
