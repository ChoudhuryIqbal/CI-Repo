package jenkins_maven_log4IntegrationProject.com.iqbal.choudhury;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("I am going to do Before Class annotation");
		Reporter.log("BeforeClass completed");
		//Log.info("hi loginfo test is starting");
	}
	
	
	
	
	@AfterClass 
	public void afterClass(){
		System.out.println("I am going to finish testing class ");
		Reporter.log("AfterClass completed");
	}

}
