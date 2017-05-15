package jenkins_maven_log4IntegrationProject.com.iqbal.choudhury.pack3;

import org.testng.Reporter;
import org.testng.annotations.Test;

import jenkins_maven_log4IntegrationProject.com.iqbal.choudhury.BaseClass;

public class Test1  extends BaseClass{
	@Test
	public void t1(){
		System.out.println("Completed T1 Test from Test1 pack3");
		Reporter.log("completed Test1 class t1 pack3");
	}
	
	@Test
	public void t2(){
		System.out.println("Completed T2 Test from Test1 pack3");
		Reporter.log("completed Test1 class t2 pack3");
		
	}
	@Test(enabled=true)
	public void t3(){
		System.out.println("Completed T3 Test from Test1 pack3");
		Reporter.log("completed Test1 class t3 pack3");
		
	}

}
