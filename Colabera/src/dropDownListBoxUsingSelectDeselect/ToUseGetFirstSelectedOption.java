package dropDownListBoxUsingSelectDeselect;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUseGetFirstSelectedOption {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Admin/Downloads/dropDown.html");
		WebElement multiSelctDropDown=driver.findElement(By.id("m1"));
		Select select=new Select(multiSelctDropDown);
		System.out.println(select.isMultiple());
		
		

		select.selectByValue("7");
		select.selectByValue("6");
		select.selectByValue("5");
		
		WebElement firstOption= select.getFirstSelectedOption();
		System.out.println(firstOption.getText());

	}

}
