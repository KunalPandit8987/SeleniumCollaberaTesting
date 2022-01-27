package javaScriptExecutorMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentsOnReddiff {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.rediff.com/");
		WebElement signIn= driver.findElement(By.linkText("Sign in"));
		signIn.click();
		driver.findElement(By.id("login1")).sendKeys("sumanthElfBatch@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.xpath("//b[text()='Write mail']")).click();
		driver.findElement(By.xpath("//input[@id='TO_IDcmp2']")).sendKeys("sumanthElfBatch@rediffmail.com");
		driver.findElement(By.xpath("//input[contains(@class,'subject')]")).sendKeys("KunalPandit");
		WebElement frameElement=driver.findElement(By.xpath("//iframe[@title=\"Rich Text Editor, rdMailEditorcmp2\"]"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("HiGoodAfternnon All");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Send")).click();
		Thread.sleep(2000);
		for(;;) {
			try {
				driver.findElement(By.xpath("//span[text()='Sumanth']/..//cite[@title='Select mail']")).click();
				driver.findElement(By.xpath("//span[text()='Delete'] and @class='rd_fil_del']")).click();
				driver.findElement(By.xpath("//button[text()='Ok']")).click();
				break;
			}catch(NoSuchElementException e) {
				driver.navigate().refresh();
			}
		}
	

	}

}
