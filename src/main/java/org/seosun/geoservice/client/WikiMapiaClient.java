package org.seosun.geoservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "wikimapia", url = "${wikimapia.url}", configuration = WikiMapiaAuth.class)
public interface WikiMapiaClient {

    @GetMapping
    String getGeo(@RequestParam String function, @RequestParam String format);
}
