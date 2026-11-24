package module2;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.GetByRoleOptions;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.SelectOption;

public class As_139 {
	@Test
	public void launch()
	{
	Playwright p1=Playwright.create();
	Browser b1=p1.chromium().launch(new LaunchOptions().setHeadless(false));
	Page page=b1.newPage();
page.navigate("https://amazon.in/");
Locator l1=page.locator("#twotabsearchtextbox");
l1.fill("shoes");
l1.press("Enter");
Locator l2=page.getByRole(AriaRole.LINK,new GetByRoleOptions().setName("Fresh"));
Locator l3=page.getByTitle("Search in");
l3.selectOption("All Categories");
l3.selectOption(new SelectOption().setValue("search-alias=aps"));
l3.selectOption(new SelectOption().setIndex(2));


}}
