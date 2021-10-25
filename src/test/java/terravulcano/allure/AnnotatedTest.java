package terravulcano.allure;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Набор тестов с аннотациями")
public class AnnotatedTest {

    @Test
    @Owner("terravulcano")
    @Feature("Работа с разметкой")
    @Story("Разметка аннотаций")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name = "BaseURL", url = "https://github.com")
    @DisplayName("Пример теста с аннотациями")
    public void testSomething() {

    }

}