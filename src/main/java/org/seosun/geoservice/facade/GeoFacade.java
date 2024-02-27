package org.seosun.geoservice.facade;

import org.seosun.geoservice.controller.model.GeoResponse;
import org.seosun.geoservice.service.GeoService;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GeoFacade {

    private final GeoService geoService;

    public String findAll() {
        return geoService.findAll();
    }
}
