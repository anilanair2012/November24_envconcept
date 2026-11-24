package module2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class As_145 {
	@DataProvider
	public Object data1()
	{
		Object[][]o1=new Object[5][1];
		o1[0][0]="mobile";
		o1[1][0]="shoe";
		o1[2][0]="Tablet";
		o1[3][0]="watch";
		o1[4][0]="tv";
		
		
		return o1;
	}
	@Test(dataProvider="data1")
	public void search(String input)
	{
		Playwright p1=Playwright.create();
		Browser b1=p1.chromium().launch(new LaunchOptions().setHeadless(false));
		Page page=b1.newPage();
		page.navigate("https://www.amazon.in/");
	Locator l1=	page.getByRole(AriaRole.SEARCHBOX);
	l1.fill(input);
	l1.press("ENTER");
		
	}

}
