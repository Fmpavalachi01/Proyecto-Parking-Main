package Ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.BajaControllerImpl;
import control.EntradaParkingControllerImpl;
import control.EstacionamientoControllerImpl;
import control.RealizarPagoControllerImpl;
import control.SalidaParkingControllerImpl;
import repositories.AbonadoRepositoryImpl;
import repositories.EstacionamientoRepository;
import repositories.EstacionamientoRepositoryImpl;
import repositories.SocioRepositoryImpl;

public class ParaUI extends UI {
	private SocioRepositoryImpl repSocios = new SocioRepositoryImpl();
	private AbonadoRepositoryImpl repAbonados = new AbonadoRepositoryImpl();
	private EstacionamientoRepositoryImpl repEstacionamientos = new EstacionamientoRepositoryImpl();
	private EntradaParkingControllerImpl entradas = new EntradaParkingControllerImpl();
	private EstacionamientoControllerImpl estacionamientos = new EstacionamientoControllerImpl();
	private BajaControllerImpl bajas = new BajaControllerImpl();
	private RealizarPagoControllerImpl pagos = new RealizarPagoControllerImpl();
	private SalidaParkingControllerImpl salidas = new SalidaParkingControllerImpl();
	private String matricula = "";

	public ParaUI() {
	//Panel Entrada	
		getBtnAceptarEntrada().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (getTextFieldMatriculaInsert() != null) {
					matricula = getTextFieldMatriculaInsert();
				}
			}
		});
		getBtnEntrar().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (entradas.entradaParking(matricula) == true) {
					cambiarPanel(getBajas());
				} else {
					estacionamientos.generarEstacionamiento(matricula);
					cerrarVentana();
				}
				
			}
		});
		getBtnSalir().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cambiarPanel(getPagos());
			}
		});
		
		//Panel Pagos
		getBtnPagar().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		getBtnContinuarPagos().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		//Panel Bajas
		getBtnDarDeBaja().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		getBtnEntrarBaja().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		//Panel Salida
		getBtnAceptarSalida().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
