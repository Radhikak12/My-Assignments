package week2Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.model.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
	//Initialize driver and Open URL	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
// Expand the window size
driver.manage().window().maximize();
//Timeout for the entire session
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//Create new account 
driver.findElement(By.linkText("Create New Account")).click();
//Enter data
driver.findElement(By.name("firstname")).sendKeys("Radhika");
driver.findElement(By.name("lastname")).sendKeys("kumar");
driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
driver.findElement(By.id("password_step_input")).sendKeys("helloworld");

//Select class for Dropdown
WebElement select1 =driver.findElement(By.name("birthday_day"));
Select tab= new Select(select1);
tab.selectByValue("1");

WebElement select2 =driver.findElement(By.name("birthday_month"));
Select tab1= new Select(select2);
tab1.selectByVisibleText("Mar");

WebElement select3 =driver.findElement(By.id("year"));
Select tab2= new Select(select3);
tab2.selectByIndex(2);

driver.findElement(By.name("sex")).click();

	}

}
