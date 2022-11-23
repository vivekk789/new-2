package com.demo.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.search.dto.Lead;

@Controller
public class SearchLeadController {
	
	@Autowired
	private RestClient c;
	
	@RequestMapping("/search")
	public String searchViewPage() {
		return "search";
	}
	
	@RequestMapping("/searchById")
	public String searchById(@RequestParam("id")long id , ModelMap model) {
		Lead lead = c.getLeadInfo(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}


}
