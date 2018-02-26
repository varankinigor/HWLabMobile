package page_objects.contact_manager;

import enums.ADD_CONTACT_TITLES;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class AddContactPage extends BasePage {
    private By targetAccountTilte = By.xpath("//android.widget.TextView[@content-desc=\"Target Account\"]");
    private By accountSpinner = By.id(app_package_name + "accountSpinner");

    private By contactNameTitle = By.xpath("//android.widget.TextView[@content-desc=\"Contact Name\"]");
    private By nameEditTextBox = By.id(app_package_name + "contactNameEditText");

    private By contactPhoneTitle = By.xpath("//android.widget.TextView[@content-desc=\"Contact Phone\"]");
    private By contactPhoneEditTextBox = By.id(app_package_name + "contactPhoneEditText");
    private By contactPhoneTypeSpinner = By.id(app_package_name + "contactPhoneTypeSpinner");

    private By contactEmailTitle = By.xpath("//android.widget.TextView[@content-desc=\"Contact Email\"]");
    private By contactEmailEditTextBox = By.id(app_package_name + "contactEmailEditText");
    private By contactEmailTypeSpinner = By.id(app_package_name + "contactEmailTypeSpinner");

    private By contactSaveButton = By.id(app_package_name + "contactSaveButton");

    /**
     *  Checks that all elements on page is displayed
     */
    public void checkAllElementsDisplayed() throws Exception {
        checkIsDisplayed(targetAccountTilte);
        checkIsDisplayed(accountSpinner);
        checkIsDisplayed(contactNameTitle);
        checkIsDisplayed(nameEditTextBox);
        checkIsDisplayed(contactPhoneTitle);
        checkIsDisplayed(contactPhoneEditTextBox);
        checkIsDisplayed(contactPhoneTypeSpinner);
        checkIsDisplayed(contactEmailTitle);
        checkIsDisplayed(contactEmailEditTextBox);
        checkIsDisplayed(contactEmailTypeSpinner);
        checkIsDisplayed(contactSaveButton);
    }

    /**
     * Check that all titles has correct texts
     */
    public void checkTitles() throws Exception {
        checkTitleText(targetAccountTilte, ADD_CONTACT_TITLES.TARGET_ACCOUNT.getText());
        checkTitleText(contactNameTitle, ADD_CONTACT_TITLES.CONTACT_NAME.getText());
        checkTitleText(contactPhoneTitle, ADD_CONTACT_TITLES.CONTACT_PHONE.getText());
        checkTitleText(contactEmailTitle, ADD_CONTACT_TITLES.CONTACT_EMAIL.getText());
    }
}
