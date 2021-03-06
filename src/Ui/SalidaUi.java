package Ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;

public class SalidaUi extends JPanel {
    private JLabel lblMensajeSalida;
    private JButton btnAceptarSalida;
	/**
	 * Create the panel.
	 */
	public SalidaUi() {
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("SALIDA");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(32, 178, 170));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(10, 58, 783, 44);
		add(lblNewLabel_1);
		
		lblMensajeSalida = new JLabel("");
		lblMensajeSalida.setForeground(new Color(32, 178, 170));
		lblMensajeSalida.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMensajeSalida.setBounds(166, 128, 690, 20);
		add(lblMensajeSalida);
		
		btnAceptarSalida = new JButton("Aceptar");
		btnAceptarSalida.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAceptarSalida.setBounds(581, 444, 171, 67);
		add(btnAceptarSalida);

	}
    public void setLblMensajeSalida(String mensaje) {
    	lblMensajeSalida.setText(mensaje);
    }
    
    public JButton getBtnAceptarSalida() {
    	return btnAceptarSalida;
    }
}
