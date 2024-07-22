package navnewseriessel;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//HW Q: How do you handle each social link one at a time??
public class FindingAllSocialLinks18b {
        static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String pwinid = driver.getWindowHandle();
		System.out.println(pwinid);
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']/a"));
		System.out.println(allLinks.size());
		
		for(WebElement e:allLinks) {
			String linktxt = e.getText();
			System.out.println(linktxt);
			e.click();
			
			//1st: fetch the  window handles
			Set<String> handles = driver.getWindowHandles();
			Iterator<String> it = handles.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
				String winid = it.next();
				//2.switch to each window handle thru forEach loop
				driver.switchTo().window(winid);
				
				System.out.println("child window id: "+driver.getCurrentUrl());
				System.out.println("child window pageTitle: "+driver.getTitle());
				
				if(!winid.equals(pwinid)) {
					driver.close();
				}
				Thread.sleep(1000);
			}
			driver.switchTo().window(pwinid);
			System.out.println("control is on pwinid");
			System.out.println("parent window url: "+driver.getCurrentUrl());
			System.out.println("parent window title: "+driver.getTitle());
			
		}
		
		
	}

}
