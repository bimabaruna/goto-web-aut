package TestStep;

import io.cucumber.java.en.And;
import org.testng.Assert;

public class ProductDetailsStep extends BaseStep{


    @And("User click add to cart button")
    public void userClickAddToCartButton() {
        objectProductDetails.addToCartProduct.click();
        String productName = objectProductDetails.productNameDetails.getText();

        objectProductDetails.cartButton.click();
        String productNameAtCart = objectCart.productNameAtCart.getText();

        Assert.assertEquals(productName, productNameAtCart);
    }
}
