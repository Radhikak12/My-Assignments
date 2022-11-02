package week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
// Expand the window size
driver.manage().window().maximize();
//Timeout for the entire session
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//login into the account
//Attribute xpath
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Democsr2");

driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
//partial text based xpath
driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();

driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
//text based xpath
driver.findElement(By.xpath("//a[text()='Leads']")).click();

driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
//Partial attribute based xpath
driver.findElement(By.xpath(" //input[contains(@id,'createLeadForm_companyName')]")).sendKeys("Testleaf");
//Index based xpath
driver.findElement(By.xpath("//input[@id='createLeadForm_firstName'][1]")).sendKeys("Radhika");

driver.findElement(By.xpath("//input[contains(@id,'_lastName')]")).sendKeys("Kumar");

driver.findElement(By.xpath("//input[@name='submitButton']")).click();

driver.findElement(By.xpath("//a[contains(@class,'subMenuButtonDangerous')]")).click();

driver.close();
	}

}
