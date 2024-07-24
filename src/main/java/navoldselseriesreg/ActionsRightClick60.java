package navoldselseriesreg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsRightClick60 {

	public static void main(String[] args) {
		/*
		 * RightClick: also known as context click
		 * 
		 * 
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		Actions act =new Actions(driver);
		
		WebElement contextclickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		act.contextClick(contextclickBtn).build().perform();
		
		WebElement copyEle = driver.findElement(By.xpath("//span[text()='Copy']"));
		
		String txt = copyEle.getText();
		
		System.out.println(txt);
		

	}

}
