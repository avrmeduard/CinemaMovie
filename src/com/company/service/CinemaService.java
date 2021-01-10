package com.company.service;

import com.company.model.Movie;

import java.time.LocalDate;
import java.util.List;

public interface CinemaService {

    void removeMovie();

    void removeMovie(Movie movie);

    void addMovie(Movie movie);

    void movieCurrentWeek();

    void movieCurrentMonth();
}
