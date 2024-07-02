package DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WidgetsMenuPage{
    WebDriver driver;

    public WidgetsMenuPage(WebDriver driver){
        this.driver = driver;
    }
    PageHelper helper = new PageHelper();
    Actions actions = new Actions(helper.getDriver());

    WebElement menuItem1 = driver.findElement(By.cssSelector("ul[id='nav']>li>a"));
    WebElement menuItem2 = driver.findElement(By.cssSelector("ul[id='nav']>li:nth-child(2)"));
    WebElement menuItem3 = driver.findElement(By.cssSelector("ul[id='nav']>li:nth-child(3)>a"));
    WebElement menuItem2a = driver.findElement(By.linkText("Main Item 2"));

    public void hoverOverMenuItem1() throws InterruptedException {
        actions.moveToElement(menuItem1);
        Thread.sleep(2000);
    }

    public void hoverOverMenuItem2() throws InterruptedException {
        actions.moveToElement(menuItem2a).build().perform();
        Thread.sleep(2000);
    }







}
