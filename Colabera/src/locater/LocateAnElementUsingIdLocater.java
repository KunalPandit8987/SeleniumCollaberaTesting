package locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateAnElementUsingIdLocater {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernameTextField=driver.findElement(By.name("username"));
		usernameTextField.sendKeys("Kunal");
		driver.findElement(By.name("pwd")).sendKeys("Abcd123");
		driver.findElement(By.id("loginButton")).click();
	

	}

}
