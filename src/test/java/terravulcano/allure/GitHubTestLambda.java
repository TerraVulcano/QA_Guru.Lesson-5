package terravulcano.allure;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class GitHubTestLambda {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    public void SearchForIssue() {

        step("Окрываем главную страницу", () -> {
            open("https:github.com");
        });
        step("Ищем репозиторий", () -> {
            $(".header-search-input").click();
            $(".header-search-input").sendKeys("eroshenkoam/allure-example");
            $(".header-search-input").submit();
        });
        step("Переходим в репозиторий", () -> {
            $(By.linkText("eroshenkoam/allure-example")).click();
        });
        step("Переходим в таб Issues", () -> {
            $("#issues-tab1").click();
        });
        step("Проверяем наличие Issue номер 68", () -> {
            $(withText("#68")).should(Condition.exist);
        });
    }
}
