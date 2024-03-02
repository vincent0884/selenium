
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SimpleTest{

TestPage tp;

String url = "https://bonigarcia.dev/selenium-webdriver-java/index.html";



public void test1(){
WebDriverManager.chromedriver().setup();
WebDriver driver;
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get(url); 
tp = new TestPage(driver); 
tp.clickWebFormButton();
driver.quit();
	



}


}
