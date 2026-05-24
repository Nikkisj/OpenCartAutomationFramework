package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    static ExtentReports extent;

    public static ExtentReports getReportObject() {

        String reportPath =
                System.getProperty("user.dir")
                        + "/reports/index.html";

        ExtentSparkReporter reporter =
                new ExtentSparkReporter(reportPath);

        reporter.config()
                .setReportName(
                        "OpenCart Automation Report");

        reporter.config()
                .setDocumentTitle(
                        "Test Execution Report");

        extent = new ExtentReports();

        extent.attachReporter(reporter);

        extent.setSystemInfo(
                "Project",
                "OpenCart Automation");

        extent.setSystemInfo(
                "Tester",
                "Nikita Jadhav");

        extent.setSystemInfo(
                "Environment",
                "QA");

        return extent;
    }
}