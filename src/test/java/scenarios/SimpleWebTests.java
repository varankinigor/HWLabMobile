package scenarios;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page_objects.iana.IanaPage;
import setup.Driver;

@Test(groups = "web")
public class SimpleWebTests extends Hooks {

    private IanaPage ianaPage;
    @BeforeClass
    public void initPages() {
        ianaPage = new IanaPage();
    }

    @Test(description = "Open iana.org and checks text on the home page")
    public void webTest() throws Exception {
        ianaPage.openIanaPage();

        ianaPage.checkTextsDisplayed();

        ianaPage.checkTextsCorrect();
    }
}
