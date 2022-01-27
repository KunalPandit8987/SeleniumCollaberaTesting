package webDriverchangesinChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLoginFaceBook {

	public static void main(String[] args) {

		String phonenumber ="8971781484";
		String password ="Ishan@123";
		String testUrl ="https://www.facebook.com/";
		String expectedLoginPageTitle ="Facebook – log in or sign up";
		String expectedHomePageTitle="(1) Facebook";
		
		//Step1:Open the Browser Enter the Url
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser launch succesfully");
		driver.manage().window().maximize();
		System.out.println("Browser is maximize succesfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait explicitWait= new WebDriverWait(driver, 15);
	
		
		driver.get(testUrl);
		String actuaLoginPageTitle=driver.getTitle();
		if(actuaLoginPageTitle.equals(expectedLoginPageTitle)) {
			System.out.println("Login Page is Displayed Succesfully");
		}
		else {
			System.out.println("Login Page is not Displayed Succesfully");
		}
		//Step2:Enter phonenumber into phonenumber Textfield
		WebElement usernameTextField = driver.findElement(By.name("email"));
		usernameTextField.clear();
		usernameTextField.sendKeys(phonenumber);
		String actualUsernameEntered=usernameTextField.getAttribute("value");
		if(actualUsernameEntered.equals(phonenumber)) {
			System.out.println("phonenumber is entered succesfully");
			
		}
		else {
			System.out.println("phonenumber is not entered succesfully");
		}
		//Step3:Enter Password into Password Textfield
				WebElement passwordTextField = driver.findElement(By.name("pass"));
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
				driver.findElement(By.name("login")).click();
				explicitWait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
				String actualHomePageTitle=driver.getTitle();
				if(actualHomePageTitle.equals(expectedHomePageTitle)) {
					System.out.println("Home page of facebbok displayed succesfully");
				}
				else {
					System.out.println("Home page of facebook is not displayed succesfully");
			
		}

	}

}
