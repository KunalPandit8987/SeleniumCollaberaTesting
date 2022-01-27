package automationScriptsReadDataFromExcel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		//Test Data
		String testUrl = ExcelLib.readStringData("Sheet5", 0, 0);
		String username = ExcelLib.readStringData("Sheet5", 0, 1);
		String password = ExcelLib.readStringData("Sheet5", 0, 2);
		String expectedLoginPageTitle = ExcelLib.readStringData("Sheet5", 1, 0);
		String expectedHomePageTitle = ExcelLib.readStringData("Sheet5", 1, 1);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.get(testUrl);
		String actualLoginPageTitle = driver.getTitle();
		if(actualLoginPageTitle.equals(expectedLoginPageTitle)) {
			System.out.println("Login page displayed succesfully");
		}
		LoginPage1 loginPage = new LoginPage1(driver);
		loginPage.getUsernameTextfield().sendKeys(username);
		loginPage.getPasswordTextfield().sendKeys(password);
		loginPage.getLoginButton().click();
		String actualHomePageTitleString = driver.getTitle();
		if(actualHomePageTitleString.equals(expectedHomePageTitle)) {
			System.out.println("Login is Successful");
		}
	}

}
