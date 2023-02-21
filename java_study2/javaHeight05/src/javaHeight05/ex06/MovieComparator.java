package javaHeight05.ex06;

import java.util.Comparator;

public class MovieComparator implements Comparator<Movie>{
    @Override
    public int compare(Movie o1, Movie o2) {
     	return o1.getMovieName().compareTo(o2.getMovieName() );
    }
}
