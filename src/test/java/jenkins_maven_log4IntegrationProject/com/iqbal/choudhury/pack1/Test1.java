package jenkins_maven_log4IntegrationProject.com.iqbal.choudhury.pack1;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import jenkins_maven_log4IntegrationProject.com.iqbal.choudhury.BaseClass;

public class Test1  extends BaseClass{
	public static final Logger log = Logger.getLogger(Test1.class.getName());
	@Test(alwaysRun=true)
	public void t1(){
		log.info("Starting test1 log4 j used ");
		System.out.println("Completed T1 Test from Test1");
		Reporter.log("completed Test1 class t1");
		//Assert.assertTrue(false);
	}
	
	@Test
	public void t2(){
		
		log.warn("Hum now i am goonna do t2");
		System.out.println("Completed T2 Test from Test1");
		Reporter.log("completed Test1 class t2");
		
	}
	@Test
	public void t3(){
		log.info("gonna do t3");
		System.out.println("Completed T3 Test from Test1");
		Reporter.log("completed Test1 class t3");
		
	}

}
