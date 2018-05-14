package test.java.myproject;

import main.java.myproject.Movie;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MovieTest {

    Movie movie = new Movie("test",30);

    @Test
    public void testMovieTitle() {
        assertEquals(movie.getTitle(),"test");
    }

    @Test
    public void testMoviePrice() {
        assertEquals(movie.getPriceCode(),30);
    }
}
