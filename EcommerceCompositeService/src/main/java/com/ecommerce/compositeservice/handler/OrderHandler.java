package com.ecommerce.compositeservice.handler;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.compositeservice.config.EcommerceConfiguration;
import com.ecommerce.compositeservice.io.Order;


@Service
public class OrderHandler {

	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private GenericHandler genericHandler;
	
	@Autowired
	private EcommerceConfiguration configuration;

	
	public ResponseEntity<Order> orderDetails(Integer custId) throws URISyntaxException, InterruptedException
	{
		ResponseEntity<Order> response =null;
		HttpHeaders header= new HttpHeaders();
		header.set("customerId", custId.toString());
		RequestEntity<Integer> request = new RequestEntity<Integer>(
				custId,header, HttpMethod.GET, new URI(this.genericHandler.locateServiceUrl(configuration.getOrderService(),"getOrdeByCustId")));
		
		response = restTemplate.exchange(request, Order.class);
		System.out.println(response);
		return response;
	}
	
}
