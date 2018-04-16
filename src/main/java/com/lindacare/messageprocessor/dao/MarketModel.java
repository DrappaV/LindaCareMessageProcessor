package com.lindacare.messageprocessor.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class MarketModel implements Serializable{

    @Id @GeneratedValue
    private Long id;
    private String  userId;
    private String  currencyFrom;
    private String  currencyTo;
    private Float  amountSell;
    private Float  amountBuy;
    private Float  rate;
    private Date timePlaced;
    private String  originatingCountry;

    public MarketModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public void setCurrencyFrom(String currencyFrom) {
        this.currencyFrom = currencyFrom;
    }

    public String getCurrencyTo() {
        return currencyTo;
    }

    public void setCurrencyTo(String currencyTo) {
        this.currencyTo = currencyTo;
    }

    public Float getAmountSell() {
        return amountSell;
    }

    public void setAmountSell(Float amountSell) {
        this.amountSell = amountSell;
    }

    public Float getAmountBuy() {
        return amountBuy;
    }

    public void setAmountBuy(Float amountBuy) {
        this.amountBuy = amountBuy;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public Date getTimePlaced() {
        return timePlaced;
    }

    public void setTimePlaced(Date timePlaced) {
        this.timePlaced = timePlaced;
    }

    public String getOriginatingCountry() {
        return originatingCountry;
    }

    public void setOriginatingCountry(String originatingCountry) {
        this.originatingCountry = originatingCountry;
    }

    @Override
    public String toString() {
        return "MarketModel{" +
                "userId='" + userId + '\'' +
                ", currencyFrom='" + currencyFrom + '\'' +
                ", currencyTo='" + currencyTo + '\'' +
                ", amountSell=" + amountSell +
                ", amountBuy=" + amountBuy +
                ", rate=" + rate +
                ", timePlaced=" + timePlaced +
                ", originatingCountry='" + originatingCountry + '\'' +
                '}';
    }
}
