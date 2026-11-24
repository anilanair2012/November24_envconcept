package module2;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
public class As147 {
	@Test
	public void login()
	{
		Playwright playwright=Playwright.create();
		Browser b1=playwright.chromium().launch(new LaunchOptions().setHeadless(false));
		Page page=b1.newPage();
page.navigate("https://www.amazon.in/");
		
		
		Locator l5=page.locator("//span[text()='Hello, sign in']");
		  l5.hover();
		  Locator l6=page.locator("(//span[text()='Sign in'])[1]");
		  l6.click();
	Locator l1=page.locator("#ap_email_login");
	l1.fill("anilanair2012@gmail.com");
	Locator l2=page.locator(".a-button-input");
	l2.click();
	Locator l3=page.locator("#ap_password");
	l3.fill("Nachu@05");
	Locator l4=page.locator("#signInSubmit");
	l4.click();
	page.waitForTimeout(3000);
	//Assertion as=new Assertion();
	//as.assertEquals(page.title(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(page.title(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	sa.assertAll();
	assertThat(page).hasTitle("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}

}
