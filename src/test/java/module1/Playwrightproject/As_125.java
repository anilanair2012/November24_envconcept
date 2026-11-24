package module1.Playwrightproject;

import java.nio.file.Paths;
import java.util.Date;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Locator.GetByRoleOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.ScreenshotOptions;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.SelectOption;

public class As_125 {

	public static void main(String[] args) {
		
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime());
System.out.println(d2);
String string = d1.toString();
String format1=		string.replace(":", "");
		System.out.println(format1);
		
		// TODO Auto-generated method stub
Playwright p1=Playwright.create();
Browser b1=p1.chromium().launch(new LaunchOptions().setHeadless(false));
Page page=b1.newPage();
page.navigate("https://www.amazon.in");

//page.getByRole(AriaRole.SEARCHBOX).fill("shoe");
Locator l2=page.getByRole(AriaRole.SEARCHBOX);
l2.fill("tablet");
l2.dblclick();
//l2.selectOption("Alexa Skills");
//l2.selectOption(new SelectOption().setValue("search-alias=alexa-skills"));
Locator l3=page.locator("#searchDropdownBox");
l3.selectOption(new SelectOption().setIndex(3) );
//page.getByRole(AriaRole.SEARCHBOX,new GetByRoleOptions().setName("Search Amazon.in")).fill("shoe").dbclick();


page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("C:\\Users\\anila\\eclipse-workspace\\Playwrightproject\\target\\"+new As_125().getClass()+format1+".png")));

	}

}

