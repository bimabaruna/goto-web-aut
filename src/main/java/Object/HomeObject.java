package Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeObject extends AbstractObject{
    public HomeObject(WebDriver driver) {
        super(driver);
    }

    @FindBy (className = "select_container")
    public WebElement sortButton;

    @FindBy (xpath = "/html/body/div/div/div/div[1]/div[2]/div/span/select/option[4]")
    public WebElement priceHiloButton;

    @FindBy (xpath = "/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/div")
    public WebElement priceTag1;

    @FindBy (xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div")
    public WebElement priceTag2;

    @FindBy (xpath = "/html/body/div/div/div/div[2]/div/div/div/div[3]/div[2]/div[2]/div")
    public WebElement priceTag3;

    @FindBy (className = "inventory_item_img")
    public WebElement productCard;

    @FindBy (className = "inventory_item_name")
    public WebElement productName;


}
