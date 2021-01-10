package com.company.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class Movie implements Comparator<Movie> {

    private HashSet<Genre> genre;
    private CastAndCrew castAndCrews;

    private String title;
    private int duration;
    private String inCinema; // release date

    private boolean is3D;

    public Movie() {
    }

    public Movie(HashSet<Genre> genre, CastAndCrew castAndCrews, String title, int duration, String inCinema) {
        this.genre = genre;
        this.castAndCrews = castAndCrews;
        this.title = title;
        this.duration = duration;
        this.inCinema = inCinema;
        this.is3D = false;
    }

    public Movie(HashSet<Genre> genre, CastAndCrew castAndCrews, String title, int duration, String inCinema, boolean is3D) {
        this.genre = genre;
        this.castAndCrews = castAndCrews;
        this.title = title;
        this.duration = duration;
        this.inCinema = inCinema;
        this.is3D = is3D;
    }

    public HashSet<Genre> getGenre() {
        return genre;
    }

    public void setGenre(HashSet<Genre> genre) {
        this.genre = genre;
    }

    public CastAndCrew getCastAndCrews() {
        return castAndCrews;
    }

    public void setCastAndCrews(CastAndCrew castAndCrews) {
        this.castAndCrews = castAndCrews;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getInCinema() {
        return inCinema;
    }

    public void setInCinema(String inCinema) {
        this.inCinema = inCinema;
    }

    public boolean isIs3D() {
        return is3D;
    }

    public void setIs3D(boolean is3D) {
        this.is3D = is3D;
    }

    public String releaseDate() {
        String date = this.inCinema;

        DateTimeFormatter longDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate localDate = LocalDate.parse(date, formatter);
        return localDate.format(longDate);
    }

    @Override
    public String toString() {
        return "\n" + getTitle() + " : from " + releaseDate() + "\n\n" +
                Arrays.toString(genre.toArray()).replaceAll("[\\[\\]]", "") + " | "
                + duration + " minutes in " + (!is3D ? "2D" : "3D") + "\n" +
                castAndCrews.toString() + "\n\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return duration == movie.duration &&
                is3D == movie.is3D &&
                Objects.equals(genre, movie.genre) &&
                Objects.equals(castAndCrews, movie.castAndCrews) &&
                Objects.equals(title, movie.title) &&
                Objects.equals(inCinema, movie.inCinema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genre, castAndCrews, title, duration, inCinema, is3D);
    }

    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.getTitle().compareTo(m2.getTitle());
    }


}
