//package com.software.engineering.spring.tripexspenses.domen;
//
//import java.io.Serializable;
//import java.util.Date;
//import javax.persistence.Column;
//import javax.persistence.EmbeddedId;
//import javax.persistence.Entity;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.validation.constraints.Size;
//import javax.xml.bind.annotation.XmlRootElement;
//
//
//@Entity
//@Table(name = "BILLS")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "Bills.findAll", query = "SELECT b FROM Bills b")
//    , @NamedQuery(name = "Bills.findByBillid", query = "SELECT b FROM Bills b WHERE b.billsPK.billid = :billid")
//    , @NamedQuery(name = "Bills.findByBillitem", query = "SELECT b FROM Bills b WHERE b.billItem = :billItem")
//    , @NamedQuery(name = "Bills.findByPrice", query = "SELECT b FROM Bills b WHERE b.price = :price")
//    , @NamedQuery(name = "Bills.findByBilldate", query = "SELECT b FROM Bills b WHERE b.billDate = :billDate")
//    , @NamedQuery(name = "Bills.findByTripbillsTripbillid", query = "SELECT b FROM Bills b WHERE b.billsPK.tripBillTripbillid = :tripBillTripbillid")})
//public class Bill implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @EmbeddedId
//    protected BillsPK billsPK;
//    @Size(max = 40)
//    @Column(name = "BILLITEM")
//    private String billItem;
//    @Column(name = "PRICE")
//    private Long price;
//    @Column(name = "BILLDATE")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date billDate;
//    @JoinColumn(name = "TRIPBILLS_TRIPBILLID", referencedColumnName = "TRIPBILLID", insertable = false, updatable = false)
//    @ManyToOne(optional = false)
//    private TripBill tripBill;
//
//    public Bill() {
//    }
//
//    public Bill(BillsPK billsPK) {
//        this.billsPK = billsPK;
//    }
//
//    public Bill(Long billId, Long tripBillTripBillId) {
//        this.billsPK = new BillsPK(billId, tripBillTripBillId);
//    }
//
//    public BillsPK getBillsPK() {
//        return billsPK;
//    }
//
//    public void setBillsPK(BillsPK billsPK) {
//        this.billsPK = billsPK;
//    }
//
//    public String getBillItem() {
//        return billItem;
//    }
//
//    public void setBillItem(String billItem) {
//        this.billItem = billItem;
//    }
//
//    public Long getPrice() {
//        return price;
//    }
//
//    public void setPrice(Long price) {
//        this.price = price;
//    }
//
//    public Date getBillDate() {
//        return billDate;
//    }
//
//    public void setBillDate(Date billDate) {
//        this.billDate = billDate;
//    }
//
//    public TripBill getTripBill() {
//        return tripBill;
//    }
//
//    public void setTripBill(TripBill tripBill) {
//        this.tripBill = tripBill;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (billsPK != null ? billsPK.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Bill)) {
//            return false;
//        }
//        Bill other = (Bill) object;
//        if ((this.billsPK == null && other.billsPK != null) || (this.billsPK != null && !this.billsPK.equals(other.billsPK))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "domen.Bills[ billsPK=" + billsPK + " ]";
//    }
//    
//}