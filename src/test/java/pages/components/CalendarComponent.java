package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    private final SelenideElement yearSelect = $(byClassName("react-datepicker__year-select"));
    private final SelenideElement monthSelect = $(byClassName("react-datepicker__month-select"));
    private final SelenideElement dayDiv = $(byClassName("react-datepicker__month"));

    public void set(String year, String month, String day) {
        yearSelect.selectOption(year);
        monthSelect.selectOption(month);
        dayDiv.$(byText(day)).click();
//        div.react-datepicker__day.react-datepicker__day--029.react-datepicker__day--weekend.react-datepicker__day--outside-month
    }
}
