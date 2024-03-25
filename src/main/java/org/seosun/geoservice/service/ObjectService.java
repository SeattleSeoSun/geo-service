package org.seosun.geoservice.service;

import org.seosun.geoservice.client.WikiMapiaClient;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ObjectService {

    private final static String FORMAT_JSON = "json";

    private final WikiMapiaClient wikiMapiaClient;

    public String findAllBySurface(String lonMin, String latMin, String lonMax, String latMax) {
        return wikiMapiaClient.getGeo("box",
                                      "bbox",
                                      lonMin,
                                      latMin,
                                      lonMax,
                                      latMax,
                                      FORMAT_JSON);
    }
}
