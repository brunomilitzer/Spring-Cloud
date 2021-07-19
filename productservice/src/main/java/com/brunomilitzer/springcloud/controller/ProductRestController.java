package com.brunomilitzer.springcloud.controller;

import com.brunomilitzer.springcloud.dto.Coupon;
import com.brunomilitzer.springcloud.entities.Product;
import com.brunomilitzer.springcloud.repository.ProductRepository;
import com.brunomilitzer.springcloud.restclients.CouponClient;
import io.github.resilience4j.retry.annotation.Retry;
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

    @Autowired
    private CouponClient couponClient;

    @RequestMapping( value = "/products", method = RequestMethod.POST )
    @Retry( name = "product-api", fallbackMethod = "handleError" )
    public Product create( @RequestBody final Product product ) {

        final Coupon coupon = this.couponClient.getCoupon( product.getCouponCode() );
        product.setPrice( product.getPrice().subtract( coupon.getDiscount() ) );

        return this.productRepository.save( product );
    }

    public Product handleError( @RequestBody final Product product, final Exception exception ) {

        System.out.println( "Inside Handle Error" + exception.getMessage() );

        return product;
    }

}
