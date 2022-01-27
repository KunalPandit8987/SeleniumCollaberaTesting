package assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformNavigationForwardBackAndRefresh {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver1.navigate().back();
		Thread.sleep(3000);
		driver1.navigate().forward();
		Thread.sleep(5000);
		driver1.navigate().refresh();

	}

}
