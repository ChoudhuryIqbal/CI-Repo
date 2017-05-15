package jenkins_maven_log4IntegrationProject.com.iqbal.choudhury.pack2;

import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;

import jenkins_maven_log4IntegrationProject.com.iqbal.choudhury.BaseClass;

public class Test1  extends BaseClass{
	
	//public static final Logger log = Logger.getLogger(Test1.class.getName());
public static final Logger log=Logger.getLogger(Test1.class.getName());
	@Test (priority=1)
	public void t1(){
		System.out.println("Completed T1 Test from Test1 pack2");
		Reporter.log("completed Test1 class t1 pack2");
		log.info("logging Log 1 from pack2");
	}
	
	@Test(priority=3)
	public void t2(){
		System.out.println("Completed T2 Test from Test1 from Pack2");
		Reporter.log("completed Test1 class t2 pack2");
		log.info("logging Log 2 from pack2");
		
	}
	@Test(priority=2)
	public void t3(){
		System.out.println("Completed T3 Test from Test1 pack2");
		Reporter.log("completed Test1 class t3 pack2");
		log.info("logging Log 3 from pack2");
		
	}

}
