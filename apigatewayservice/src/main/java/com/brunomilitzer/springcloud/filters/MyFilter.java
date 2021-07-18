package com.brunomilitzer.springcloud.filters;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class MyFilter implements GlobalFilter {

    @Override
    public Mono<Void> filter( final ServerWebExchange exchange, final GatewayFilterChain chain ) {

        System.out.println( "Pre Processing Logic Goes Here " + exchange.getRequest() );

        return chain.filter( exchange ).then( Mono.fromRunnable( () -> {
            System.out.println( "Post Processing Logic Goes Here " + exchange.getResponse() );
        } ) );
    }

}
