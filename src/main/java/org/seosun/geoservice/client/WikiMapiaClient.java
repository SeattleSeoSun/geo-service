package org.seosun.geoservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "wikimapia", url = "${wikimapia.url}", configuration = WikiMapiaAuth.class)
public interface WikiMapiaClient {

    @GetMapping
    String getCategories(@RequestParam String function, @RequestParam String name, @RequestParam String format);

    @GetMapping
    String getCategoryById(@RequestParam String function,
                           @RequestParam Long id,
                           @RequestParam String format);

    @GetMapping
    String getGeo(@RequestParam String function,
                  @RequestParam String coordsby,
                  @RequestParam String lon_min,
                  @RequestParam String lat_min,
                  @RequestParam String lon_max,
                  @RequestParam String lat_max,
                  @RequestParam String format);
}
