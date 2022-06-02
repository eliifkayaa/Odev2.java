import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        //*******************Manage*************************
        //Timeouts
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //elementlerin yüklenmesini bekler//yapılan işlemleri .. sn bekler
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); //sayfanın yüklenmesini bekler

        //Window
        driver.manage().window().maximize();   //pencereyi maximisize yapar
        driver.manage().window().fullscreen();  //pencereyi full screen yapar
        int xDuzlemi = driver.manage().window().getPosition().getX(); //pencerenin x düzlemindeki konumu verir int
        int yDuzlemi = driver.manage().window().getPosition().getY(); //pencerenin y düzlemindeki konumu verir int

        //*******************quit-close*************************
        driver.quit(); //tüm her şeyi kapatır.
        driver.close(); //sekmeyi kapatır

        //*******************URL İŞLEMLERİ************************
        driver.get("https://www.google.com/"); //URL e gitmek için kullanılır.
        String suAnkiSite = driver.getCurrentUrl(); //Sayfadaki urli getirir.
        String title = driver.getTitle(); //sayfanın titleni getirir.
        String pageSource = driver.getPageSource(); //sayfanın kaynak kodlarını çeker. çok kullanılmıyor.

        //*******************Navigate************************
        driver.navigate().to("https://www.google.com/"); //URLE gitmek için. driver.get ile aynı işlemi yapar.
        driver.navigate().back(); //geri gitmek için
        driver.navigate().forward(); //ileri gitmek için
        driver.navigate().refresh(); //sayfayı yenilemek için

        //*****************Window Handle****************
        Set<String> sayfalar = driver.getWindowHandles(); //Driver hangi pencere açıksa onu görür.pencereler arasında görmek istediğimiz yer için kullanırız. sayfalar arası geçiş
        String sayfa = driver.getWindowHandle();

        //*****************Frame****************
        WebElement frame = driver.findElement(By.xpath("html/body/iframe[1]"));
        driver.switchTo().frame(frame); //diğer elementlere tam erişebilirim ama frame taglerine direk ulaşamıyorum. önce frame geçmem gerekiyor. bunun için kullanılır.
        driver.switchTo().defaultContent(); //ana pagesourcea döner. frameden çıkmak için kullanılır.

        //*****************Find Element**************** ÖNEMLİ BUNLAR
        WebElement element1 = driver.findElement(By.id(""));  //id attribute göre
        WebElement element2 = driver.findElement(By.name("")); //name attribute
        WebElement element3 = driver.findElement(By.linkText("")); //equals textine göre
        WebElement element4 = driver.findElement(By.partialLinkText(""));//cotains textine göre
        WebElement element5 = driver.findElement(By.tagName(""));//
        WebElement element6 = driver.findElement(By.className("logo"));//
        WebElement element7 = driver.findElement(By.xpath(""));//
        WebElement element8 = driver.findElement(By.cssSelector("logo"));//

        element6.click();
        element6.sendKeys("ayakkabı");
        String text = element6.getText();
        element6.clear();
        String attribute = element6.getAttribute("class");
        String css = element6.getCssValue("");
        int Elementx = element6.getLocation().getX();
        int Elementy = element6.getLocation().getY();
        int Elementh = element6.getRect().getHeight();
        int Elementw = element6.getRect().getWidth();
        element6.getSize(); //elementin genişliği büyüklüğü varsa element vardır. element6.getSize() >1
        String tagName = element6.getTagName();
        element6.isDisplayed(); //elementim var mı?
        element6.isSelected(); //element seçili mi . mesela radio buton
        element6.isEnabled(); //
        element6.findElement(By.tagName("svf"));

        element6.findElements(By.xpath(""));




        //*****************Find Element**************** ÖNEMLİ BUNLAR
        List<WebElement> elementList = driver.findElements(By.cssSelector(".menu-header-item__title"));
        for (WebElement elem : elementList) {
            if (elem.getText().equals("Kadın"));
            {
                elem.click();
                break;
            }
        }



    }
}
