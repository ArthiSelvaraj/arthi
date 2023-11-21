package week7.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String[] args) {
		//to open the ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//load the url
		driver.get("http://en-gb.facebook.com");
		//maximize the browser
		driver.manage().window().maximize();
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click create new account button
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		//enter first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Arthi");
		//enter second name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("selvaraj");
		//enter your mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("987809642");
		//enter your password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("arthi13");
		//select date
		Select date=new Select(driver.findElement(By.xpath("//select[@id='day']")));
		date.selectByVisibleText("27");
		//Select month
		Select month=new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
		month.selectByVisibleText("Aug");
		Select year=new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
		year.selectByVisibleText("2003");
		//select gender
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		//close the window
		driver.close();
		
		
	}

}
