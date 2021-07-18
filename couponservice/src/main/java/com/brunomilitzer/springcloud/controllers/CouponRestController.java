package com.brunomilitzer.springcloud.controllers;

import com.brunomilitzer.springcloud.entities.Coupon;
import com.brunomilitzer.springcloud.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/couponapi" )
public class CouponRestController {

    @Autowired
    private CouponRepository couponRepository;

    @RequestMapping( value = "/coupons", method = RequestMethod.POST )
    public Coupon create( @RequestBody final Coupon coupon ) {

        return this.couponRepository.save( coupon );
    }

    @RequestMapping( value = "/coupons/{code}", method = RequestMethod.GET )
    public Coupon getCoupon( @PathVariable( "code" ) final String code ) {

        return this.couponRepository.findByCode( code );
    }

}
