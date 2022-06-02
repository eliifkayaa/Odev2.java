package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class HomePage {

    By logo = By.cssSelector("a.main-header-logo");
    By searchBox = By.id("search-form__input-field__search-input");
    By searchButton = By.cssSelector(".search-form__input-field__btn-search.false");

    //Constructor oluşturduk
    WebDriver driver;
    public HomePage(WebDriver disardanDriver) {

        this.driver = disardanDriver;
    }

    public void setDefaultSettings(int time) {
        driver.get("https://www.lcwaikiki.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void checkLogo() {
        driver.findElement(logo);
    }
    public void setSearchBox(String product) {
        driver.findElement(searchBox).sendKeys(product);
    }
    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }
}
