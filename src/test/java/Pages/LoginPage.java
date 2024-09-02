package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {

    WebDriver driver;

    // Locators
    private By emailInputLocator = By.name("email");
    private By passwordInputLocator = By.name("password");
    private By loginButtonLocator = By.xpath("//button[@type='submit']");
    private By logoutButtonLocator = By.xpath("//a[@href='/logout']");
    private By errorMessageLocator = By.xpath("//p[normalize-space()='Your email or password is incorrect!']");



    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void enterEmail(String email) {
        WebElement emailInput = driver.findElement(emailInputLocator);
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordInput = driver.findElement(passwordInputLocator);
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();
    }

    public boolean checkLogoutButton(){
        return driver.findElement(logoutButtonLocator).isDisplayed();
    }

    public boolean checkErrorMesage(){
        return driver.findElement(errorMessageLocator).isDisplayed();
    }
}
