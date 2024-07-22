package navnewseriessel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandling18a {
     /*
      * for browser windows: target=_blank  ---is the property which makes it
      * available in a new tab
      * SET: Set collection is used to handle the browser popups
      *      because set is non-order based and it stores only unique eles
      *      ==>cannot have duplicate eles
      * HOW TO ITERATE THIS SET COLLECTION:
      * ---have to use iterator();
      * is a method available to travers thru the collection-which are not
      * order base(where no index is available to access using the index no)
      * 
      * it.next();
      * initially it object ref --points to just above the next
      * next();---has to purposes-it will move the it(objRef) to the next segment and also fetch
      * the value,whatever is available(the next win id)
      */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");//parent
		
		Thread.sleep(3000);
		
		
		
		//1st: fetch the window ids:

	}

}
