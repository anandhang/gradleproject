package test_scripts.bdd.bddsteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testdemosteps {

    @Given("Open the URL {string}")
    public void open_the_url(String string) {
        System.out.println(string);
    }

    @When("user is entering {string}")
    public void user_is_entering(String string) {
        System.out.println(string);
    }
    @When("press the enter key")
    public void press_the_enter_key() {
        System.out.println("press the enter key");
    }
    @Then("validate results")
    public void validate_results() {
        System.out.println("validate results");
    }
}
