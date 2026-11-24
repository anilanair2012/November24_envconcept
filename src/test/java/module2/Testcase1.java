package module2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import io.github.cdimascio.dotenv.Dotenv;
@Listeners(Listners_logic.class)
public class Testcase1 extends Listners_logic{
	
	@Test
	public void method1()
	{
		 p1=Playwright.create();
		//Browser b1=p1.chromium().launch(new LaunchOptions().setHeadless(false));
		//Browser b2=p1.firefox().launch(new LaunchOptions().setHeadless(false));
		b3=p1.webkit().launch(new LaunchOptions().setHeadless(false));

		page=b3.newPage();
		page.navigate("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D825671333480%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D13067763073558599140%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9153226%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2479342%26mcid%3D4c22dcdee2bf3a71b0b832c5c4ba9c17%26hvocijid%3D13067763073558599140--%26hvexpln%3Dnav%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Dotenv dotenv = Dotenv.load();
		page.locator("#ap_email_login").fill(dotenv.get("un"));

		page.locator(".a-button-input").click();
		//page.locator(".a-button-text").click();
		page.locator("#ap_password").fill(dotenv.get("pwd"));
		page.waitForTimeout(3000);

		page.locator(".a-button-input").click();
		page.waitForTimeout(3000);
	}

}
