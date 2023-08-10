package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage {
    SelenideElement
            userName = $x("//*[@id='userName']"),
            userEmail = $x("//*[@id='userEmail']"),
            userCurrentAddress = $x("//*[@id='currentAddress']"),
            userPermanentAddress = $x("//*[@id='permanentAddress']"),
            submitButton = $x("//*[@id='submit']"),
            nameOutput = $x("//div[@id='output']//*[@id='name']"),
            emailOutput = $x("//div[@id='output']//*[@id='email']"),
            currentAddressOutput = $x("//div[@id='output']//*[@id='currentAddress']"),
            permanentAddressOutput = $x("//div[@id='output']//*[@id='permanentAddress']");

    public TextBoxPage openPage() {
        open("/text-box");
        return this;
    }

    public TextBoxPage setUserName(String value) {
        userName.setValue(value);
        return this;
    }

    public TextBoxPage setEmail(String value) {
        userEmail.setValue(value);
        return this;
    }

    public TextBoxPage setCurrentAddress(String value) {
        userCurrentAddress.setValue(value);
        return this;
    }

    public TextBoxPage setPermanentAddress(String value) {
        userPermanentAddress.setValue(value);
        return this;
    }

    public TextBoxPage submitInformation() {
        submitButton.click();
        return this;
    }

    public TextBoxPage checkNameOutput(String name) {
        nameOutput.shouldHave(text(name));
        return this;
    }

    public TextBoxPage checkEmailOutput(String email) {
        emailOutput.shouldHave(text(email));
        return this;
    }

    public TextBoxPage checkCurrentAddressOutput(String currentAddress) {
        currentAddressOutput.shouldHave(text(currentAddress));
        return this;
    }

    public TextBoxPage checkPermanentAddressOutput(String permanentAddress) {
        permanentAddressOutput.shouldHave(text(permanentAddress));
        return this;
    }
}
