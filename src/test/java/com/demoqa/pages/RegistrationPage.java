package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.components.CalendarComponent;
import com.demoqa.components.TableChecks;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    CalendarComponent calendar = new CalendarComponent();
    TableChecks table = new TableChecks();
    SelenideElement
            firstNameInput = $x("//*[@id='firstName']"),
            lastNameInput = $x("//*[@id='lastName']"),
            userEmailInput = $x("//*[@id='userEmail']"),
            genderWrapper = $x("//*[@id='genterWrapper']"),
            userNumber = $x("//*[@id='userNumber']"),
            birthDate = $x("//*[@id='dateOfBirthInput']"),
            subjectsInput = $x("//div[@id='subjectsContainer']//input"),
            hobbiesInput = $x("//*[@id='hobbiesWrapper']"),
            addressInput = $x("//*[@id='currentAddress']"),
            uploadPictureInput = $("#uploadPicture"),
            stateInput = $x("//div[@id='state']"),
            cityInput = $x("//div[@id='city']"),
            stateCityInput = $x("//div[@id='stateCity-wrapper']"),
            submitButton = $x("//*[@id='submit']");


    public RegistrationPage openPage() {
        open("/automation-practice-form");
        return this;
    }

    public RegistrationPage removeBanner() {
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public RegistrationPage setGender(String value) {
        genderWrapper.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setUserNumber(String value) {
        userNumber.setValue(value);
        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year) {
        birthDate.click();
        calendar.setDate(day, month, year);
        return this;
    }

    public RegistrationPage setSubjects(String value) {
        subjectsInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage setHobbies(String value) {
        hobbiesInput.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setAddress(String value) {
        addressInput.setValue(value);
        return this;
    }

    public RegistrationPage uploadFile(String classPath) {
        uploadPictureInput.uploadFromClasspath(classPath);
        return this;
    }

    public RegistrationPage selectState(String value) {
        stateInput.click();
        stateCityInput.$(byText(value)).click();
        return this;
    }

    public RegistrationPage selectCity(String value) {
        cityInput.click();
        stateCityInput.$(byText(value)).click();
        return this;
    }

    public RegistrationPage submitInformation() {
        submitButton.click();
        return this;
    }

    public RegistrationPage checkResult(String name, String email, String gender, String phone, String birthDate, String subject,
                                        String hobby, String fileName, String address, String stateCity) {
        table.compareTableResult(name, email, gender, phone, birthDate, subject, hobby, fileName, address, stateCity);
        return this;
    }
}
