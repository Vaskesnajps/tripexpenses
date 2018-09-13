package com.software.engineering.spring.tripexspenses.service;

import java.util.List;

import com.software.engineering.spring.tripexspenses.domen.BusinessTrip;

public interface BusinessTripService {

	public List<BusinessTrip> findAll();
	public void delete(Long bussinessTripId);
	public BusinessTrip save(BusinessTrip businessTrip);
	public BusinessTrip findByID(Long bussinessTripId);
	
}
