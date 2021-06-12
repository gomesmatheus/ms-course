package gomesmatheus.com.github.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gomesmatheus.com.github.hrpayroll.entities.Payment;
import gomesmatheus.com.github.hrpayroll.entities.Worker;
import gomesmatheus.com.github.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(Long workerId, int days) {
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
	
}
