package org.seosun.geoservice.controller;

import org.seosun.geoservice.service.ObjectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/geo/object")
@RequiredArgsConstructor
public class ObjectController {

    private final ObjectService objectService;

    @GetMapping("/bySurface")
    public String findAllBySurface(@RequestParam String lonMin,
                                   @RequestParam String latMin,
                                   @RequestParam String lonMax,
                                   @RequestParam String latMax) {
        return objectService.findAllBySurface(lonMin, latMin, lonMax, latMax);
    }
}
