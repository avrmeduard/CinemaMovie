package com.company;

import com.company.model.CastAndCrew;
import com.company.model.Genre;
import com.company.model.Movie;
import com.company.privilege.UserPrivilege;
import com.company.service.CinemaProduction;
import com.company.utils.UtilsService;


import java.util.*;

public class Main {

    public static CinemaProduction cinemaProduction = new CinemaProduction();

    public static void main(String[] args) {

        HashSet<Genre> genresStarTrek = new HashSet<>();
        genresStarTrek.add(Genre.ADVENTURE);
        genresStarTrek.add(Genre.ACTION);
        genresStarTrek.add(Genre.SCI_FI);
        genresStarTrek.add(Genre.CRIME);

        CastAndCrew castAndCrewST = new CastAndCrew();
        castAndCrewST.setDirected("Eduard Alex");
        castAndCrewST.setWritten("Mara Morgenstein");

        List<String> castST = new ArrayList<>();
        castST.add("Antony Hopp");
        castST.add("Billy Ill");
        castST.add("Dumpy Dope");
        castST.add("Chris Crane");
        castST.add("John Dwayne");

        castAndCrewST.setCast(castST);

        Movie starTrek = new Movie(genresStarTrek, castAndCrewST, "Star Trek", 240, "22-10-2020");


        HashSet<Genre> genreJoker = new HashSet<>();
        genreJoker.add(Genre.CRIME);
        genreJoker.add(Genre.DRAMA);
        genreJoker.add(Genre.THRILLER);

        CastAndCrew castAndCrewJ = new CastAndCrew();
        castAndCrewJ.setDirected("Todd Phillips");
        castAndCrewJ.setWritten("Scott Silver");

        List<String> castJ = new ArrayList<>();
        castJ.add("Joaquin Phoenix");
        castJ.add("Robert De Niro");
        castJ.add("Zazie Beetz");

        castAndCrewJ.setCast(castJ);

        Movie Joker = new Movie(genreJoker, castAndCrewJ, "Joker", 162, "11-08-2020");


        cinemaProduction.addMovie(starTrek);
        cinemaProduction.addMovie(Joker);
        UserPrivilege userPrivilege = new UserPrivilege();
        Menu menu = new Menu();

        menu.welcomeText();
        userPrivilege.menuOption();


    }
}
