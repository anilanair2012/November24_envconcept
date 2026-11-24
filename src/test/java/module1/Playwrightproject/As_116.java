package module1.Playwrightproject;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class As_116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Playwright p1=Playwright.create();
Browser b1=p1.chromium().launch(new LaunchOptions().setHeadless(false));
Page page=b1.newPage();
page.navigate("https://www.google.com/");
//page.locator("#ti6dpd").fill("amazon");
page.locator(".gLFyf").fill("amazon");
	}

}
