package org.seosun.geoservice.controller;

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
//
//    @GetMapping
//    public ResponseEntity<GeoResponse> findByCategory(@RequestParam String category) {
//        return geoFacade.findByCategory(category);
//    }
//
//    @GetMapping
//    public ResponseEntity<GeoResponse> findByCategories(@RequestParam List<String> categories) {
//        return geoFacade.findByCategories(categories);
//    }
//
//    @GetMapping
//    public ResponseEntity<GeoResponse> findByCategoriesAndSurface(@RequestParam List<String> categories,
//                                                        @RequestBody Surface surface) {
//        return geoFacade.findByCategoriesAndSurface(categories, surface);
//    }
}
