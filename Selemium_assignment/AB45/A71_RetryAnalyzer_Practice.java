package ab45_TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class A71_RetryAnalyzer_Practice implements IRetryAnalyzer {
 int current_count=0;
 int no_of_retry=2;
	@Override
	public boolean retry(ITestResult result) {
		
		if(current_count<no_of_retry)
		{
			current_count++;
			return true; //give retry.
		}
		return false; //do not retry.
	}

}
