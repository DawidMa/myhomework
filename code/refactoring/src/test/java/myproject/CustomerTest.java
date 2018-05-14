package test.java.myproject;
import main.java.myproject.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    Customer customer = new Customer("test");
    @Test
    public void test() {
        assertEquals(customer.getName(),"test");
    }
}
