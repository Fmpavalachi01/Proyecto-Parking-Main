package Ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.Color;

public class AbonadoSocioUi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AbonadoSocioUi frame = new AbonadoSocioUi();
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
	public AbonadoSocioUi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 882, 554);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setForeground(new Color(240, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Abonado");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(42, 41, 139, 70);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo de bono :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 219, 188, 56);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(143, 239, 174, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Horario :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(24, 314, 111, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Horario");
		lblNewLabel_3.setForeground(new Color(30, 144, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(121, 315, 181, 22);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblSocio = new JLabel("Socio");
		lblSocio.setHorizontalAlignment(SwingConstants.CENTER);
		lblSocio.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblSocio.setBounds(451, 41, 139, 70);
		contentPane.add(lblSocio);
		
		JLabel lblNewLabel_4 = new JLabel("\u00A1Bienvenido! ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(313, 149, 128, 22);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tu plaza es la ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(480, 243, 139, 32);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("plaza");
		lblNewLabel_6.setForeground(new Color(30, 144, 255));
		lblNewLabel_6.setBounds(605, 255, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Fecha de expiración: ");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(480, 321, 188, 32);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6_1 = new JLabel("fecha");
		lblNewLabel_6_1.setForeground(new Color(30, 144, 255));
		lblNewLabel_6_1.setBounds(678, 334, 46, 14);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_8 = new JLabel("Disfrute de su estancia :D");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(261, 421, 242, 61);
		contentPane.add(lblNewLabel_8);
	}
}
