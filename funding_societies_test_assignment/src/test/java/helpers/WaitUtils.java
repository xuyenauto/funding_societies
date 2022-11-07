package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

    public static void waitForElementPresent(WebDriver aDriver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(aDriver, Constant.TIME_OUT_SECOND);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForElementPresent(WebDriver aDriver, WebElement element, int time) {
        WebDriverWait wait = new WebDriverWait(aDriver, time);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForElementClickable(WebDriver aDriver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(aDriver, Constant.TIME_OUT_SECOND);
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
