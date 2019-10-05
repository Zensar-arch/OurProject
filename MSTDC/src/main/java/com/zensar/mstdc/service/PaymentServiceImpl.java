package com.zensar.mstdc.service;

import java.util.ArrayList;
import java.util.List;

import com.zensar.mstdc.dao.PaymentDao;
import com.zensar.mstdc.dao.PaymentDaoImpl;
import com.zensar.mstdc.entities.Payment;

public class PaymentServiceImpl implements PaymentService {
	private PaymentDao paymentDao;
	
	public PaymentServiceImpl() {
		// TODO Auto-generated constructor stub
		paymentDao=new PaymentDaoImpl();
	}

	public List<Payment> findAllPayments() {
		// TODO Auto-generated method stub
		return paymentDao.getAll();
	}

	public Payment findPaymentById(int paymentId) {
		// TODO Auto-generated method stub
		return paymentDao.getByPaymentId(paymentId);
	}

	public void addPayment(Payment payment) {
		// TODO Auto-generated method stub
		paymentDao.insert(payment);
		
	}

	public void updatePayment(Payment payment) {
		// TODO Auto-generated method stub
		paymentDao.update(payment);
		
	}

	public void removePayment(Payment payment) {
		// TODO Auto-generated method stub
		paymentDao.delete(payment);
		
	}

	public List<Payment> findPaymentByName(String name) {
		// TODO Auto-generated method stub
		List<Payment> list = paymentDao.getAll();
		List<Payment> filterByName = new ArrayList<Payment>();
		for(Payment payment : list)
			filterByName.add(payment);
		
		
		
		return filterByName ;
	}

	public Long getPaymentCount() {
		// TODO Auto-generated method stub
		long count=0;
		List<Payment> list1 = paymentDao.getAll();
		for(Payment payment : list1) {
			count++;}
		
		return count;
	
	}

}
