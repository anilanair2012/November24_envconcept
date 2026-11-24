package module2;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.AriaRole;
//import org.testng.IRetryAnalyzer;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
public class As141 extends BaseTest {
	@Test//(retryAnalyzer=Retry_logic.class)
	public void login()
	{
		page.navigate("https://www.amazon.in/");
		
		
	/*	Locator l5=page.locator("//span[text()='Hello, sign in']");
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
	Assert.assertEquals(page.title(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
*/
Locator l7=	page.getByRole(AriaRole.SEARCHBOX);
l7.fill("shoe");
l7.press("Enter");
page.waitForTimeout(6000);
Locator l9=page.getByLabel("Add to cart");
assertThat(l9).isVisible();


/*Locator l=page.locator(".a-truncate-cut");
//Locator l8=page.locator("//span[contains(text()='Ringke PC Alles for Samsung Galaxy S25 Ultra')]");
//l8.click();
//page.waitForTimeout(3000);;
//Locator l9=page.locator("(//span[text()='Add to cart'])[2]");
//l9.click();
Assert.assertEquals(page.title(),"Amazon.in Shopping Cart");*/
	}
	

}
