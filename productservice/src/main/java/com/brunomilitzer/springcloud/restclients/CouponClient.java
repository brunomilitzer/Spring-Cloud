package com.brunomilitzer.springcloud.restclients;

import com.brunomilitzer.springcloud.dto.Coupon;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component( value = "couponClient" )
@FeignClient( "COUPON-SERVICE" )
public interface CouponClient {

    @GetMapping( value = "/couponapi/coupons/{code}" )
    Coupon getCoupon( @PathVariable( "code" ) String code );

}
