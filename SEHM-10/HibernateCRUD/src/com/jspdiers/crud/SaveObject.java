package com.jspdiers.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.jpa.event.internal.core.JpaAutoFlushEventListener;

public class SaveObject {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		
		Institute jspiders = new Institute();
		jspiders.setId(100);
		jspiders.setName("jsidpers");;
		jspiders.setFee(30000);
		
		session.save(jspiders);
		
		tx.commit();
		
		
		
	}
	

}
