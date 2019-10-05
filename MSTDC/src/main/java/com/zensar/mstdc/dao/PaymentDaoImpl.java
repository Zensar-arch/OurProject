package com.zensar.mstdc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.mstdc.entities.Payment;

public class PaymentDaoImpl implements PaymentDao {
	private Session session;
	
	public PaymentDaoImpl() {
		// TODO Auto-generated constructor stub
		Configuration configuration =new Configuration().configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		session = sessionFactory.openSession();
	}

	public List<Payment> getAll() {
		// TODO Auto-generated method stub
		return session.createQuery("from Payment").getResultList();
		
	}

	public Payment getByPaymentId(int paymentId) {
		// TODO Auto-generated method stub
		return session.get(Payment.class, paymentId);
	}

	public void insert(Payment payment) {
		// TODO Auto-generated method stub
		Transaction t = session.beginTransaction();
		session.save(payment);
		t.commit();

	}

	public void update(Payment payment) {
		// TODO Auto-generated method stub
		Transaction t1 = session.beginTransaction();
		session.update(payment);
		t1.commit();
		

	}

	public void delete(Payment payment) {
		// TODO Auto-generated method stub
		Transaction t1 = session.beginTransaction();
		session.delete(payment);
		t1.commit();
		

	}

}
