package com.demoqa.tests;

import com.demoqa.pages.TextBoxPage;
import org.junit.jupiter.api.Test;

public class TextBoxTests extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();
    @Test
    void fillFormTest() {
        textBoxPage
                .openPage()
                .setUserName("Valeria Reshetina")
                .setEmail("valeria@yandex.ru")
                .setCurrentAddress("Some current address 1")
                .setPermanentAddress("Some permanent address 2")
                .submitInformation()
                .checkResult("Valeria Reshetina","valeria@yandex.ru",
                        "Some current address 1","Some permanent address 2");

    }
}
