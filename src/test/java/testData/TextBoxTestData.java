package testData;

import testUtils.Rando;

import java.util.LinkedHashMap;

public class TextBoxTestData {
    private String userEmailIncorrect;
    private LinkedHashMap<String, String> correctFormData = new LinkedHashMap<>();

    public TextBoxTestData() throws Exception {
        userEmailIncorrect = Rando.getNumericString(10);
        correctFormData.put("name", Rando.getFullName());
        correctFormData.put("email", Rando.getEmail());
        correctFormData.put("currentAddress", Rando.getAddress());
        correctFormData.put("permanentAddress", Rando.getAddress());
    }

    public String getUserEmailIncorrect() {
        return userEmailIncorrect;
    }

    public String getName() {
        return correctFormData.get("name");
    }

    public String getEmail() {
        return correctFormData.get("email");
    }

    public String getCurrentAddress() {
        return correctFormData.get("currentAddress");
    }

    public String getPermanentAddress() {
        return correctFormData.get("permanentAddress");
    }

    public LinkedHashMap<String, String> getCorrectFormData() {
        return correctFormData;
    }
}
