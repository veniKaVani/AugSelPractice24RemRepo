package navoldseriestestng;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest30 {
	
WebDriver driver;
	
	@Test
	@Parameters({"username","pwd"})
	public void OpenCartLoginTest(String username, String pwd) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(username);

		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(pwd);

		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();


	}

		

}
