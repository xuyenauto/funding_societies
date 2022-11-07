package pageobjects;

import helpers.CommonActions;
import helpers.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopNavigationsPage extends  GenericPage{

    @Override
    public void waitForPageIsDisplayed() {
        WaitUtils.waitForElementPresent(driver,statisticsNavigation);
    }

    public TopNavigationsPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//li[@class='nav-menu__item']/a[text()='Statistics'])[1]")
    private WebElement statisticsNavigation;

    public void clickOnTopNavagationItem(String item){
        String xpath = "(//li[@class='nav-menu__item']/a[text()='"+item+"'])[1]";
        CommonActions.click(driver,driver.findElement(By.xpath(xpath)));
    }
}
