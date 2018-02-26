package page_objects.contact_manager;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import setup.Driver;

public abstract class BasePage {
    protected String app_package_name = "com.example.android.contactmanager:id/";

    /**
     * Custom isDisplayed assert with error message
      * @param element - element to check
     */
    protected void checkIsDisplayed(By element) throws Exception {
        Assert.assertTrue(Driver.getDriver().findElement(element).isDisplayed(), element + " is not displayed");
    }

    /**
     * Custom assert to check that text of element is equals to str
     * @param element - element to check
     * @param str - expected value of element text
     */
    protected void checkTitleText(By element, String str) throws Exception {
        if (Driver.getDriver().findElement(element).isDisplayed()) {
            Assert.assertEquals(Driver.getDriver().findElement(element).getText(), str, element + " is not equals to " + str);
        }
    }
}