package ex.comparable.comparator.ex4_2;

import java.util.*;
import java.io.*;

class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;

    public int compareTo(Movie m) {
        Integer movie1 = Integer.valueOf(this.getYear());
        Integer movie2 = Integer.valueOf(m.getYear());
        return movie1.compareTo(movie2);
    }

    public Movie(String name, double rating, int year) {

    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
