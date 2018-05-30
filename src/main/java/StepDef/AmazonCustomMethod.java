package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonCustomMethod {
	static WebDriver driver;
	public static void gotocategory(String s1,String s2) throws InterruptedException{
		String categoryLocator="//h2[text()='@']";
		String Mainmenu=categoryLocator.replace("@",s1);
		String Mainmenusub=categoryLocator.replace("@",s2);
		WebElement ele = driver.findElement(By.xpath(Mainmenu));
		Actions ac=new Actions(driver);
		ac.moveToElement(ele).build().perform();
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath(Mainmenusub));
		ac.moveToElement(ele1).build().perform();
		ele1.click();
		
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Computer\\workspace\\DemoqaRegisteration\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//span[text()='Shop by']")).click();
	    gotocategory("Echo & Alexa","Echo Plus");
}
}