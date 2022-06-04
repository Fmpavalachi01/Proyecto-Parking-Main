package aplicacion;

import java.awt.EventQueue;
import Ui.ParaUI;
import model.Socio;
import model.Abonado;
import model.Estacionamiento;
public class App {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParaUI frame=new ParaUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
