package com.software.engineering.spring.tripexspenses.domen;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author stefan.vasic
 */
@Entity
@Table(name = "TRIPBILLS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tripbills.findAll", query = "SELECT t FROM Tripbills t")
    , @NamedQuery(name = "Tripbills.findByTripbillid", query = "SELECT t FROM Tripbills t WHERE t.tripBillId = :tripBillId")
    , @NamedQuery(name = "Tripbills.findByTotalamount", query = "SELECT t FROM Tripbills t WHERE t.totalAmount = :totalAmount")})
public class TripBill implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "TRIPBILLID")
    private Long tripBillId;
    @Column(name = "TOTALAMOUNT")
    private Long totalAmount;
    @JoinColumn(name = "BUSINESSTRIPS_BUSTRIPID", referencedColumnName = "BUSTRIPID")
    @OneToOne(optional = false)
    private BusinessTrip businessTripBusTripId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tripBill")
    private List<Bill> billList;

    public TripBill() {
    }

    public TripBill(Long tripBillId) {
        this.tripBillId = tripBillId;
    }

    public Long getTripBillId() {
        return tripBillId;
    }

    public void setTripbillid(Long tripBillId) {
        this.tripBillId = tripBillId;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BusinessTrip getBusinessTripBustripId() {
        return businessTripBusTripId;
    }

    public void setBusinessTripBustripid(BusinessTrip businessTripBusTripId) {
        this.businessTripBusTripId = businessTripBusTripId;
    }

    @XmlTransient
    public List<Bill> getBillList() {
        return billList;
    }

    public void setBillList(List<Bill> billList) {
        this.billList = billList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tripBillId != null ? tripBillId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TripBill)) {
            return false;
        }
        TripBill other = (TripBill) object;
        if ((this.tripBillId == null && other.tripBillId != null) || (this.tripBillId != null && !this.tripBillId.equals(other.tripBillId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domen.TripBill[ tripBillId=" + tripBillId + " ]";
    }
    
}
