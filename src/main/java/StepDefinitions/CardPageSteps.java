package StepDefinitions;

import Pages.CardPage;
import Util.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class CardPageSteps {
    WebDriver driver = DriverFactory.getDriver();
    CardPage cardPage = new CardPage(driver);
    @When("Sepete gidilir")
    public void sepeteGidilir() {
        cardPage.clickButton();
    }

    @Then("Urunun sepete eklendigi kontrol edilir")
    public void urununSepeteEklendigiKontrolEdilir() {
        cardPage.clickButton2();
    }
}
