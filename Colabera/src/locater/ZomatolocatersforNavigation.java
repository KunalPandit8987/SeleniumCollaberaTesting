package locater;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatolocatersforNavigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Add restaurant")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		driver.findElement(By.className("class=['sc-1yzxt5f-9 bbrwhB']")).sendKeys("1234657hjj");

	}

}
