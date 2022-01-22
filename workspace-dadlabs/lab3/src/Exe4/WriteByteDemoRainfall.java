package Exe4;


import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteByteDemoRainfall {

	public static void main(String[] args) throws IOException {

		String targetStorage = "outByteRainfallDemo2.txt";
		int stationID[]= {2321006, 2222002, 2324033, 2225044, 2222007, 2221008};
		String stationName[]= {"Ladang Lendu", "Durian Tunggal", "Hospital Jasin", "Sg.Chohong", "Cheng D/S", "Pusat Pertanian Sg Udang"};
		String districtName[]= {"Alor Gajah", "Alor Gajah", "Jasin", "Jasin", "Melaka Tengah", "Melaka Tengah"};
		double day1[] = {0.0, 51.0, 25.0, 43.0, 130.0, 76.0};
		double day2[] = {1.0, 1.0, 0.0, 0.0, 0.0, 0.0};
		double day3[] = {2.0, 3.0, 0.0, 6.0, 0.0, 1.0};
		double day4[] = {1.0, 0.0, 0.0, 1.0, 0.0, 0.0};
		double day5[] = {1.0, 0.0, 7.0, 0.0, 19.0, 1.0};
		double day6[] = {0.0, 19.0, 8.0, 5.0, 0.0, 0.0};
	
		
		DataOutputStream rainfall = new DataOutputStream(new FileOutputStream(targetStorage));
		

		for(int index=0; index < stationName.length; index++) {
			

			rainfall.writeInt(stationID[index]);
			rainfall.writeUTF(stationName[index]);
			rainfall.writeUTF(districtName[index]);
			rainfall.writeDouble(day1[index]);
			rainfall.writeDouble(day2[index]);
			rainfall.writeDouble(day3[index]);
			rainfall.writeDouble(day4[index]);
			rainfall.writeDouble(day5[index]);
			rainfall.writeDouble(day6[index]);
			

			rainfall.flush();
			
		}

		rainfall.close();
		
		

		System.out.println("Program Finished. Check out the "+targetStorage);
	}
}
