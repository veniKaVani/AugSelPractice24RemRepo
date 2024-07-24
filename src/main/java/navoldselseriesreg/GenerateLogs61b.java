package navoldselseriesreg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.log4testng.Logger;

public class GenerateLogs61b {

	public static void main(String[] args) {
		/*
		 * LOG4j api: is a 3rd party api developed by Samudra Guptha
		 * LOGGER: is a class and there is a method available in log4j api library
		 * getLogger();
		 * 
		 */
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
