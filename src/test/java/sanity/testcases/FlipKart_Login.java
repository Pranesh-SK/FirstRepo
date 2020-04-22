package sanity.testcases;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.flipkart.Pages.Homepage;
import com.flipkart.Pages.basePage;
import com.flipkart.Pages.loginPage;

public class FlipKart_Login {
	WebDriver driver;
	loginPage lp;
	Homepage homepage;
	
	@Parameters({ "URL" })
	@BeforeMethod
	public void browserConfig(String link) throws IOException {
		basePage bp = new basePage(driver);
		driver = bp.initializ_driver();
		driver.get(link);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void TC_01_login_to_FlipKart() {
		loginPage lp = new loginPage(driver);
		lp.username("8971010704");
		lp.passWord("PraneshK@92");
		lp.submit().click();
	}
	

}
