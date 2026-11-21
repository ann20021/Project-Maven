package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    private final App app = new App();

    @Test
    void shouldGreetWithRegularName() {
        assertEquals("Привет, Аня!", app.greet("Аня"));
    }

    @Test
    void shouldGreetGuestWhenNameIsEmpty() {
        assertEquals("Привет, Гость!", app.greet(""));
    }

    @Test
    void shouldGreetGuestWhenNameIsNull() {
        assertEquals("Привет, Гость!", app.greet(null));
    }
}
