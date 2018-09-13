package onlineTest.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import onlineTest.Entity.Address;
import onlineTest.Entity.student;
import onlineTest.Entity.teacher;

public class saveUser {
	String msg;

	String addStudent() {
		try {
			Session session=new Configuration().configure().buildSessionFactory().openSession();
			Transaction trans=session.beginTransaction();
			
//			Address address=new Address(area, landmark, street, city, state, pincode);
//			student student=new student(username, email, address, contact, password, conPass, college);
//			session.save(student);
			
			trans.commit();
			session.close();
			msg="data successfully inserted";
		}
		catch(Exception e){
			e.printStackTrace();
			msg="data no inserted";
		}
		return msg;
	}
	String addTeacher() {
		try {
			Session session=new Configuration().configure().buildSessionFactory().openSession();
			Transaction trans=session.beginTransaction();
			
			//Address address=new Address(area, landmark, street, city, state, pincode);
			//teacher teacher=new teacher(username, email, address, contact, password, conPass, college, salary);
			//session.save(teacher);
			
			trans.commit();
			session.close();
			msg="data successfully inserted";
		}
		catch(Exception e){
			e.printStackTrace();
			msg="data no inserted";
		}
		return msg;
	}
}
