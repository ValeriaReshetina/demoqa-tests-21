package com.demoqa.tests;

import com.demoqa.checks.RegistrationPageChecks;
import com.demoqa.components.CalendarComponent;
import com.demoqa.pages.RegistrationPage;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

public class RegistrationTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationPageChecks registrationChecks = new RegistrationPageChecks();
    CalendarComponent calendarComponent = new CalendarComponent();

    @Description("Registration test with page object approach as a homework for lesson #7")
    @Test
    void userRegistrationTest() {
        registrationPage.openPage()
                .removeBanner()
                .setFirstName("Valeria")
                .setLastName("Reshetina")
                .setUserEmail("valeria@yandex.ru")
                .setGender("Female")
                .setUserMobileNumber("9881120310");

        calendarComponent.setBirthDate("12", "August", "1996");

        registrationPage.setSubjects("Arts")
                .setHobbies("Reading")
                .setAddress("Saint Petersburg")
                .uploadFile("photoForTest.jpg")
                .selectState("NCR")
                .selectCity("Delhi")
                .submitInformation();

        registrationChecks.checkNameResult("Valeria Reshetina").checkEmailResult("valeria@yandex.ru")
                .checkGenderResult("Female").checkMobileNumberResult("9881120310")
                .checkBirthDateResult("12 August,1996").checkSubjectResult("Arts")
                .checkHobbyResult("Reading").checkFileNameResult("photoForTest.jpg")
                .checkAddressResult("Saint Petersburg").checkStateCityResult("NCR Delhi");
    }
}
