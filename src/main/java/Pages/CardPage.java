package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CardPage {
    By Button = By.cssSelector("#shopping-cart");
    By Button2= By.cssSelector("#ShoppingCartContent");
    WebDriver driver;

    public CardPage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickButton() {

        driver.findElement(Button).click();
    }
    public void clickButton2(){

        driver.findElement(Button2).click();
    }
}