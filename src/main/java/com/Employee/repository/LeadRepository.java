package com.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Employee.entity.Lead;



public interface LeadRepository extends JpaRepository<Lead, Long> {

}
