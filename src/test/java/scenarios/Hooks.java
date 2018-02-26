package scenarios;

import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static setup.Driver.getDriver;
import static setup.Driver.initDriver;

public class Hooks  {
    @BeforeSuite(groups = "web")
    public void setUpWeb(ITestContext testContext) throws Exception {
        initDriver(testContext);
    }

    @AfterSuite(groups = "web")
    public void tearDownWeb() throws Exception {
        getDriver().quit();
    }

    @BeforeSuite(groups = "native")
    public void setUpNative(ITestContext testContext) throws Exception {
        initDriver(testContext);
    }

    @AfterSuite(groups = "native")
    public void tearDownNative() throws Exception {
        getDriver().closeApp();
        getDriver().quit();
    }
}
