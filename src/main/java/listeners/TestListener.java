package listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import base.DriverFactory;
import utils.ExtentManager;
import utils.ExtentTestManager;
import utils.ScreenshotUtil;

public class TestListener implements ITestListener {

    ExtentReports extent =
            ExtentManager.getReportObject();

    @Override
    public void onTestStart(ITestResult result) {

        ExtentTest test =
                extent.createTest(result.getName());

        ExtentTestManager.setTest(test);
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        ExtentTestManager.getTest()
                .pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        ExtentTestManager.getTest()
                .fail(result.getThrowable());

        try {

            String screenshotPath =
                    ScreenshotUtil.captureScreenshot(
                            DriverFactory.getDriver(),
                            result.getName());

            ExtentTestManager.getTest()
                    .addScreenCaptureFromPath(
                            screenshotPath);

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {

        ExtentTestManager.getTest()
                .skip("Test Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {

        extent.flush();
    }
}