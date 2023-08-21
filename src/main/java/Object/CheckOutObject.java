package Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutObject extends AbstractObject{
    public CheckOutObject(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "first-name")
    public WebElement firstNameField;

    @FindBy (id = "last-name")
    public WebElement lastNameField;

    @FindBy (id = "postal-code")
    public WebElement zipCodeField;

    @FindBy (id = "continue")
    public WebElement continueButton;

    @FindBy (id = "finish")
    public WebElement finishOrderButton;

    @FindBy (className = "title")
    public WebElement orderStatus;
}
