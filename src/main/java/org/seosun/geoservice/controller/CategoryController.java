package org.seosun.geoservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;

import org.seosun.geoservice.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/geo/category")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping
    public String findAll(@RequestParam(required = false) String name) {
        return categoryService.findAll(name);
    }

    @GetMapping("/{id}")
    public String findByID(@PathVariable Long id) throws JsonProcessingException {
        return categoryService.findByID(id);
    }
}
