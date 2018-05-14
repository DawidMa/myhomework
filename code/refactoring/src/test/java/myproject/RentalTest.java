package test.java.myproject;

import main.java.myproject.Movie;
import main.java.myproject.Rental;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RentalTest {

    Movie movie = new Movie("test",30);
    Rental rental = new Rental(movie,5);

    @Test
    public void testRentalMovie() {
        assertEquals(rental.getMovie().getTitle(),"test");
    }

    @Test
    public void testRentalPrice() {
        assertEquals(rental.getMovie().getPriceCode(),30);
    }
}
