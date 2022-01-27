package webDriverchangesinChromeDriver;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class ToWriteLoginScriptsOfActitimebrowser {

	public static void main(String[] args)  {
		
		
		

		String username ="admin";
		String password ="manager";
		String testUrl ="https://demo.actitime.com/login.do";
		String expectedLoginPageTitle ="actiTIME - Login";
		String expectedHomePageTitle="actiTIME -  Enter Time-Track";
		
		//Step1:Open the Browser Enter the Url
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser launch succesfully");
		driver.manage().window().maximize();
		System.out.println("Browser is maximize succesfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait explicitWait= new WebDriverWait(driver, 500);
		
		driver.get(testUrl);
		String actuaLoginPageTitle=driver.getTitle();
		if(actuaLoginPageTitle.equals(expectedLoginPageTitle)) {
			System.out.println("Login Page is Displayed Succesfully");
		}
		else {
			System.out.println("Login Page is not Displayed Succesfully");
		}
		//Step2:Enter username into username Textfield
		WebElement usernameTextField = driver.findElement(By.name("username"));
		usernameTextField.clear();
		usernameTextField.sendKeys(username);
		String actualUsernameEntered=usernameTextField.getAttribute("value");
		if(actualUsernameEntered.equals(username)) {
			System.out.println("username is entered succesfully");
			
		}
		else {
			System.out.println("username is not entered succesfully");
		}
		//Step3:Enter Password into Password Textfield
				WebElement passwordTextField = driver.findElement(By.name("pwd"));
				passwordTextField.clear();
				passwordTextField.sendKeys(password);
				String actualPasswordEntered=passwordTextField.getAttribute("value");
				if(actualPasswordEntered.equals(password)) {
					System.out.println("password is entered succesfully");
					
				}
				else {
					System.out.println("pasword is not entered succesfully");
				}
		          //Step4:Click on Login Button
				driver.findElement(By.xpath("//div[text()='Login ']")).click();
				explicitWait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
				String actualHomePageTitle=driver.getTitle();
				if(actualHomePageTitle.equals(expectedHomePageTitle)) {
					System.out.println("Home page is displayed succesfully");
				}
				else {
					System.out.println("Home page is not displayed succesfully");
			
		}
		
	}

}
