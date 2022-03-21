package com.user.user.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
@Table(name = "USER")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "DOLLAR_BALANCE")
    private String dollarBalance;

    @Column(name = "CREATED_ON")
    private Timestamp createdOn;
    
    @Column(name = "UPDATED_ON")
    private Timestamp updatedOn;

    @OneToMany(mappedBy = "user")
    @JsonBackReference
    private List<Order> orders;

    @OneToMany(mappedBy = "user")
    @JsonBackReference
    private List<UserStockBalance> userstockbalances;

}
