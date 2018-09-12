package com.software.engineering.spring.tripexspenses.domen;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the BILLS database table.
 * 
 */
@Entity
@Table(name="BILLS")
@NamedQuery(name="Bill.findAll", query="SELECT b FROM Bill b")
public class Bill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long billid;

	@Temporal(TemporalType.DATE)
	private Date billdate;

	private String billitem;

	private BigDecimal price;

	//bi-directional many-to-one association to Tripbill
	@ManyToOne
	@JoinColumn(name="TRIPBILLS_TRIPBILLID")
	private Tripbill tripbill;

	public Bill() {
	}

	public long getBillid() {
		return this.billid;
	}

	public void setBillid(long billid) {
		this.billid = billid;
	}

	public Date getBilldate() {
		return this.billdate;
	}

	public void setBilldate(Date billdate) {
		this.billdate = billdate;
	}

	public String getBillitem() {
		return this.billitem;
	}

	public void setBillitem(String billitem) {
		this.billitem = billitem;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Tripbill getTripbill() {
		return this.tripbill;
	}

	public void setTripbill(Tripbill tripbill) {
		this.tripbill = tripbill;
	}

}