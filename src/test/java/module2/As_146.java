package module2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class As_146 {
	@DataProvider
	public Object values()
	{
		Object[][]o2=new Object[3][2];
		o2[0][0]="anilanair2012@gmail.com";
		o2[0][1]="Nachu@05";
		o2[1][0]="9495989216";
		o2[1][1]="Nachu@05";
		o2[2][0]="anilanair2012@gmail.com";
		o2[2][1]="hu@05";
		return o2;
	}
	@Test(dataProvider="values")
	public void login(String username,String password)
	{
	Playwright p1=Playwright.create();
	Browser b1=p1.chromium().launch(new LaunchOptions().setHeadless(false));
	Page page=b1.newPage();
	page.navigate("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	Locator l1=page.locator("//input[@name='email']");
	l1.fill(username);
	Locator l2=page.locator("(//span[\"#continue-announce\"])[8]");
	l2.click();
	Locator l3=page.locator("(//input[\"#ap_password\"])[13]");
	l3.fill(password);
	Locator l4=page.locator("(//input[\"#ap_password\"])[14]");
	l4.click();
	}

}
