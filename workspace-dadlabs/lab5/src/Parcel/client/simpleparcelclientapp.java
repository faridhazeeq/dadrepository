package Parcel.client;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import Parcel.parcel;

public class simpleparcelclientapp {
public static void main(String[] args) {
		
		System.out.println("Starting SimpleParcelClientApp program");
		

		parcel parcel = new parcel();
		parcel.setWeight(0.99);
		
		try {
			

			Socket socket = new Socket(InetAddress.getLocalHost(), 4228);
			ObjectOutputStream oos = new ObjectOutputStream (socket.getOutputStream());
			oos.writeObject(parcel);
			
			System.out.println("Sending "+parcel.getWeight() + " kg"
					+ " to server-side application");
			
			//Receive processed object
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			parcel processedParcel = (parcel) ois.readObject();
			
			//Manipulate processed object
			System.out.println("Weight of the parcel(in kg): "+ processedParcel.getWeight());
			System.out.print("The courier charge: RM  ");
			System.out.printf("%.2f", processedParcel.getPrice());
			
			//close all streams
			ois.close();
			oos.close();
			socket.close();
		}
		catch (Exception ex) {
			
		}

	}

}
