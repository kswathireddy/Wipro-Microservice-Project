package com.wipro.travelAgency.swathi.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.travelAgency.swathi.demo.entity.PackageWrapper;
import com.wipro.travelAgency.swathi.demo.entity.Payment;
import com.wipro.travelAgency.swathi.demo.entity.PaymentResponse;
import com.wipro.travelAgency.swathi.demo.entity.UserWrapper;
import com.wipro.travelAgency.swathi.demo.feign.PackageFeign;
import com.wipro.travelAgency.swathi.demo.feign.UserFeign;
import com.wipro.travelAgency.swathi.demo.repo.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	private PaymentRepository paymentRepository;

	@Autowired
	private UserFeign userFeign;
	@Autowired
	private PackageFeign packageFeign;
	@Override
	public Payment addPayment(Payment payment) {
		// TODO Auto-generated method stub
		return paymentRepository.save(payment);
	}

	@Override
	public PaymentResponse getPaymentDetails(Long paymentId) {
        Payment payment = paymentRepository.findById(paymentId)
            .orElseThrow(() -> new RuntimeException("Payment not found with ID: " + paymentId));

        UserWrapper user = userFeign.getUserById(payment.getUserId());
        PackageWrapper packageInfo = packageFeign.getPackageById(payment.getPackageId());

        return new PaymentResponse(
        		payment.getPaymentId(),
        		payment.getBookingId(),
                payment.getAmount(),
            payment.getMethod(),
            
            
           
            user,
            packageInfo
        );
    }

	
	
	

}
