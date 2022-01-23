package exe2.tcttextserverapp;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class textserverapp {
	public static void main(String[] args) {
		// Launch the server frame
		servertextframe serverFrame = new servertextframe();
		serverFrame.setVisible(true);
		
		try {
			//Bind SeverSocket to port
			int portNo = 4228;
			ServerSocket serverSocket = new ServerSocket(portNo);
			
			textgenerator textGenerator = new textgenerator();
			
			// Counter to keep track the number of requested connection
			int totalRequest = 0;
			
			// Server need to be alive forever
			while(true) {
				
				//Accept client request for connection
				Socket clientSocket = serverSocket.accept();
				
				//Get current text input length		
				int textLength = textGenerator.getTextLength();
				
				// Create stream to write data on the network
				DataOutputStream outputStream = 
						new DataOutputStream(clientSocket.getOutputStream());
				//send current text length back to the client
				outputStream.writeByte(textLength);
				
				// Close the socket
				clientSocket.close();
				
				//update the request status
				serverFrame.updateRequestStatus("Data sent to the client: "+textLength);
				serverFrame.updateRequestStatus("Accepted connection from the client. " 
				+ "Total request =" + ++totalRequest);
				
			}
			
		}catch(Exception exception) {
			
			System.out.println("Durian Tunggal, we got problem");
			exception.printStackTrace();
		}
	

	} 

}
