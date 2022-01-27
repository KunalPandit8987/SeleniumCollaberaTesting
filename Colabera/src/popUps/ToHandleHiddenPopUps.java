package popUps;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenPopUps {

	public static void main(String[] args) {
		LocalDateTime ldt=LocalDateTime.now();
				String month=ldt.getMonth().name();
		month=month.substring(0, 1).toUpperCase()+month.substring(0, month.length()).toLowerCase();
		int date=ldt.getDayOfMonth();
		int year=ldt.getYear();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.oyorooms.com/");
		
		driver.findElement(By.xpath("//span[text()='Fri, 21-Jan']/../../..//div[@class='oyo-row oyo-row--no-spacing datePickerDesktop datePickerDesktop--home']")).click();
		//Here Selecting Date is from 21stjanuary2022 to 25thjanuary2022
		
		//driver.findElement(By.xpath("//span[text()='January']/..//span[text()='2022']/../..//span[text()='21']")).click();
		//driver.findElement(By.xpath("//span[text()='January']/..//span[text()='2022']/../..//span[text()='25']")).click();

		//Here Selecting Date is from 30thJune2022 to 1stJuly2022
		for(;;) {
			try {
				driver.findElement(By.xpath("//span[text()='June']/..//span[text()='2022']/../..//span[text()='30']")).click();
				driver.findElement(By.xpath("//span[text()='July']/..//span[text()='2022']/../..//span[text()='1']")).click();
break;
			}catch(NoSuchElementException e) {
				driver.findElement(By.xpath("//div[@class='DateRangePicker__PaginationArrow DateRangePicker__PaginationArrow--next']")).click();
			}
		}
	}

}
