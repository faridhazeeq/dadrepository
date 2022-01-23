package lab8.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class threadpooldemo1 {
public static void main(String[] args) {
		
		simplearray sharedArray = new simplearray(6);
		arraywriter write1 = new arraywriter(1, sharedArray);
		arraywriter write2 = new arraywriter(11, sharedArray);

		//send to The Executor
		ExecutorService executor = Executors.newCachedThreadPool();
		executor.execute(write1);
		executor.execute(write2);

		executor.shutdown();
		
		try {
		
			boolean endFlag = executor.awaitTermination(1, TimeUnit.MINUTES);
			
			if(endFlag) {
	
				System.out.println("\nContent of SimpleArray");
				System.out.println(sharedArray);
				
			}else {
				
				System.out.println("Timed out while waiting for tasks to finish");
			}
		} catch(Exception ex) {
			
			ex.printStackTrace();
		}
		
	}
}
