package com.company.model;

import java.util.Arrays;
import java.util.List;

public class CastAndCrew {
    private String directed;
    private String written;

    private List<String> cast;

    public CastAndCrew() {
    }

    public CastAndCrew(String directed, String written, List<String> cast) {
        this.directed = directed;
        this.written = written;
        this.cast = cast;
    }

    public String getDirected() {
        return directed;
    }

    public void setDirected(String directed) {
        this.directed = directed;
    }

    public String getWritten() {
        return written;
    }

    public void setWritten(String written) {
        this.written = written;
    }

    public List<String> getCast() {
        return cast;
    }

    public void setCast(List<String> cast) {
        this.cast = cast;
    }

    @Override
    public String toString() {
        return "Directed by : " + directed + "\n" +
                "Written by : " + written + "\n" +
                "Cast by : " + Arrays.toString(cast.toArray()).replaceAll("[\\[\\]]", "");
    }
}
