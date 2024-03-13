package org.seosun.geoservice.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.seosun.geoservice.client.WikiMapiaClient;
import org.seosun.geoservice.repository.CategoryRepository;
import org.seosun.geoservice.wrapper.CategoryWrapper;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GeoService {

    private final static String FORMAT_JSON = "json";
    private final static String CATEGORY_GET_ALL = "category.getAll";

    private final WikiMapiaClient wikiMapiaClient;
    private final CategoryRepository categoryRepository;
    private final ObjectMapper objectMapper;

    public String findAll() {
        return wikiMapiaClient.getGeo(CATEGORY_GET_ALL, FORMAT_JSON);
    }

    public String findAllBySurface(String lonMin, String latMin, String lonMax, String latMax) {
        return wikiMapiaClient.getGeo("box",
                                      "bbox",
                                      lonMin,
                                      latMin,
                                      lonMax,
                                      latMax,
                                      FORMAT_JSON);
    }

    public String findByID(Long id) throws JsonProcessingException {
        var categoryJson = wikiMapiaClient.getGeoById("category.getById", id, FORMAT_JSON);

        var category = objectMapper.readValue(categoryJson, CategoryWrapper.class)
                                   .getCategory();
        categoryRepository.save(category);

        return categoryJson;
    }

    public String findAllByName(String name) {
        return wikiMapiaClient.getGeoByName(CATEGORY_GET_ALL, name, FORMAT_JSON);
    }
}
