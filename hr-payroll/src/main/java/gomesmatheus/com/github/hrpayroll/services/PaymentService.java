package gomesmatheus.com.github.hrpayroll.services;

import org.springframework.stereotype.Service;

import gomesmatheus.com.github.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(Long workerId, int days) {
		return new Payment("Bob", 200, days);
	}
	
}
