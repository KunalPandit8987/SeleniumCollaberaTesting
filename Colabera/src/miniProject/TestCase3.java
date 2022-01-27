package miniProject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestCase3 {
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
		String Vname = "Tshirt";
		WebElement ViewNameTextfield = driver.findElement(By.name("viewName"));
		ViewNameTextfield.sendKeys(Vname);
		WebElement saveButton = driver.findElement(By.xpath("//input[@type='submit']"));
		saveButton.click();
		WebElement Filter = driver.findElement(By.id("viewname"));
		Select select=new Select(Filter);
		System.out.println(select.isMultiple());
		
select.selectByVisibleText(Vname);
		
		WebElement firstOption= select.getFirstSelectedOption();
		String expectedVname = firstOption.getText();
		if(expectedVname.equals(Vname)) {
			System.out.println("data saved");
		}
		else {
			System.out.println("data is not saved");
		}
		
	}

}
