package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

public class RegistrationTestsWithPageObjectApproach extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Description("Registration test with page object approach as a homework for lesson #7")
    @Test
    void userRegistrationTest() {
        registrationPage.openPage()
                .removeBanner()
                .setFirstName("Valeria")
                .setLastName("Reshetina")
                .setUserEmail("valeria@yandex.ru")
                .setGender("Female")
                .setUserNumber("9881120310")
                .setBirthDate("12","August","1996")
                .setSubjects("Arts")
                .setHobbies("Reading")
                .setAddress("Saint Petersburg")
                .uploadFile("photoForTest.jpg")
                .selectState("NCR")
                .selectCity("Delhi")
                .submitInformation()
                .checkResult("Valeria Reshetina","valeria@yandex.ru", "Female", "9881120310",
                        "12 August,1996", "Arts", "Reading","photoForTest.jpg",
                        "Saint Petersburg", "NCR Delhi");
    }
}
