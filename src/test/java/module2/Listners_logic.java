package module2;

import java.nio.file.Paths;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Page.ScreenshotOptions;


public class Listners_logic implements ITestListener
{
	public static Playwright p1;
	public static Browser b3;
	public static Page page;
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		page.screenshot(new ScreenshotOptions().setPath(Paths.get("C:\\Users\\anila\\eclipse-workspace\\Playwrightproject\\test-output\\Screenshot\\Pass\\"+"Photo.png")));

		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		page.screenshot(new ScreenshotOptions().setPath(Paths.get("C:\\Users\\anila\\eclipse-workspace\\Playwrightproject\\test-output\\Screenshot\\Fail\\"+"Photo.png")));

	}

}
