//package com.software.engineering.spring.tripexspenses.controllers;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.software.engineering.spring.tripexspenses.domen.Authority;
//import com.software.engineering.spring.tripexspenses.domen.User;
//import com.software.engineering.spring.tripexspenses.service.AuthorityService;
//import com.software.engineering.spring.tripexspenses.service.UserService;
//
//@Controller
//public class AuthorityController {
//	@Autowired
//	UserService userService;
//	@Autowired
//	AuthorityService authorityService;
//
//	@RequestMapping("/authorities")
//	public String showAuthorities(Model model) {
//		List<Authority> authorities=authorityService.findAll();
//		model.addAttribute("authorities",authorities);
//		return "authorities";
//	}
//	@RequestMapping("/addauthority")
//	public String createAuthority(Model model) {
//		List<User> users=userService.findAll();
//		model.addAttribute("users", users);
//		
//		return "addauthority";
//	}
//
//	@RequestMapping(value = "/docreateauthority", method = RequestMethod.POST)
//	public String doCreatedepartment(Model model,  Authority authority, Long userid, BindingResult result) {
//		User user=userService.findByID(userid);
//		authority.setUser(user);
//		authorityService.save(authority);
//		System.out.println(authority);
//		System.out.println("Authority added successfully");
//		model.addAttribute("message","Authority added succesfully!!!");
//		
//		
//		return "addauthority";
//
//	}
//}
