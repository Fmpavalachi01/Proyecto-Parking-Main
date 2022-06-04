package Ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

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
	private Double cantidadPago=0.0;

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
					if (repSocios.isSocio(matricula)==true) {
						setNombreCliente(repSocios.getNombre(matricula));
					}else if(repAbonados.isAbonado(matricula)==true) {
						setNombreCliente(repAbonados.getNombre(matricula));
					}
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
				repEstacionamientos.setHoraSalida(LocalDateTime.now(),matricula);
				setTextFieldTarifaTotal(pagos.getTarifaTotal(matricula));
			}
		});
		
		//Panel Pagos
		getBtnPagar().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cantidadPago=Double.parseDouble(getTextFieldCantidadIntroducida().getText());
				setTextFieldCambio(pagos.realizarPago(matricula, cantidadPago));
				
			}
		});
		getBtnContinuarPagos().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (pagos.realizarPago(matricula, cantidadPago).equalsIgnoreCase("El cambio es de: "+(cantidadPago-pagos.getTarifaTotal(matricula))+"€")) {
					cambiarPanel(getSalida());
				} else {
                    setTextFieldCambio(pagos.realizarPago(matricula, cantidadPago));
				}
				
			}
		});
		//Panel Bajas
		getBtnDarDeBaja().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				bajas.darDeBaja(matricula);
				cambiarPanel(getEntrada());
			}
		});
		getBtnEntrarBaja().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cerrarVentana();
				
			}
		});
		
		//Panel Salida
		getBtnAceptarSalida().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (salidas.salirDelParking(matricula)) {
					setLblMensajeSalida(salidas.salirDelParking(matricula));
					cerrarVentana();
				} else {
					setLblMensajeSalida(salidas.salirDelParking(matricula));
					estacionamientos.generarEstacionamiento(matricula);
					repEstacionamientos.setHoraSalida(LocalDateTime.now(),matricula);
					cambiarPanel(getPagos());
				}
				
			}
		});
	}
}
