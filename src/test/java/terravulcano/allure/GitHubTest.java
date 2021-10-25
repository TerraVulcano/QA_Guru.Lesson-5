package terravulcano.allure;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubTest {

    private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final static String USER = "eroshenkoam";
    private final static int ISSUE_NUMBER = 12;

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    public void SearchForIssue() {

        open("https:github.com");
        $(".header-search-input").click();
        $(".header-search-input").sendKeys("eroshenkoam/allure-example");
        $(".header-search-input").submit();
        $(By.linkText("eroshenkoam/allure-example")).click();
        $("#issues-tab").click();
        $(withText("#68")).should(Condition.exist);
    }
}
