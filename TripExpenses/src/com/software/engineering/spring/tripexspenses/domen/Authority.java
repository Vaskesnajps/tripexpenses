//package com.software.engineering.spring.tripexspenses.domen;
//
//import java.io.Serializable;
//import javax.persistence.*;
//import java.util.List;
//
//
///**
// * The persistent class for the AUTHORITIES database table.
// * 
// */
//@Entity
//@Table(name="AUTHORITIES")
//@NamedQuery(name="Authority.findAll", query="SELECT a FROM Authority a")
//public class Authority implements Serializable {
//	private static final long serialVersionUID = 1L;
//
//	@Id
//	private long authorityid;
//
//	private String authority;
//
//	//bi-directional many-to-one association to User
//	@ManyToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="USERS_USERNAME")
//	private User userid;
//
//	//bi-directional many-to-one association to User
////	@OneToMany(mappedBy="username")
////	private List<User> users;
//
//	public Authority() {
//	}
//
//	public long getAuthorityid() {
//		return this.authorityid;
//	}
//
//	public void setAuthorityid(long authorityid) {
//		this.authorityid = authorityid;
//	}
//
//	public String getAuthority() {
//		return this.authority;
//	}
//
//	public void setAuthority(String authority) {
//		this.authority = authority;
//	}
//
//	public User getUser() {
//		return this.userid;
//	}
//
//	public void setUser(User userid) {
//		this.userid = userid;
//	}
//
////	public List<User> getUsers() {
////		return this.users;
////	}
////
////	public void setUsers(List<User> users) {
////		this.users = users;
////	}
//
////	public User addUser(User user) {
////		getUsers().add(user);
////		user.setAuthority(this);
////
////		return user;
////	}
////
////	public User removeUser(User user) {
////		getUsers().remove(user);
////		user.setAuthority(null);
////
////		return user;
////	}
//
//}