package com.user.user.model;
import java.sql.Timestamp;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Data
@Entity
@Table(name = "ORDER")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "VOLUME")
    private Long volume;

    @Column(name = "VOLUME_REMAINING")
    private Long volumeRemaining;

    @Column(name = "PRICE")
    private Double price;

    @Column(name = "TYPE")
    private Integer type;

    @Column(name = "STOCK_SYMBOL")
    private String stockSymbol;

    @Column(name = "STOCK_NAME")
    private String stockName;

    @Column(name = "STATUS")
    private Boolean status;

    @Column(name = "CREATED_ON")
    private Timestamp createdOn;
    
    @Column(name = "UPDATED_ON")
    private Timestamp updatedOn;

    @ManyToOne
    @JoinColumn(name = "ID_USER")
    @JsonManagedReference
    private User user;
    
    
}
