package module1.Playwrightproject;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class As_131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Playwright p1=Playwright.create();
Browser b1=p1.chromium().launch(new LaunchOptions().setHeadless(false));
BrowserContext bc=b1.newContext(new Browser.NewContextOptions().setRecordVideoDir(Paths.get("C:\\Users\\anila\\eclipse-workspace\\Playwrightproject\\target\\newvideo")));
//BrowserContext bc=b1.newContext(new Browser.NewContextOptions().setRecordVideoDir(Paths.get("C:\\Users\\anila\\eclipse-workspace\\Playwrightproject\\target\\Video")));
Page page=bc.newPage();
page.navigate("https://www.amazon.in");
Locator l2=page.getByRole(AriaRole.SEARCHBOX);
l2.fill("Watch");
	}
	

}
