package com.software.engineering.spring.tripexspenses.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.software.engineering.spring.tripexspenses.dao.BillDAO;
import com.software.engineering.spring.tripexspenses.domen.Bill;
import com.software.engineering.spring.tripexspenses.service.BillService;

@Service("billsService")
public class BillServiceImpl implements BillService {
	
	@Autowired
	private BillDAO dao;

	@Override
	public List<Bill> findAll() {
		return dao.findAll();
	}

	@Override
	public void delete(Long billId) {
		dao.delete(billId);
	}

	@Override
	public Bill save(Bill bill) {
		return dao.save(bill);
	}

	@Override
	public Bill findByID(Long billId) {
		return dao.findOne(billId);
	}

}
