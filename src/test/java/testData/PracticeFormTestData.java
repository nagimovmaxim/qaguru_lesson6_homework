package testData;


import testUtils.Rando;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class PracticeFormTestData {
    private LinkedHashMap<String, String> correctFormData = new LinkedHashMap<>();
    private LinkedHashMap<String, String> errorMarkers = new LinkedHashMap<>();
    private final Set<Integer> numFieldsForShortSubmit = new HashSet<>();
    private String userEmailIncorrect;
    private String userNumberIncorrect;


    public PracticeFormTestData() throws Exception {
        userEmailIncorrect = Rando.getNumericString(10);
        userNumberIncorrect = Rando.getLetterString(10);

        numFieldsForShortSubmit.addAll(Set.of(1, 3, 4));

        correctFormData.put("Student Name", Rando.getFullName());
        correctFormData.put("Student Email", Rando.getEmail());
        correctFormData.put("Gender", Rando.getOneOf("Male", "Female", "Other"));
        correctFormData.put("Mobile", Rando.getNumericString(10));
        correctFormData.put("Date of Birth", Rando.getDateByFormat("d MMMM,yyyy", 1950, 2000));
        correctFormData.put("Subjects", Rando.getOneOf("Maths", "Accounting", "Arts", "Social Studies", "Biology"
                , "Physics", "Chemistry", "Computer Science", "Commerce", "Economics", "Civics", "Hindi", "English", "History"));
        correctFormData.put("Hobbies", Rando.getOneOf("Reading", "Music", "Sports"));
        correctFormData.put("Picture", "images.jpg");
        correctFormData.put("Address", Rando.getAddress());
        correctFormData.put("State and City", Rando.getOneOf(new HashMap<>() {{
            put("NCR", new String[]{"Delhi", "Gurgaon", "Noida"});
            put("Uttar Pradesh", new String[]{"Agra", "Lucknow", "Merrut"});
            put("Haryana", new String[]{"Karnal", "Panipat"});
            put("Rajasthan", new String[]{"Jaipur", "Jaiselmer"});
        }}));
        errorMarkers.put("firstName", "border-color;rgb(220, 53, 69)");
        errorMarkers.put("lastName", "border-color;rgb(220, 53, 69)");
        errorMarkers.put("maleRadioBorder", "border-color;rgb(220, 53, 69)");
        errorMarkers.put("maleRadio", "color;rgba(220, 53, 69, 1)");
        errorMarkers.put("femaleRadioBorder", "border-color;rgb(220, 53, 69)");
        errorMarkers.put("femaleRadio", "color;rgba(220, 53, 69, 1)");
        errorMarkers.put("otherRadioBorder", "border-color;rgb(220, 53, 69)");
        errorMarkers.put("otherRadio", "color;rgba(220, 53, 69, 1)");
        errorMarkers.put("userNumber", "border-color;rgb(220, 53, 69)");
        errorMarkers.put("userEmail", "border-color;rgb(220, 53, 69)");
    }

    public String getFirstName() {
        return correctFormData.get("Student Name").split(" ")[0];
    }

    public String getLastName() {
        return correctFormData.get("Student Name").split(" ")[1];
    }

    public String getUserEmail() {
        return correctFormData.get("Student Email");
    }

    public String getGender() {
        return correctFormData.get("Gender");
    }

    public String getUserNumber() {
        return correctFormData.get("Mobile");
    }

    public String getDateOfBirth() {
        return correctFormData.get("Date of Birth");
    }

    public String getSubjects() {
        return correctFormData.get("Subjects");
    }

    public String getHobbies() {
        return correctFormData.get("Hobbies");
    }

    public String getPicture() {
        return correctFormData.get("Picture");
    }

    public String getCurrentAddress() {
        return correctFormData.get("Address");
    }

    public String getStateAndCity() {
        return correctFormData.get("State and City");
    }

    public LinkedHashMap<String, String> getCorrectFormData() {
        return correctFormData;
    }

    public Set<Integer> getNumFieldsForShortSubmit() {
        return numFieldsForShortSubmit;
    }

    public String getFirstNameErrorMarker() {
        return errorMarkers.get("firstName");
    }

    public String getLastNameErrorMarker() {
        return errorMarkers.get("lastName");
    }

    public String getMaleRadioBorderErrorMarker() {
        return errorMarkers.get("maleRadioBorder");
    }

    public String getMaleRadioErrorMarker() {
        return errorMarkers.get("maleRadio");
    }

    public String getFemaleRadioBorderErrorMarker() {
        return errorMarkers.get("femaleRadioBorder");
    }

    public String getFemaleRadioErrorMarker() {
        return errorMarkers.get("femaleRadio");
    }

    public String getOtherRadioBorderErrorMarker() {
        return errorMarkers.get("otherRadioBorder");
    }

    public String getOtherRadioErrorMarker() {
        return errorMarkers.get("otherRadio");
    }

    public String getUserEmailErrorMarker() {
        return errorMarkers.get("userEmail");
    }

    public String getUserNumberErrorMarker() {
        return errorMarkers.get("userNumber");
    }

    public String getUserEmailIncorrect() {
        return userEmailIncorrect;
    }

    public String getUserNumberIncorrect() {
        return userNumberIncorrect;
    }
}
