package popUps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFileUpLoadPopUps {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your active Email ID / Username')]")).sendKeys("kunalpandit.jsre18@gmail.com");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your password')]")).sendKeys("Kunal@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		
		driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@class='crossIcon chatBot chatBot-ic-cross']")).click();
		driver.findElement(By.xpath("//div@class='uploadBtn']")).click();
		
		Runtime.getRuntime().exec("./autoIt/fileUpload.exe");



	}

}
