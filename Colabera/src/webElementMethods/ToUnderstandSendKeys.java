package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandSendKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign up")).click();
		WebElement nametextfileld=driver.findElementById("name");
		nametextfileld.clear();
		nametextfileld.sendKeys("k","u","nal",Keys.CONTROL+"a");
		Thread.sleep(2000);
		nametextfileld.sendKeys(Keys.CONTROL+"c");
		WebElement emailtextfileld=driver.findElementById("email");
		emailtextfileld.clear();
		Thread.sleep(2000);
		emailtextfileld.sendKeys(Keys.CONTROL+"v");
		
		
		
		
		
		

	}

}
