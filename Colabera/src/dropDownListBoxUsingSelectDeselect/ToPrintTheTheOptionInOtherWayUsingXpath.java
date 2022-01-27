package dropDownListBoxUsingSelectDeselect;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPrintTheTheOptionInOtherWayUsingXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/signup");
		
		WebElement monthListBox=driver.findElement(By.id("month"));
		List<WebElement> OptionsinMonths=driver.findElements(By.xpath("//select[@id='month']/option"));
		for(WebElement ele:OptionsinMonths) {
			System.out.println(ele.getText());
		}

	}

}
