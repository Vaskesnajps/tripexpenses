package com.software.engineering.spring.tripexspenses.domen;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author stefan.vasic
 */
@Entity
@Table(name = "BUSINESSTRIPS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Businesstrips.findAll", query = "SELECT b FROM Businesstrips b")
    , @NamedQuery(name = "Businesstrips.findByBustripid", query = "SELECT b FROM Businesstrips b WHERE b.bustripid = :bustripid")
    , @NamedQuery(name = "Businesstrips.findByFromdate", query = "SELECT b FROM Businesstrips b WHERE b.fromdate = :fromdate")
    , @NamedQuery(name = "Businesstrips.findByTodate", query = "SELECT b FROM Businesstrips b WHERE b.todate = :todate")
    , @NamedQuery(name = "Businesstrips.findByDayscount", query = "SELECT b FROM Businesstrips b WHERE b.dayscount = :dayscount")
    , @NamedQuery(name = "Businesstrips.findByTriptotallow", query = "SELECT b FROM Businesstrips b WHERE b.triptotallow = :triptotallow")})
public class Businesstrips implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "BUSTRIPID")
    private BigDecimal bustripid;
    @Column(name = "FROMDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromdate;
    @Column(name = "TODATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date todate;
    @Column(name = "DAYSCOUNT")
    private BigInteger dayscount;
    @Column(name = "TRIPTOTALLOW")
    private BigInteger triptotallow;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "businesstripsBustripid")
    private List<Tripbills> tripbillsList;
    @JoinColumn(name = "EMPLOYEES_EMPLOYEEID", referencedColumnName = "EMPLOYEEID")
    @ManyToOne(optional = false)
    private Employees employeesEmployeeid;
    @JoinColumn(name = "LOCATIONS_LOCID", referencedColumnName = "LOCID")
    @ManyToOne(optional = false)
    private Locations locationsLocid;

    public Businesstrips() {
    }

    public Businesstrips(BigDecimal bustripid) {
        this.bustripid = bustripid;
    }

    public BigDecimal getBustripid() {
        return bustripid;
    }

    public void setBustripid(BigDecimal bustripid) {
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

    public BigInteger getDayscount() {
        return dayscount;
    }

    public void setDayscount(BigInteger dayscount) {
        this.dayscount = dayscount;
    }

    public BigInteger getTriptotallow() {
        return triptotallow;
    }

    public void setTriptotallow(BigInteger triptotallow) {
        this.triptotallow = triptotallow;
    }

    @XmlTransient
    public List<Tripbills> getTripbillsList() {
        return tripbillsList;
    }

    public void setTripbillsList(List<Tripbills> tripbillsList) {
        this.tripbillsList = tripbillsList;
    }

    public Employees getEmployeesEmployeeid() {
        return employeesEmployeeid;
    }

    public void setEmployeesEmployeeid(Employees employeesEmployeeid) {
        this.employeesEmployeeid = employeesEmployeeid;
    }

    public Locations getLocationsLocid() {
        return locationsLocid;
    }

    public void setLocationsLocid(Locations locationsLocid) {
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
        if (!(object instanceof Businesstrips)) {
            return false;
        }
        Businesstrips other = (Businesstrips) object;
        if ((this.bustripid == null && other.bustripid != null) || (this.bustripid != null && !this.bustripid.equals(other.bustripid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domen.Businesstrips[ bustripid=" + bustripid + " ]";
    }
    
}
