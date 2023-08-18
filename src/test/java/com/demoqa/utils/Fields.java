package com.demoqa.utils;

public class Fields {

    RandomGenerationUtil randomGenerationUtil = new RandomGenerationUtil();

    public String
            userFirstName = randomGenerationUtil.getFirstName(),
            userLastName = randomGenerationUtil.getLastName(),
            userEmail = randomGenerationUtil.getUserEmail(),
            userGender = randomGenerationUtil.getUserGender(),
            userBirthDay = randomGenerationUtil.getUserBirthDay(),
            userBirthMonth = randomGenerationUtil.getUserBirthMonth(),
            userBirthYear = randomGenerationUtil.getUserBirthYear(),
            userMobileNumber = randomGenerationUtil.getUserMobileNumber(),
            userSubject = randomGenerationUtil.getUserSubject(),
            userHobby = randomGenerationUtil.getUserHobby(),
            userAddress = randomGenerationUtil.getUserAddress(),
            userState = randomGenerationUtil.getUserState(),
            userCity = randomGenerationUtil.getUserCity(userState),
            userFullName = userFirstName+" "+ userLastName,
            userFullBirthday = userBirthDay+" "+ userBirthMonth +","+ userBirthYear,
            userStateAndCity = userState+" "+userCity;
}