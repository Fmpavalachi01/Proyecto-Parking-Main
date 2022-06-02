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
		
		JLabel lblElPagoSe = new JLabel("El pago se ha realizado correctamente, \u00A1Ya puede salir!");
		lblElPagoSe.setHorizontalAlignment(SwingConstants.CENTER);
		lblElPagoSe.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblElPagoSe.setBounds(10, 191, 847, 49);
		contentPane.add(lblElPagoSe);
		
		JLabel lblQueTengaUn = new JLabel("Que tenga un buen");
		lblQueTengaUn.setHorizontalAlignment(SwingConstants.CENTER);
		lblQueTengaUn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblQueTengaUn.setBounds(10, 410, 847, 49);
		contentPane.add(lblQueTengaUn);
		
		JLabel lblTipoDeHora = new JLabel("Tipo de hora");
		lblTipoDeHora.setForeground(new Color(30, 144, 255));
		lblTipoDeHora.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoDeHora.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTipoDeHora.setBounds(384, 410, 386, 49);
		contentPane.add(lblTipoDeHora);
	}

}
