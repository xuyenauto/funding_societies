package pageobjects;

import org.openqa.selenium.support.PageFactory;
import steps_definitions.Hooks;

public abstract class GenericPage extends Hooks {

    public GenericPage(){
        PageFactory.initElements(driver,this);
    }
    public abstract void waitForPageIsDisplayed();
}
