package TestStep;

import Test.TestRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LoginPageStep extends BaseStep{

    @Given("User input field user name with {string}")
    public void userInputFieldUserNameWith(String username) {
        objLogin.usernameField.sendKeys(username);
    }

    @And("User input field password with {string}")
    public void userInputFieldPasswordWith(String password) {
        objLogin.passwordField.sendKeys(password);

    }

    @And("User click login button")
    public void userClickLoginButton() {
        objLogin.loginButton.click();
        objLogin.menuButton.click();
        objLogin.logoutButton.isDisplayed(); // Verify user success login by verify logout button is displayed
    }

}
