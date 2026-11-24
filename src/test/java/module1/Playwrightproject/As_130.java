package module1.Playwrightproject;

import java.nio.file.Paths;
import java.util.Date;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.ScreenshotOptions;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class As_130 {

	public static void main(String[] args) {
		Date d1=new Date();
	
		Date d2=new Date(d1.getTime());
		String s2=d2.toString();
		String format=s2.replace(":", "");
		// TODO Auto-generated method stub
Playwright p1=Playwright.create();
Browser b1=p1.chromium().launch(new LaunchOptions().setHeadless(false));
Page page=b1.newPage();
page.navigate("https://www.amazon.in");
Locator l2=page.getByRole(AriaRole.SEARCHBOX);
l2.fill("Watch");
//page.screenshot(new ScreenshotOptions().setPath(Paths.get("C:\\Users\\anila\\eclipse-workspace\\Playwrightproject\\target\\photo"+Math.random()+".png")));
	//page.screenshot(new ScreenshotOptions().setPath(Paths.get("C:\\Users\\anila\\eclipse-workspace\\Playwrightproject\\target\\photo"+format+".png")));
	page.screenshot(new ScreenshotOptions().setPath(Paths.get("C:\\Users\\anila\\eclipse-workspace\\Playwrightproject\\target"+new As_130().getClass()+format+".png")));
			

}}
