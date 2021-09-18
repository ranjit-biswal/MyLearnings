package com.learnings.selenium;

import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiniDriver {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://qa.smartcmobile.net/SCM_10.0_S-SCP");

		WebElement footerElement = driver.findElement(By.cssSelector(".container ul.group-links"));
		List<WebElement> footerlinks = footerElement.findElements(By.tagName("a"));

		for (WebElement footerlink : footerlinks) {
			System.out.println(footerlink.getText());

			String clickbyKeyboard = Keys.chord(Keys.CONTROL, Keys.ENTER);
			footerlink.sendKeys(clickbyKeyboard);
			Thread.sleep(2000);

		}

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while (it.hasNext()) {

			String windowTitle = driver.switchTo().window(it.next()).getTitle();
			System.out.println(windowTitle);

		}

		driver.quit();

	}

}
