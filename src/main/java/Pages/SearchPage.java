package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

       By button = By.cssSelector("a[href='/tr-TR/TR/urun/LC-WAIKIKI/erkek/Espadril/4892190/1479679']");
        WebDriver driver;

       public SearchPage(WebDriver driver) {
               this.driver = driver;
       }

     public void clickButton() {
              this.driver.findElement(this.button).click();
        }
}



