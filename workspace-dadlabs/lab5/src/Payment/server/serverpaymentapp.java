package Payment.server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import Parcel.parcel;
import Parcel.parcelManager;
import Payment.payment;
import Payment.paymentManager;

public class serverpaymentapp {
public static void main(String[] args) {
		
		parcelManager  parcelManager = new parcelManager();
		paymentManager managePayment = new paymentManager();
		
		System.out.println("Starting Payment Server side..");
		
		try {

			int portNo = 4228;
			ServerSocket serverSocket = new ServerSocket(portNo);
			

			while(true) {
				
			
				Socket clientSocket = serverSocket.accept();
				
				//Read object from client, cast into payment
				
				ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
				parcel parcel = (parcel) ois.readObject();
				payment payment = (payment) ois.readObject();
				System.out.println("Processing object from client: "+payment.getPaymentId());
				
				//Process object
				parcel =  parcelManager.CreateParcel(parcel);
				payment = managePayment.managePayment(payment);
				ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());
				oos.writeObject(payment);
				oos.writeObject(parcel);
				
				//close all stream
				ois.close();
				oos.close();
				
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
