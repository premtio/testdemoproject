package amazondemoproject;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import com.relevantcodes.extentreports.ExtentTest;
public class AmazonloginPage {
	public static Screenshot Screenshot;

	public void amazonlogin() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
//		System.out.println("Asset Examples started");
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Teaching\\Workspace\\Day1Test\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(10000);
		Testrunner.logger.info("Amazon launched");
//		Thread.sleep(5000);
//		Screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
//		ImageIO.write(Testrunner.Screenshot.getImage(), "jpg", new File("C:\\Users\\PremTio\\eclipse-workspace\\amazondemo\\TestScreenshots\\AmazonHomePage.jpg"));
		//a[@id='nav-link-accountList']//div//span
		
		String strgettext = driver.findElement(By.xpath("//a[@id='nav-link-accountList']//div//span")).getText();
//		Testrunner testcls = new Testrunner();
//		System.out.println(strgettext);
		Testrunner.logger.info("Account name : "+strgettext);
		if(strgettext.contains("Hello, Sign in"))
		{
			Testrunner.test.log(LogStatus.PASS, "successful");
			Testrunner.logger.info("successful matched");
//			System.out.println("success");
		}
		else
		{
			Testrunner.test.log(LogStatus.FAIL, "Test Failed due to not matching");
			Testrunner.logger.warn("Test Failed due to not matching");
//			System.out.println("fail");
		}
		driver.close();
		Testrunner.logger.info("Chrome Closed");
	}

}
