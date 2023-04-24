package hilos;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Hora extends Thread {
	
	private boolean terminar = false;
	
	//metodo set para terminar hilo
	public void setTerminar(boolean terminar) {
		
		this.terminar = terminar;
	}
	
	@Override
	public void run() {
				

		while(!terminar) {
			DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			Date date = new Date();
			System.out.println("Hora actual: " + dateFormat.format(date));
	
		try {
			Hora.sleep(60000);
		}
		catch(InterruptedException e) {
			System.out.println(e.toString());
		}
		

		}
	}

}
