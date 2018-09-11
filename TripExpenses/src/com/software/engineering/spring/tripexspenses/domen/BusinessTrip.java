package com.software.engineering.spring.tripexspenses.domen;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "BUSINESSTRIPS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Businesstrips.findAll", query = "SELECT b FROM Businesstrips b")
    , @NamedQuery(name = "Businesstrips.findBybusTripId", query = "SELECT b FROM Businesstrips b WHERE b.busTripId = :busTripId")
    , @NamedQuery(name = "Businesstrips.findByFromdate", query = "SELECT b FROM Businesstrips b WHERE b.fromDate = :fromDate")
    , @NamedQuery(name = "Businesstrips.findByTodate", query = "SELECT b FROM Businesstrips b WHERE b.toDate = :toDate")
    , @NamedQuery(name = "Businesstrips.findByDayscount", query = "SELECT b FROM Businesstrips b WHERE b.daysCount = :daysCount")
    , @NamedQuery(name = "Businesstrips.findByLocationsLocid", query = "SELECT b FROM Businesstrips b WHERE b.locationLocId = :locationLocId")
    , @NamedQuery(name = "Businesstrips.findByTriptotalallowance", query = "SELECT b FROM Businesstrips b WHERE b.tripTotalAllowance = :tripTotalAllowance")})
public class BusinessTrip implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "BUSTRIPID")
    private Long busTripId;
    @Column(name = "FROMDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "TODATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date toDate;
    @Column(name = "DAYSCOUNT")
    private Long daysCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LOCATIONS_LOCID")
    private Long locationLocId;
    @Column(name = "TRIPTOTALALLOWANCE")
    private Long tripTotalAllowance;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "businesstripsbusTripId")
    private TripBill tripBill;
    @JoinColumn(name = "EMPLOYEES_EMPLOYEEID", referencedColumnName = "EMPLOYEEID")
    @ManyToOne(optional = false)
    private Employee employeeEmployeeId;

    public BusinessTrip() {
    }

    public BusinessTrip(Long busTripId) {
        this.busTripId = busTripId;
    }

    public BusinessTrip(Long busTripId, Long locationLocId) {
        this.busTripId = busTripId;
        this.locationLocId = locationLocId;
    }

    public Long getBusTripId() {
        return busTripId;
    }

    public void setBusTripId(Long busTripId) {
        this.busTripId = busTripId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Long getDaysCount() {
        return daysCount;
    }

    public void setDaysCount(Long daysCount) {
        this.daysCount = daysCount;
    }

    public Long getLocationsLocId() {
        return locationLocId;
    }

    public void setLocationsLocId(Long locationLocId) {
        this.locationLocId = locationLocId;
    }

    public Long getTripTotalAllowance() {
        return tripTotalAllowance;
    }

    public void setTripTotalAllowance(Long tripTotalAllowance) {
        this.tripTotalAllowance = tripTotalAllowance;
    }

    public TripBill getTripBill() {
        return tripBill;
    }

    public void setTripBill(TripBill tripBill) {
        this.tripBill = tripBill;
    }

    public Employee getEmployeeEmployeeid() {
        return employeeEmployeeId;
    }

    public void setEmployeeEmployeeid(Employee employeeEmployeeId) {
        this.employeeEmployeeId = employeeEmployeeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (busTripId != null ? busTripId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BusinessTrip)) {
            return false;
        }
        BusinessTrip other = (BusinessTrip) object;
        if ((this.busTripId == null && other.busTripId != null) || (this.busTripId != null && !this.busTripId.equals(other.busTripId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domen.BusinessTrip[ busTripId=" + busTripId + " ]";
    }
    
}