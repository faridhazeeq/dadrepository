package lab8.threadpool;

public class arraywriter implements Runnable {
	private final simplearray sharedsimplearray;
	private int startValue;

	public arraywriter(int value, simplearray simplearray) {
		
		startValue = value;
		sharedsimplearray = simplearray;
		
	}
	
	@Override
	public void run() {
		
		for(int i= startValue; i < startValue + 3; i++) {
			
			sharedsimplearray.add(i);
		}
		
	}
}
