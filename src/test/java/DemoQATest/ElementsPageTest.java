package DemoQATest;

import DemoQA.ElementsPage;
import DemoQA.HomePage;
import DemoQA.PageHelper;
import org.testng.annotations.Test;

public class ElementsPageTest {

    @Test
    public void validationElementsPage(){
        PageHelper helper = new PageHelper();
        helper.startBrowser("https://demoqa.com/");
        HomePage homePage = new HomePage(helper.getDriver());
        homePage.clickElementsOption();
        ElementsPage elementsPage = new ElementsPage(helper.getDriver());
        elementsPage.ElementsPageUrlValidation();
        elementsPage.clickAlertDropDownAndAlertOption();
    }
}
