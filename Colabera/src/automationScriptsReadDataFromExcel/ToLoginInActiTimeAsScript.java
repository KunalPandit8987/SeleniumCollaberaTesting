package automationScriptsReadDataFromExcel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLoginInActiTimeAsScript {

	public static void main(String[] args) throws InterruptedException {
		String username =ExcelUtility.readStringData("Sheet4",0,0);
		String password =ExcelUtility.readStringData("Sheet4",0,1);
		String testUrl =ExcelUtility.readStringData("Sheet4",0,2);
		String expectedLoginPageTitle =ExcelUtility.readStringData("Sheet4",1,0);
		String expectedHomePageTitle=ExcelUtility.readStringData("Sheet4",1,1);
		
		//Step1:Open the Browser Enter the Url
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser launch succesfully");
		driver.manage().window().maximize();
		System.out.println("Browser is maximize succesfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver,30);
	
		
		driver.get(testUrl);
		String actuaLoginPageTitle=driver.getTitle();
		if(actuaLoginPageTitle.equals(expectedLoginPageTitle)) {
			System.out.println("Login Page is Displayed Succesfully");
		}
		else {
			System.out.println("Login Page is not Displayed Succesfully");
		}
		//Step2:Enter username username Textfield
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.clear();
		usernameTextField.sendKeys(username);
		String actualUsernameEntered=usernameTextField.getAttribute("value");
		if(actualUsernameEntered.equals(username)) {
			System.out.println("phonenumber is entered succesfully");
			
		}
		else {
			System.out.println("phonenumber is not entered succesfully");
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
					System.out.println("password is not entered succesfully");
				}
		          //Step4:Click on Login Button
				driver.findElement(By.id("loginButton")).click();
				driver.findElement(By.xpath("//div[text()='Time-Track']")).click();
				
				explicitWait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
				 
				 String actualHomePageTitle = driver.getTitle();
				if(actualHomePageTitle.equals(expectedHomePageTitle)) {
					System.out.println("Home page of actitime displayed succesfully");
				}
				else {
					System.out.println("Home page of actitime is not displayed succesfully");
			
		}

	}

}


	


