package module2;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
public class As_151 {
	@Test
	public void medicine()
	{
		Playwright p1=Playwright.create();
		Browser b1=p1.chromium().launch(new LaunchOptions().setHeadless(false));
		Page page=b1.newPage();
		page.navigate("https://www.1mg.com/");
	Locator l1=	page.getByPlaceholder("Search for Medicines and Health Products");
	l1.fill("PCM");
	l1.press("Enter");
	Locator l2=page.locator("//div[text()='Search results for PCM']");
assertThat(l2).hasText("Search results for PCM");
	Locator l3=page.locator("//div[text()='Login']");
	l3.click();
	Locator l4=page.locator("//label[text()='Enter Your mobile number or email']");
	l4.fill("9495989216");
	Locator l5=page.getByLabel("Send OTP");
	l5.click();
	page.waitForTimeout(6000);
	Locator l6=page.locator("//input[@name='otp']");
	l6.fill("1234");
	Locator l7=page.getByLabel("Done");
	l7.click();
	Locator l8=page.locator("#otp-error");
	assertThat(l8).containsText("OTP is invalid as it has timed out, we've sent you a new OTP. Please try logging in with that.");
	
		
	}

}
