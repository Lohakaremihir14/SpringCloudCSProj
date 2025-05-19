package com.mi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("ProducerMS-Shopping")
public interface IBillingServiceRestConsumer 
{
	@GetMapping("/billing/api/info") 
	public String fetchBill();
}
