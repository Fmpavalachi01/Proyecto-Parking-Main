package Ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PagarUi extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PagarUi() {
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Pagar estancia");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(10, 73, 783, 44);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("La tarifa es de ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(39, 157, 141, 35);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("X\u20AC");
		lblNewLabel.setForeground(new Color(100, 149, 237));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(178, 152, 51, 44);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Introducir cantidad");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(39, 240, 190, 35);
		add(lblNewLabel_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(218, 251, 146, 20);
		add(textField);
		textField.setColumns(10);
		
		JButton btnPagar = new JButton("Pagar");
		btnPagar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPagar.setBounds(100, 298, 171, 67);
		add(btnPagar);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Su cambio es de ");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(39, 381, 159, 35);
		add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("X\u20AC");
		lblNewLabel_2.setForeground(new Color(100, 149, 237));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(194, 381, 51, 44);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Label Cantidad insuficiente");
		lblNewLabel_2_1.setForeground(Color.RED);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(115, 436, 237, 20);
		add(lblNewLabel_2_1);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnContinuar.setBounds(564, 457, 171, 67);
		add(btnContinuar);

	}

}
