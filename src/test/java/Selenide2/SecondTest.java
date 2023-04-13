package Selenide2;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SecondTest {
    @Test
    void draganddrop() {
        open ("https://the-internet.herokuapp.com/drag_and_drop");

}
}
