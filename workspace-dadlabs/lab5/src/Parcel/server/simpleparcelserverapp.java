package Parcel.server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import Parcel.parcel;
import Parcel.parcelManager;

public class simpleparcelserverapp {
public static void main(String[] args) {
		
		parcelManager parcelManager = new parcelManager();
		
		System.out.println("Starting SimpleParcelServerApp Program");
		
		try {
		
			int portNo = 4228;
			ServerSocket serverSocket = new ServerSocket(portNo);
			
		
			while (true) {
				
				//Accept client request for connection
				Socket clientSocket = serverSocket.accept();
				
				//Read object from client, cast into Parcel
				ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
				parcel parcel = (parcel) ois.readObject();
				System.out.println("Generate object from client: " +parcel.getWeight() + " kg");
				
				
				parcel = parcelManager.CreateParcel(parcel);
				
				ObjectOutputStream oos  = new ObjectOutputStream(clientSocket.getOutputStream());
				oos.writeObject(parcel);
				
				//Close all streams
				ois.close();
				oos.close();
			}
			
		}
		catch(Exception ex) {
			
			ex.printStackTrace();
		}

	}
}
