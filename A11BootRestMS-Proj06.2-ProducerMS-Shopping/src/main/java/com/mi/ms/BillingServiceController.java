package com.mi.ms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing/api")
@RefreshScope
public class BillingServiceController 
{
	@Value("${server.port}")
	private int 	port;

	@Value("${eureka.instance.instance-id}")
	private String instance;
	
	@Value("${dbuser}")
	private String user;
	
	@Value("${dbpwd}")
	private String pwd;

	@GetMapping("/info")
	public String getBillingInfo()
	{
		return "We accept Card Payment/UPI/Net Banking/COD  port no :: "+port+" Instance ID :: "+instance+" DbUsername: "+user+" pwd: "+pwd;
	}
}
