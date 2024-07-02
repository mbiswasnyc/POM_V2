package DemoQA;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;


public class ElementsPage {
    WebDriver driver;

    public ElementsPage(WebDriver driver){
        this.driver = driver;
    }

    // List of task on this page
    public void ElementsPageUrlValidation(){
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("elements"));
    }
    public void clickAlertDropDownAndAlertOption(){
        driver.findElement(By.cssSelector("div[id='app']>div>div>div>div>div>div>div:nth-child(3)")).click();
        driver.findElement(By.cssSelector("div[id='app']>div>div>div>div>div>div>div:nth-child(3)>div>ul>li:nth-child(2)")).click();
    }
    public void clickWidgetsDropDownAndMenuOption(){
        driver.findElement(By.cssSelector("div[id='app']>div>div>div>div>div>div>div:nth-child(4)")).click();
        driver.findElement(By.cssSelector("div[id='app']>div>div>div>div>div>div>div:nth-child(4)>div>ul>li:nth-child(8)")).click();
    }
}
