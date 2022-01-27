package miniProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		
		WebElement usernameTestFiled = driver.findElement(By.name("user_name"));
		usernameTestFiled.sendKeys("admin");
		WebElement passwordTestFiled = driver.findElement(By.name("user_password"));
		passwordTestFiled.sendKeys("root");
		WebElement loginButton = driver.findElement(By.id("submitButton"));
		loginButton.click();
		//Homepage
		WebElement product = driver.findElement(By.linkText("Products"));
		Actions actions = new Actions (driver);
		actions.moveToElement(product).perform();
		product.click();
		//product list page should be display
		WebElement advancedSearch = driver.findElement(By.linkText("Go to Advanced Search"));
		advancedSearch.click();
		//advanced search page displaying
	}

}
