package scenarios;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page_objects.contact_manager.AddContactPage;
import page_objects.contact_manager.ContactListPage;
import setup.Driver;


@Test(groups = "native")
public class SimpleNativeTests extends Hooks {
    private ContactListPage contactListPage;
    private AddContactPage addContactPage;

    @BeforeClass
    public void initPages() throws Exception {
        contactListPage = new ContactListPage(Driver.getDriver());
        addContactPage = new AddContactPage(Driver.getDriver());
    }

    @Test(description = "Check AddContactBtn, click on it, and check AddContactPage elements")
    public void simplestNativeTest() {
        contactListPage.checkAddContactBtnDisplayed();

        contactListPage.clickAddContactBtn();
        addContactPage.checkAllElementsDisplayed();
        addContactPage.checkTitles();
    }
}
