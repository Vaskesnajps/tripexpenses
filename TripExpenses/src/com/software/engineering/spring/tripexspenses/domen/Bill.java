package com.software.engineering.spring.tripexspenses.domen;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "BILLS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bills.findAll", query = "SELECT b FROM Bills b")
    , @NamedQuery(name = "Bills.findByBillid", query = "SELECT b FROM Bills b WHERE b.billid = :billid")
    , @NamedQuery(name = "Bills.findByBillitem", query = "SELECT b FROM Bills b WHERE b.billitem = :billitem")
    , @NamedQuery(name = "Bills.findByPrice", query = "SELECT b FROM Bills b WHERE b.price = :price")
    , @NamedQuery(name = "Bills.findByBilldate", query = "SELECT b FROM Bills b WHERE b.billdate = :billdate")})
public class Bill implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "billId")
    private Long billId;
    @Size(max = 40)
    @Column(name = "billItem")
    private String billItem;
    @Column(name = "PRICE")
    private Long price;
    @Column(name = "billDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date billDate;
    @JoinColumn(name = "TRIPBILLS_TRIPbillId", referencedColumnName = "TRIPbillId")
    @ManyToOne(optional = false)
    private TripBill tripBillsTripbillId;

    public Bill() {
    }

    public Bill(Long billId) {
        this.billId = billId;
    }

    public Long getbillId() {
        return billId;
    }

    public void setbillId(Long billId) {
        this.billId = billId;
    }

    public String getbillItem() {
        return billItem;
    }

    public void setbillItem(String billItem) {
        this.billItem = billItem;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Date getbillDate() {
        return billDate;
    }

    public void setbillDate(Date billDate) {
        this.billDate = billDate;
    }

    public TripBill gettripBillsTripbillId() {
        return tripBillsTripbillId;
    }

    public void settripBillsTripbillId(TripBill tripBillsTripbillId) {
        this.tripBillsTripbillId = tripBillsTripbillId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (billId != null ? billId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bill)) {
            return false;
        }
        Bill other = (Bill) object;
        if ((this.billId == null && other.billId != null) || (this.billId != null && !this.billId.equals(other.billId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domen.Bill[ billId=" + billId + " ]";
    }
    
}
