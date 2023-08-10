package com.demoqa.checks;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class RegistrationPageChecks {

    public RegistrationPageChecks checkNameResult(String name) {
        compareNameInTableResult(name);
        return this;
    }

    public RegistrationPageChecks checkEmailResult(String email) {
        compareEmailInTableResult(email);
        return this;
    }

    public RegistrationPageChecks checkGenderResult(String gender) {
        compareGenderInTableResult(gender);
        return this;
    }

    public RegistrationPageChecks checkMobileNumberResult(String phone) {
        comparePhoneInTableResult(phone);
        return this;
    }

    public RegistrationPageChecks checkBirthDateResult(String birthDate) {
        compareBirthDateInTableResult(birthDate);
        return this;
    }

    public RegistrationPageChecks checkSubjectResult(String subject) {
        compareSubjectInTableResult(subject);
        return this;
    }

    public RegistrationPageChecks checkHobbyResult(String hobby) {
        compareHobbyInTableResult(hobby);
        return this;
    }

    public RegistrationPageChecks checkFileNameResult(String fileName) {
        compareFileNameInTableResult(fileName);
        return this;
    }

    public RegistrationPageChecks checkAddressResult(String address) {
        compareAddressInTableResult(address);
        return this;
    }

    public RegistrationPageChecks checkStateCityResult(String stateCity) {
        compareStateCityInTableResult(stateCity);
        return this;
    }

    //CHECKS FOR THE TABLE THAT APPEARS AFTER CLICKING SUBMIT BUTTON

    public void compareNameInTableResult(String name) {
        $x("//td[contains(text(), 'Student Name')]/following-sibling::td[1]").shouldHave(text(name));
    }

    public void compareEmailInTableResult(String email) {
        $x("//td[contains(text(), 'Student Email')]/following-sibling::td[1]").shouldHave(text(email));
    }

    public void compareGenderInTableResult(String gender) {
        $x("//td[contains(text(), 'Gender')]/following-sibling::td[1]").shouldHave(text(gender));
    }

    public void comparePhoneInTableResult(String mobilePhone) {
        $x("//td[contains(text(), 'Mobile')]/following-sibling::td[1]").shouldHave(text(mobilePhone));
    }

    public void compareBirthDateInTableResult(String birthDate) {
        $x("//td[contains(text(), 'Date of Birth')]/following-sibling::td[1]").shouldHave(text(birthDate));
    }

    public void compareSubjectInTableResult(String subject) {
        $x("//td[contains(text(), 'Subjects')]/following-sibling::td[1]").shouldHave(text(subject));
    }

    public void compareHobbyInTableResult(String hobby) {
        $x("//td[contains(text(), 'Hobbies')]/following-sibling::td[1]").shouldHave(text(hobby));
    }

    public void compareFileNameInTableResult(String fileName) {
        $x("//td[contains(text(), 'Picture')]/following-sibling::td[1]").shouldHave(text(fileName));
    }

    public void compareAddressInTableResult(String address) {
        $x("//td[contains(text(), 'Address')]/following-sibling::td[1]").shouldHave(text(address));
    }

    public void compareStateCityInTableResult(String stateCity) {
        $x("//td[contains(text(), 'State and City')]/following-sibling::td[1]").shouldHave(text(stateCity));
    }
}
