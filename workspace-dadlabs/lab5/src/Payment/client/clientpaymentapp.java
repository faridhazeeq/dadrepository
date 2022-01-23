package Payment.client;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import Parcel.parcel;
import Payment.payment;

public class clientpaymentapp {
	public static void main(String[] args) {
		System.out.println("Starting Payment Client App..");
		

		parcel parcel = new parcel();
		parcel.setWeight(0.39);
		payment payment = new payment();
		payment.setPaymentId(1010);
		Date date = new Date();
		payment.setTransactionDate(date);
		String name ="Farid Hazeeq";
		payment.setRecordedBy(name);
		
	
		 try {
			 
			 Socket socket = new Socket(InetAddress.getLocalHost(), 4228);
			 ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			 oos.writeObject(parcel);
			 oos.writeObject(payment);
			 
			 System.out.println("Sending "+payment.getPaymentId() + " to server-side application");
			 
			
			 ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			 parcel processedParcel = (parcel) ois.readObject();
			 payment processedPayment = (payment) ois.readObject();
			 
			 System.out.println("Payment Id: "+ processedPayment.getPaymentId());
			 System.out.println("Weight of Parcel: "+processedParcel.getWeight());
			 System.out.println("Recorded By:  " + processedPayment.getRecordedBy());
			 System.out.println("Transaction Date: "+processedPayment.getTransactionDate());
			 
			 
			 //Close all stream
			 ois.close();
			 oos.close();
			 socket.close();
			 
			 
		 }
		 catch(Exception ex) {
			 ex.printStackTrace();
		 }
		

	}
}
