package Ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class DarDeBajaUi extends JPanel {
    private JLabel lblNombreCliente;
    private JButton btnDarDeBaja;
    private JButton btnEntrarBaja;
	/**
	 * Create the panel.
	 */
	public DarDeBajaUi() {
		setLayout(null);
		
		lblNombreCliente = new JLabel("\u00A1Bienvenido \"nombre cliente\"!");
		lblNombreCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreCliente.setBounds(10, 67, 861, 25);
		lblNombreCliente.setFont(new Font("Tahoma", Font.PLAIN, 30));
		add(lblNombreCliente);
		
		JLabel lblNewLabel_1_1 = new JLabel("Elige una opcion :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(285, 168, 259, 35);
		add(lblNewLabel_1_1);
		
		btnDarDeBaja = new JButton("Dar de baja");
		btnDarDeBaja.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDarDeBaja.setBounds(144, 346, 171, 67);
		add(btnDarDeBaja);
		
		btnEntrarBaja = new JButton("Entrar");
		btnEntrarBaja.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEntrarBaja.setBounds(492, 346, 171, 67);
		add(btnEntrarBaja);

	}
    public void setNombreCliente(String nombreCliente) {
    	lblNombreCliente.setText("\u00A1Bienvenido \""+nombreCliente+"!");
    }
    public JButton getBtnDarDeBaja() {
    	return btnDarDeBaja;
    }
    public JButton getBtnEntrarBaja() {
    	return btnEntrarBaja;
    }
}
