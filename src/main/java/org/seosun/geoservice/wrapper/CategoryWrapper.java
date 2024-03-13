package org.seosun.geoservice.wrapper;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.seosun.geoservice.entity.Category;

import lombok.Data;

@Data
public class CategoryWrapper {

    @JsonProperty("category")
    private Category category;
}
