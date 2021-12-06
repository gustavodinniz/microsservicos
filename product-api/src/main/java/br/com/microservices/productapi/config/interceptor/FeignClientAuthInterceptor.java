package br.com.microservices.productapi.config.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;

import static br.com.microservices.productapi.config.RequestUtil.getCurrentRequest;

public class FeignClientAuthInterceptor implements RequestInterceptor {

    private static final String AUTHORIZATION = "Authorization";
    private static final String TRANSACTION_ID = "transactionid";

    @Override
    public void apply(RequestTemplate template) {
        var currentRequest = getCurrentRequest();
        template
                .header(AUTHORIZATION, currentRequest.getHeader(AUTHORIZATION))
                .header(TRANSACTION_ID, currentRequest.getHeader(TRANSACTION_ID));
    }

}
