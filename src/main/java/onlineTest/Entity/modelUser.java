package onlineTest.Entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Getter;
import lombok.NonNull;


@Entity(name="User1")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Type",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="employee")
@Getter
public class modelUser {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@NonNull String username;
	@NonNull String email;
	@Embedded
	@NonNull Address address;
	@NonNull long contact;
	@NonNull String password;
	@NonNull String conPass;
	@NonNull String college;
	public modelUser(String username, String email, Address address, long contact, String password, String conPass,String college) {
		super();
		this.username = username;
		this.email = email;
		this.address = address;
		this.contact = contact;
		this.password = password;
		this.conPass = conPass;
		this.college = college;
	}
	
	public modelUser() {
		super();
	}
	
}
