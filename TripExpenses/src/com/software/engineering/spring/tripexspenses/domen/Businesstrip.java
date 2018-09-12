package com.software.engineering.spring.tripexspenses.domen;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the BUSINESSTRIPS database table.
 * 
 */
@Entity
@Table(name="BUSINESSTRIPS")
@NamedQuery(name="Businesstrip.findAll", query="SELECT b FROM Businesstrip b")
public class Businesstrip implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long bustripid;

	private BigDecimal dayscount;

	@Temporal(TemporalType.DATE)
	private Date fromdate;

	@Temporal(TemporalType.DATE)
	private Date todate;

	private BigDecimal triptotallow;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="EMPLOYEES_EMPLOYEEID")
	private Employee employee;

	//bi-directional many-to-one association to Location
	@ManyToOne
	@JoinColumn(name="LOCATIONS_LOCID")
	private Location location;

	//bi-directional many-to-one association to Tripbill
	@OneToMany(mappedBy="businesstrip")
	private List<Tripbill> tripbills;

	public Businesstrip() {
	}

	public long getBustripid() {
		return this.bustripid;
	}

	public void setBustripid(long bustripid) {
		this.bustripid = bustripid;
	}

	public BigDecimal getDayscount() {
		return this.dayscount;
	}

	public void setDayscount(BigDecimal dayscount) {
		this.dayscount = dayscount;
	}

	public Date getFromdate() {
		return this.fromdate;
	}

	public void setFromdate(Date fromdate) {
		this.fromdate = fromdate;
	}

	public Date getTodate() {
		return this.todate;
	}

	public void setTodate(Date todate) {
		this.todate = todate;
	}

	public BigDecimal getTriptotallow() {
		return this.triptotallow;
	}

	public void setTriptotallow(BigDecimal triptotallow) {
		this.triptotallow = triptotallow;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public List<Tripbill> getTripbills() {
		return this.tripbills;
	}

	public void setTripbills(List<Tripbill> tripbills) {
		this.tripbills = tripbills;
	}

	public Tripbill addTripbill(Tripbill tripbill) {
		getTripbills().add(tripbill);
		tripbill.setBusinesstrip(this);

		return tripbill;
	}

	public Tripbill removeTripbill(Tripbill tripbill) {
		getTripbills().remove(tripbill);
		tripbill.setBusinesstrip(null);

		return tripbill;
	}

}