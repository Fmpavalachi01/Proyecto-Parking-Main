package Ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class UI extends JFrame {

	private JPanel contentPane;
	private EntradaUi entrada;
	private DarDeBajaUi bajas;
	private PagarUi pagos;
	private SalidaUi salida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
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
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1047, 706);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		// Paneles
		entrada = new EntradaUi();
		contentPane.add(entrada);
		bajas = new DarDeBajaUi();
		contentPane.add(bajas);
		pagos = new PagarUi();
		contentPane.add(pagos);
		salida = new SalidaUi();
		contentPane.add(salida);
        
	}
	public void cerrarVentana() {
		//TODO
		this.dispose();
	}
	public void cambiarPanel(JPanel actual) {
		contentPane.removeAll();
		contentPane.add(actual);
		contentPane.repaint();
		contentPane.revalidate();
	}

	public JButton getBtnAceptarEntrada() {
		return entrada.getBtnAceptarEntrada();
	}

	public EntradaUi getEntrada() {
		return entrada;
	}

	public DarDeBajaUi getBajas() {
		return bajas;
	}

	public PagarUi getPagos() {
		return pagos;
	}

	public SalidaUi getSalida() {
		return salida;
	}

	public JButton getBtnEntrar() {
		return entrada.getBtnEntrar();
	}

	public JButton getBtnSalir() {
		return entrada.getBtnSalir();
	}

	public String getTextFieldMatriculaInsert() {
		return entrada.getTextFieldMatriculaInsert();
	}

	public void setNombreCliente(String nombreCliente) {
		bajas.setNombreCliente(nombreCliente);
	}

	public JButton getBtnDarDeBaja() {
		return bajas.getBtnDarDeBaja();
	}

	public JButton getBtnEntrarBaja() {
		return bajas.getBtnEntrarBaja();
	}

	public void setTextFieldTarifaTotal(double TarifaTotal) {
		pagos.setTextFieldTarifaTotal(TarifaTotal);
		;
	}

	public JTextField getTextFieldCantidadIntroducida() {
		return pagos.getTextFieldCantidadIntroducida();
	}

	public JButton getBtnPagar() {
		return pagos.getBtnPagar();
	}

	public void setTextFieldCambio(String cambio) {
		pagos.setTextFieldCambio(cambio);
		;
	}

	public JButton getBtnContinuarPagos() {
		return pagos.getBtnContinuarPagos();
	}

	public void setLblMensajeSalida(boolean periodoGracia) {
		salida.setLblMensajeSalida(periodoGracia);
	}

	public JButton getBtnAceptarSalida() {
		return salida.getBtnAceptarSalida();
	}
}
