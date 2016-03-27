package com.infiniteskills.data;

import java.util.Date;

import org.hibernate.Session;

import com.infiniteskills.data.entities.User;

public class Application {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		
		User user = new User("Bob", "Robert", new Date(), "bob.rob@gmall.net", new Date(), "Mike", new Date(), "Mike");
		
		session.save(user);
		
		session.getTransaction().commit();
		session.close();
	}
}
