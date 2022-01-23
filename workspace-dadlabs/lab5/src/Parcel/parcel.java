package Parcel;

import java.io.Serializable;

public class parcel implements Serializable {
private static final long serialVersionUID = 1L;
	
	private double weight;
	private double price;
	
	public parcel() {
		this.weight = 0.0;
		this.price = 0.0;
		
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
