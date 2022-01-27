package webElementMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Toadd3rdProduct {

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
				 WebDriverWait wait=new WebDriverWait(driver,30);
				 wait.until(ExpectedConditions.elementToBeClickable(Cost));
				 String PhoneCost=Cost.getText();
				 System.out.println(PhoneCost);
				 
				 String numberCost=PhoneCost.substring(1);
				 System.out.println(numberCost);
				 String DigitCost=numberCost.replaceAll("\\D+", "");
				 System.out.println(DigitCost);
				 int CostInValue=Integer.parseInt(DigitCost);
				 System.out.println(CostInValue);
				 
				 if(CostInValue<=6000) {
					 driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
					 System.out.println("Adding to the Cart");
					 
				 }
				 System.out.println("Not Added to the Cart");
				 }
			
			}
			
		

	

}

