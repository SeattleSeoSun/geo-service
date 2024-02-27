package org.seosun.geoservice.client;

import org.springframework.beans.factory.annotation.Value;

import feign.RequestInterceptor;
import feign.RequestTemplate;

public class WikiMapiaAuth implements RequestInterceptor {

    private final String key;

    public WikiMapiaAuth(@Value("${wikimapia.key}") String key) {
        this.key = key;
    }

    @Override
    public void apply(RequestTemplate template) {
        template.query("key", key);
    }
}
