package webDriverchangesinChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseFindElementsInMyntraToGetAllNavBar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		List<WebElement> navOptions=driver.findElements(By.xpath("//a[@data-index]"));
		for(WebElement navMenu:navOptions) {
			System.out.println(navMenu.getText());
		}
		

	}

}
