package week7.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UIBank {
	public static void main(String[] args) {
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//load the url
		driver.get("https://uibank.uipath.com/register-account");
		//maximize the window
		driver.manage().window().maximize();
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//enter firstname
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Arthi");
		///enter title
		Select title=new Select(driver.findElement(By.xpath("//select[@id='title']")));
		title.selectByVisibleText("Ms");
		//entermiddle name
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("s");
		//enter last name
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Selvaraj");
		Select sex=new Select(driver.findElement(By.xpath("//select[@id='sex']")));
		sex.selectByVisibleText("Female");
		//enter employment status
		Select status=new Select(driver.findElement(By.xpath("//select[@id='employmentStatus']")));
		status.selectByVisibleText("Unemployed");
		//enter DOB
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("07/27/2003");
		//enter marital status
		Select maritalstatus=new Select(driver.findElement(By.xpath("//select[@id='maritalStatus']")));
		maritalstatus.selectByVisibleText("Single");
		//enter dependendent
      driver.findElement(By.xpath("//input[@id='numberOfDependents']")).sendKeys("2");
      driver.findElement(By.xpath("//input[@id='username']")).sendKeys("arthi");
      

      driver.findElement(By.xpath("//input[@id='email']")).sendKeys("arthi186@gmail.com");
      driver.findElement(By.xpath("//input[@id='password']")).sendKeys("arthi3");
      driver.close();
     
		
		
	}
}
