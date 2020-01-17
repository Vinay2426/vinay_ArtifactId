package org.example_GroupId;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs
{
    LoginPage loginPage = new LoginPage();

    @Given("^user is on homepage$")
    public void userIsOnHomepage()
    {
    }

    @When("^user enter valid credential for login$")
    public void userEnterValidCredentialForLogin()
    {
        loginPage.userEnterValidCredential();
    }

    @Then("^user should be able to login successfully$")
    public void userShouldBeAbleToLoginSuccessfully() {
    }
}
