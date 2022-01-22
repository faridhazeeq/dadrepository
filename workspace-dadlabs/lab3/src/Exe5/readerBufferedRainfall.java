package Exe5;

import java.io.BufferedReader;
import java.io.FileReader;

public class readerBufferedRainfall {
	
	public static void main(String[] args) {
		
		String sourceFile = "exercise5.txt";
		System.out.println("Reading data from " + sourceFile + "\n");
		System.out.println("Daily of Rainfall Data From Selected Station For Each District in Melaka");
		System.out.println("------------------------------------------------------------------------------------------------");
		
		try {
			
			BufferedReader buffRead = new BufferedReader(new FileReader(sourceFile));
			
		
			String strRainfall = "";
			

            while ((strRainfall = buffRead.readLine()) != null) {
    
				System.out.println(strRainfall);
            }
           
        
			buffRead.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("End of program.");	

	}

}
