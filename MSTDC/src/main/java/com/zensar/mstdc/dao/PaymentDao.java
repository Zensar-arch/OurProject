package com.zensar.mstdc.dao;

import java.util.List;

import com.zensar.mstdc.entities.Payment;

public interface PaymentDao {
	List<Payment> getAll();
	Payment getByPaymentId(int paymentId);
	void insert(Payment payment);
	void update(Payment payment);
	void delete(Payment payment);
}
