package DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AlertsAlertsPage {
    WebDriver driver;

    public AlertsAlertsPage(WebDriver driver){
        this.driver = driver;
    }

    // List of task on this page
    public void AlertsPageHeaderValidation(){
        String headerText = driver.findElement(By.cssSelector("#javascriptAlertsWrapper>h1")).getText();
        Assert.assertEquals(headerText, "Alerts");
    }
    public void handleAlert1Btn() throws InterruptedException {
        driver.findElement(By.cssSelector("button[id='alertButton']")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }
    public void handleAlert2Btn5Sec() throws InterruptedException {
        driver.findElement(By.cssSelector("button[id='timerAlertButton']")).click();
        Thread.sleep(5000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

    }
    public void handelAlert3BtnOkCancel() throws InterruptedException {
        driver.findElement(By.cssSelector("button[id='confirmButton']")).click();
        driver.switchTo().alert().dismiss();
        String cancelMassage = driver.findElement(By.cssSelector("span[id='confirmResult']")).getText();
        Assert.assertEquals(cancelMassage, "You selected Cancel");
        System.out.println(cancelMassage);
    }
    public void handleAlert4BtnWriteText() throws InterruptedException {
        driver.findElement(By.cssSelector("button[id='promtButton']")).click();
        String name = "Mritunjoy Biswas";
        driver.switchTo().alert().sendKeys(name);
        driver.switchTo().alert().accept();
        String textDisplayed = driver.findElement(By.cssSelector("span[id='promptResult']")).getText();
        Assert.assertTrue(textDisplayed.contains(name));
        System.out.println(textDisplayed);
    }

}
