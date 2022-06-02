package Ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class DarDeBajaUi extends JPanel {

	/**
	 * Create the panel.
	 */
	public DarDeBajaUi() {
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\u00A1Bienvenido \"nombre cliente\"!");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 67, 861, 25);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Elige una opccion :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(285, 168, 259, 35);
		add(lblNewLabel_1_1);
		
		JButton btnDarDeBaja = new JButton("Dar de baja");
		btnDarDeBaja.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDarDeBaja.setBounds(144, 346, 171, 67);
		add(btnDarDeBaja);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEntrar.setBounds(492, 346, 171, 67);
		add(btnEntrar);

	}

}
