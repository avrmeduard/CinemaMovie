package com.company.service;

import com.company.model.Cinema;
import com.company.model.Movie;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CinemaProduction implements CinemaService {

//    LocalDate currentDate = LocalDate.now();

    public List<Movie> movies = new ArrayList<>();


    private String currentDate() {
        LocalDate myLocal = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return myLocal.format(dtf);
    }


    @Override
    public void removeMovie() {
        // remove movie from movieList if movieReleaseDate equal to currentDate + 1 day
        movies.removeIf(movies -> movies.getInCinema().equals(currentDate()));

        System.out.println(currentDate() + " current date");

        for (Movie movie : movies) {
            System.out.println(movie.getInCinema());

        }
    }

    @Override
    public void removeMovie(Movie movie) {
        movies.remove(movie);
    }

    @Override
    public void addMovie(Movie movie) {
        movies.add(movie);
    }


    @Override
    public void movieCurrentWeek() {

    }

    @Override
    public void movieCurrentMonth() {

    }
}
