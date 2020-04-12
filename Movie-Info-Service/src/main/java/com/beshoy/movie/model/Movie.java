package com.beshoy.movie.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder(setterPrefix = "set")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Movie implements Serializable {
    private String id;
    private String name;
}
