package StepDef;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
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


@When("^The user selected the iphones \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void the_user_selected_the_iphones(String itemname1, String itemname2, String itemname3, String itemname4, String itemname5) throws Throwable {
  
//	1st iteration
	       driver.findElement(By.xpath("//input[@class='LM6RPg']")).click();
	        driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys(itemname1);
	       
	        driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        parentWindowID = driver.getWindowHandle();
	        driver.findElement(By.xpath("//a[@title='Apple iPhone X (Space Gray, 256 GB)']")).click();
	        
	        Set<String> WH = driver.getWindowHandles();
	        System.out.println(WH);
	        for(String x:WH)
	        {
	        if(!parentWindowID.equals(x)){
	        	driver.switchTo().window(x);}	
	        	}
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
	        
	        Thread.sleep(1000);
//	        2nd iteration
	        driver.findElement(By.xpath("//input[@class='LM6RPg']")).click();
	        driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys(itemname2);
	       
	        driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        parentWindowID = driver.getWindowHandle();
	        driver.findElement(By.xpath("//a[@title='Apple iPhone X (Space Gray, 64 GB)']")).click();
	        
	        Set<String> WH1 = driver.getWindowHandles();
	        System.out.println(WH1);
	        for(String x1:WH1)
	        {
	        if(!parentWindowID.equals(x1)){
	        	driver.switchTo().window(x1);}	
	        	}
	        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	        driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
	        
//			3rd iteration
                Thread.sleep(2000);
                driver.findElement(By.xpath("//input[@class='LM6RPg']")).click();
                driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys(itemname3);

                 driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
                 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                 parentWindowID = driver.getWindowHandle();
                 driver.findElement(By.xpath("//a[@title='Apple iPhone X (Silver, 64 GB)']")).click();

                Set<String> WH2 = driver.getWindowHandles();
                System.out.println(WH2);
                System.out.println("Hai");
                for(String x2:WH2)
                  {
                   if(!parentWindowID.equals(x2)){
	               driver.switchTo().window(x2);}	
	             }
                 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
                 driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
                 Thread.sleep(2000);

//     			4th iteration
                 Thread.sleep(2000);
                 driver.findElement(By.xpath("//input[@class='LM6RPg']")).click();
                 driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys(itemname4);

                  driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
                  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                  parentWindowID = driver.getWindowHandle();
                  driver.findElement(By.xpath("//a[@title='Apple iPhone X (Silver, 256 GB)']")).click();

                 Set<String> WH3 = driver.getWindowHandles();
                 System.out.println(WH3);
                 for(String x3:WH3)
                   {
                    if(!parentWindowID.equals(x3)){
 	               driver.switchTo().window(x3);}	
 	             }
                  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
                  driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
   
//       			5th iteration
                  Thread.sleep(2000);
                  driver.findElement(By.xpath("//input[@class='LM6RPg']")).click();
                  driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys(itemname5);

                   driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
                   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                   parentWindowID = driver.getWindowHandle();
                   driver.findElement(By.xpath("//a[@title='Usha EI 1602 Dry Iron']")).click();

                  Set<String> WH4 = driver.getWindowHandles();
                  System.out.println(WH4);
                  for(String x4:WH4)
                    {
                     if(!parentWindowID.equals(x4)){
  	               driver.switchTo().window(x4);}	
  	             }
                   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
                   driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
	}

	

	@Then("^The user verifies items are sucessfully added$")
	public void the_user_verifies_items_are_sucessfully_added() throws Throwable {
Assert.assertEquals("MY CART (5)", driver.findElement(By.xpath("//span[@class='_1WMqsr']")).getText());
	}
}
