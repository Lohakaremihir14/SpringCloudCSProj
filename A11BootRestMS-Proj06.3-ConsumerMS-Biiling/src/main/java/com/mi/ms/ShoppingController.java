package com.mi.ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mi.client.IBillingServiceRestConsumer;

@RestController
@RequestMapping("/shopping/api")
@RefreshScope
public class ShoppingController 
{
	@Autowired
	private IBillingServiceRestConsumer consumer;
	
	@Value("${dbuser}")
	private String user;
	
	@Value("${dbpwd}")
	private String pwd;
	
	@GetMapping("/details")
	public String displayShoppingDetails()
	{
		
		System.out.println("Client component class name :: "+consumer.getClass());
	
		return "<h2><center>Diwali Shopping For Family :: "+consumer.fetchBill()+" DbUsername: "+user+" pwd: "+pwd+"<center></h2>";
	}
}
