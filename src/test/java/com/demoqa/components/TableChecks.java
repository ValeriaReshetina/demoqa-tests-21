package com.demoqa.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class TableChecks {

    public void compareTableResult(String name, String email, String gender, String phone, String birthDate,
                                   String subject, String hobby, String fileName, String address, String stateCity) {

        $x("//td[contains(text(), 'Student Name')]/following-sibling::td[1]").shouldHave(text(name));
        $x("//td[contains(text(), 'Student Email')]/following-sibling::td[1]").shouldHave(text(email));
        $x("//td[contains(text(), 'Gender')]/following-sibling::td[1]").shouldHave(text(gender));
        $x("//td[contains(text(), 'Mobile')]/following-sibling::td[1]").shouldHave(text(phone));
        $x("//td[contains(text(), 'Date of Birth')]/following-sibling::td[1]").shouldHave(text(birthDate));
        $x("//td[contains(text(), 'Subjects')]/following-sibling::td[1]").shouldHave(text(subject));
        $x("//td[contains(text(), 'Hobbies')]/following-sibling::td[1]").shouldHave(text(hobby));
        $x("//td[contains(text(), 'Picture')]/following-sibling::td[1]").shouldHave(text(fileName));
        $x("//td[contains(text(), 'Address')]/following-sibling::td[1]").shouldHave(text(address));
        $x("//td[contains(text(), 'State and City')]/following-sibling::td[1]").shouldHave(text(stateCity));
    }
}
