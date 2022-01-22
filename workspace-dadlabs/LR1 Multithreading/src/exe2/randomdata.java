package exe2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class randomdata implements Runnable {
	
	public void printRandom (String wordthread) {
		
		try {
			
			String[] data = {"It", "is", "recommended", "to", "use", "calendar", "class"};
			
			List<String> list = Arrays.asList(data);
			Collections.shuffle(list);
			list.toArray(data);
			
			for(String element:data) {
				
				System.out.println(wordthread + " -> "+element);
				
			}
					
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
			
	}

	@Override
	public void run() {
		
		Thread currentThread = Thread.currentThread();
		printRandom(currentThread.getName());
		
	}

}
