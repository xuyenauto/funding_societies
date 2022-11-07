package steps_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageobjects.ProgressPage;

public class ProgressSteps {

    ProgressPage progressPage = new ProgressPage();

    @Then("^I should see the total funded value is displayed$")
    public void iShouldSeeTheTotalFundedValueIsDisplayed() {
        Assert.assertFalse("Total funded value is empty",progressPage.isTotalFundedEmpty());
    }

    @And("^I should see the number of financing value is displayed$")
    public void iShouldSeeTheNumberOfFinancingValueIsDisplayed() {
        Assert.assertFalse("No financing value is empty",progressPage.isNoOfFinancingEmpty());
    }

    @And("^I should see the default rate value is displayed$")
    public void iShouldSeeTheDefaultRateValueIsDisplayed() {
        Assert.assertFalse("Default rate value is empty",progressPage.isDefaultRateEmpty());
    }

    @And("^I should see the financing fulfillment rate value is displayed$")
    public void iShouldSeeTheFinancingFulfillmentRateValueIsDisplayed() {
        Assert.assertFalse("Financing Fullfillment rate value is empty",progressPage.isFinancingFulfillmentRateEmpty());
    }

    @And("^I should see the \"([^\"]*)\" tab is displayed$")
    public void iShouldSeeTheTabIsDisplayed(String arg0){
        Assert.assertTrue("Tab " + arg0 + "is not displayed",progressPage.isTabDisplayed(arg0));

    }

    @When("^I click on \"([^\"]*)\" tab$")
    public void iClickOnTab(String arg0)  {
       
    }

    @Then("^I get the total approved value$")
    public void iGetTheTotalApprovedValue() {
    }
}
