package page_objects.iana;

import enums.HOME_PANEL_TEXTS;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import setup.Driver;

public class IanaPage {

    private By headerText = By.cssSelector("#intro p");

    private By homePanelDomainsHeaderLink = By.cssSelector("#home-panel-domains h2 a");
    private By homePanelDomainsText = By.cssSelector("#home-panel-domains p");

    private By homePanelNumbersHeaderLink = By.cssSelector("#home-panel-numbers h2 a");
    private By homePanelNumbersText = By.cssSelector("#home-panel-numbers p");

    private By homePanelProtocolsHeaderLink = By.cssSelector("#home-panel-protocols h2 a");
    private By homePanelProtocolsText = By.cssSelector("#home-panel-protocols p");

    /**
     * Custom isDisplayed assert with error message
     * @param element - element to check
     */
    private void checkIsDisplayed(By element) throws Exception {
        Assert.assertTrue(Driver.getDriver().findElement(element).isDisplayed(), element + " is not displayed");
    }

    /**
     * Custom assert to check that text of element is equals to str
     * @param element - element to check
     * @param str - expected value of element text
     */
    private void checkTextCorrect(By element, String str) throws Exception {
        if (Driver.getDriver().findElement(element).isDisplayed()) {
            Assert.assertEquals(Driver.getDriver().findElement(element).getText(), str, element + " is not equals to " + str);
        }
    }

    /**
     * Navigate to iana.org
     */
    public void openIanaPage() throws Exception {
        Driver.getDriver().get(Driver.getSUT());
        Driver.getWaiter().until(ExpectedConditions.urlToBe(Driver.getSUT() + "/"));
    }

    /**
     * Checks that all elements on page is displayed
     */
    public void checkTextsDisplayed() throws Exception {
        checkIsDisplayed(headerText);
        checkIsDisplayed(homePanelDomainsHeaderLink);
        checkIsDisplayed(homePanelDomainsText);
        checkIsDisplayed(homePanelNumbersHeaderLink);
        checkIsDisplayed(homePanelNumbersText);
        checkIsDisplayed(homePanelProtocolsHeaderLink);
        checkIsDisplayed(homePanelProtocolsText);
    }

    /**
     * Check that all texts are correct
     */
    public void checkTextsCorrect() throws Exception {
        checkTextCorrect(headerText, HOME_PANEL_TEXTS.HEADER_TEXT.getText());
        checkTextCorrect(homePanelDomainsHeaderLink, HOME_PANEL_TEXTS.DOMAINS_HEADER_TEXT.getText());
        checkTextCorrect(homePanelDomainsText, HOME_PANEL_TEXTS.DOMAINS_TEXT.getText());
        checkTextCorrect(homePanelNumbersHeaderLink, HOME_PANEL_TEXTS.NUMBERS_HEADER_TEXT.getText());
        checkTextCorrect(homePanelNumbersText, HOME_PANEL_TEXTS.NUMBERS_TEXT.getText());
        checkTextCorrect(homePanelProtocolsHeaderLink, HOME_PANEL_TEXTS.PROTOCOLS_HEADER_TEXT.getText());
        checkTextCorrect(homePanelProtocolsText, HOME_PANEL_TEXTS.PROTOCOLS_TEXT.getText());
    }
}
