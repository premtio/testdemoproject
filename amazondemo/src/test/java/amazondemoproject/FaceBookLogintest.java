package amazondemoproject;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.LogStatus;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FaceBookLogintest {
	public static Screenshot Screenshot;
	public void facebooklogin() throws InterruptedException, IOException {
		
//		System.out.println("Asset Examples started");
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Teaching\\Workspace\\Day1Test\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(10000);
		Testrunner.logger.info("Facebook launched");
		Thread.sleep(5000);
		//a[@id='nav-link-accountList']//div//span
//		Screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
//		ImageIO.write(Testrunner.Screenshot.getImage(), "jpg", new File("C:\\Users\\PremTio\\eclipse-workspace\\amazondemo\\TestScreenshots\\FaceBookLoginPage.jpg"));
		String strgettext = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]")).getText();
//		Testrunner testcls = new Testrunner();
		Testrunner.logger.info("Account name : "+strgettext);
//		System.out.println(strgettext);
		if(strgettext.contains("Facebook helps"))
		{
			Testrunner.test.log(LogStatus.PASS, "Text displayed as expected");
			Testrunner.logger.info("Text displayed as expected");
//			System.out.println("success");
		}
		else
		{
			Testrunner.test.log(LogStatus.FAIL, "Test Failed due to not matching");
			Testrunner.logger.warn("Test Failed due to not matching");
//			System.out.println("fail");
		}
		driver.close();
		
	}
	
	

}
