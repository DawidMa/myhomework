package test.java.myproject;

import main.java.myproject.Program;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ProgramTest {

    Program program = new Program();

    @Test
    public void notNull() {
        assertNotNull(program);
    }
}
