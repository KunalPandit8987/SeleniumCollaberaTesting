package webElementMethods;

import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyystemCompatibility {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.FaceBook.com/");
		WebElement utf=driver.findElementById("email");
		WebElement ptf=driver.findElementById("passContainer");
		Rectangle UsrnameRect=utf.getRect();
		Rectangle PasswordRect=ptf.getRect();
		 int YlocationofUsername=UsrnameRect.getY();
		 int HeightofUsername=UsrnameRect.getHeight();
		 final int Space=3;
		 int YlocationofPassword=PasswordRect.getY();
		 if(YlocationofUsername+HeightofUsername+Space<=YlocationofPassword) {
			 System.out.println("It is not clashing");}
		 else
			 System.out.println("It is clashing");
		 }
	}


