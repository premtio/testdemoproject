package test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import ru.yandex.qatools.ashot.Screenshot;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;		
import org.junit.runner.notification.Failure;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Testrunner {
	
	calculator cacl = new calculator();
	
//	@BeforeClass
//	public static void startTest() throws FileNotFoundException, IOException
//	{
//		
//		System.out.println("Start Test");
//	}
//
	@Before
	public void BeforeTestCase() throws InterruptedException, IOException {	
		System.out.println("Before Test");
	}
	
	@Test
	public void testcase1() throws InterruptedException, IOException {	
		System.out.println("Test Case 1");
		cacl.add();
		
	}
	
	@Test(ignoreBefore=True )
	public void testcase2() throws InterruptedException, IOException {
		System.out.println("Test Case 2");
		cacl.sub();
		//Assert.fail("Failed");
	}
	
	@After
	public void AfterTestCase() throws InterruptedException, IOException {	
		System.out.println("After Test");
	}
//	
//	@AfterClass
//	public static void endTest()
//	{
//		
//	}
	
	
//	@Test
//	public void test1() {
//		 Result result = JUnitCore.runClasses(AssetExamples.class);					
//			for (Failure failure : result.getFailures()) {							
//			      System.out.println(failure.toString());					
//			   }		
//			   System.out.println("Result=="+result.wasSuccessful());
//	}

}
