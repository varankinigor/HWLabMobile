package page_objects.contact_manager;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public abstract class BasePage {
    protected String app_package_name = "com.example.android.contactmanager:id/";
    protected AppiumDriver driver;

    /**
     * Custom isDisplayed assert with error message
      * @param element - element to check
     */
    protected void checkIsDisplayed(By element) {
        Assert.assertTrue(driver.findElement(element).isDisplayed(), element + " is not displayed");
    }

    /**
     * Custom assert to check that text of element is equals to str
     * @param element - element to check
     * @param str - expected value of element text
     */
    protected void checkTitleText(By element, String str) {
        if (driver.findElement(element).isDisplayed()) {
            Assert.assertEquals(driver.findElement(element).getText(), str, element + " is not equals to " + str);
        }
    }
}