package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class homePage extends BaseClass{
	public homePage(WebDriver driver){
		super(driver);
	}
	@FindBy(how=How.XPATH, using="//a[@id='nav-link-yourAccount']")
	public static WebElement mouse;
	@FindBy(how=How.XPATH, using=" //*[@id='nav-flyout-ya-signin']/a/span")
	public static WebElement sigin_in;
	@FindBy(how=How.XPATH, using="//*[@id='ap_email']")
	public static WebElement email;
	@FindBy(how=How.XPATH, using="//*[@id='ap_password']")
	public static WebElement password;
	@FindBy(how=How.XPATH, using="//*[@id='signInSubmit']")
	public static WebElement signin_button;
	@FindBy(how=How.XPATH, using="//*[@id='continue']")
	public static WebElement Continue;


	}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
