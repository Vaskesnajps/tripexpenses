package com.software.engineering.spring.tripexspenses.controllers;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.software.engineering.spring.tripexspenses.domen.Location;
import com.software.engineering.spring.tripexspenses.service.LocationService;

@Controller
public class LocationController {
	@Autowired
	LocationService locationService;
	
	@RequestMapping("/locations")
	public String showLocations(Model model) {
		List<Location> locations=locationService.findAll();
		model.addAttribute("locations",locations);
		return "locations";
	}
	@RequestMapping("/deletelocation")
	public String deleteLocation(Model model, Long locid) {
		locationService.delete(locid);
		List<Location> locations = locationService.findAll();
		model.addAttribute("locations", locations);
		return "locations";
	}

	@RequestMapping(value = "/docreatelocation", method = RequestMethod.POST)
	public String doCreatedepartment(Model model,  Location location,  BindingResult result) {
	
		locationService.save(location);
		System.out.println(location);
		System.out.println("location added successfully");
		model.addAttribute("message","Location added succesfully!!!");
		List<Location> locations=locationService.findAll();
		model.addAttribute("locations",locations);
		return "locations";

	}
	@RequestMapping("/updatelocation")
	public String updateLocation(Model model, Long locid) {
		
		
		Location location=locationService.findByID(locid);
		
		
		model.addAttribute("location", location);
		return "updatelocations";
	}
	@RequestMapping(value = "/doupdatelocation", method = RequestMethod.POST)
	public String doUpdateLocation(Model model,  Location location,String loccountry,String locname, BigDecimal locdailyallowance, BigDecimal locdistance,  long locid,  BindingResult result) {
		Location location1 =locationService.findByID(locid);
		location1.setLoccountry(loccountry);
		location1.setLocdailyallowance(locdailyallowance);
		location1.setLocdistance(locdistance);
		location1.setLocname(locname);
		locationService.save(location1);
		System.out.println(location);
		System.out.println("location updated successfully");
		model.addAttribute("message","Location updated succesfully!!!");
		List<Location> locations=locationService.findAll();
		model.addAttribute("locations",locations);
		return "locations";

	}
}
