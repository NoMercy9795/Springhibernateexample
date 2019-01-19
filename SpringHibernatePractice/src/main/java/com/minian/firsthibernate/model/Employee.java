package com.minian.firsthibernate.model;

import javax.persistence.*;
import java.sql.Timestamp;

import java.util.Set;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @Column(name="eId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eId;
    @Column(name="eName")
    private String eName;
    @Column(name="eAddr")
    private String eAddr;
    @Column(name="eNumber")
    private int eNumber;
    @Column(name="createdAt")
    private Timestamp createdAt;
    @Column(name="updatedAt")
    private Timestamp updatedAt;

//    @OneToMany(mappedBy = "employee")
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name ="person_id")
    private Set<Phone> phone;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="address_id")
    private Address address;

    public Employee() {
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public void seteAddr(String eAddr) {
        this.eAddr = eAddr;
    }

    public void seteNumber(int eNumber) {
        this.eNumber = eNumber;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int geteId() {
        return eId;
    }

    public String geteName() {
        return eName;
    }

    public String geteAddr() {
        return eAddr;
    }

    public int geteNumber() {
        return eNumber;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public Set<Phone> getPhone() {
        return phone;
    }

    public void setPhone(Set<Phone> phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", eAddr='" + eAddr + '\'' +
                ", eNumber=" + eNumber +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", phone=" + phone +
                ", address=" + address +
                '}';
    }
}