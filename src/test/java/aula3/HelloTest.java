package aula3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HelloTest {

    private final ByteArrayOutputStream outCOntent = new ByteArrayOutputStream();
    private final PrintStream oringinalout = System.out;

    @AfterEach
    void restoreStreams() {
        .setOut(originalOut);
    }

    @Testvoid testHello() {
        Hello h = new Hello();
        assertNotNull(h, "Hello is null");
        h.sayHello();

    }
}
