package com.minian.firsthibernate.model;

import javax.persistence.Entity;
import javax.persistence.* ;
import java.sql.Timestamp;

@Entity
@Table(name="address")
public class Address
{   @Id
    @Column(name="id")
    private long id;
    @Column(name = "createdat")
//    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp createdAt;
    @Column(name = "updatedat")
//    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp updatedAt;
    @Column(name = "city")
    private String city;
//    @OneToOne(mappedBy ="employee")
//    private Employee employee;
    @Column(name="streetno")
    private int streetNo;



    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", city='" + city + '\'' +

                ", streetNo=" + streetNo +
                '}';
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    public Address() {
    }



}
