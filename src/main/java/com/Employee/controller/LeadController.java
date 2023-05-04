package com.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Employee.entity.Lead;
import com.Employee.service.LeadService;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadservo;

	@RequestMapping("/leadPage")
	public String viewPage()
	{
		return"create_lead";
	}
	@RequestMapping("/save")
	public String saveData(@ModelAttribute("lead")Lead lead,ModelMap l)
	{
		leadservo.saveLead(lead);
		l.addAttribute("lead", lead);
		return"create_lead";
}
	@RequestMapping("/listall")
	public String getLeads(ModelMap m)
	{
		List<Lead> leads=leadservo.getOneLead();
		m.addAttribute("lead", leads);
		return "list_leads";
	}
}