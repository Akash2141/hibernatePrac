package onlineTest.Entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Teacher")
public class teacher extends modelUser{
	
	teacher(){}
	int salary;

	public teacher(String username, String email, Address address, long contact, String password, String conPass,
			String college,int salary) {
		super(username, email, address, contact, password, conPass, college);
		this.salary=salary;
	}
}
