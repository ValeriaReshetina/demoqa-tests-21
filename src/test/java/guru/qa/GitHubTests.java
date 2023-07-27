package guru.qa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GitHubTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    public void gitHubSoftAssertionsTest() {
        open("https://github.com/selenide/selenide");
        $x("//*[@id='wiki-tab']").click();
        $x("//*[@class='Box-row wiki-more-pages-link']//button").click();
        $x("//*[@id='wiki-pages-box']//*[contains(text(), 'SoftAssertions')]")
                .shouldBe(Condition.interactable).scrollTo().click();
        $x("//*[@id='wiki-body']").shouldHave(text("Using JUnit5 extend test class"));
    }

    @AfterAll
    static void afterAll() {
        Selenide.closeWindow();
    }
}
