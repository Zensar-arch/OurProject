package com.zensar.mstdc.service;

import java.util.List;

import com.zensar.mstdc.entities.Payment;

public interface PaymentService {

	List<Payment> findAllPayments();

	Payment findPaymentById(int paymentId);

	void addPayment(Payment payment);

	void updatePayment(Payment payment);

	void removePayment(Payment payment);

	List<Payment> findPaymentByName(String name);

	Long getPaymentCount();

}
