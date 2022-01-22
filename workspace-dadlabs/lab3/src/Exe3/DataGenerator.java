package Exe3;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataGenerator {
public static void main(String[] args) {
		
		
		String outFile = "dailyRainfallData.txt";
		
	
		String station[]= {"Day 1", "Day 2", "Day 3", "Day 4", "Day 5", "Day 6"};
		double dailyRainfallData[]= {0.0, 1.5, 51.5, 2.0, 3.0, 0.0};
		
		try {
			
			DataOutputStream datarainfall = new DataOutputStream(new FileOutputStream(outFile));
			
			
			for(int index=0; index< station.length; index++ ) {
				
				datarainfall.writeUTF(station[index]);
				datarainfall.writeDouble(dailyRainfallData[index]);
				
				
				datarainfall.flush();
					
			}
			
			datarainfall.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("program Finished. Check out the "+outFile);
		
	
	}

}
