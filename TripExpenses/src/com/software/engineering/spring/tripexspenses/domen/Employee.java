package com.software.engineering.spring.tripexspenses.domen;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author stefan.vasic
 */
@Entity
@Table(name = "EMPLOYEES")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "Employees.findAll", query = "SELECT e FROM Employees e")
<<<<<<< HEAD
//    , @NamedQuery(name = "Employees.findByEmployeeid", query = "SELECT e FROM Employees e WHERE e.employeeid = :employeeid")
//    , @NamedQuery(name = "Employees.findByFullname", query = "SELECT e FROM Employees e WHERE e.fullname = :fullname")
//    , @NamedQuery(name = "Employees.findByEmail", query = "SELECT e FROM Employees e WHERE e.email = :email")
//    , @NamedQuery(name = "Employees.findByPersidnum", query = "SELECT e FROM Employees e WHERE e.persidnum = :persidnum")
//    , @NamedQuery(name = "Employees.findByPassnum", query = "SELECT e FROM Employees e WHERE e.passnum = :passnum")
//    , @NamedQuery(name = "Employees.findByHaslicence", query = "SELECT e FROM Employees e WHERE e.haslicence = :haslicence")})
=======
//    , @NamedQuery(name = "Employees.findByEmployeeid", query = "SELECT e FROM Employees e WHERE e.employeeid = :employeeId")
//    , @NamedQuery(name = "Employees.findByFullname", query = "SELECT e FROM Employees e WHERE e.fullname = :fullName")
//    , @NamedQuery(name = "Employees.findByEmail", query = "SELECT e FROM Employees e WHERE e.email = :email")
//    , @NamedQuery(name = "Employees.findByPersidnum", query = "SELECT e FROM Employees e WHERE e.persidnum = :persIdNum")
//    , @NamedQuery(name = "Employees.findByPassnum", query = "SELECT e FROM Employees e WHERE e.passnum = :passNum")
//    , @NamedQuery(name = "Employees.findByHaslicence", query = "SELECT e FROM Employees e WHERE e.haslicence = :hasLicence")})
>>>>>>> branch 'master' of https://github.com/bogaroskidejan/tripexpenses.git
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "EMPLOYEEID")
    private Long employeeId;
    @Size(max = 40)
    @Column(name = "FULLNAME")
    private String fullName;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 40)
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PERSIDNUM")
    private Long persIdNum;
    @Size(max = 15)
    @Column(name = "PASSNUM")
    private String passNum;
    @Column(name = "HASLICENCE")
<<<<<<< HEAD
    private BigInteger haslicence;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employeesEmployeeid")
    private List<User> usersList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employeesEmployeeid")
    private List<BusinessTrip> businesstripsList;
=======
    private Long hasLicence;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employeesEmployeeid")
//    private List<User> usersList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employeesEmployeeid")
//    private List<BusinessTrip> businesstripsList;
>>>>>>> branch 'master' of https://github.com/bogaroskidejan/tripexpenses.git

    public Employee() {
    }

<<<<<<< HEAD
    public Employee(BigDecimal employeeid) {
        this.employeeid = employeeid;
=======
    public Employee(Long employeeId) {
        this.employeeId = employeeId;
>>>>>>> branch 'master' of https://github.com/bogaroskidejan/tripexpenses.git
    }

    public Long getEmployeeid() {
        return employeeId;
    }

    public void setEmployeeid(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFullname() {
        return fullName;
    }

    public void setFullname(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPersidnum() {
        return persIdNum;
    }

    public void setPersidnum(Long persIdNum) {
        this.persIdNum = persIdNum;
    }

    public String getPassnum() {
        return passNum;
    }

    public void setPassnum(String passNum) {
        this.passNum = passNum;
    }

    public Long getHaslicence() {
        return hasLicence;
    }

    public void setHaslicence(Long hasLicence) {
        this.hasLicence = hasLicence;
    }

<<<<<<< HEAD
    @XmlTransient
    public List<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<User> usersList) {
        this.usersList = usersList;
    }

    @XmlTransient
    public List<BusinessTrip> getBusinesstripsList() {
        return businesstripsList;
    }

    public void setBusinesstripsList(List<BusinessTrip> businesstripsList) {
        this.businesstripsList = businesstripsList;
    }
=======
//    @XmlTransient
//    public List<User> getUsersList() {
//        return usersList;
//    }
//
//    public void setUsersList(List<User> usersList) {
//        this.usersList = usersList;
//    }
//
//    @XmlTransient
//    public List<BusinessTrip> getBusinesstripsList() {
//        return businesstripsList;
//    }
//
//    public void setBusinesstripsList(List<BusinessTrip> businesstripsList) {
//        this.businesstripsList = businesstripsList;
//    }
>>>>>>> branch 'master' of https://github.com/bogaroskidejan/tripexpenses.git

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeeId != null ? employeeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
<<<<<<< HEAD
        if ((this.employeeid == null && other.employeeid != null) || (this.employeeid != null && !this.employeeid.equals(other.employeeid))) {
=======
        if ((this.employeeId == null && other.employeeId != null) || (this.employeeId != null && !this.employeeId.equals(other.employeeId))) {
>>>>>>> branch 'master' of https://github.com/bogaroskidejan/tripexpenses.git
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domen.Employee[ employeeId=" + employeeId + " ]";
    }
    
}
