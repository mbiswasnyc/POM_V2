package DemoQATest;

import DemoQA.ElementsPage;
import DemoQA.HomePage;
import DemoQA.PageHelper;
import DemoQA.WidgetsMenuPage;
import org.testng.annotations.Test;

public class WidgetsMenuPageTest extends PageHelper{
    @Test
    public void hoverOverMenu() throws InterruptedException {
        PageHelper helper = new PageHelper();
        helper.startBrowser("https://demoqa.com/menu");
       /* HomePage homePage = new HomePage(helper.getDriver());
        homePage.clickElementsOption();
        ElementsPage elementsPage = new ElementsPage(helper.getDriver());
        elementsPage.clickWidgetsDropDownAndMenuOption();*/
        WidgetsMenuPage widgetsMenuPage = new WidgetsMenuPage(getDriver());
        //widgetsMenuPage.hoverOverMenuItem2();

    }
}
