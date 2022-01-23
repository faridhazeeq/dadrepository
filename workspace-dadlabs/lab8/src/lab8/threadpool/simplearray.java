package lab8.threadpool;

import java.security.SecureRandom;
import java.util.Arrays;

public class simplearray {

		private final  int[] sharedData;
		private int currentIndex = 0;
		private final static SecureRandom random = new SecureRandom();
		

		public simplearray(int size) {
			sharedData = new int[size];
		}
		
		public synchronized void add(int value) {
			
			
			int position = currentIndex;
			

			Thread currentThread = Thread.currentThread();

			try {
		
				Thread.sleep(random.nextInt(500));
				
			} catch (Exception ex) {
				
				ex.printStackTrace();
			}
			

			sharedData[position] = value;
			System.out.printf("%s wrote %2d to element %d.\n",
					currentThread.getName(), value, position);
			
			++currentIndex;
			System.out.printf("Next write index is %d\n", currentIndex);
		}
		
		public String toString() {
			
			return Arrays.toString(sharedData);
			
		}
}
