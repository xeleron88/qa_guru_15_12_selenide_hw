package guru.xel.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GithubMainPage {

    @Step("Open GitHub main page")
    public GithubMainPage openPage(String url) {
        open(url);

        return this;
    }

    @Step("Hower cursor to Solutions button")
    public GithubMainPage howerSolutions() {
        $(withTagAndText("button", "Solutions")).hover();

        return this;
    }

    @Step("Click to the Enterprice link")
    public GithubMainPage enterpriceClick() {
        $$(".HeaderMenu-dropdown-link").findBy(text("Enterprise")).click();

        return this;
    }
}
