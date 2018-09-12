package com.software.engineering.spring.tripexspenses.domen;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the TRIPBILLS database table.
 * 
 */
@Entity
@Table(name="TRIPBILLS")
@NamedQuery(name="Tripbill.findAll", query="SELECT t FROM Tripbill t")
public class Tripbill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long tripbillid;

	private BigDecimal totalamount;

	//bi-directional many-to-one association to Bill
	@OneToMany(mappedBy="tripbill")
	private List<Bill> bills;

	//bi-directional many-to-one association to Businesstrip
	@ManyToOne
	@JoinColumn(name="BUSINESSTRIPS_BUSTRIPID")
	private Businesstrip businesstrip;

	public Tripbill() {
	}

	public long getTripbillid() {
		return this.tripbillid;
	}

	public void setTripbillid(long tripbillid) {
		this.tripbillid = tripbillid;
	}

	public BigDecimal getTotalamount() {
		return this.totalamount;
	}

	public void setTotalamount(BigDecimal totalamount) {
		this.totalamount = totalamount;
	}

	public List<Bill> getBills() {
		return this.bills;
	}

	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}

	public Bill addBill(Bill bill) {
		getBills().add(bill);
		bill.setTripbill(this);

		return bill;
	}

	public Bill removeBill(Bill bill) {
		getBills().remove(bill);
		bill.setTripbill(null);

		return bill;
	}

	public Businesstrip getBusinesstrip() {
		return this.businesstrip;
	}

	public void setBusinesstrip(Businesstrip businesstrip) {
		this.businesstrip = businesstrip;
	}

}