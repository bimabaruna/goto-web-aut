package TestStep;

import Test.TestRunner;
import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;
import Object.*;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class BaseStep {

    public static LoginObject objLogin = new LoginObject(TestRunner.driver);
    public static HomeObject objHomePage = new HomeObject(TestRunner.driver);
    public static ProductDetailsObject objectProductDetails = new ProductDetailsObject(TestRunner.driver);
    public static CartObject objectCart = new CartObject(TestRunner.driver);
    public static CheckOutObject objectCheckOut = new CheckOutObject(TestRunner.driver);

    public WebDriverWait wt = new WebDriverWait(TestRunner.driver,55);

    public void implicitWait(Integer time){
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {

        }
    }

    public static boolean verifySortHilo(double a, double b, double c){
        for (int i = 1; i< a; i++){
            if (a < b  || b < c){
                return false;
            }
        }return true;
    }

    public void isSorted(double a, double b, double c){

        boolean isSorted = verifySortHilo(a,b,c);
        if (isSorted) {
            System.out.println("Quantities are sorted correctly.");
            String correctSorted =  "Quantities are sorted correctly.";
            Assert.assertEquals("Quantities are sorted correctly.", correctSorted);

        } else {
            System.out.println("Quantities are not sorted correctly.");
            String incorrectSorted = "Quantities are not sorted correctly";
            Assert.assertEquals("Quantities are sorted correctly", incorrectSorted);
        }
    }

    public void captureScreen() throws IOException {
        File imageFile = ((TakesScreenshot) TestRunner.driver).getScreenshotAs(OutputType.FILE);
        String imageFileName =  new SimpleDateFormat("MM-dd-yyyy_HH-mm").format(new GregorianCalendar().getTime()) + ".png";
        File successOrderImageFile = new File(System.getProperty("user.dir") + "//target/cucumber-html-reports/screenshots order success/ " + imageFileName);
        successOrderImageFile.getParentFile().mkdir();
        successOrderImageFile.createNewFile();
        Files.copy(imageFile, successOrderImageFile);
    }

}
