package Exe3;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataReader {
	
	public static void main(String[] args) {
		
				String sourceFile = "dailyRainfallData.txt";
				System.out.println("Reading data from "+sourceFile+ "\n");
				
				try {
					
					DataInputStream readData = new DataInputStream(new FileInputStream(sourceFile));
					double  dailyRainfallData=0;
					double totalDailyRainfallData=0;
					int noOfRecords = 0;
					String station ="";
					
					
					while(readData.available() > 0) {
						
						for(int index=0; index <= station.length(); index++) {
							
					
							station = readData.readUTF();
							dailyRainfallData = readData.readDouble();
							System.out.println( station + " Cheng(Taman Merdeka)"+ "\t" + dailyRainfallData);
							
						
							totalDailyRainfallData += dailyRainfallData;
							noOfRecords++;	
						}
						
						
					}
					
					readData.close();
					
					
					double averageDailyRainfallData = totalDailyRainfallData /  noOfRecords;
					String formattedAverage = String.format("%.1f", averageDailyRainfallData);
					System.out.print("\nAverage  for " + noOfRecords 
							+ " days daily rainfall from selected station is : " + formattedAverage + "%");
					
				}
				catch(Exception e) {
					
					e.printStackTrace();
					
				}
				
				
				System.out.println("\nEnd of program.");
				
			}

}
