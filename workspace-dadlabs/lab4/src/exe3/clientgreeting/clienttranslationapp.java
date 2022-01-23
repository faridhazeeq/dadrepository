package exe3.clientgreeting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class clienttranslationapp {
	
public static void main(String[] args) {
		
		try {
			// connect to the server at localhost, port 4228
			Socket socket = new Socket(InetAddress.getLocalHost(), 4228);
			
			// create input stream
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// read from the network and display the current date
			String text = bufferedReader.readLine();
			System.out.println(text);
			
			// close everything
			bufferedReader.close();
			socket.close();
			
		} catch(IOException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
