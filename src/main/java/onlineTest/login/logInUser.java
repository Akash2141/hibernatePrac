package onlineTest.login;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import onlineTest.Entity.student;

public class logInUser {
	
	String msg;

	String studLogin(String username,String password) {
		try {
			Session session=new Configuration().configure().buildSessionFactory().openSession();
			Transaction trans=session.beginTransaction();
			
			//student student=(student) session.get(student.class, id);
			
			trans.commit();
			session.close();
			msg="successfully logged in";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg="login failed";
		}
		return msg;
	}
	
}
