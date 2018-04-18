package TestCases;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class Hooks {
	public static String mailscreenshotpath;
	 public static WebDriver driver;
	public static Properties Config = new Properties();

	public static FileInputStream fis;
	public static Logger logs = Logger.getLogger("devpinoyLogger");
	//Loading Files and executing them before executing the suite 
	//Reload the config file and open the browser after each test
	@Before
	public void init() throws IOException, AddressException, SQLException, ClassNotFoundException, MessagingException{
	 //driver is set to null
	driver=null;
	//Below we load Config file onto fis
	fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Utilities\\Config.properties");
	Config.load(fis);
	logs.debug("Loaded the Config property file");
	//Below we are loading the Or file which holds all the xpaths
	//the test will open the browser whichever is written in the config file
	driver = new ChromeDriver();
	logs.debug("Opened the Browser");
	driver.get(Config.getProperty("testsiteurl"));
	//above code will check for the website
	logs.debug("Navigating to website");
	driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
	}
	public static void CaptureScreenshot() throws IOException{
		
		  Calendar cal = new GregorianCalendar();
		  int month = cal.get(Calendar.MONTH); //3
		  int year = cal.get(Calendar.YEAR); //2014
		  int sec =cal.get(Calendar.SECOND);
		  int min =cal.get(Calendar.MINUTE);
		  int date = cal.get(Calendar.DATE);
		  int day =cal.get(Calendar.HOUR_OF_DAY);
		
		  
		  /*Below Code will capture the screenshot*/
		  mailscreenshotpath = System.getProperty("user.dir")+"\\screenshots\\"+year+"_"+date+"_"+(month+1)+"_"+day+"_"+min+"_" +sec+".jpeg";
			
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(scrFile, new File(mailscreenshotpath));
		
	}
	@After
	public void QuitDriver( ) throws IOException{
	//Captures the Screenshot
		

	CaptureScreenshot();
	//Close the Browser After Each Test

driver.quit();
	logs.debug("Browser is closed");
		
	}

}
