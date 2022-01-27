package webDriverchangesinChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseFindElementsInAutoSuggestionsOfGoogleTextField {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).click();
		List<WebElement> suggestions=driver.findElements(By.xpath("//li[@role=\"presentation\" and @class=\"sbct\"]"));
		for(WebElement Lists:suggestions) {
			System.out.println(Lists.getText());

	}

	}
}
