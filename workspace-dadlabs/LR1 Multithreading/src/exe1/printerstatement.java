package exe1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class printerstatement extends Thread {

		
	public void printThread (String genethread) {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date date = new Date();
		
		String currentDate = formatter.format(date);
		
		for (int counter = 1; counter < 11; counter++) {
			System.out.println(genethread +"\n"+counter+ "->" + currentDate);
			
		}
	}

	@Override
	public void run() {
		Thread genethread = Thread.currentThread();
		printThread(genethread.getName());
		
	}

}
