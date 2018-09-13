//package com.software.engineering.spring.tripexspenses.service.impl;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.software.engineering.spring.tripexspenses.dao.AuthorityDAO;
//import com.software.engineering.spring.tripexspenses.domen.Authority;
//import com.software.engineering.spring.tripexspenses.service.AuthorityService;
//
//@Service("authorityService")
//public class AuthorityServiceImpl implements AuthorityService{
//	@Autowired
//	AuthorityDAO authorityDAO;
//	@Override
//	public List<Authority> findAll() {
//		// TODO Auto-generated method stub
//		return authorityDAO.findAll();
//	}
//
//	@Override
//	public void delete(Long authorityid) {
//		authorityDAO.delete(authorityid);
//		
//	}
//
//	@Override
//	public Authority save(Authority authority) {
//		// TODO Auto-generated method stub
//		return authorityDAO.save(authority);
//	}
//
//	@Override
//	public Authority findByID(Long authorityid) {
//		// TODO Auto-generated method stub
//		return authorityDAO.findOne(authorityid);
//	}
//
//}
