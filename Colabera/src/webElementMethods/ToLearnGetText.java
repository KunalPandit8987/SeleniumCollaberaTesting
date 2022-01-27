package webElementMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement Pleasetext=driver.findElementById("headerContainer");
		System.out.println(Pleasetext.getText());
		WebElement Admintext=driver.findElementByXPath("//b[text()='admin']");
		System.out.println(Admintext.getText());
		

	}

}
