package navoldselseriesreg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.log4testng.Logger;

public class GenerateLogs {

	public static void main(String[] args) {
		
		Logger log=Logger.getLogger(GenerateLogs.class);
		
WebDriver driver = new ChromeDriver();
		
		log.info("launching browser");
		
		driver.get("https://www.google.com/");
		log.info("google url has been launched");
		
		String title = driver.getTitle();
		System.out.println("title value is: "+title);
		
		log.info("title value is: "+title);
		
		if(title.equals("Google")) {
			System.out.println("correct title is Google");
		}else {
			System.out.println("incorrect title");
		}
        
		driver.quit();
		log.info("browser is closed");
	}


	}


