
package com.example;

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


/**
 * Unit test for simple App.
 */
public class AppTest 
{
   
    public void testApp ()
    {

	String url = "https://bonigarcia.dev/selenium-webdriver-java/web-form.html";

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.get(url); 
	String title = driver.getTitle(); 
	String url1 = driver.getCurrentUrl();

	WebElement we = driver.findElement(By.name("my-select"));
        Select dropdown = new Select(we);
	dropdown.selectByValue("1");
dropdown.selectByIndex(1);
dropdown.selectByVisibleText("Three");

List<WebElement> options = dropdown.getOptions();
for(WebElement option: options){
String text = option.getText();
System.out.println(text);

}

	try{Thread.sleep(2000);}catch(Exception e){}


driver.navigate().to("https://bonigarcia.dev/selenium-webdriver-java/dropdown-menu.html");

WebElement wee1 = driver.findElement(By.xpath("//*[contains(text(),'Use right-click here')]"));

WebElement wee2 = driver.findElement(By.xpath("//*[contains(text(),'Use left-click here')]"));

WebElement wee3 = driver.findElement(By.xpath("//*[contains(text(),'Use double-click here')]"));


Actions actions = new Actions(driver);
actions.contextClick(wee1).build().perform();
actions.click(wee2).build().perform();
actions.doubleClick(wee3).build().perform();

driver.navigate().to("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
WebElement weeww1 = driver.findElement(By.name("my-file"));
String path= "C:\\Users\\Astami\\Desktop\\selenium\\my-project\\pom.xml";
weeww1.sendKeys(path);

WebElement ddu3 = driver.findElement(By.xpath("/html/body/main/div/form/div/div[3]/label[2]/input"));
String path1= "03/01/2024";
ddu3.sendKeys(path1);
        ddu3.sendKeys(Keys.ESCAPE);

driver.navigate().to("https://bonigarcia.dev/selenium-webdriver-java/navigation1.html");


List<WebElement> laddu3 = driver.findElements(By.xpath("//ul[@class='pagination']/li"));

for(int m = 2; m< laddu3.size();m++){

driver.findElement(By.xpath("//ul[@class='pagination']/li[" +m+ "]")).click();

try{Thread.sleep(2000);}catch(Exception e){}
}

driver.navigate().to("https://bonigarcia.dev/selenium-webdriver-java/long-page.html");

JavascriptExecutor js = (JavascriptExecutor)driver;

js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
try{Thread.sleep(5000);}catch(Exception e){}

js.executeScript("window.scrollTo(0,0)");
try{Thread.sleep(5000);}catch(Exception e){}

driver.navigate().back();

WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

WebElement ww = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div/div[4]/div/a")));

ww.click();

	driver.close();
		

	}
    }

