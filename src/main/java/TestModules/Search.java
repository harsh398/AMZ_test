package TestModules;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import PageObjects.PageObjectFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Search  {
	@SuppressWarnings("unused")	 public static WebDriver driver;
	public static void D(WebDriver driver,List<HashMap<String,String>> datamap) throws Exception {
	System.out.println("Test Started");
	driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']"));
		LoginTest.A(driver,datamap);
		LoginTest.B(driver,datamap);
		LoginTest.C(driver,datamap);
	}
	public static void E(WebDriver driver,List<HashMap<String,String>> datamap) throws Exception {
		PageObjectFile.search.sendKeys(datamap.get(0).get("Search"));
		PageObjectFile.search1.click();
	}
		public static void F(WebDriver driver,List<HashMap<String,String>> datamap) throws Exception {
		WebDriverWait wait1 = new WebDriverWait(driver, 5);
		String oldTab = driver.getWindowHandle();
		PageObjectFile.search2.click();
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(oldTab);
		driver.switchTo().window(newTab.get(0));
	}
	    // change focus to new tab
		public static void G(WebDriver driver,List<HashMap<String,String>> datamap) throws Exception{

	    PageObjectFile.item.click();
	    System.out.println("item Added to cart");
	
	}
}
