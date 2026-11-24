package module2;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

import io.github.cdimascio.dotenv.Dotenv;

public class Envn_Program
{
public static void main(String[] args) 
{
Dotenv dotenv = Dotenv.load();	
String url = dotenv.get("url");

Playwright playwright=Playwright.create();
Browser b1=playwright.chromium().launch(new LaunchOptions().setHeadless(false));
Page page=b1.newPage();
page.navigate(url);






}
	
}
