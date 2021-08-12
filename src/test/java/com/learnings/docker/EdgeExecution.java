package com.learnings.docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class EdgeExecution {

	@Test
	public void Edge() throws MalformedURLException {
		DesiredCapabilities cap = DesiredCapabilities.firefox();

		URL url = new URL("http://localhost:4444/wd/hub");

		RemoteWebDriver driver = new RemoteWebDriver(url, cap);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}

}
