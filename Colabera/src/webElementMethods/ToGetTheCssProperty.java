package webElementMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheCssProperty {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String Propertyvalue = driver.findElementById("loginButton").getCssValue("border-bottom-width");
		System.out.println(Propertyvalue);
	}

}
