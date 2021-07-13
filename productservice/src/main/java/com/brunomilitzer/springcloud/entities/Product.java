package com.brunomilitzer.springcloud.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class Product implements Serializable {

    private static final long serialVersionUID = -1864584326564666844L;

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    private String name;

    private String description;

    private BigDecimal price;

    public Long getId() {

        return this.id;
    }

    public void setId( final Long id ) {

        this.id = id;
    }

    public String getName() {

        return this.name;
    }

    public void setName( final String name ) {

        this.name = name;
    }

    public String getDescription() {

        return this.description;
    }

    public void setDescription( final String description ) {

        this.description = description;
    }

    public BigDecimal getPrice() {

        return this.price;
    }

    public void setPrice( final BigDecimal price ) {

        this.price = price;
    }

}
