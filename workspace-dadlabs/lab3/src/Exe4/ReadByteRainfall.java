package Exe4;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class ReadByteRainfall {
	
	public static void main(String[] args) {
		
		String rainfallData = "outByteRainfallDemo2.txt";

		System.out.println("Reading data from "+rainfallData+ "\n");

		System.out.println("Daily of Rainfall Data From Selected Station For Each District in Melaka");
		
		System.out.println("------------------------------------------------------------------------------------------------");
		try {
		
			DataInputStream readRainfall = new DataInputStream(new FileInputStream(rainfallData));

		
			int stationID = 0;
			String stationName = "";
			String districtName = "";
			double day1=0;
			double day2=0;
			double day3=0;
			double day4=0;
			double day5=0;
			double day6=0;
			
			double totalRainfallStation=0;
			int noOfRecords=0;
			
			
			while(readRainfall.available()> 0) {
					
					
					stationID = readRainfall.readInt();
					stationName = readRainfall.readUTF();
					districtName = readRainfall.readUTF();
					day1 = readRainfall.readDouble();
					day2 = readRainfall.readDouble();
					day3 = readRainfall.readDouble();
					day4 = readRainfall.readDouble();
					day5 = readRainfall.readDouble();
					day6 = readRainfall.readDouble();
					
					
					totalRainfallStation = day1 + day2 + day3 + day4 + day5 + day6;
					noOfRecords++;	
					
					System.out.println(stationID +"\t\t"+ stationName+ "\t\t"+ districtName+ "\t"+ day1+ "\t" +day2+ "\t"
							+day3 +"\t" +day4 +"\t"+day5 +"\t"+ day6+ "\t"+ "\n");
				
					
					
					double averageRainfallStation = totalRainfallStation / 6;
					String formattedAverage = String.format("%.1f", averageRainfallStation);

					System.out.println("Total daily of rainfall for 6 days  of the selected station is "+totalRainfallStation);
					System.out.println("The average rainfall of the selected station is "+formattedAverage);
					System.out.println("------------------------------------------------------------------------------------------------");
					
				}

			
			readRainfall.close();
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
					System.out.println("\nEnd of program.");
	}

}
