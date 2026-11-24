package module1.Playwrightproject;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class Flipkart_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright p1=Playwright.create();
		Browser b1=p1.chromium().launch(new LaunchOptions().setHeadless(false));
		Page page=b1.newPage();
		page.navigate("https://www.flipkart.com/");
		Locator l4=page.locator(".b3wTlE");
		//Locator l1=page.getByRole(AriaRole.BUTTON);
		l4.click();
		Locator l2=page.locator("(//input[@name='q'])[1]");
		l2.fill("mobile phone");
		l2.press("Enter");
		Locator l3=page.locator("//div[text()='Google Pixel 11 (Frost, 256 GB)']");
	l3.click();
	}

}
