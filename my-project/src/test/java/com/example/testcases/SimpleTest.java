
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class SimpleTest{

TestPage tp;
WebDriver driver;
private static final Logger logger = LoggerFactory.getLogger(SimpleTest.class);
ExtentSparkReporter reporter = new ExtentSparkReporter("extent-report.html");
ExtentReports extent = new ExtentReports();
ExtentTest test;

@Before
public void setup(){
extent.attachReporter(reporter);
test = extent.createTest("MyFirstTest", "Sample description");
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get(Constant.URL); 
}

@After
public void teardown(){
 // Take a screenshot
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        try {
            // Save the screenshot to a file
            FileUtils.copyFile(screenshotFile, new File("C:\\Users\\Astami\\Desktop\\selenium\\my-project\\screenshot.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
driver.quit();
extent.flush();
}

@Test
public void test1(){
assertEquals("Hands-On Selenium WebDriver with Java",driver.getTitle());
logger.info("Test compled");
test.log(Status.INFO, "This step shows usage of log(status, details)");


}

@Test
public void test2(){
tp = new TestPage(driver); 
tp.clickWebFormButton();
logger.info("Test compled");
test.log(Status.INFO, "This step shows usage of log(status, details)");


}


}
