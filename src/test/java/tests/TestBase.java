package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {
    @BeforeAll
    static void setUp() {
        headless = false;
        browserSize = "2560x1440";
        browser = "chrome";
        browserVersion = "latest";
        baseUrl = "https://demoqa.com";
        pageLoadStrategy = "eager";
        timeout = 10000;
    }

    @AfterEach
    void down() {
        closeWebDriver();
    }
}