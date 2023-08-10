package com.demoqa.components;

public class ChecksComponent {

    TableChecksComponent table = new TableChecksComponent();

    public ChecksComponent checkNameResult(String name) {
        table.compareNameInTableResult(name);
        return this;
    }

    public ChecksComponent checkEmailResult(String email) {
        table.compareEmailInTableResult(email);
        return this;
    }

    public ChecksComponent checkGenderResult(String gender) {
        table.compareGenderInTableResult(gender);
        return this;
    }

    public ChecksComponent checkMobileNumberResult(String phone) {
        table.comparePhoneInTableResult(phone);
        return this;
    }

    public ChecksComponent checkBirthDateResult(String birthDate) {
        table.compareBirthDateInTableResult(birthDate);
        return this;
    }

    public ChecksComponent checkSubjectResult(String subject) {
        table.compareSubjectInTableResult(subject);
        return this;
    }

    public ChecksComponent checkHobbyResult(String hobby) {
        table.compareHobbyInTableResult(hobby);
        return this;
    }

    public ChecksComponent checkFileNameResult(String fileName) {
        table.compareFileNameInTableResult(fileName);
        return this;
    }

    public ChecksComponent checkAddressResult(String address) {
        table.compareAddressInTableResult(address);
        return this;
    }

    public ChecksComponent checkStateCityResult(String stateCity) {
        table.compareStateCityInTableResult(stateCity);
        return this;
    }
}
