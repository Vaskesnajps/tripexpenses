package com.software.engineering.spring.tripexspenses.domen;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The persistent class for the USERS database table.
 * 
 */
@Entity
@Table(name="USERS")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="my_entity_seq_gen7")
	@SequenceGenerator(name="my_entity_seq_gen7", sequenceName="user_seq")
	private long userid;

	private BigDecimal enabled;

	private String password;

	private String username;


	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="EMPLOYEES_EMPLOYEEID")
	private Employee employeeid;
	
	public User() {
	}

	public long getUserid() {
		return this.userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public BigDecimal getEnabled() {
		return this.enabled;
	}

	public void setEnabled(BigDecimal enabled) {
		this.enabled = enabled;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}



	public Employee getEmployee() {
		return this.employeeid;
	}

	public void setEmployee(Employee employeeid) {
		this.employeeid = employeeid;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", password=" + password + ", username=" + username + "]";
	}

}