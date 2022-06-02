package Ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Cobro_Ui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cobro_Ui frame = new Cobro_Ui();
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
	public Cobro_Ui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 842, 592);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSuTarifaEs = new JLabel("Su tarifa es de :");
		lblSuTarifaEs.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSuTarifaEs.setBounds(36, 121, 134, 49);
		contentPane.add(lblSuTarifaEs);
		
		JLabel lblX = new JLabel("X \u20AC");
		lblX.setForeground(new Color(30, 144, 255));
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblX.setBounds(169, 121, 219, 49);
		contentPane.add(lblX);
		
		JButton btnNewButton = new JButton("Pagar aqu\u00ED");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(244, 283, 190, 51);
		contentPane.add(btnNewButton);
		
		JLabel lblSeLeDevuelven = new JLabel("Se le devuelven :");
		lblSeLeDevuelven.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSeLeDevuelven.setBounds(110, 358, 151, 49);
		contentPane.add(lblSeLeDevuelven);
		
		JLabel lblX_1 = new JLabel("X \u20AC");
		lblX_1.setForeground(new Color(30, 144, 255));
		lblX_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblX_1.setBounds(258, 358, 219, 49);
		contentPane.add(lblX_1);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAceptar.setBounds(592, 458, 190, 51);
		contentPane.add(btnAceptar);
		
		JLabel lblPagarEstancia = new JLabel("Pagar estancia");
		lblPagarEstancia.setHorizontalAlignment(SwingConstants.CENTER);
		lblPagarEstancia.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPagarEstancia.setBounds(10, 37, 806, 73);
		contentPane.add(lblPagarEstancia);
		
		JLabel lblIntroduzcaCantidad = new JLabel("Introduzca cantidad");
		lblIntroduzcaCantidad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIntroduzcaCantidad.setBounds(36, 192, 180, 49);
		contentPane.add(lblIntroduzcaCantidad);
		
		textField = new JTextField();
		textField.setBounds(205, 209, 146, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Cantidad insuficiente");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(110, 428, 299, 14);
		contentPane.add(lblNewLabel_2);
	}
}
