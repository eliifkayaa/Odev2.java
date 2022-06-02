package StepDefinitions;

import Pages.SearchPage;
import Util.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class SearchPageSteps {
    WebDriver driver = DriverFactory.getDriver();
    SearchPage searchPage;
   // SearchPage searchPage = new SearchPage(DriverFactory.getDriver());

    public SearchPageSteps() {
        this.searchPage = new SearchPage(this.driver);
    }

    @When("{int}. siradaki ayakkabiya tıklanır")
    public void siradakiAyakkabiyaTıklanır(int arg0) {
        try {
            Thread.sleep(1500L);
        } catch (InterruptedException var3) {
            var3.printStackTrace();
        }

        searchPage.clickButton();
    }
}
