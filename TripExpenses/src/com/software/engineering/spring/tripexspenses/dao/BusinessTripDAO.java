package com.software.engineering.spring.tripexspenses.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.software.engineering.spring.tripexspenses.domen.BusinessTrip;

@Repository("businessTripDAO")
public interface BusinessTripDAO extends JpaRepository<BusinessTrip, Long>{

}
