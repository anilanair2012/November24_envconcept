package module2;

import java.nio.file.Paths;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Listeners_logic implements ITestListener{
public static Playwright p1;
public static Browser b1;
public static Page page;
@Test

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("C:\\Users\\anila\\eclipse-workspace\\Playwrightproject\\test-output\\Screenshotnew\\fail\\"+"photo.png")));
	}

}
