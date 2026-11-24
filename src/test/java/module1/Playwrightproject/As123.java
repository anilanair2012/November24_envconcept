package module1.Playwrightproject;

import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Tracing;
import com.microsoft.playwright.options.AriaRole;

public class As123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Playwright p1=Playwright.create();
Browser b1=p1.firefox().launch(new LaunchOptions().setHeadless(false));
BrowserContext bc=b1.newContext();
Page page=bc.newPage();
bc.tracing().start(new Tracing.StartOptions().setSnapshots(true).setScreenshots(true).setSources(true));
page.navigate("https://www.amazon.in/");
		
Locator l1=page.getByRole(AriaRole.SEARCHBOX);
l1.fill("Shoes for Men");
l1.press("Enter");
//page.locator("//div[@id='brandsRefinements']/descendant::span[text()='Campus']").click();

	bc.tracing().stop(new Tracing.StopOptions().setPath(Paths.get("C:\\Users\\anila\\eclipse-workspace\\Playwrightproject\\target\\Tracing\\trace.zip")));
	
	bc.close();
	}}
