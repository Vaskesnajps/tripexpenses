package com.software.engineering.spring.tripexspenses.domen;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


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
	private long userid;

	private BigDecimal enabled;

	private String password;

	private String username;

	//bi-directional many-to-one association to Authority
//	@OneToMany(mappedBy="username",fetch = FetchType.EAGER)
//	private List<Authority> authorities;

	//bi-directional many-to-one association to Authority
//	@ManyToOne
//	
//	private Authority authority;



	@ManyToOne
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

//	public List<Authority> getAuthorities() {
//		return this.authorities;
//	}
//
//	public void setAuthorities(List<Authority> authorities) {
//		this.authorities = authorities;
//	}

//	public Authority addAuthority(Authority authority) {
//		getAuthorities().add(authority);
//		authority.setUser(this);
//
//		return authority;
//	}
//
//	public Authority removeAuthority(Authority authority) {
//		getAuthorities().remove(authority);
//		authority.setUser(null);
//
//		return authority;
//	}

//	public Authority getAuthority() {
//		return this.authority;
//	}
//
//	public void setAuthority(Authority authority) {
//		this.authority = authority;
//	}

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