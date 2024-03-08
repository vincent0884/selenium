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


public class TestPage{

	WebDriver driver;

//constroctor

public TestPage(WebDriver driver){

System.out.println(Constant.MSG);
//Log.info("first log");

this.driver=driver;

}

//locators

By webFormButton = By.xpath("/html/body/main/div/div[4]/div[1]/div/div/a[1]");


//methods

public void clickWebFormButton(){

driver.findElement(webFormButton).click();
}

}