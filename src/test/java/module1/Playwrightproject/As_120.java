package module1.Playwrightproject;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.WaitForSelectorState;

public class As_120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Playwright p1=Playwright.create();
Browser b1=p1.firefox().launch(new LaunchOptions().setHeadless(false));

	Page page=b1.newPage();
	page.navigate("https://google.com");
page.getByRole(AriaRole.COMBOBOX).fill("India");
//Locator l2=page.locator("//ul[@role='listbox']//li");
//l2.first().waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));

//int count2=l2.count();
//int count=	page.locator("//li[@class='sbct PZPZlf']").count();
Locator l3=page.locator("//ul[@role='listbox']/descendant::li[@class='sbct PZPZlf']");
l3.first().waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
int count1=l3.count();
System.out.println(count1);
l3.first().waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
//page.locator("(//li[@class='sbct PZPZlf sbhl']/preceding-sibling::*)[1]").click();
page.locator("((//ul[\"@class=sbct PZPZlf\"]/li)[13]/preceding-sibling::*)[1]").click();
page.locator("(//ul[\"@class=sbct PZPZlf\"]/li/following-sibling::*)[12]").click();
//page.locator("(//li[@class='sbct PZPZlf sbhl']/following-sibling::*)[9]").click();
//System.out.println(count1);
	}

}
