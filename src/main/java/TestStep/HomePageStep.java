package TestStep;

import io.cucumber.java.en.And;

import org.testng.Assert;

public class HomePageStep extends BaseStep {

    @And("User sort of product by Highest Price")
    public void userSortOfProductByHighestPrice() {
        objHomePage.sortButton.click();
        objHomePage.priceHiloButton.click();
        double priceTag1 = Double.parseDouble(objHomePage.priceTag1.getText().replace("$",""));
        double priceTag2 = Double.parseDouble(objHomePage.priceTag2.getText().replace("$",""));
        double priceTag3 = Double.parseDouble(objHomePage.priceTag3.getText().replace("$", ""));

        isSorted(priceTag1,priceTag2,priceTag3);
    }

    @And("User click product card")
    public void userClickProductCard() {
        String productName = objHomePage.productName.getText();
        String priceTag = objHomePage.priceTag1.getText();
        objHomePage.productCard.click();

        String productNameDetails = objectProductDetails.productNameDetails.getText();
        String priceTagDetails = objectProductDetails.priceTagDetails.getText();
        Assert.assertEquals(productName, productNameDetails);
        Assert.assertEquals(priceTag, priceTagDetails);

    }
}
