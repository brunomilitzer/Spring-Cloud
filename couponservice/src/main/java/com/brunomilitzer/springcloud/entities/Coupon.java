package com.brunomilitzer.springcloud.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class Coupon implements Serializable {

    private static final long serialVersionUID = -4360847879541851486L;

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    private String code;

    private BigDecimal discount;

    private String expDate;

    public Long getId() {

        return this.id;
    }

    public void setId( final Long id ) {

        this.id = id;
    }

    public String getCode() {

        return this.code;
    }

    public void setCode( final String code ) {

        this.code = code;
    }

    public BigDecimal getDiscount() {

        return this.discount;
    }

    public void setDiscount( final BigDecimal discount ) {

        this.discount = discount;
    }

    public String getExpDate() {

        return this.expDate;
    }

    public void setExpDate( final String expDate ) {

        this.expDate = expDate;
    }

}
