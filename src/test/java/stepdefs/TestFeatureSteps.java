package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestFeatureSteps {

    @Given("^I have (\\d+) positive numbers$")
    public void i_have_positive_numbers(int arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I add (\\d+) numbers$")
    public void i_add_numbers(int arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^Sum should be greater than (\\d+)\\.$")
    public void sum_should_be_greater_than(int arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}
