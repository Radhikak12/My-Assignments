package Week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//Open url 
		driver.get("https://acme-test.uipath.com/login");
// Expand the window size
driver.manage().window().maximize();
//Timeout for the entire session
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//Enter details using advXpath
driver.findElement(By.xpath("(//div[@class='controls']/input)[1]")).sendKeys("kumar.testleaf@gmail.com");
driver.findElement(By.xpath("(//div[@class='controls']/input)[2]")).sendKeys("leaf@12");
driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
 //Get the title of the page
String title=driver.getTitle();
System.out.println(title);
//Logout child to parent Xpath
driver.findElement(By.xpath("//a[contains(text(),'Log Out')]/parent::li")).click();
driver.close();

}

}
