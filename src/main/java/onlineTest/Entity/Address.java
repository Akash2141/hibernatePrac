package onlineTest.Entity;

import javax.persistence.Embeddable;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Embeddable
public class Address {
	
	String area;
	String landmark;
	String street;
	String city;
	String state;
	long pincode;
	
	public Address(String area, String landmark, String street, String city, String state, long pincode) {
		super();
		this.area = area;
		this.landmark = landmark;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public Address() {
		super();
	}
	
	
	
	
}
