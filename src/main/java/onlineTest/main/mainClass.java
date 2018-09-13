package onlineTest.main;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import onlineTest.Entity.Address;
import onlineTest.Entity.student;
import onlineTest.Entity.teacher;

public class mainClass {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction trans=session.beginTransaction();
		
		Address address=new Address("S.B.shelar chowk", "Tulja bhavani mandir", "abc", "pagalbivli", "Maharashtra", 421201l);
		
		
		student student=new student("Akash","asgupta2141@gmail.com", address, 8879563646l, "Akash2141", "Akash2141", "RJCollege");
		
		session.save(student);
		
		teacher teacher=new teacher("Akshay","asgupta2141@gmail.com", address, 8879563646l, "Akash2141", "Akash2141", "RJCollege",11000);
		
		session.save(teacher);
		
	
		
		trans.commit();
		
		session.close();
		System.out.println("successfully added");

	}

}
