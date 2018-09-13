package com.software.engineering.spring.tripexspenses.controllers;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.joda.time.Days;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.software.engineering.spring.tripexspenses.domen.Businesstrip;
import com.software.engineering.spring.tripexspenses.domen.Employee;
import com.software.engineering.spring.tripexspenses.domen.Location;
import com.software.engineering.spring.tripexspenses.service.BusinessTripService;
import com.software.engineering.spring.tripexspenses.service.EmployeesService;
import com.software.engineering.spring.tripexspenses.service.LocationService;

@Controller
public class BusinessTripController {
	
	@Autowired
	private BusinessTripService businessTripService;
	
	@Autowired
	private EmployeesService employeeService;
	
	@Autowired
	private LocationService locationService;
	
	@RequestMapping("/businesstrips")
	public String showLocations(Model model) {
		List<Businesstrip> businessTrips =businessTripService.findAll();
		model.addAttribute("businesstrips",businessTrips);
		return "businesstrips";
	}
	
	@RequestMapping("/addbusinesstrip")
	public String createBusinesstrip(Model model) {
		List<Employee> employees = employeeService.findAll();
		model.addAttribute("employees", employees);
		
		List<Location> locations = locationService.findAll();
		model.addAttribute("locations", locations);
		
		return "addbusinesstrip";
	}

	@RequestMapping(value = "/docreatebusinesstrip", method = RequestMethod.POST)
	public String doCreateBusinesstrip (Model model,String fromdate, String todate, Long locid,Long employeeid, Businesstrip businessTrip,  BindingResult result)throws Exception {
//	java.sql.Date daysFrom = new java.sql.Date( businessTrip.getFromdate().getTime());
//	java.sql.Date daysTo = new java.sql.Date( businessTrip.getTodate().getTime());
//	long daysBetween = ChronoUnit.DAYS.between(daysFrom, daysTo);
//	businessTrip.setDayscount(daysBetween);

		Employee employee=employeeService.findByID(employeeid);
		Location location=locationService.findByID(locid);
		businessTrip.setEmployee(employee);
		businessTrip.setLocation(location);
//		businessTrip.setDayscount(4l);
//		Date from=new Date(businessTrip.getFromdate())
		
		  Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(fromdate); 
		  Date date2=new SimpleDateFormat("dd-MM-yyyy").parse(todate);  
		  
		  long between =   date2.getTime() - date1.getTime();
		  System.out.println(between);
		  businessTrip.setDayscount(TimeUnit.DAYS.convert(between, TimeUnit.MILLISECONDS));
//		businessTrip.setFromdate(new Date(8-12-2018));
//		businessTrip.setTodate(new Date(9-12-2018));
//		Date daysFrom =businessTrip.getFromdate();
//		Date daysTo = businessTrip.getTodate();
		  businessTrip.setFromdate(date1);
		  businessTrip.setTodate(date2);
		System.out.println(businessTrip);
//		System.out.println(daysFrom);
//		System.out.println(daysTo);
		System.out.println(fromdate);
		System.out.println(todate);
		
		businessTripService.save(businessTrip);
		System.out.println("Business trip added successfully");
		model.addAttribute("message", "Business trip added succesfully!!!");
		
		return "addbusinesstrip";
	}
	
	public static long getDifferenceDays(Date d1, Date d2) {
	    long diff = d2.getTime() - d1.getTime();
	    return TimeUnit.DAYS.convert(diff, TimeUnit.DAYS);
	}

}