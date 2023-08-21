package TestStep;

import io.cucumber.java.en.And;

public class CartPageStep extends BaseStep {

    @And("user click check out button")
    public void userClickCheckOutButton() {
        objectCart.checkOutButton.click();
    }
}
