package onlineTest.Entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Student")
public class student extends modelUser{
	student()
	{}

	public student(String username, String email, Address address, long contact, String password, String conPass,
			String college) {
		super(username, email, address, contact, password, conPass, college);
	}
}
