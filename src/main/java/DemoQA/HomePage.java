package DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickElementsOption(){
        driver.findElement(By.cssSelector("div[class='category-cards']>div:nth-child(1)")).click();
    }
}
