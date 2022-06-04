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
	private JLabel lblTarifa;
	private JButton btnPagar;
	private JLabel lblCambio;
	private JButton btnContinuarPagos;

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

		lblTarifa = new JLabel("X\u20AC");
		lblTarifa.setForeground(new Color(100, 149, 237));
		lblTarifa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTarifa.setBounds(178, 152, 659, 44);
		add(lblTarifa);

		JLabel lblNewLabel_1_1_1 = new JLabel("Introducir cantidad");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(39, 240, 190, 35);
		add(lblNewLabel_1_1_1);

		textField = new JTextField();
		textField.setBounds(218, 251, 146, 20);
		add(textField);
		textField.setColumns(10);

		btnPagar = new JButton("Pagar");
		btnPagar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPagar.setBounds(100, 298, 171, 67);
		add(btnPagar);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("Su cambio es de ");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(39, 381, 181, 35);
		add(lblNewLabel_1_1_1_1);

		lblCambio = new JLabel("X\u20AC");
		lblCambio.setForeground(new Color(100, 149, 237));
		lblCambio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCambio.setBounds(194, 381, 659, 44);
		add(lblCambio);

		btnContinuarPagos = new JButton("Continuar");
		btnContinuarPagos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnContinuarPagos.setBounds(564, 457, 171, 67);
		add(btnContinuarPagos);

	}
    public void setTextFieldTarifaTotal(double TarifaTotal) {
    	lblTarifa.setText(""+TarifaTotal+"€");
    }
	public JTextField getTextFieldCantidadIntroducida() {
		return textField;
	}
	public JButton getBtnPagar() {
		return btnPagar;
	}
	public void setTextFieldCambio(String cambio) {
		lblCambio.setText(cambio);
	}
	public JButton getBtnContinuarPagos() {
		return btnContinuarPagos;
	}
	
}
