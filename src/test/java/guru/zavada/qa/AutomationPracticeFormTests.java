package guru.zavada.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class AutomationPracticeFormTests {

    @Test
    void fillFormTests() {
        open("/automation-practice-form");
    }
}
