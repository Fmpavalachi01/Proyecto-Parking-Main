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

public class Cobro_Ui extends JFrame {

	private JPanel contentPane;

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
		
		JLabel lblNewLabel = new JLabel("Ha introducido la tarjeta: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(39, 111, 219, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblTarjeta = new JLabel("Tarjeta");
		lblTarjeta.setForeground(new Color(30, 144, 255));
		lblTarjeta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTarjeta.setBounds(256, 111, 219, 49);
		contentPane.add(lblTarjeta);
		
		JLabel lblSuTarifaEs = new JLabel("Su tarifa es de :");
		lblSuTarifaEs.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSuTarifaEs.setBounds(39, 214, 134, 49);
		contentPane.add(lblSuTarifaEs);
		
		JLabel lblX = new JLabel("X \u20AC");
		lblX.setForeground(new Color(30, 144, 255));
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblX.setBounds(181, 214, 219, 49);
		contentPane.add(lblX);
		
		JButton btnNewButton = new JButton("Pagar aqu\u00ED");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(39, 299, 190, 51);
		contentPane.add(btnNewButton);
		
		JLabel lblSeLeDevuelven = new JLabel("Se le devuelven :");
		lblSeLeDevuelven.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSeLeDevuelven.setBounds(120, 418, 219, 49);
		contentPane.add(lblSeLeDevuelven);
		
		JLabel lblX_1 = new JLabel("X \u20AC");
		lblX_1.setForeground(new Color(30, 144, 255));
		lblX_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblX_1.setBounds(269, 418, 219, 49);
		contentPane.add(lblX_1);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAceptar.setBounds(487, 417, 190, 51);
		contentPane.add(btnAceptar);
	}

}
