package com.software.engineering.spring.tripexspenses.domen;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author stefan.vasic
 */
@Entity
@Table(name = "BUSINESSTRIPS")
public class BusinessTrip implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "BUSTRIPID")
    private Long bustripid;
    
    @Column(name = "FROMDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromdate;
    
    @Column(name = "TODATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date todate;
    
    @Column(name = "DAYSCOUNT")
    private Long dayscount;
    
    @Column(name = "TRIPTOTALLOW")
    private Long triptotallow;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "businesstripsBustripid")
    private List<TripBill> tripbillList;
    
    @JoinColumn(name = "EMPLOYEES_EMPLOYEEID", referencedColumnName = "EMPLOYEEID")
    @ManyToOne(optional = false)
    private Employee employeesEmployeeid;
    
    @JoinColumn(name = "LOCATIONS_LOCID", referencedColumnName = "LOCID")
    @ManyToOne(optional = false)
    private Location locationsLocid;

    public BusinessTrip() {
    }
    public BusinessTrip(Long bustripid) {
        this.bustripid = bustripid;
    }

    public Long getBustripid() {
        return bustripid;
    }

    public void setBustripid(Long bustripid) {
        this.bustripid = bustripid;
    }

    public Date getFromdate() {
        return fromdate;
    }

    public void setFromdate(Date fromdate) {
        this.fromdate = fromdate;
    }

    public Date getTodate() {
        return todate;
    }

    public void setTodate(Date todate) {
        this.todate = todate;
    }

    public Long getDayscount() {
        return dayscount;
    }

    public void setDayscount(Long dayscount) {
        this.dayscount = dayscount;
    }

    public Long getTriptotallow() {
        return triptotallow;
    }

    public void setTriptotallow(Long triptotallow) {
        this.triptotallow = triptotallow;
    }

    @XmlTransient
    public List<TripBill> getTripbillList() {
        return tripbillList;
    }

    public void setTripbillList(List<TripBill> tripbillsList) {
        this.tripbillList = tripbillsList;
    }

    public Employee getEmployeesEmployeeid() {
        return employeesEmployeeid;
    }

    public void setEmployeesEmployeeid(Employee employeesEmployeeid) {
        this.employeesEmployeeid = employeesEmployeeid;
    }

    public Location getLocationsLocid() {
        return locationsLocid;
    }

    public void setLocationsLocid(Location locationsLocid) {
        this.locationsLocid = locationsLocid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bustripid != null ? bustripid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BusinessTrip)) {
            return false;
        }
        BusinessTrip other = (BusinessTrip) object;
        if ((this.bustripid == null && other.bustripid != null) || (this.bustripid != null && !this.bustripid.equals(other.bustripid))) {
            return false;
        }
        return true;
    }
	@Override
	public String toString() {
		return "BusinessTrip [bustripid=" + bustripid + ", fromdate=" + fromdate + ", todate=" + todate + ", dayscount="
				+ dayscount + ", triptotallow=" + triptotallow + ", " + ", tripbillList="
				+ tripbillList + "]";
	}

    
}
