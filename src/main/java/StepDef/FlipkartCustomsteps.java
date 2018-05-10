package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartCustomsteps {
	static WebDriver driver;
	

	public static void gotocategory(String s1,String s2) throws InterruptedException{
		String categoryLocator="//span[text()='@']";
		String ActualMenucategory=categoryLocator.replace("@",s1);
		String ActualMenucategorysub=categoryLocator.replace("@",s2);
		WebElement ele = driver.findElement(By.xpath(ActualMenucategory));
		Actions ac=new Actions(driver);
		ac.moveToElement(ele).build().perform();
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath(ActualMenucategorysub));
		ac.moveToElement(ele1).build().perform();
		ele1.click();
		
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Computer\\workspace\\DemoqaRegisteration\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	    gotocategory("TVs & Appliances","Split ACs");
	}
	

	
	

}
