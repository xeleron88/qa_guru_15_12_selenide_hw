package guru.xel.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropPage {

    @Step("Open Drag and Drop page")
    public DragAndDropPage openPage(String url) {
        open(url);

        return this;
    }

    @Step("Move to left element A")
    public DragAndDropPage moveElement() {
        $("#column-a").dragAndDropTo("#column-b");
        return this;
    }

    @Step("Checking the DragAndDrop result")
    public DragAndDropPage CheckingMoveResult() {
        $("div.column").$("header").shouldHave(text("B"));
        return this;
    }
}
