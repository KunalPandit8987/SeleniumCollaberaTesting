package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyErrorMsgInSkillRary {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/user/login");
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		String expectedErrorMessage="Email Field Is Required";
		String actualErrorMessage=driver.findElement(By.id("email-error")).getText();
		if(expectedErrorMessage.equals(actualErrorMessage)) {
			System.out.println("proper error msg is displayed");
		}
		else {
			System.out.println("error msg is not same");
		}

	}

}
