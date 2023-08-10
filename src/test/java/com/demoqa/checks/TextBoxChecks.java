package com.demoqa.checks;

import com.demoqa.pages.TextBoxPage;

import static com.codeborne.selenide.Condition.text;

public class TextBoxChecks {
    TextBoxPage textBoxPage = new TextBoxPage();

    public TextBoxChecks checkNameOutput(String name) {
        textBoxPage.nameOutput.shouldHave(text(name));
        return this;
    }

    public TextBoxChecks checkEmailOutput(String email) {
        textBoxPage.emailOutput.shouldHave(text(email));
        return this;
    }

    public TextBoxChecks checkCurrentAddressOutput(String currentAddress) {
        textBoxPage.currentAddressOutput.shouldHave(text(currentAddress));
        return this;
    }

    public TextBoxChecks checkPermanentAddressOutput(String permanentAddress) {
        textBoxPage.permanentAddressOutput.shouldHave(text(permanentAddress));
        return this;
    }
}
