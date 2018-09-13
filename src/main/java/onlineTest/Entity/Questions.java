package onlineTest.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Questions {

	@Id
	int qid;
	String question;
}
