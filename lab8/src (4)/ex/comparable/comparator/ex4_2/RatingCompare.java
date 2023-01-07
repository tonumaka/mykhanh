package ex.comparable.comparator.ex4_2;

import java.util.Comparator;

class RatingCompare implements Comparator<Movie> {
    public int compare(Movie left, Movie right) {
        return Double.compare(left.getRating(), right.getRating());
    }
}
