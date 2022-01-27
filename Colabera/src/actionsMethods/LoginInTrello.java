package actionsMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginInTrello {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait explicitWait=new WebDriverWait(driver, 20); 
		
		driver.get("https://trello.com/login");
		driver.findElement(By.id("user")).sendKeys("kunalpandit.jsre18@gmail.com");
		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("password")));
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("password")).sendKeys("Kunal-8987");
		driver.findElement(By.id("login-submit")).click();

		driver.findElement(By.xpath("//div[text()='selenium']")).click();
		
		
		
		explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//h2[text()='Manual']")));
		
		Thread.sleep(3000);
		WebElement ManualList=driver.findElement(By.xpath("//span[text()='SDLC']"));
		WebElement javaList=driver.findElement(By.xpath("//h2[text()='java']/../..//span[text()='Add a card']"));
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(ManualList, javaList).perform();
		
		

	}

}
