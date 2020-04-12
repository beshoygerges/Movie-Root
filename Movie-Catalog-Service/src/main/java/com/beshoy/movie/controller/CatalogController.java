package com.beshoy.movie.controller;

import com.beshoy.movie.model.Catalog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/Catalog")
public class CatalogController {

    @GetMapping("/{userId}")
    public List<Catalog> getAll(@PathVariable String userId) {
        return Arrays.asList(new Catalog("Drama", "drama catalog", 9.6));
    }
}
