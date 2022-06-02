package Ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class EntradaUi extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public EntradaUi() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u00A1Bienvenido! :D");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(32, 178, 170));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 44));
		lblNewLabel.setBounds(10, 64, 867, 74);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Introduce tu matricula");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(47, 198, 259, 35);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(267, 209, 171, 20);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(267, 290, 171, 67);
		add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Label de posible error");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(267, 409, 171, 20);
		add(lblNewLabel_2);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSalir.setBounds(47, 461, 171, 67);
		add(btnSalir);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEntrar.setBounds(605, 461, 171, 67);
		add(btnEntrar);

	}
}
