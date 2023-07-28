package guru.qa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import jdk.jfr.Description;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitHubTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Description("Test for lesson #4 to check that there is example code for JUnit5")
    @Test
    public void gitHubSoftAssertionsTest() {
        String codeExample =  "@ExtendWith({SoftAssertsExtension.class})\n" +
                "class Tests {\n" +
                "  @Test\n" +
                "  void test() {\n" +
                "    Configuration.assertionMode = SOFT;\n" +
                "    open(\"page.html\");\n" +
                "\n" +
                "    $(\"#first\").should(visible).click();\n" +
                "    $(\"#second\").should(visible).click();\n" +
                "  }\n" +
                "}";
        open("https://github.com/selenide/selenide");

        $x("//*[@id='wiki-tab']").click();
        $x("//*[@class='Box-row wiki-more-pages-link']//button").click();
        $x("//*[@id='wiki-pages-box']//*[contains(text(), 'SoftAssertions')]")
                .shouldBe(Condition.interactable).scrollTo().click();
        $x("//div[@class='markdown-body']").$(byText("3. Using JUnit5 extend test class:"))
                .sibling(0).shouldHave(text(codeExample));
    }

    @Description("First test for lesson #5 to check that necessary page has loaded by it's title")
    @Test
    public void gitHubHoverTest() {
        open("https://github.com/");

        $x("//*[contains(text(), 'Solutions')]").hover();
        $x("//*[contains(text(), 'Enterprise')]").click();
        $x("//*[@class='application-main ']").shouldHave(text("Build like the best"));
    }

    @Description("Second test for lesson #5 to check that rectangles A and B are indeed switched places")
    @Test
    public void gitHubDragAndDropTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");

        $x("//div[@id='column-a']").dragAndDropTo($x("//div[@id='column-b']"));
        $x("//div[@id='column-a']").shouldHave(text("B"));
        $x("//div[@id='column-b']").shouldHave(text("A"));
    }

    @AfterAll
    static void afterAll() {
        Selenide.closeWindow();
    }
}
