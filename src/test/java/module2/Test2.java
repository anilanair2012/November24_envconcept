package module2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Test2 {
@Test
public void launch() {
Playwright p1=Playwright.create();
Browser b1=p1.chromium().launch(new LaunchOptions().setHeadless(false));
Page page=b1.newPage();
page.navigate("https://amazon.in");

System.out.println("five");

}
@BeforeSuite
public void print()
{
	System.out.println("first");
}
@BeforeTest
public void display()
{
System.out.println("second");
}
@BeforeClass
public void show()
{
	System.out.println("third");
}
@BeforeMethod
public void shoq() {
	System.out.println("forth");
	
}
@AfterMethod
public void five()
{
	System.out.println("six");
	
}
@AfterClass
public void six()

{
	System.out.println("seven");	
}
@AfterTest
public void seven()
{
	System.out.println("eight");
}
@AfterSuite
public void eight()
{
	System.out.println("Eighth");
}
}