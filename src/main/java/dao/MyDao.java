package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.mysql.cj.Query;



public class MyDao<Student> {
	//hybernate
	
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction =manager.getTransaction();
	private Object Student;
	
	public void save(Student student) {
	   transaction.begin();
		manager.persist(student);
       transaction.commit();
	}
}
