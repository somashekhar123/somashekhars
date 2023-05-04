package com.Employee.service;

import java.util.List;

import com.Employee.entity.Lead;

public interface LeadService {

	void saveLead(Lead lead);

	List<Lead> getOneLead();

}
