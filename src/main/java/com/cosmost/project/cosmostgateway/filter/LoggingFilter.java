package com.cosmost.project.cosmostgateway.filter;

import lombok.Data;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.OrderedGatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.core.Ordered;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import reactor.core.publisher.Mono;

public class LoggingFilter extends AbstractGatewayFilterFactory<LoggingFilter.Config> {

    GatewayFilter filter = new OrderedGatewayFilter(((exchange, chain) -> {
        ServerHttpRequest request = exchange.getRequest();
        ServerHttpResponse response = exchange.getResponse();

        if(config.isPre)

        return chain.filter(exchange).then(Mono.fromRunnable(() -> {

        }));

    }, Ordered.HIGHEST_PRECEDENCE);

    @Override
    public GatewayFilter apply(LoggingFilter.Config config) {
        return filter;
    }
}
    @Data
    public static class Config {
        private String baseMessage;
        private boolean preLogger;
        private boolean postLogger;
    }

}
