package org.seosun.geoservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;

import org.seosun.geoservice.service.GeoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/geo")
@RequiredArgsConstructor
public class GeoController {

    private final GeoService geoService;

    @GetMapping
    public String findAll() {
        return geoService.findAll();
    }

    @GetMapping("/bySurface")
    public String findAllBySurface(@RequestParam String lonMin,
                                   @RequestParam String latMin,
                                   @RequestParam String lonMax,
                                   @RequestParam String latMax) {
        return geoService.findAllBySurface(lonMin, latMin, lonMax, latMax);
    }

    @GetMapping ("/byID")
    public String findByID(@RequestParam Long id) throws JsonProcessingException {
        return geoService.findByID(id);
    }

    @GetMapping("/byName")
    public String findAllByName(@RequestParam String name) {
        return geoService.findAllByName(name);
    }
}
