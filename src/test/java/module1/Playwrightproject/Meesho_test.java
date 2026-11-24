package module1.Playwrightproject;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Meesho_test {
@Test
{
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
Playwright p1=Playwright.create();
Browser b1=p1.chromium().launch(new LaunchOptions().setHeadless(false));
Page page=b1.newPage();
page.navigate("https://www.meesho.com/");
Locator l2=page.getByTitle("https://www.meesho.com/");
System.out.println(l2);
Locator l1=page.getByPlaceholder("Try Saree, Kurti or Search by Product Code");
l1.fill("T-shirt");
l1.press("Enter");
Locator l3=page.getByTitle("https://www.meesho.com/search?q=T-shirt&searchType=autosuggest&searchIdentifier=text_search");
System.out.println(l3);
Locator l4=page.locator("//p[text()='Men Cotton Blend Regular Tshirts']");
l4.click();
Locator l6=page.locator("//span[text()='M']");
l6.click();
Locator l5=page.locator("//span[text()='Add to Cart']");
l5.click();
	}

}
