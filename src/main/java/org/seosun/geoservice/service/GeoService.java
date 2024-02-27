package org.seosun.geoservice.service;

import org.seosun.geoservice.client.WikiMapiaClient;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GeoService {

    private final WikiMapiaClient wikiMapiaClient;

    public String findAll() {
        var t = wikiMapiaClient.getGeo("category.getAll", "json");
        System.out.println(t);
       return t;
    }

}
