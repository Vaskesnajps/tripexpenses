package com.software.engineering.spring.tripexspenses.service;

import java.util.List;
import com.software.engineering.spring.tripexspenses.domen.TripBill;

public interface TripBillService {
	
	public List<TripBill> findAll();
	public void delete(Long tripBillId);
	public TripBill save(TripBill tripBill);
	public TripBill findByID(Long tripBillId);

}
