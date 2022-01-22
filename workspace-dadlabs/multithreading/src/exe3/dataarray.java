package exe3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class dataarray implements Runnable {
	
	String[] data = {"It", "is", "recommended", "to", "use", "calendar", "class"};

	int repeat= 10;
	int dataSize = data.length;
	int newSize = dataSize*repeat;
	
	String[] result = new String[newSize];
	
	public void printArray () {
		String text = "";
		for(int i=0; i<repeat; i ++) {
			result[i] = data[i%dataSize];
			text = text + " "+ result[i];
			System.out.println(text);
		}
	
	} 
	
	public void randomData(String wordthread) {
		try {
			
			String[] data = {"It", "is", "recommended", "to", "use", "calendar", "class"};
			
			List<String> list = Arrays.asList(data);
			Collections.shuffle(list);
			list.toArray(data);
			for(String element:data) {
							
			System.out.println(wordthread + " -> "+element);
			
			Thread.sleep(5000);
							
			}
			
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}


	@Override
	public void run() {

		Thread currentThread = Thread.currentThread();
		printArray();
		randomData(currentThread.getName());
		
	}

}
