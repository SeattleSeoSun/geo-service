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
public class CategoryService {

    private final static String FORMAT_JSON = "json";
    private final static String CATEGORY_GET_ALL = "category.getAll";

    private final WikiMapiaClient wikiMapiaClient;
    private final CategoryRepository categoryRepository;
    private final ObjectMapper objectMapper;

    public String findAll(String name) {
        return wikiMapiaClient.getCategories(CATEGORY_GET_ALL, name, FORMAT_JSON);
    }

    public String findByID(Long id) throws JsonProcessingException {
        var categoryJson = wikiMapiaClient.getCategoryById("category.getById", id, FORMAT_JSON);

        var category = objectMapper.readValue(categoryJson, CategoryWrapper.class)
                                   .getCategory();
        categoryRepository.save(category);

        return categoryJson;
    }
}
