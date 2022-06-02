package Util;

import com.beust.jcommander.Parameters;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;


public class Hooks {
        WebDriver driver;  //= DriverFactory.getDriver();

    @Before
    public void before(){

       driver = DriverFactory.initializeDriver("Chrome");
       // driver.get("https://www.lcwaikiki.com/");
    }
    @BeforeStep
    public void beforeStep() {

    }

    @AfterStep
    public void afterStep() {

    }

    @After
    public void after(){

        driver.quit();
    }
}
