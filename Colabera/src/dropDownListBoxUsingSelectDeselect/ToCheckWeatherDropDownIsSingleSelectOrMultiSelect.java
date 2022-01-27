package dropDownListBoxUsingSelectDeselect;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToCheckWeatherDropDownIsSingleSelectOrMultiSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/signup");
		WebElement dayListBox=driver.findElement(By.id("day"));
		WebElement monthListBox=driver.findElement(By.id("month"));
		WebElement yearListBox=driver.findElement(By.id("year"));
		
		Select daySelect=new Select(dayListBox);
		System.out.println(daySelect.isMultiple());
		
		
		Select monthSelect=new Select(monthListBox);
		System.out.println(monthSelect.isMultiple());
		
		Select yearSelect=new Select(yearListBox);
		System.out.println(yearSelect.isMultiple());

	}

}
