package guru.xel.tests;


import guru.xel.pages.GithubEnterpricePage;
import guru.xel.pages.GithubMainPage;
import org.junit.jupiter.api.Test;


public class GithubTest extends TestBase {
    GithubMainPage githubMainPage = new GithubMainPage();
    GithubEnterpricePage githubEnterpricePage = new GithubEnterpricePage();

    @Test
    void githubTest() {
            githubMainPage.openPage("https://github.com");
            githubMainPage.howerSolutions();
            githubMainPage.enterPriceClick();
            githubEnterpricePage.checkH1Text();
    }
}
