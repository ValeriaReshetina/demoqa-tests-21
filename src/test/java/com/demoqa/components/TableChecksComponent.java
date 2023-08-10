package com.demoqa.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class TableChecksComponent {

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
