package com.monopolardesigns.trackey.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Transactions {
    @Id
    @GeneratedValue
    private Long transactionId;
    private Date date;

    @ManyToOne
    @JoinColumn(name="stockNo")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employee;

    public Transactions() {
        this.date = new Date();
    }

}
