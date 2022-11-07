package steps_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import helpers.CommonActions;
import helpers.Log;
import helpers.ReadDataFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;


public class Hooks {

    protected static WebDriver driver;
    ReadDataFile readDataFile = new ReadDataFile();
    String url = readDataFile.readJsonFile("/Config.json","Constant","url");
    String browser = readDataFile.readJsonFile("/Config.json","Constant","browser");
    String firefoxPath = readDataFile.readJsonFile("/Config.json","Constant","firefox_install_location");

    @Before
    public WebDriver initializeTest() throws Exception{
        switch (browser){
            case "firefox":
                if(firefoxPath.equals(null) || firefoxPath.equals("")){
                    Log.error("You are missing the firefox installation location");
                }
                File pathBinary = new File(firefoxPath);
                FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
                DesiredCapabilities desired = DesiredCapabilities.firefox();
                FirefoxOptions options = new FirefoxOptions();
                desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver(options);
                break;
            case "edge":
                //todo
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
        }
        openHomePage();
        return driver;
    }

    @After
    public void embedScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.close();
            driver.quit();
        }
    }

    private void openHomePage() {
        driver.navigate().to(url);
        if(CommonActions.getCurrentOperation().contains("Mac")){
            driver.manage().window().fullscreen();
        }else{
            driver.manage().window().maximize();
        }
    }
}
