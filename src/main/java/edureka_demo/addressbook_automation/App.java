package edureka_demo.addressbook_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*
 * UI Automation script for testing Addressbook web app
 */

public class App 
{
	public static void main( String[] args )
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriver driver = new ChromeDriver(chromeOptions);
		String url = "http://localhost:8080/addressbook/";

		System.out.println("Hitting the endpoint : " + url);
		driver.get(url);

		String firstName = "Mahesh";
		String lastName = "Pathak";
		String mobNo = "9080980981";
		String dob = "01/01/80";
		String email = "Mahesh@gmail.com";


		try {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.className("v-button")).click();

			Thread.sleep(2000);
		//	driver.findElement(By.id("gwt-uid-5")).sendKeys(firstName);
			driver.findElement(By.xpath("//*[@id='gwt-uid-5']")).sendKeys(firstName);
			Thread.sleep(2000);
			driver.findElement(By.id("gwt-uid-7")).sendKeys(lastName);
			Thread.sleep(2000);
			driver.findElement(By.id("gwt-uid-9")).sendKeys(mobNo);
			Thread.sleep(2000);
			driver.findElement(By.id("gwt-uid-11")).sendKeys(email);
			Thread.sleep(2000);
			driver.findElement(By.id("gwt-uid-13")).sendKeys(dob);
			Thread.sleep(2000);
			driver.findElement(By.className("v-button-primary")).click();
			System.out.println("Automation completed..");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.quit();
	}
}
