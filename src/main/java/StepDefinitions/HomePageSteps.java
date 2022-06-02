package StepDefinitions;
import Pages.HomePage;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class HomePageSteps {
     //DriverFactory driverFactory = new DriverFactory();
     WebDriver driver = DriverFactory.getDriver();
     HomePage homePage = new HomePage(driver);

    @Given("Uygulama acilir")
    public void uygulamaAcilir() {
        homePage.setDefaultSettings(10);
        homePage.checkLogo();
    }

    @When("Arama cubuguna {string} yazilir") // {string} koymamız ayakkabı yerine başka elementler de yazabilelim
    public void aramaCubugunaAyakkabiYazilir(String product) {
        homePage.setSearchBox(product);
    }

    @When("Ara butonuna tiklanir")
    public void araButonunaTiklanir() {
        homePage.clickSearchButton();
    }
}
