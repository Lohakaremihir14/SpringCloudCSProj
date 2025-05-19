package com.mi.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceRestConsumer
{
	@Autowired
	private DiscoveryClient client;

	public String getBillingInfo()
	{
		// find and get service instaces of producer by using service Id
		List<ServiceInstance> lisSI=client.getInstances("ProviderMS");
	
		// user first service instance from the list of instance
		ServiceInstance SI=lisSI.get(0); // manually we are picking
		
		//get Producer MS URI and make it as URL
		String url=SI.getUri()+"/hospital-service/info";
		
		// create rest template object
		/*RestTemplate template=new RestTemplate();
		String msg=template.getForObject(url,String.class);
		return msg;*/
		
		return new RestTemplate().getForObject(url,String.class);
	}
}
