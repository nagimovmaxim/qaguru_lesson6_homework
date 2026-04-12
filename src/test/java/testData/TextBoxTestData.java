package testData;

import testUtils.Rando;

public class TextBoxTestData {
    public String formUrl = "/text-box",
            userEmailIncorrect,
            name,
            email,
            currentAddress,
            permanentAddress;

    public TextBoxTestData() throws Exception {
        userEmailIncorrect = Rando.getNumericString(10);
        name = Rando.getFullName();
        email = Rando.getEmail();
        currentAddress = Rando.getAddress();
        permanentAddress = Rando.getAddress();
    }
}
