package module2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.options.AriaRole;

public class Testcase_1 {

@Test(priority=1,invocationCount=4,enabled=true)
public void search()
{
	Playwright p1=Playwright.create();
	Browser b1=p1.firefox().launch(new LaunchOptions().setHeadless(false));

		Page page=b1.newPage();
		page.navigate("https://google.com");
	page.getByRole(AriaRole.COMBOBOX).fill("India");
}
@Test
public void launch1()
{
	Playwright p1=Playwright.create();
	Browser b1=p1.firefox().launch(new LaunchOptions().setHeadless(false));

		Page page=b1.newPage();
		page.navigate("https://google.com");
	page.getByRole(AriaRole.COMBOBOX).fill("India");
}
}

