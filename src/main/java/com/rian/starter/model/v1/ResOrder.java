package com.rian.starter.model.v1;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ResOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int merchant_id;
    private String no_reff;
    private Date trx_date;
    private int amount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(int merchant_id) {
        this.merchant_id = merchant_id;
    }

    public String getNo_reff() {
        return no_reff;
    }

    public void setNo_reff(String no_reff) {
        this.no_reff = no_reff;
    }

    public Date getTrx_date() {
        return trx_date;
    }

    public void setTrx_date(Date trx_date) {
        this.trx_date = trx_date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", merchant_id=" + merchant_id +
                ", no_reff='" + no_reff + '\'' +
                ", trx_date=" + trx_date +
                ", amount=" + amount +
                '}';
    }
}
