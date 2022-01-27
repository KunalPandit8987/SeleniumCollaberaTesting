package webElementMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoassignments {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElementByXPath("//button[text()='✕']").click();
		
		//Adding 1st Product
		driver.findElement(By.name("q")).sendKeys("poco");
		driver.findElement(By.xpath("//button[@type=\'submit\']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@data-id])[3]")).click();
		

			String parentWindowId=driver.getWindowHandle();
			Set<String> allWindowsIds=driver.getWindowHandles();
			allWindowsIds.remove(parentWindowId);
			for(String windowID:allWindowsIds) {
				driver.switchTo().window(windowID);
				Thread.sleep(3000);
				 WebElement Cost=driver.findElement(By.xpath("//div[span='20% off']/../../../..//div[span='Extra ₹2500 off']/..//div[text()='₹9,499']"));

	}

	}
}
