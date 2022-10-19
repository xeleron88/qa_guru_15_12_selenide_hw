package guru.xel.tests;

import guru.xel.pages.DragAndDropPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class DragAndDropTest extends TestBase {
    DragAndDropPage dragAndDropPage = new DragAndDropPage();

    @Test
    void dragAndDropTest() {
            dragAndDropPage.openPage("https://the-internet.herokuapp.com/drag_and_drop");
            dragAndDropPage.moveElement();
            sleep(1000);
            dragAndDropPage.CheckingMoveResult();

    }


}
