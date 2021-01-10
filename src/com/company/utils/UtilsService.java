package com.company.utils;


import com.company.Main;
import com.company.model.Genre;
import com.company.model.Movie;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class UtilsService {

    Scanner sc = new Scanner(System.in);
    List<Movie> movies;
    public static Movie selectedMovie;

    HashMap<Integer, Movie> movieHashMap = new HashMap<>();

    {
        AtomicInteger count = new AtomicInteger();
        for (Movie movie : Main.cinemaProduction.movies) {
            movieHashMap.put(count.incrementAndGet(), movie);
        }
    }

    public void compare() {

    }


    public void printMovie() {
        Main.cinemaProduction.movies.forEach(System.out::print);
    }

    public void show2DMovie() {
        movies = new ArrayList<>();

        for (Movie movie : Main.cinemaProduction.movies) {
            if (!movie.isIs3D()) {
                movies.add(movie);
            }
        }

        if (returnList(movies).size() > 0) {
            for (Movie movie : movies) {
                System.out.println(movie.getTitle());
            }
        } else {
            System.out.println("There is no 2D movie for tonight");
        }
    }

    public void show3DMovie() {
        movies = new ArrayList<>();

        for (Movie movie : Main.cinemaProduction.movies) {
            if (movie.isIs3D()) {
                movies.add(movie);
            }
        }
        if (movies.size() > 0) {
            for (Movie movie : movies) {
                System.out.println(movie.getTitle());
            }
        } else {
            System.out.println("There is no 3D movie for tonight");
        }
    }

    public void showMovieByGenre() {
        List<Genre> genres = new ArrayList<>(Arrays.asList(Genre.values()));
        Map<Genre, List<String>> map = new HashMap<>();
        List<String> movieList;

        for (Genre genre : genres) {
            movieList = new ArrayList<>();


            for (Movie m : Main.cinemaProduction.movies) {
                if (m.getGenre().contains(genre)) {
                    movieList.add(m.getTitle());
                }
            }

            map.put(genre, movieList);
        }
        System.out.println("\n");
        map.forEach((Genre, String) -> System.out.println(Genre + " - " + String));
    }

    public void printMovieHashMap() {
        movieHashMap.forEach((Integer, Movie) -> {
            System.out.println(Integer + ". " + Movie.getTitle());
        });
    }

    public void buyATicket() {
        printMovieHashMap();
        System.out.print("\nSelect your movie : ");

        try {
            selectedMovie = movieHashMap.get(sc.nextInt());
            System.out.println("\nYou've selected " + selectedMovie.getTitle() +
                    " available in " + (selectedMovie.isIs3D() ? "3D" : "2D"));

        } catch (NullPointerException e) {
            System.out.println("Index doesn't exist");
            buyATicket();
        }


//        String movieChosed = inputCheck();

    }

    public List<Movie> returnList(List<Movie> list) {
        return list.size() > 0 ? list : null;
    }


}
