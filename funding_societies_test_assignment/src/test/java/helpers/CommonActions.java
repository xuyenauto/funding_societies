package helpers;

import org.openqa.selenium.*;
import steps_definitions.Hooks;

import java.util.Arrays;

import static helpers.WaitUtils.*;


public class CommonActions extends Hooks {

    public static void setText(WebElement element, String key) {
        waitForElementPresent(driver,element);
        try {
            if (element.isDisplayed() && element.isEnabled()) {
                element.clear();
                element.sendKeys(key);
            } else {
                Log.info("Unable to set text on field");
            }
        } catch (StaleElementReferenceException e) {
            Log.info("#Unable to set text on field: Element is not attached to the page document " + Arrays.toString(e.getStackTrace()));
        } catch (NoSuchElementException e) {
            Log.info("#Unable to set text on field: Element was not found in DOM " + Arrays.toString(e.getStackTrace()));
        } catch (Exception e) {
            Log.info("Unable to set text on field " + Arrays.toString(e.getStackTrace()));
        }
    }


    public static String getText(WebDriver driver, WebElement element) {
        waitForElementPresent(driver, element,100);
        return element.getText();
    }

    public static void clickByJS(WebDriver driver, WebElement element) {
        waitForElementClickable(driver,element);
        try {
            if (element.isEnabled() && element.isDisplayed()) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
            } else {
                System.out.println("Unable to click on element");
            }
        } catch (StaleElementReferenceException e) {
            System.out.println("Element is not attached to the page DOCUMENT " + Arrays.toString(e.getStackTrace()));
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Element was not found in DOM " + Arrays.toString(e.getStackTrace()));
        } catch (Exception e) {
            System.out.println("Unable to click on element " + Arrays.toString(e.getStackTrace()));
        }
    }


    public static void click(WebDriver driver, WebElement element){
        waitForElementClickable(driver,element);
        scrollToElement(element);
        element.click();
    }

    public static void scrollToElement(WebElement el) {
        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].scrollIntoView(true);", el);
        }
    }

    public static boolean isExistElementBy(WebDriver driver, By by){
        try{
            return driver.findElement(by).isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    public static String getCurrentOperation(){
        return System.getProperty("os.name");
    }
}