package javaScriptExecutorMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollToSpecificElementInNaukriCom {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		WebElement viewallcompanies=driver.findElement(By.partialLinkText("View all companies"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		
		js.executeScript("arguments[0].scrollIntoView(true);",viewallcompanies);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-100);");
	}

}
