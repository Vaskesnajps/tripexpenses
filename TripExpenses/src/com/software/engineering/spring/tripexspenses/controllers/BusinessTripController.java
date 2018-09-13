package com.software.engineering.spring.tripexspenses.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.software.engineering.spring.tripexspenses.domen.BusinessTrip;
import com.software.engineering.spring.tripexspenses.service.BusinessTripService;

@Controller
public class BusinessTripController {
	
	@Autowired
	private BusinessTripService businessTripService;
	
	@RequestMapping("/businesstrips")
	public String showLocations(Model model) {
		List<BusinessTrip> businessTrips =businessTripService.findAll();
		model.addAttribute("businesstrips",businessTrips);
		return "businesstrips";
	}
	
	@RequestMapping("/addbusinesstrip")
	public String createBusinessTrip(Model model) {
		
		return "addbusinesstrip";
	}

	@RequestMapping(value = "/docreatebusinesstrip", method = RequestMethod.POST)
	public String doCreateBusinessTrip(Model model,  BusinessTrip businessTrip,  BindingResult result) {
		businessTripService.save(businessTrip);
		System.out.println(businessTrip);
		System.out.println("Business trip added successfully");
		model.addAttribute("message", "Business trip added succesfully!!!");
		
		return "addbusinesstrip";
	}

}
