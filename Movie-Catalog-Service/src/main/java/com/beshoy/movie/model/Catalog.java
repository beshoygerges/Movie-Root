package com.beshoy.movie.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@AllArgsConstructor
public class Catalog implements Serializable {
    private String name;
    private String description;
    private double rating;
}
