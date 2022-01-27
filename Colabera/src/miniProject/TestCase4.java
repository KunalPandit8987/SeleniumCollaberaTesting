package miniProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase4 {

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
		WebElement createFilter = driver.findElement(By.linkText("Create Filter"));
		createFilter.click();
		//Product>costumeNewPageDisplaying
		
		WebElement ViewNameTextfield = driver.findElement(By.name("viewName"));
		ViewNameTextfield.sendKeys("");
		WebElement saveButton = driver.findElement(By.xpath("//input[@type='submit']"));
		saveButton.click();
		String actualErrorMessage = "Missing required fields:"
				+ "View Name:";
		Alert alert = driver.switchTo().alert();
		String ExpectedErrorMessage = alert.getText();
		if(ExpectedErrorMessage.equals(actualErrorMessage)) {
			System.out.println("error msg is correct displaying");
		}
		
		else {
			System.out.println("error msg is not correct displaying");
		}

	}

}
