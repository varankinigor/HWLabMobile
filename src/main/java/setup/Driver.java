package setup;

import enums.BROWSERS;
import enums.TEST_PLATFORMS;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;

import java.io.File;
import java.net.URL;
import java.util.Properties;

public class Driver {
    private static AppiumDriver driverSingle = null;
    private static WebDriverWait waitSingle;

    private static String AUT;
    private static String SUT;
    private static String TEST_PLATFORM;
    private static String DRIVER;
    private static String DEVICE_NAME;
    private static String BROWSER_NAME;

    public static String getSUT() {
        return SUT;
    }

    private static ITestContext testContext;

    public static void initDriver(ITestContext context) throws Exception {
        testContext = context;
        prepareDriver();
    }

    private static void prepareDriver() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        Properties props = PropsHandler.getProps(testContext.getCurrentXmlTest().getParameter("propfile"));

        AUT = props.getProperty("aut");
        SUT = props.getProperty("sut") == null ? null : "http://" + props.getProperty("sut");
        TEST_PLATFORM = props.getProperty("platform");
        DRIVER = props.getProperty("driver");
        DEVICE_NAME = props.getProperty("deviceName");

        if (TEST_PLATFORM.equals(TEST_PLATFORMS.ANDROID.getText())) {
            BROWSER_NAME = BROWSERS.CHROME.getText();
        } else if (TEST_PLATFORM.equals(BROWSERS.SAFARI.getText())) {
            BROWSER_NAME = BROWSERS.SAFARI.getText();
        } else {
            throw new Exception("Unknown mobile platform");
        }

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, TEST_PLATFORM);

        if (AUT != null && SUT == null) {
            // Native
            File app = new File(AUT);
            capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        } else if (SUT != null && AUT == null) {
            // Web
            capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, BROWSER_NAME);
        } else {
            throw new Exception("Unclear type of mobile app");
        }

        // Init driver for local Appium server with capabilities have been set
        if (driverSingle == null) {
            driverSingle = new AppiumDriver(new URL(DRIVER), capabilities);
        }
        // Set an object to handle timeouts
        if (waitSingle == null) {
            waitSingle = new WebDriverWait(getDriver(), 10);
        }
    }

    public static AppiumDriver getDriver() throws Exception {
        if (driverSingle == null) {
            prepareDriver();
        }
        return driverSingle;
    }

    public static WebDriverWait getWaiter() {
        return waitSingle;
    }
}
