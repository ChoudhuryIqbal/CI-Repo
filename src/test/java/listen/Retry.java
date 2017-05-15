package listen;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	private int retryCount = 0;
	private int maxRetryCount = 1;

	// below method return true if the test
	// method has to be retried else "false

	

	private String getResultStatusName(int status) {
		// TODO Auto-generated method stub
		String resultName = null;
		if (status == 1) {
			resultName = "success";
		}
		if (status == 2) {
			resultName = "Failure";
		}
		if (status == 3) {
			resultName = "Skip";
		}

		return resultName;
	}

	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if (retryCount < maxRetryCount) {
			System.out.println("Retrying test "

					+ result.getName() + "with status" + getResultStatusName(result.getStatus()) + "for the "
					+ (retryCount + 1) + "Times");
			retryCount++;
			return true;

		}

		return false;
	}

}
