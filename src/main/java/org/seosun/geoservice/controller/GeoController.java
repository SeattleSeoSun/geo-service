package org.seosun.geoservice.controller;

import java.util.List;

import org.seosun.geoservice.controller.model.GeoResponse;
import org.seosun.geoservice.controller.model.Surface;
import org.seosun.geoservice.facade.GeoFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/geo")
@RequiredArgsConstructor
public class GeoController {

    private final GeoFacade geoFacade;

    @GetMapping
    public String findAll() {
        return geoFacade.findAll();
    }

//    @GetMapping
//    public ResponseEntity<GeoResponse> findAllBySurface(@RequestBody Surface surface) {
//        return geoFacade.findAllBySurface(surface);
//    }
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
