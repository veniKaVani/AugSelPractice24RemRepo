package navoldselseriesreg;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesOR61a {
       static WebDriver driver;
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("src//main//java//myRepo.properties");
		
		prop.load(fis);

//		System.out.println(prop.getProperty("env"));
		System.out.println(prop.getProperty("browserName"));
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("pwd"));
		
		String browserName = prop.getProperty("browserName");
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		
		driver.get(prop.getProperty("url"));
		WebElement userid = driver.findElement(By.id("input-email"));
		userid.clear();
		userid.sendKeys(prop.getProperty("username"));
		
		WebElement pwdid = driver.findElement(By.id("input-password"));
		pwdid.clear();
		pwdid.sendKeys(prop.getProperty("pwd"));
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
		loginBtn.click();
	}

}
