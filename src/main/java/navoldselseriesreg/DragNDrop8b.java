package navoldselseriesreg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop8b {

	public static void main(String[] args) {
		/*
		 * dragNdrop: 3 steps: Actions-; clickNholdsrcEle; dragittotarget; release
		 * 
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		WebElement srcEle = driver.findElement(By.id("draggable"));
		WebElement targetEle = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(srcEle).moveToElement(targetEle).release()
		                                                  .build()
		                                                    .perform();

	}

}
