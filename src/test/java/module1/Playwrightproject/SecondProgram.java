package module1.Playwrightproject;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class SecondProgram {

	public static void main(String[] args) 
	{
		Playwright playwright=                    Playwright.create();
		Browser browser = playwright.chromium().launch(new LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
page.navigate("https://www.amazon.in")	;
Locator locator = page.locator("#twotabsearchtextbox");
locator.fill("shoe");


	}

}
