package Ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Elegir_Entrar_Darme_DeBaja_Ui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Elegir_Entrar_Darme_DeBaja_Ui frame = new Elegir_Entrar_Darme_DeBaja_Ui();
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
	public Elegir_Entrar_Darme_DeBaja_Ui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 886, 554);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u00A1Bienvenido \"nombre cliente\"!\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(130, 11, 581, 73);
		contentPane.add(lblNewLabel);
		

		
		JButton btnDarmeDeBaja = new JButton("Darme de baja");
		btnDarmeDeBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDarmeDeBaja.setBounds(130, 222, 194, 50);
		contentPane.add(btnDarmeDeBaja);
		
		JLabel lblEligeUnaOpcion = new JLabel("Elige una opcion");
		lblEligeUnaOpcion.setHorizontalAlignment(SwingConstants.CENTER);
		lblEligeUnaOpcion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEligeUnaOpcion.setBounds(10, 119, 850, 73);
		contentPane.add(lblEligeUnaOpcion);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(533, 222, 194, 50);
		contentPane.add(btnEntrar);
	}

}
