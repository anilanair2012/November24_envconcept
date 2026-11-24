package module2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class As_140 {
	Page page;
	@BeforeMethod

	public void launch()
	{
	Playwright p1=Playwright.create();
	Browser b1=p1.chromium().launch(new LaunchOptions().setHeadless(false));
	page=b1.newPage();
	page.navigate("https://www.hopscotch.in/");
	
	
	}
	@AfterMethod
	public void closed()
	{
	page.close();	
	}
@Test
public void test1()
{
	System.out.println("First test");
}
@Test
public void test2()
{
	System.out.println("second test");	
}
}
