package tests;

import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.TextBoxPage;
import testData.TextBoxTestData;


public class TextBoxTests extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();
    TextBoxTestData testData;

    @BeforeEach
    @Description("Параметризация тестовых данных")
    void parametrizationTestData() throws Exception {
        testData = new TextBoxTestData();
    }

    @Test
    @Description("Негативная проверка на неправильнео заполнение почты")
    void negativeMailErrorTextBoxTest() {
        textBoxPage.openPage()
                .setUserEmail(testData.userEmailIncorrect)
                .submitFormClick()
                .checkEmailOnError();
    }

    @Test
    @Description("ПОзитивная проверка заполнения всех полей")
    void successfulFullSubmitTextBoxTest() {
        textBoxPage.openPage()
                .setUserName(testData.name)
                .setUserEmail(testData.email)
                .setCurrentAddress(testData.currentAddress)
                .setPermanentAddress(testData.permanentAddress)
                .submitFormClick()
                .checkOutputOnCorrectData(testData.name, testData.email, testData.currentAddress, testData.permanentAddress);
    }
}