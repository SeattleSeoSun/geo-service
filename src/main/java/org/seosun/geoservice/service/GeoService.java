package org.seosun.geoservice.service;

import org.seosun.geoservice.client.WikiMapiaClient;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GeoService {

    private final WikiMapiaClient wikiMapiaClient;

    public String findAll() {
        return wikiMapiaClient.getGeo("category.getAll", "json");
    }

    public String findAllBySurface(String lonMin, String latMin, String lonMax, String latMax) {
        return wikiMapiaClient.getGeo("box",
                                      "bbox",
                                      lonMin,
                                      latMin,
                                      lonMax,
                                      latMax,
                                      "json");
    }

}
