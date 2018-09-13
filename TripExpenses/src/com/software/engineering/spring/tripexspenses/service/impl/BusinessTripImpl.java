package com.software.engineering.spring.tripexspenses.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.software.engineering.spring.tripexspenses.dao.BusinessTripDAO;
import com.software.engineering.spring.tripexspenses.domen.BusinessTrip;
import com.software.engineering.spring.tripexspenses.service.BusinessTripService;

@Service("businessTripService")
public class BusinessTripImpl implements BusinessTripService {
	
	@Autowired
	private BusinessTripDAO dao;

	@Override
	public List<BusinessTrip> findAll() {
		return dao.findAll();
	}

	@Override
	public void delete(Long bussinessTripId) {
		dao.delete(bussinessTripId);
	}

	@Override
	public BusinessTrip save(BusinessTrip businessTrip) {
		return dao.save(businessTrip);
	}

	@Override
	public BusinessTrip findByID(Long bussinessTripId) {
		return dao.findOne(bussinessTripId);
	}

}
