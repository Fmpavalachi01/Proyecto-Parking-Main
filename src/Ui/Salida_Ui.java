package Ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Salida_Ui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Salida_Ui frame = new Salida_Ui();
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
	public Salida_Ui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 883, 586);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setForeground(new Color(240, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblElPagoSe = new JLabel("Puede proceder a abandonar el parking");
		lblElPagoSe.setHorizontalAlignment(SwingConstants.CENTER);
		lblElPagoSe.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblElPagoSe.setBounds(10, 207, 847, 49);
		contentPane.add(lblElPagoSe);
		
		JLabel lblSalida = new JLabel("SALIDA");
		lblSalida.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalida.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblSalida.setBounds(10, 27, 847, 73);
		contentPane.add(lblSalida);
		
		JButton btnNewButton = new JButton("Aceptar\r\n");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(326, 385, 192, 58);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Label si ha pasado el periodo de gracia");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(254, 166, 299, 14);
		contentPane.add(lblNewLabel_2);
	}

}
