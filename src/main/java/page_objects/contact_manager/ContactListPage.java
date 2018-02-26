package page_objects.contact_manager;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class ContactListPage extends BasePage {
    public ContactListPage(AppiumDriver driver) {
        this.driver = driver;
    }

    private By addContactBtn = By.id(app_package_name + "addContactButton");

    /**
     * Check that addContactBtn is displayed
     */
    public void checkAddContactBtnDisplayed() {
        checkIsDisplayed(addContactBtn);
    }

    /**
     * Click on addContactBtn
     */
    public void clickAddContactBtn() {
        driver.findElement(addContactBtn).click();
    }
}
