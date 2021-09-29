package com.learnings.miscellaneous;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FindBrokenLinks {

	@Test
	public void getBrokenLinks() throws MalformedURLException, IOException {

		SoftAssert sa = new SoftAssert();

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://qa.smartcmobile.net/SCM_10.0_S-SCP/default.aspx");

		List<WebElement> ele = driver.findElements(By.cssSelector(".list-group a"));
		for (WebElement el : ele) {
			String url = el.getAttribute("href");
			System.out.println(url);
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responseCode = conn.getResponseCode();
			sa.assertTrue(responseCode < 400, "This is a broken link " + url + " with status code as " + responseCode);

		}
		sa.assertAll();

	}
}
