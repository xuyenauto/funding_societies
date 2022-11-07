package pageobjects;

import helpers.CommonActions;
import helpers.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgressPage extends  GenericPage{
    @Override
    public void waitForPageIsDisplayed() {
        WaitUtils.waitForElementPresent(driver,title);
    }

    public ProgressPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h1[.='Our Progress']")
    private WebElement title;

    @FindBy(xpath = "//div[text()='Total funded']/preceding-sibling::font")
    private WebElement totalFunded;

    @FindBy(xpath = "//div[contains(text(),'No.')]/preceding-sibling::font")
    private WebElement noOfFinancing;

    @FindBy(xpath = "//div[contains(text(),'Default')]/preceding-sibling::font")
    private WebElement defaultRate;

    @FindBy(xpath = "//div[contains(text(),'Financing')]/preceding-sibling::font")
    private WebElement financingFulfillmentRate;

    public String getTotalFunded(){
        return CommonActions.getText(driver,totalFunded);
    }

    public String getNoOfFinancing(){
        return CommonActions.getText(driver,noOfFinancing);
    }

    public String getDefaultRate(){
        return CommonActions.getText(driver,defaultRate);
    }

    public String getFinancingFulfillmentRate(){
        return CommonActions.getText(driver, financingFulfillmentRate);
    }

    public boolean isTotalFundedEmpty(){
        if(getTotalFunded()==null){
            return true;
        }
        return  false;
    }

    public boolean isNoOfFinancingEmpty(){
        if(getNoOfFinancing()==null){
            return true;
        }
        return  false;
    }

    public boolean isDefaultRateEmpty(){
        if(getDefaultRate()==null){
            return true;
        }
        return  false;
    }

    public boolean isFinancingFulfillmentRateEmpty(){
        if(getFinancingFulfillmentRate()==null){
            return true;
        }
        return  false;
    }

    public boolean isTabDisplayed(String tabName){
        String xpath = "//button[contains(@class,'tab-button -progress') and normalize-space(text()='"+tabName+"')]";
        return CommonActions.isExistElementBy(driver,By.xpath(xpath));
    }

    public void  clickOnSpecificTab(String tabName){
        String xpath = "//button[contains(@class,'tab-button -progress') and normalize-space(text()='"+tabName+"')]";
        CommonActions.click(driver, driver.findElement(By.xpath(xpath)));
    }
}
