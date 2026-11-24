package module2;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class Retry_logic implements IRetryAnalyzer
{
int currentcount=0;
int  retrycount=2;

	@Override
	public boolean retry(ITestResult result) {
		if(currentcount<retrycount)
		{
			currentcount++;
			return true;
		}
		return false;
	}
	

}
