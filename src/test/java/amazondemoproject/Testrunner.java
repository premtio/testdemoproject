package amazondemoproject;

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
import org.junit.AfterClass;
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
	public static ExtentTest test;
//	public static WebDriver driver;
//	public static Screenshot Screenshot;
	public static ExtentReports report;
	public static final Logger logger = LogManager.getLogger(Testrunner.class);
	
	@BeforeClass
	public static void startTest() throws FileNotFoundException, IOException
	{
//	BasicConfigurator.configure();
	File file = new File("C:\\Users\\PremTio\\eclipse-workspace\\amazondemo\\amazondemo\\logging.log");        
    file.delete();
	Properties props = new Properties();	
	props.load(new FileInputStream("log4j.properties"));	
	PropertyConfigurator.configure(props);
//	PropertyConfigurator.configure("log4j.properties");
	report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");	
	report.assignProject("Amazon & Facebook login test cases");
	
	}

	@Test
	public void testcase1() throws InterruptedException, IOException {	
		test = report.startTest("Amazon testcase");
		logger.info("Amazon test case started");
		AmazonloginPage login = new AmazonloginPage();
		login.amazonlogin();
		
	}
	
	@Test
	public void testcase2() throws InterruptedException, IOException {
		test = report.startTest("facebook testcase");
		logger.info("facebook test case started");
		FaceBookLogintest facelogin = new FaceBookLogintest();
		facelogin.facebooklogin();
		
	}
	
	@AfterClass
	public static void endTest()
	{
	report.endTest(test);
	report.flush();
	}
	
	
//	@Test
//	public void test1() {
//		 Result result = JUnitCore.runClasses(AssetExamples.class);					
//			for (Failure failure : result.getFailures()) {							
//			      System.out.println(failure.toString());					
//			   }		
//			   System.out.println("Result=="+result.wasSuccessful());
//	}

}
