package com.demoqa.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import jdk.jfr.Description;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class OriginalRegistrationTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void fillFormTestClasswork() {
        open("/text-box");

        $("#userName").setValue("Valeria Reshetina");
        $("#userEmail").setValue("valeria@yandex.ru");
        $("#currentAddress").setValue("Some current address 1");
        $("#permanentAddress").setValue("Some permanent address 2");
        $("#submit").click();
        $("#output #name").shouldHave(text("Valeria Reshetina"));
        $("#output #email").shouldHave(text("valeria@yandex.ru"));
        $("#output #currentAddress").shouldHave(text("Some current address 1"));
        $("#output #permanentAddress").shouldHave(text("Some permanent address 2"));
    }

    @Description("Filling in all fields of the form as second homework")
    @Test
    void fillFormTestHomework() {
        open("https://demoqa.com/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        $x("//*[@id='firstName']").setValue("Valeria");
        $x("//*[@id='lastName']").setValue("Reshetina");
        $x("//*[@id='userEmail']").setValue("valeria@yandex.ru");
        $x("//*[@id='genterWrapper']//*[contains(text(), 'Female')]").click();
        $x("//*[@id='userNumber']").setValue("9881120310");
        $x("//*[@id='dateOfBirthInput']").click();
        $x("//*[@class='react-datepicker__month-select']")
                .selectOptionContainingText("August");
        $x("//*[@class='react-datepicker__year-select']")
                .selectOptionContainingText("1996");
        $x("//*[@class='react-datepicker__day react-datepicker__day--012']").click();
        $x("//div[@id='subjectsContainer']//input").shouldBe(Condition.interactable).click();
        $x("//div[@id='subjectsContainer']//input").setValue("Arts").pressEnter();
        $x("//*[@id='hobbiesWrapper']//*[contains(text(),'Reading')]").click();
        $("#uploadPicture").uploadFromClasspath("photoForTest.jpg");
        $x("//*[@id='currentAddress']").setValue("Saint Petersburg");
        $x("//*[contains(text(), 'Select State')]").shouldBe(Condition.interactable)
                .scrollTo().click();
        $x("//*[contains(text(), 'NCR')]").shouldBe(Condition.interactable)
                .scrollTo().click();
        $x("//*[contains(text(), 'Select City')]").shouldBe(Condition.interactable)
                .scrollTo().click();
        $x("//*[contains(text(), 'Delhi')]").shouldBe(Condition.interactable)
                .scrollTo().click();
        $x("//*[contains(text(), 'Submit')]").click();

        //CHECKS
        $x("//td[contains(text(), 'Student Name')]/following-sibling::td[1]")
                .shouldHave(exactText("Valeria Reshetina"));
        $x("//td[contains(text(), 'Student Email')]/following-sibling::td[1]")
                .shouldHave(exactText("valeria@yandex.ru"));
        $x("//td[contains(text(), 'Gender')]/following-sibling::td[1]").shouldHave(exactText("Female"));
        $x("//td[contains(text(), 'Mobile')]/following-sibling::td[1]")
                .shouldHave(exactText("9881120310"));
        $x("//td[contains(text(), 'Date of Birth')]/following-sibling::td[1]")
                .shouldHave(exactText("12 August,1996"));
        $x("//td[contains(text(), 'Subjects')]/following-sibling::td[1]").shouldHave(exactText("Arts"));
        $x("//td[contains(text(), 'Hobbies')]/following-sibling::td[1]").shouldHave(exactText("Reading"));
        $x("//td[contains(text(), 'Picture')]/following-sibling::td[1]")
                .shouldHave(exactText("photoForTest.jpg"));
        $x("//td[contains(text(), 'Address')]/following-sibling::td[1]")
                .shouldHave(exactText("Saint Petersburg"));
        $x("//td[contains(text(), 'State and City')]/following-sibling::td[1]")
                .shouldHave(exactText("NCR Delhi"));
    }

        @AfterAll
    static void afterAll() {
        Selenide.closeWindow();
    }
}
