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
	private EntradaParkingControllerImpl entradas = new EntradaParkingControllerImpl(repAbonados,repSocios);
	private EstacionamientoControllerImpl estacionamientos = new EstacionamientoControllerImpl(repEstacionamientos);
	private BajaControllerImpl bajas = new BajaControllerImpl(repSocios,repAbonados);
	private RealizarPagoControllerImpl pagos = new RealizarPagoControllerImpl(repEstacionamientos);
	private SalidaParkingControllerImpl salidas = new SalidaParkingControllerImpl(repEstacionamientos,repSocios,repAbonados);
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
					getLblMensaje().setText("Su estacionamiento se ha generado correctamente");
				}
				
			}
		});
		getBtnSalir().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (repSocios.isSocio(matricula)==true || repAbonados.isAbonado(matricula)==true) {
					setLblMensajeSalida("Ya puede salir del parking, esperamos que haya tenido una agradable estancia");
					cambiarPanel(getSalida());
				}else {
					repEstacionamientos.setHoraSalida(LocalDateTime.now(),matricula);
					setTextFieldTarifaTotal(pagos.getTarifaTotal(matricula));
					cambiarPanel(getPagos());
				}
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
				if (pagos.realizarPago(matricula, cantidadPago).equalsIgnoreCase((Math.round(cantidadPago-pagos.getTarifaTotal(matricula)))+"€" )){
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
				if (repSocios.isSocio(matricula)==true) {
					getLblMensaje().setText("El cliente "+repSocios.getNombre(matricula)+" se ha dado de baja correctamente");
				}else if(repAbonados.isAbonado(matricula)==true) {
					getLblMensaje().setText("El cliente "+repAbonados.getNombre(matricula)+" se ha dado de baja correctamente");
				}
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
					cerrarVentana();
				} else {
					setLblMensajeSalida("Ha superado el periodo de gracia, debe pagar su nuevo estacionamiento");
					estacionamientos.generarEstacionamiento(matricula);
					repEstacionamientos.setHoraSalida(LocalDateTime.now(),matricula);
					cambiarPanel(getPagos());
				}
				
			}
		});
	}
}
