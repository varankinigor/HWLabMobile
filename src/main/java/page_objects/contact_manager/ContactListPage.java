package page_objects.contact_manager;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import setup.Driver;

public class ContactListPage extends BasePage {
    private By addContactBtn = By.id(app_package_name + "addContactButton");

    /**
     * Check that addContactBtn is displayed
     */
    public void checkAddContactBtnDisplayed() throws Exception {
        checkIsDisplayed(addContactBtn);
    }

    /**
     * Click on addContactBtn
     */
    public void clickAddContactBtn() throws Exception {
        Driver.getDriver().findElement(addContactBtn).click();
    }
}
