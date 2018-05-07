package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class flipkartSteps {
	WebDriver driver;
	static String parentWindowID;

	@Given("^The user is in Flipkart site$")
	public void the_user_is_in_Flipkart_site() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Computer\\workspace\\DemoqaRegisteration\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
 
	}

	@When("^The user selected the iphones \"([^\"]*)\"$")
	public void the_user_selected_the_iphones(String itemname) throws Throwable {
	       driver.findElement(By.xpath("//input[@class='LM6RPg']")).click();
	        driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys(itemname);
	       
	        driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        parentWindowID = driver.getWindowHandle();
	        driver.findElement(By.xpath("//a[@title='Apple iPhone X (Space Gray, 64 GB)']")).click();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
	        
	       // WebDriverWait wait=new WebDriverWait(driver,10);
	       // wait.until(ExpectedConditions.presenceOfElementLocated(locator))
	}

	@Then("^The user verifies items are sucessfully added$")
	public void the_user_verifies_items_are_sucessfully_added() throws Throwable {

	}
}
