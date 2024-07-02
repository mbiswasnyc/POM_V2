package Try;

import DemoQA.ElementsPage;
import DemoQA.HomePage;
import DemoQA.PageHelper;
import org.testng.annotations.Test;

public class TestClass extends PageHelper {
    @Test
    public void hoverOverTest() throws InterruptedException {
        startBrowser("https://demoqa.com");
        HomePage homePage = new HomePage(getDriver());
        homePage.clickElementsOption();
        ElementsPage elementsPage = new ElementsPage(getDriver());
        elementsPage.clickWidgetsDropDownAndMenuOption();
        /*WidgetsMenuPage widgetsMenuPage = new WidgetsMenuPage(getDriver());
        widgetsMenuPage.hoverOverMenuItem2();*/
        hoverOver("ul[id='nav']>li:nth-child(2)");
    }

    @Test
    public void hoverOverTest2(){
        startBrowser("https://www.dell.com/en-us");
        hoverOver("div[id='unified-masthead-navigation']>nav>ul>li:nth-child(2)");
    }
}
