package com.ecommerce.compositeservice.handler;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;


@Service
public class GenericHandler {

	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
	private LoadBalancerClient loadBalancer; 
	
	public String locateServiceUrl(String service, String endpoint) throws InterruptedException
	{
		ServiceInstance instance = loadBalancer.choose(service);
		List<String> services = this.discoveryClient.getServices();
		System.out.print(services);
		Thread.sleep(5000);
		System.out.print("http://"+instance.getHost()+":"+instance.getPort());
		String uri = "http://"+instance.getHost()+":"+instance.getPort()+"/"+endpoint;
		return uri;
	}
}
