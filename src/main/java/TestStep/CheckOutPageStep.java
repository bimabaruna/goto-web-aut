package TestStep;

import io.cucumber.java.en.And;
import org.testng.Assert;

import java.io.IOException;

public class CheckOutPageStep extends BaseStep{

    @And("user input {string} on first name field")
    public void userInputOnFirstNameField(String firstname) {
        objectCheckOut.firstNameField.sendKeys(firstname);
    }

    @And("user input {string} on last name field")
    public void userInputOnLastNameField(String lastname) {
        objectCheckOut.lastNameField.sendKeys(lastname);
    }

    @And("user input {string} on zip code field")
    public void userInputOnZipCodeField(String zipCode) {
        objectCheckOut.zipCodeField.sendKeys(zipCode);
    }

    @And("user click continue button")
    public void userClickContinueButton() throws IOException {
        objectCheckOut.continueButton.click();
        objectCheckOut.finishOrderButton.click();
        String actualStatus = objectCheckOut.orderStatus.getText();
        String expectedStatus = "Checkout: Complete!";

        Assert.assertEquals(actualStatus, expectedStatus);
        captureScreen();
    }
}
