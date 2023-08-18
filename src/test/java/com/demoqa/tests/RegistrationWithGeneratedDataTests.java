package com.demoqa.tests;


import com.demoqa.checks.RegistrationPageChecks;
import com.demoqa.components.CalendarComponent;
import com.demoqa.pages.RegistrationPage;
import com.demoqa.utils.Fields;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

public class RegistrationWithGeneratedDataTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationPageChecks registrationChecks = new RegistrationPageChecks();
    CalendarComponent calendarComponent = new CalendarComponent();
    Fields fields = new Fields();


    @Description("Registration test with usage of generated data as a homework for lesson #8")
    @Test
    void userRegistrationTest() {
        registrationPage.openPage()
                .removeBanner()
                .setFirstName(fields.userFirstName)
                .setLastName(fields.userLastName)
                .setUserEmail(fields.userEmail)
                .setGender(fields.userGender)
                .setUserMobileNumber(fields.userMobileNumber);

        calendarComponent.setBirthDate(fields.userBirthDay, fields.userBirthMonth, fields.userBirthYear);

        registrationPage.setSubjects(fields.userSubject)
                .setHobbies(fields.userHobby)
                .setAddress(fields.userAddress)
                .uploadFile("photoForTest.jpg")
                .selectState(fields.userState)
                .selectCity(fields.userCity)
                .submitInformation();

        registrationChecks
                .checkResult("Student Name", fields.userFullName)
                .checkResult("Student Email", fields.userEmail)
                .checkResult("Gender", fields.userGender)
                .checkResult("Mobile", fields.userMobileNumber)
                .checkResult("Date of Birth", fields.userFullBirthday)
                .checkResult("Subjects", fields.userSubject)
                .checkResult("Hobbies", fields.userHobby)
                .checkResult("Picture", "photoForTest.jpg")
                .checkResult("Address", fields.userAddress)
                .checkResult("State and City", fields.userStateAndCity);
    }
}
