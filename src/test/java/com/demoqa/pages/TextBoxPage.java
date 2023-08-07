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
        open("https://demoqa.com/text-box");
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
    public TextBoxPage checkResult(String name, String email, String currentAddress, String permanentAddress) {
        nameOutput.shouldHave(text(name));
        emailOutput.shouldHave(text(email));
        currentAddressOutput.shouldHave(text(currentAddress));
        permanentAddressOutput.shouldHave(text(permanentAddress));
        return this;
    }
}
