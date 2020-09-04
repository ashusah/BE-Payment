package com.hackerrank.stocktrades.model;

import com.hackerrank.stocktrades.validation.StockType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class StockTrade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Column
    @StockType
    private String type;

    @NotNull
    @Column
    private Integer userId;

    @NotNull
    @Column
    private String symbol;

    @NotNull
    @Column
    private Integer shares;

    @NotNull
    @Column
    private Integer price;

    @NotNull
    @Column
    private Long timestamp;

    public StockTrade() {
    }

    public StockTrade(Integer id, String type, Integer userId, String symbol, Integer shares, Integer price, Long timestamp) {
        this.id = id;
        this.type = type;
        this.userId = userId;
        this.symbol = symbol;
        this.shares = shares;
        this.price = price;
        this.timestamp = timestamp;
    }

    public StockTrade(String type, Integer userId, String symbol, Integer shares, Integer price, Long timestamp) {
        this.type = type;
        this.userId = userId;
        this.symbol = symbol;
        this.shares = shares;
        this.price = price;
        this.timestamp = timestamp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Integer getShares() {
        return shares;
    }

    public void setShares(Integer shares) {
        this.shares = shares;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
