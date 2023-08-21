package Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginObject extends AbstractObject {
    public LoginObject(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "user-name")
    public WebElement  usernameField;

    @FindBy (id = "password")
    public WebElement passwordField;

    @FindBy (id = "login-button")
    public WebElement loginButton;

    @FindBy (id = "react-burger-menu-btn")
    public WebElement menuButton;

    @FindBy (id = "logout_sidebar_link")
    public WebElement logoutButton;
}
