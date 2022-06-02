package Ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;

public class SalidaUi extends JPanel {

	/**
	 * Create the panel.
	 */
	public SalidaUi() {
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("SALIDA");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(10, 58, 783, 44);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Label si ha pasado el periodo de gracia");
		lblNewLabel_2_1.setForeground(Color.RED);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(266, 128, 301, 20);
		add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Puede proceder a abandonar el parking");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(202, 226, 376, 35);
		add(lblNewLabel_1_1_1);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAceptar.setBounds(581, 444, 171, 67);
		add(btnAceptar);

	}

}
