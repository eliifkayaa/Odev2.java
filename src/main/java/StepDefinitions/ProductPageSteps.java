package StepDefinitions;

import Pages.ProductPage;
import Util.DriverFactory;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class ProductPageSteps {
    WebDriver driver = DriverFactory.getDriver();
    ProductPage productPage;

    public ProductPageSteps() {
        this.productPage = new ProductPage(this.driver);
    }
    @When("Ayakkabi beden olarak {int} secilir")
    public void ayakkabiBedenOlarakSecilir(int arg0) {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException var3) {
            var3.printStackTrace();
        }

        this.productPage.clickButton2();
    }

    @When("Sepete ekleye tiklanir")
    public void sepeteEkleyeTiklanir() {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException var2) {
                var2.printStackTrace();
            }

            this.productPage.clickButton3();

    }
}
