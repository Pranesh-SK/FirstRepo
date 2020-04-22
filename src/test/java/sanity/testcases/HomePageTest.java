package sanity.testcases;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.flipkart.Pages.Homepage;
import com.flipkart.Pages.basePage;
import com.flipkart.Pages.loginPage;

public class HomePageTest {
	
	WebDriver driver;
	basePage bp;
	Homepage homepage;

	@Parameters({ "URL" })
	@BeforeMethod
	public void browserConfig(String link) throws IOException, InterruptedException {
		bp = new basePage(driver);
		driver = bp.initializ_driver();
		driver.get(link);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage lp = new loginPage(driver);
		lp.username("8971010704");
		lp.passWord("PraneshK@92");
		lp.submit().click();
		Thread.sleep(10000);
	}

	/*
	@Test(priority = 1)
	public void TC_03_HomePage_Links() {
	homepage = new Homepage(driver);
	System.out.println("Lists :" + homepage.links());
	int size = homepage.links().size();
	System.out.println(size);
	for (int i=0; i<size; i++) {
		System.out.println("All tagnames : " + homepage.links().get(i).getText());
	}
	}
	
	@Test (priority = 0)
	public void TC_02_HomePage_CartImage() {
	System.out.println(homepage.checkcart());
	}
	*/
	@Test 
	public void Electronics_Items() {
		homepage = new Homepage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(homepage.electronics_list()).build().perform();
		
		/*Select p = new Select(homepage.electronics_list());
		List<WebElement> k = p.getOptions();
		for (int i=0; i<k.size(); i++) {
			System.out.println(k.get(i).getText());
		}*/
	}
	
	/*
	 * @AfterMethod public void close() { driver.close(); }
	 */
	
}
