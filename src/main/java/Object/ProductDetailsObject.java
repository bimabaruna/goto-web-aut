package Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsObject extends AbstractObject{
    public ProductDetailsObject(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "/html/body/div/div/div/div[2]/div/div/div[2]/button")
    public WebElement addToCartProduct;

    @FindBy (xpath = "/html/body/div/div/div/div[2]/div/div/div[2]/div[1]")
    public WebElement productNameDetails;

    @FindBy (className = "inventory_details_price")
    public WebElement priceTagDetails;

    @FindBy (className = "shopping_cart_badge")
    public WebElement cartButton;



}
