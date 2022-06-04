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
    private JButton btnAceptar;
    private JLabel lblMensaje;
    private JButton btnEntrar;
    private JButton btnSalir;
    
	/**
	 * Create the panel.
	 */
	public EntradaUi() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u00A1Bienvenido! ");
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
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAceptar.setBounds(267, 290, 171, 67);
		add(btnAceptar);
		
		lblMensaje = new JLabel("");
		lblMensaje.setForeground(new Color(32, 178, 170));
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMensaje.setBounds(47, 409, 580, 20);
		add(lblMensaje);
		
	    btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSalir.setBounds(47, 461, 171, 67);
		add(btnSalir);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEntrar.setBounds(605, 461, 171, 67);
		add(btnEntrar);

	}
    public JButton getBtnAceptarEntrada() {
    	return btnAceptar;
    }
    public JButton getBtnEntrar() {
    	return btnEntrar;
    }
    public JButton getBtnSalir() {
    	return btnSalir;
    }
    
    public String getTextFieldMatriculaInsert() {
    	return textField.getText();
    }
    
    public JLabel getLblMensaje() {
    	return lblMensaje;
    }
}
