package module2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BaseTest {
	Playwright p1;
	Browser b1;
	Page page;
	@Parameters("broserengine")
	@BeforeMethod
	public void launch(String nameofbrowser)
	{
		if(nameofbrowser.equals("chromium"))
		{
		 p1=Playwright.create();
	b1=p1.chromium().launch(new LaunchOptions().setHeadless(false));
	page=b1.newPage();
		}
		if(nameofbrowser.equals("firefox"))
		{
			p1=Playwright.create();
			b1=p1.firefox().launch(new LaunchOptions().setHeadless(false));
		 page=b1.newPage();
		}
		if(nameofbrowser.equals("webkit"))
		{
			p1=Playwright.create();
			b1=p1.webkit().launch(new LaunchOptions().setHeadless(false));
		 page=b1.newPage();
		}
	}
@AfterMethod
public void close()
{
	b1.close();
	
}
}
