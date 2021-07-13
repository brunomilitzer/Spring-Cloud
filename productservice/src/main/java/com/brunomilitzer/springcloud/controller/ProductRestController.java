package com.brunomilitzer.springcloud.controller;

import com.brunomilitzer.springcloud.entities.Product;
import com.brunomilitzer.springcloud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/productapi" )
public class ProductRestController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping( value = "/products", method = RequestMethod.POST )
    public Product create( @RequestBody final Product product ) {

        return this.productRepository.save( product );
    }

}
