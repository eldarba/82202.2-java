package app.core.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.core.entities.Book;

@Component
public class BookDaoDb implements BookDao {
	
	@Autowired
	private EntityManagerFactory factory;

	@Override
	public int addBook(Book book) {
		EntityManager em = factory.createEntityManager();
		try {
			em.getTransaction().begin(); // start transaction
			System.out.println(book);
			em.persist(book);
			System.out.println(book);
			em.getTransaction().commit(); // end transaction - success
			System.out.println(book);
			return book.getId();
		} catch (Exception e) {
			em.getTransaction().rollback(); // end transaction - failure
			throw new RuntimeException("addBook faild");
		}
		
	}

}
