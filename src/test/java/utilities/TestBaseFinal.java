package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.stream.StreamSupport;

public class TestBaseFinal {

    protected static ExtentReports extentReports;
    protected static ExtentTest extendTest;
    protected static ExtentHtmlReporter extentHtmlReporter;

    @BeforeTest
    public void setUpTest(){
    extentReports = new ExtentReports();
    String filePath = System.getProperty("user.dir") + "/test-output/report.html";
    extentHtmlReporter = new ExtentHtmlReporter(filePath);
    extentReports.attachReporter(extentHtmlReporter);
    extentReports.setSystemInfo("Environment", "QA");
    extentReports.setSystemInfo("Browser", ConfigReader.getProperty("browser"));
    extentHtmlReporter.config().setDocumentTitle("Concort Hotel");
    }

    @AfterMethod
    public void tearDownMethodForScreenshot(ITestResult result) throws IOException {

        if (result.getStatus() == ITestResult.FAILURE) {

            String screenshotLocation = ReusableMethods.getScreenshot(result.getName());
            extendTest.fail(result.getName());
            extendTest.addScreenCaptureFromPath(screenshotLocation);
            extendTest.fail(result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) {
            extendTest.skip("Test Case is skipped: " + result.getName());
        }
        Driver.closeDriver();
    }

    @AfterTest(alwaysRun = true)
    public void tearDownTest() {
        extentReports.flush();
    }
}



