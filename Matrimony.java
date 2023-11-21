package week7.day1;



import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Matrimony {
	public static void main(String[] args) {
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//load the url
		driver.get("https://www.tamilmatrimony.in/");
		//maximize the window
		driver.manage().window().maximize();
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//profile for myself
				driver.findElement(By.xpath("//select[@id='REGISTERED_BY']")).click();
				Select myself=new Select(driver.findElement(By.xpath("//select[@id='REGISTERED_BY']")));
				myself.selectByVisibleText("Myself");
				//enter name
				driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("Arthi");
				//select gender
				driver.findElement(By.xpath("//input[@id='genderfemale']")).click();
				//select date
				Select date=new Select(driver.findElement(By.xpath("//select[@id='DOBDAY']")));
				date.selectByVisibleText("27");
				//select month
				Select month=new Select(driver.findElement(By.xpath("//select[@id='DOBMONTH']")));
				month.selectByVisibleText("Aug");
				//select year
				Select year=new Select(driver.findElement(By.xpath("//select[@id='DOBYEAR']")));
				year.selectByVisibleText("2003");
				//select religion
				Select relejion=new Select(driver.findElement(By.xpath("//select[@id='RELIGION']")));
				relejion.selectByVisibleText("Hindu");
				//select language
				Select language=new Select(driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']")));
				language.selectByVisibleText("Tamil");
				Select caste=new Select(driver.findElement(By.xpath("//select[@id='CASTE_NORMAL']")));
				caste.selectByVisibleText("Vannia Kula Kshatriyar");
				//select country
				Select country=new Select(driver.findElement(By.xpath("//select[@id='COUNTRY']")));
				country.selectByVisibleText("India");
				//enter country code
				Select code=new Select(driver.findElement(By.xpath("//select[@id='M_COUNTRYCODE']")));
				code.selectByVisibleText("+91");
				//enter number
				driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("948767894");
			
				//enter email
				driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("arthiselvaraj186@gmail.com");
				driver.findElement(By.xpath("//input[@name='PASSWD1']")).sendKeys("arthi12");
				//close the windoe
				driver.close();

				
						
	}

}
