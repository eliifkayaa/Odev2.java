package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class ProductPage {
        By Button2 = By.cssSelector("#option-size > a:nth-child(6)");
        By Button3 = By.cssSelector("#pd_add_to_cart");
        WebDriver driver;
        public ProductPage(WebDriver driver) {

            this.driver = driver;
        }

        public void clickButton2() {

            this.driver.findElement(this.Button2).click();
        }

        public void clickButton3() {

            this.driver.findElement(this.Button3).click();
        }

}
