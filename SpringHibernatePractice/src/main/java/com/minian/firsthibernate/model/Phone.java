package com.minian.firsthibernate.model;

import javax.persistence.*;

@Entity
@Table(name="phone")
public class Phone {
    @Column(name="number")
    private int number;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;


    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", id=" + id +
//                ", employee=" + employee +
                '}';
    }

//    public Employee getEmployee() {
//        return employee;
//    }
//
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "person_id")
//     private Employee employee;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Phone() {
    }
}
