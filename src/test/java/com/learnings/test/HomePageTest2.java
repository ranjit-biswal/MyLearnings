package com.learnings.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.learnings.page.SCMHomePage;

public class HomePageTest2 {

	@Test
	public void validateLogin() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://qa.smartcmobile.net/SCM_10.0_S-SCP/default.aspx");
		SCMHomePage homePage = new SCMHomePage(driver);
		homePage.txtBoxUsername().sendKeys("business_-&+commercial");
		homePage.txtBoxPassword().sendKeys("Demo@123");
		homePage.btnLogin().click();
		Thread.sleep(10000);
		File files = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(files, new File("D:\\workspace\\Learnings\\MyLearnings\\images\\image.png"));

		driver.close();
	}

}
