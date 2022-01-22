package exe2;

public class multiprintapp {

public static void main(String[] args) {
		
		// create objects of runnable
		Runnable number = new wordgenerator();
		Thread nothread = new Thread(number);
		nothread.setName("Text");
		
		Runnable statement = new randomdata();
		Thread threadstatement = new Thread(statement);
		threadstatement.setName("Word1 / Word2");

		// Execute thread
		threadstatement.start();
		nothread.start();

	}
}
