package MyStepDefination;

import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import Pages.LoginPage;

import java.io.IOException;

public class LoginStepDefination {

    WebDriver driver = Hooks.driver;
    LoginPage loginPage;

    @Given("I am on the AutomationExercise login page")
    public void i_am_on_the_automation_exercise_login_page()throws IOException {
        driver.get("https://www.automationexercise.com/login");
        loginPage = new LoginPage(driver);

    }

    @Given("I have entered valid {string} and {string}")
    public void i_have_entered_a_valid_username_and_password(String username, String password) throws IOException{
        loginPage.enterEmail(username);
        loginPage.enterPassword(password);
    }

    @When("I click on the login button")
    public void i_click_on_the_login_button()throws IOException {
        loginPage.clickLoginButton();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() throws IOException{
        Assert.assertEquals(loginPage.checkLogoutButton(), true);
    }

    @Given("I have entered invalid {string} and {string}")
    public void i_have_entered_invalid_and(String username, String password) throws IOException{
        loginPage.enterEmail(username);
        loginPage.enterPassword(password);
    }

    @Then("I should see an error message indicating {string}")
    public void i_should_see_an_error_message() throws IOException {
        Assert.assertEquals(loginPage.checkErrorMesage(), true);
    }

}
