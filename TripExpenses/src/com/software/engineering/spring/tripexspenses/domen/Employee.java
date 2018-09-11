//package com.software.engineering.spring.tripexspenses.domen;
//
//import java.io.Serializable;
//import java.util.List;
//
//import javax.persistence.*;
//import javax.validation.constraints.*;
//import javax.xml.bind.annotation.XmlRootElement;
//import javax.xml.bind.annotation.XmlTransient;
//
//@Entity
//@Table(name = "EMPLOYEES")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "Employees.findAll", query = "SELECT e FROM Employees e")
//    , @NamedQuery(name = "Employees.findByemployeeId", query = "SELECT e FROM Employees e WHERE e.employeeId = :employeeId")
//    , @NamedQuery(name = "Employees.findByfullName", query = "SELECT e FROM Employees e WHERE e.fullName = :fullName")
//    , @NamedQuery(name = "Employees.findByEmail", query = "SELECT e FROM Employees e WHERE e.email = :email")
//    , @NamedQuery(name = "Employees.findBypersIdNumber", query = "SELECT e FROM Employees e WHERE e.persIdNumber = :persIdNumber")
//    , @NamedQuery(name = "Employees.findBypassportNumber", query = "SELECT e FROM Employees e WHERE e.passportNumber = :passportNumber")
//    , @NamedQuery(name = "Employees.findByhasLicence", query = "SELECT e FROM Employees e WHERE e.hasLicence = :hasLicence")})
//public class Employee implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
//    @Id
//    @Basic(optional = false)
//    @NotNull
//    @Column(name = "employeeId")
//    private long employeeId;
//    @Size(max = 40)
//    @Column(name = "fullName")
//    private String fullName;
//    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
//    @Size(max = 40)
//    @Column(name = "EMAIL")
//    private String email;
//    @Column(name = "persIdNumber")
//    private long persIdNumber;
//    @Size(max = 15)
//    @Column(name = "passportNumber")
//    private String passportNumber;
//    @Column(name = "hasLicence")
//    private Character hasLicence;
////    @JoinColumn(name = "user_USERNAME", referencedColumnName = "USERNAME")
////    @OneToOne(optional = false)
////    private User userUsername;
////    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employeesemployeeId")
////    private List<User> userList;
////    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employeesemployeeId")
////    private List<BusinessTrip> BusinessTripList;
//
//    public Employee() {
//    }
//
//    public Employee(long employeeId) {
//        this.employeeId = employeeId;
//    }
//
//    public long getEmployeeId() {
//        return employeeId;
//    }
//
//    public void setEmployeeId(long employeeId) {
//        this.employeeId = employeeId;
//    }
//
//    public String getFullName() {
//        return fullName;
//    }
//
//    public void setFullName(String fullName) {
//        this.fullName = fullName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Long getPersIdNumber() {
//        return persIdNumber;
//    }
//
//    public void setPersIdNumber(Long persIdNumber) {
//        this.persIdNumber = persIdNumber;
//    }
//
//    public String getPassportNumber() {
//        return passportNumber;
//    }
//
//    public void setPassportNumber(String passportNumber) {
//        this.passportNumber = passportNumber;
//    }
//
//    public Character getHasLicence() {
//        return hasLicence;
//    }
//
//    public void setHasLicence(Character hasLicence) {
//        this.hasLicence = hasLicence;
//    }
//
////    public User getuserUsername() {
////        return userUsername;
////    }
////
////    public void setUserUsername(User userUsername) {
////        this.userUsername = userUsername;
////    }
//
////    @XmlTransient
////    public List<User> getUserList() {
////        return userList;
////    }
////
////    public void setUserList(List<User> userList) {
////        this.userList = userList;
////    }
////
////    @XmlTransient
////    public List<BusinessTrip> getBusinessTripList() {
////        return BusinessTripList;
////    }
////
////    public void setBusinessTripList(List<BusinessTrip> BusinessTripList) {
////        this.BusinessTripList = BusinessTripList;
////    }
//
//
//
//    @Override
//    public String toString() {
//        return "domen.Employee[ employeeId=" + employeeId + " ]";
//    }
//    
//}