package com.demoqa.tests;

import com.demoqa.checks.TextBoxChecks;
import com.demoqa.pages.TextBoxPage;
import org.junit.jupiter.api.Test;

public class TextBoxTests extends TestBase {

    TextBoxPage textBoxPage = new TextBoxPage();
    TextBoxChecks textBoxChecks = new TextBoxChecks();

    @Test
    void fillFormTest() {
        textBoxPage
                .openPage()
                .setUserName("Valeria Reshetina")
                .setEmail("valeria@yandex.ru")
                .setCurrentAddress("Some current address 1")
                .setPermanentAddress("Some permanent address 2")
                .submitInformation();

        textBoxChecks
                .checkNameOutput("Valeria Reshetina")
                .checkEmailOutput("valeria@yandex.ru")
                .checkCurrentAddressOutput("Some current address 1")
                .checkPermanentAddressOutput("Some permanent address 2");
    }
}
