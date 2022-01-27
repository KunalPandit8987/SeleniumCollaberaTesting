package actionsMethods;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToUseKeyUpAndKeysDownAndCloseTheSpecificWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.myntra.com");
		List<WebElement> navBarElements=driver.findElements(By.xpath("//a[@data-type='navElements']"));
		Actions actions=new Actions(driver);
		
		for(WebElement ele:navBarElements) {
			actions.keyDown(Keys.SHIFT).click(ele).perform();
			actions.keyUp(Keys.SHIFT).perform();//inorder to unsed shift key now
		}
			
			Set<String>allWin=driver.getWindowHandles();
			String windowclose="Home and Living - Buy Interior Decoration Products and Accessories Online in India";
			for(String s:allWin)
			{
			driver.switchTo().window(s);
			String Actualwindowclose=driver.getTitle();
			if(windowclose.equals(Actualwindowclose))
			{
				driver.close();
			}
		}

	}

}

