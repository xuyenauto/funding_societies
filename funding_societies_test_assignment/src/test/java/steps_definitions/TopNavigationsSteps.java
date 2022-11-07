package steps_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.TopNavigationsPage;

public class TopNavigationsSteps {

    TopNavigationsPage topNavigationsPage = new TopNavigationsPage();

    @When("^I click on \"([^\"]*)\" on top navigation$")
    public void iClickOnOnTopNavigation(String arg0)  {
        topNavigationsPage.clickOnTopNavagationItem(arg0);
    }



}
