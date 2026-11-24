package module2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;
@Listeners(Listeners_logic.class)
public class Assignment_146 extends Listeners_logic  {
	@Test
	public void login()
	{
	
 p1=Playwright.create();
b1=p1.chromium().launch(new LaunchOptions().setHeadless(false));
 page=b1.newPage();

page.navigate("https://www.google.in/");
Locator l1=page.getByRole(AriaRole.SEARCHBOX);

}
}