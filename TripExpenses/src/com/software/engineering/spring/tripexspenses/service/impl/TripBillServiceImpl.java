package com.software.engineering.spring.tripexspenses.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.software.engineering.spring.tripexspenses.dao.TripBillDAO;
import com.software.engineering.spring.tripexspenses.domen.TripBill;
import com.software.engineering.spring.tripexspenses.service.TripBillService;

@Service("tripBillsService")
public class TripBillServiceImpl implements TripBillService{
	
	@Autowired
	private TripBillDAO dao;

	@Override
	public List<TripBill> findAll() {
		return dao.findAll();
	}

	@Override
	public void delete(Long tripBillId) {
		dao.delete(tripBillId);
	}

	@Override
	public TripBill save(TripBill tripBill) {
		return dao.save(tripBill);
	}

	@Override
	public TripBill findByID(Long tripBillId) {
		return dao.findOne(tripBillId);
	}

}
