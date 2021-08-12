package com.learnings.docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeExecution {

	@Test
	public void Chrome() throws MalformedURLException {
		DesiredCapabilities cap = DesiredCapabilities.chrome();

		URL url = new URL("http://localhost:4444/wd/hub");

		RemoteWebDriver driver = new RemoteWebDriver(url, cap);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}

}
