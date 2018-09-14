package com.software.engineering.spring.tripexspenses.controllers;


import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.software.engineering.spring.tripexspenses.domen.Bill;
import com.software.engineering.spring.tripexspenses.domen.Businesstrip;
import com.software.engineering.spring.tripexspenses.service.BillService;
import com.software.engineering.spring.tripexspenses.service.BusinessTripService;

@Controller
public class BillController {
	
	@Autowired
	private BillService billService;
	
	@Autowired
	private BusinessTripService businessTripService;
	
	@RequestMapping("/bills")
	public String showLocations(Model model) {
		List<Bill> bills = billService.findAll();
		model.addAttribute("bills", bills);
		return "bills";
	}
	
	@RequestMapping("/addbill")
	public String createBill(Model model) {
		List<Businesstrip> businesstrips = businessTripService.findAll();
		model.addAttribute("businesstrips", businesstrips);
		return "addbill";
	}

	@RequestMapping(value = "/docreatebill", method = RequestMethod.POST)
	public String doCreateBill(Model model, String billdate,Long bustripid, Bill bill,  BindingResult result) throws ParseException {
	Businesstrip busTrip=businessTripService.findByID(bustripid);
		bill.setBusinesstrip(busTrip);
		Date date = new SimpleDateFormat("dd-MM-yyyy").parse(billdate); 
		bill.setBilldate(date);
		
		billService.save(bill);
		System.out.println(bill);
		System.out.println("Bill added successfully");
		model.addAttribute("message", "Bill added succesfully!!!");
		
		return "addbill";
	}
	
	@RequestMapping(value = "/deletebill")
	public String delete(Model model, Long billId) {
		billService.delete(billId);
		List<Bill> bills = billService.findAll();
		model.addAttribute("bills", bills);
		return "bills";
	}

	@RequestMapping(value = "/updatebill")
	public String update(Model model, Long billid) {
		Bill bill = billService.findByID(billid);
		List<Bill> bills = new ArrayList<>();
		bills.add(bill);
		model.addAttribute("bills", bills);
		return "updatebill";
	}

	@RequestMapping(value = "/doupdatebill")
	public String doUpdate(Model model,@Valid Bill bill, BindingResult result) {
		billService.save(bill);
		List<Bill> bills = billService.findAll();
		model.addAttribute("bills", bills);
		model.addAttribute("message","Bill updated succesfully!!!");
		return "bills";
	}


}
