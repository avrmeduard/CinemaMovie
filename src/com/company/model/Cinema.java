package com.company.model;

import java.time.LocalDate;
import java.util.List;

public class Cinema {


//    public static final int IN_THEATRE = 28;
//    public static final int EXTRA_DAYS = 7;
//

    private List<Movie> movies;

    public Cinema() {
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

}
