package com.demo.search.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.demo.search.dto.Lead;

@Component
public class RestClient {
	public Lead getLeadInfo(long id) {
		RestTemplate restTemplate = new RestTemplate();
		Lead lead = restTemplate.getForObject("http://localhost:8080/api/lead/lead/"+id , Lead.class);
		return lead;
	}
}
