package exe1;

public class appmultithread {
	
	public static void main(String[]args) {
		
		//create object of thread with current time
		Thread ps1 = new printerstatement();
		Thread ps2 = new printerstatement();
		
		//create object of thread name
		Thread pt1 = new Thread(ps1, "Generate Thread 1");
		Thread pt2 = new Thread(ps2, "Generate Thread 2");
		
		//execute thread
		pt1.start();
		pt2.start();
		
	}

}
