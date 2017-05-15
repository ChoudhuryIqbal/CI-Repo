package listen;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener {

	public void onTestStart(ITestResult result) {
		Reporter.log("-----Starting test----" + result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("----- test success----" + result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		/*
		 * if (!result.isSuccess()) { String userDirector =
		 * System.getProperty("user.dir"); String customeLocation =
		 * "\\src\\com\\actiTime\\screenShot\\"; String failureImageFileName =
		 * userDirector+customeLocation+new
		 * SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new
		 * GregorianCalendar().getTime())+"-"+result.getMethod().getMethodName()
		 * + ".png"; File scrFile = ((TakesScreenshot)
		 * driver).getScreenshotAs(OutputType.FILE); try {
		 * FileUtils.copyFile(scrFile, new File(failureImageFileName)); } catch
		 * (IOException e) { e.printStackTrace(); } //String userDirector =
		 * System.getProperty("user.dir") + "/"; Reporter.log("<a href=\"" +
		 * failureImageFileName + "\"><img src=\"file:///" +
		 * failureImageFileName +"\" alt=\"\"" + "height='100' width='100'/> " +
		 * "<br />"); Reporter.setCurrentTestResult(null);
		 * 
		 * }
		 */
		Reporter.log("-----failed  test----" + result.getMethod().getMethodName());

	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("-----Skipped test----" + result.getMethod().getMethodName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//Reporter.log("-----finish  test----" + ((ITestResult) context).getMethod().getMethodName());

	}

}