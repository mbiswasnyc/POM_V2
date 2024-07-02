package DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class PageHelper {
    public WebDriver driver;

    public void startBrowser(String url){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to(url);
    }

    public WebDriver getDriver() {
        return driver;
    }





    // from commonAPI

    public void hoverOver(String locator){
        Actions actions = new Actions(driver);
        WebElement element;
        try {
            element = driver.findElement(By.cssSelector(locator));
        }catch (Exception e){
            element = driver.findElement(By.xpath(locator));
        }
        actions.moveToElement(element).build().perform();
    }
}
