package tests;

import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;
import testData.PracticeFormTestData;

public class PracticeFormTests extends TestBase {
    PracticeFormPage practiceFormPage = new PracticeFormPage();
    PracticeFormTestData testData;

    @BeforeEach
    @Description("Параметризация тестовых данных")
    void parametrizationTestData() throws Exception {
        testData = new PracticeFormTestData();
    }

    @Test
    @Description("Негативная проверка на неправильное заполенние телефона")
    void negativePhoneErrorPracticeFormTest() {
        practiceFormPage.openPage()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .clickGender(testData.gender)
                .setUserNumber(testData.userNumberIncorrect)
                .clickSubmit()
                .checkUserNumberOnIncorrectData();
    }

    @Test
    @Description("Негативная проверка на неправильное заполнение почты")
    void negativeMailErrorPracticeFormTest() {
        practiceFormPage.openPage()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .clickGender(testData.gender)
                .setUserNumber(testData.userNumber)
                .setUserEmail(testData.userEmailIncorrect)
                .clickSubmit()
                .checkUserEmailOnIncorrectData();
    }

    @Test
    @Description("Негативная проверка на незаполнение всех обязательных полей")
    void negativeShortSubmitPracticeFormTest() {
        practiceFormPage.openPage()
                .clickSubmit()
                .checkRequiredElementsOnEmptyData();
    }

    @Test
    @Description("Позитивно проверяются только обязательные поля формы")
    void positiveShortSubmitPracticeFormTest() {
        practiceFormPage.openPage()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .clickGender(testData.gender)
                .setUserNumber(testData.userNumber)
                .clickSubmit()
                .checkResponseTableOnAppearance()
                .checkResponseTableOnCorrectData(testData.firstName, testData.lastName, testData.gender, testData.userNumber);

    }

    @Test
    @Description("Позитивно проверяются все поля формы, а не только обязательные")
    void positiveFullSubmitPracticeFormTest() {
        practiceFormPage.openPage()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setUserEmail(testData.userEmail)
                .clickGender(testData.gender)
                .setUserNumber(testData.userNumber)
                .setDateOfBirth(testData.dateOfBirth)
                .setSubjects(testData.subjects)
                .clickHobbies(testData.hobbies)
                .uploadPicture(testData.picture)
                .setCurrentAddress(testData.address)
                .setStateAndCity(testData.stateAndCity)
                .clickSubmit()
                .checkResponseTableOnAppearance()
                .checkResponseTableOnCorrectData(testData.firstName, testData.lastName, testData.userEmail, testData.gender,
                        testData.userNumber, testData.dateOfBirth, testData.subjects, testData.hobbies,
                        testData.picture, testData.address, testData.stateAndCity);
    }
}