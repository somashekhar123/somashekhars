package com.Employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.entity.Lead;
import com.Employee.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService{
	@Autowired
    private  LeadRepository LeadRepo;
	@Override
	public void saveLead(Lead lead) {
		LeadRepo.save(lead);
		
		
	}
	@Override
	public List<Lead> getOneLead() {
		List<Lead> leads = LeadRepo.findAll();
		return leads;
	}

}
