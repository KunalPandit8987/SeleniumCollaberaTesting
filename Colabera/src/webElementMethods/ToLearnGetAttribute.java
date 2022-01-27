package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String LocationName="Jamshedpur";
		driver.get("https://www.zomato.com/");
		 WebElement LocationTextfield=driver.findElementByXPath("//input[@placeholder='Bengaluru']");
		 LocationTextfield.clear();
		 LocationTextfield.sendKeys(LocationName);
		 String actualDataEntered=LocationTextfield.getAttribute("value");
		 System.out.println(actualDataEntered);
		 if(actualDataEntered.equals(LocationName)) {
			 System.out.println("Location Enter properly");
		 }
		 
		 
		
			

	}

}
