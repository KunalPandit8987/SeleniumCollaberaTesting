package dropDownListBoxUsingSelectDeselect;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectLastOptionOfDropLists {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Admin/Downloads/dropDown.html");
		WebElement multiSelctDropDown=driver.findElement(By.id("m1"));
		Select select=new Select(multiSelctDropDown);
		System.out.println(select.isMultiple());
		
		List<WebElement>Alloptions=select.getOptions();
		select.selectByIndex(Alloptions.size()-1);
		

	}

}
