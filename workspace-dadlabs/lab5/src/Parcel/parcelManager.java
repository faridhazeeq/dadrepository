package Parcel;

public class parcelManager {
	
public parcel CreateParcel(parcel parcel) {
		
		double weight = parcel.getWeight();
		parcel.setWeight(weight);
		double price = this.courierCharge(parcel.getWeight());
		parcel.setPrice(price);
		return parcel;
}
		
		private double courierCharge(double weight) {
			
			double price = 0.0;
			
			if(weight <= 0.00) {
				
				System.out.println("Please enter the valid amount of weight in kg.");
			}
			else if(weight >= 0.00 && weight<=0.50) {
				
				price = 8.00;
			}
			else if(weight>= 0.51 && weight <= 1.00) {
				
				price = 9.00;
			}
			else if(weight >= 1.01 && weight <=1.50) {
				
				price = 10.05;
				
			}
			else if(weight >= 1.51 && weight <= 2.00) {
				
				price = 10.60;
		
			}
			else {
				System.out.println("The weight you've insert exceed the limit.");
			}
			return price;
		
	}
}

