package DemoQATest;

import DemoQA.AlertsAlertsPage;
import DemoQA.ElementsPage;
import DemoQA.HomePage;
import DemoQA.PageHelper;
import org.testng.annotations.Test;

public class AlertsAlertsPageTest {
    @Test
    public void AlertPageValidation() throws InterruptedException {
        PageHelper helper = new PageHelper();
        helper.startBrowser("https://demoqa.com/");
        HomePage homePage = new HomePage(helper.getDriver());
        homePage.clickElementsOption();

        ElementsPage elementsPage = new ElementsPage(helper.getDriver());
        elementsPage.ElementsPageUrlValidation();
        elementsPage.clickAlertDropDownAndAlertOption();

        AlertsAlertsPage alertsAlertsPage = new AlertsAlertsPage(helper.getDriver());
        alertsAlertsPage.AlertsPageHeaderValidation();

        alertsAlertsPage.handleAlert1Btn();

        alertsAlertsPage.handleAlert2Btn5Sec();

        alertsAlertsPage.handelAlert3BtnOkCancel();

        alertsAlertsPage.handleAlert4BtnWriteText();
    }
}
