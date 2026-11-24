package module1.Playwrightproject;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class As119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Playwright p1=Playwright.create();
Browser b1=p1.chromium().launch(new LaunchOptions().setHeadless(false));
BrowserContext bc=b1.newContext(new Browser.NewContextOptions().setRecordVideoDir(Paths.get("C:\\Users\\anila\\eclipse-workspace\\Playwrightproject\\target\\Video")));
Page page=bc.newPage();
page.navigate("https://services1.passportindia.gov.in/forms/registration");
page.locator("//div[text()='CPV Delhi']").click();


bc.close();
	}

}
