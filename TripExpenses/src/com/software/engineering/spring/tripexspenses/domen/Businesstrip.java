package com.software.engineering.spring.tripexspenses.domen;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


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
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="my_entity_seq_gen")
	@SequenceGenerator(name="my_entity_seq_gen", sequenceName="businesstrips_seq")
	private long bustripid;

	private Long dayscount;

	@Temporal(TemporalType.DATE)
//	@DateTimeFormat(pattern="DD-MON-RR")
	private Date fromdate;

	@Temporal(TemporalType.DATE)
//	@DateTimeFormat(pattern="DD-MON-RR")
	private Date todate;

	private Long triptotallow;

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

	public Long getDayscount() {
		return this.dayscount;
	}

	public void setDayscount(Long dayscount) {
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

	public Long getTriptotallow() {
		return this.triptotallow;
	}

	public void setTriptotallow(Long triptotallow) {
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