package stepDefinitions;

import cucumber.api.java.en.*;

public class Login {
    @Given("I navigate to the Website")
    public void navigate_to_url(){
        System.out.println("Navigated to the URL");
    }
    @When("I entered the user name")
    public void enter_user_name(){
        System.out.println("I entered the user name");
    }
    @And("I entered the password")
    public void enter_password(){
        System.out.println("I entered the password");
    }

    @And("click on the sign-in button")
    public void click_on_signin_button(){
        System.out.println("click on the sign-in button");
    }

    @Then("validate user successfully logged-in")
    public void validate_success_login(){
        System.out.println("validate user successfully logged-in");
    }

    @But("log-in button is not present")
    public void validate_button(){
        System.out.println("log-in button is not present");
    }

    @Then("validate error message")
    public void validate_login_error(){
        System.out.println("validate error message");
    }
}
