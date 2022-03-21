package com.user.user.model;
import java.sql.Timestamp;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Data
@Entity
@Table(name = "USER_STOCK_BALANCE")
public class UserStockBalance {

    @Column(name = "STOCK_SYMBOL")
    private String stockSymbol;

    @Column(name = "STOCK_NAME")
    private String stockName;
    
    @Column(name = "VOLUME")
    private Integer volume;

    @Column(name = "CREATED_ON")
    private Timestamp createdOn;
    
    @Column(name = "UPDATED_ON")
    private Timestamp updatedOn;

    @ManyToOne
    @JoinColumn(name = "ID_USER")
    @JsonManagedReference
    private User user;
    
}
