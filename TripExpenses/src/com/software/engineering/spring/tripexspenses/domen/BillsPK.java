//package com.software.engineering.spring.tripexspenses.domen;
//
//import java.io.Serializable;
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Embeddable;
//import javax.validation.constraints.NotNull;
//
//
//@Embeddable
//public class BillsPK implements Serializable {
//
//    @Basic(optional = false)
//    @NotNull
//    @Column(name = "BILLID")
//    private Long billId;
//    @Basic(optional = false)
//    @NotNull
//    @Column(name = "TRIPBILLS_TRIPBILLID")
//    private Long tripBillTripBillId;
//
//    public BillsPK() {
//    }
//
//    public BillsPK(Long billId, Long tripBillTripBillId) {
//        this.billId = billId;
//        this.tripBillTripBillId = tripBillTripBillId;
//    }
//
//    public Long getBillId() {
//        return billId;
//    }
//
//    public void setBillId(Long billId) {
//        this.billId = billId;
//    }
//
//    public Long getTripBillsTripBillId() {
//        return tripBillTripBillId;
//    }
//
//    public void setTripBillsTripBillId(Long tripBillTripBillId) {
//        this.tripBillTripBillId = tripBillTripBillId;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (billId != null ? billId.hashCode() : 0);
//        hash += (tripBillTripBillId != null ? tripBillTripBillId.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof BillsPK)) {
//            return false;
//        }
//        BillsPK other = (BillsPK) object;
//        if ((this.billId == null && other.billId != null) || (this.billId != null && !this.billId.equals(other.billId))) {
//            return false;
//        }
//        if ((this.tripBillTripBillId == null && other.tripBillTripBillId != null) || (this.tripBillTripBillId != null && !this.tripBillTripBillId.equals(other.tripBillTripBillId))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "domen.BillsPK[ billId=" + billId + ", tripBillTripBillId=" + tripBillTripBillId + " ]";
//    }
//    
//}
