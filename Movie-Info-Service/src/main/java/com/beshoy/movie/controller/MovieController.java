package com.beshoy.movie.controller;

import com.beshoy.movie.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Movies")
public class MovieController {

    @GetMapping("/{movieId}")
    public Movie getMovieById(@PathVariable String movieId) {
        return Movie.builder()
                .setId(movieId)
                .setName("Gaheem fi elhend")
                .build();
    }
}
