package Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartObject extends AbstractObject {
    public CartObject(WebDriver driver) {
        super(driver);
    }

    @FindBy (className = "inventory_item_name")
    public WebElement productNameAtCart;

    @FindBy (id = "checkout")
    public WebElement checkOutButton;
}
