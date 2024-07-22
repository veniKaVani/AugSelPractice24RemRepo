package navoldselseriesreg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement8a {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/");
		
		By content_Ele = By.xpath("//a[@class='menulink']");
		By Articles_Ele = By.linkText("ARTICLES");
		
		handleMenuSubmenu(content_Ele, Articles_Ele);
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
   public static void handleMenuSubmenu(By parentMenuLoc, By subMenuLoc) throws InterruptedException {
	   Actions act = new Actions(driver);
	   act.moveToElement(getElement(parentMenuLoc)).perform();
	   Thread.sleep(3000);
	   
	   getElement(subMenuLoc).click();
   }
}
