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

public class ElegirEntrarDarmeDeBajaUi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ElegirEntrarDarmeDeBajaUi frame = new ElegirEntrarDarmeDeBajaUi();
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
	public ElegirEntrarDarmeDeBajaUi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 886, 554);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Eligue una opcion:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(103, 209, 173, 73);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Darme de baja como abonado");
		btnNewButton.setBounds(329, 156, 194, 50);
		contentPane.add(btnNewButton);
		
		JButton btnDarmeDeBaja = new JButton("Darme de baja como socio");
		btnDarmeDeBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDarmeDeBaja.setBounds(329, 309, 194, 50);
		contentPane.add(btnDarmeDeBaja);
	}

}
