package testData;


import testUtils.Rando;

import java.util.HashMap;

public class PracticeFormTestData {
    public String formUrl = "/automation-practice-form",
            userEmailIncorrect,
            userNumberIncorrect,
            firstName,
            lastName,
            userEmail,
            gender,
            userNumber,
            dateOfBirth,
            subjects,
            hobbies,
            picture,
            address,
            stateAndCity;


    public PracticeFormTestData() throws Exception {
        userEmailIncorrect = Rando.getNumericString(10);
        userNumberIncorrect = Rando.getLetterString(10);
        firstName = Rando.getFirstName();
        lastName = Rando.getLastName();
        userEmail = Rando.getEmail();
        gender = Rando.getOneOf("Male", "Female", "Other");
        userNumber = Rando.getNumericString(10);
        dateOfBirth = Rando.getDateByFormat("d MMMM,yyyy", 1950, 2000);
        subjects = Rando.getOneOf("Maths", "Accounting", "Arts", "Social Studies", "Biology"
                , "Physics", "Chemistry", "Computer Science", "Commerce", "Economics", "Civics", "Hindi", "English", "History");
        hobbies = Rando.getOneOf("Reading", "Music", "Sports");
        picture = "images.jpg";
        address = Rando.getAddress();
        stateAndCity = Rando.getOneOf(new HashMap<>() {{
            put("NCR", new String[]{"Delhi", "Gurgaon", "Noida"});
            put("Uttar Pradesh", new String[]{"Agra", "Lucknow", "Merrut"});
            put("Haryana", new String[]{"Karnal", "Panipat"});
            put("Rajasthan", new String[]{"Jaipur", "Jaiselmer"});
        }});
    }
}
