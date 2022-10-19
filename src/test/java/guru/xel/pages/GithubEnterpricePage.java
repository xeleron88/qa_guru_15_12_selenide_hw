package guru.xel.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class GithubEnterpricePage {

    @Step("Should have text in h1")
    public GithubEnterpricePage checkH1Text() {
        $("h1").shouldHave(text("Build like the best"));

        return this;
    }
}
