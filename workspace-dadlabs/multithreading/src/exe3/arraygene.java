package exe3;

import exe2.wordgenerator;
import exe2.randomdata;

public class arraygene {
	
	public static void main(String[] args) {
		
		// create objects of runnable
		Runnable statement = new dataarray();
		Thread statementThread = new Thread(statement);
		statementThread.setName("Word1");
	
		
		// Execute thread
		statementThread.start();


	}

}
