package dropDownListBoxUsingSelectDeselect;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToDeSelectTheOpTionsWhichIsSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Admin/Downloads/dropDown.html");
		WebElement multiSelctDropDown=driver.findElement(By.id("m1"));
		Select select=new Select(multiSelctDropDown);
		System.out.println(select.isMultiple());
		
		 select.selectByIndex(2);
		 select.selectByIndex(3);
		 select.selectByValue("1");
		 select.selectByVisibleText("Mango");
		 Thread.sleep(3000);
		 select.deselectByIndex(0);
		 Thread.sleep(3000);
		 select.deselectByValue("2");
		 Thread.sleep(3000);
		 select.deselectByVisibleText("Grapes");
		 //select.deselectAll();

	}

}
