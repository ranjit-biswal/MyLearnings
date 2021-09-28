package com.learnings.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SCMHomePage {
	WebDriver driver;

	public SCMHomePage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "txtpwd")
	WebElement txtBoxPassword;

	@FindBy(css = "input#btnlogin")
	WebElement btnLogin;

	By txtBoxUsername = By.name("txtLogin");

	public WebElement txtBoxUsername() {
		return (driver.findElement(txtBoxUsername));
	}

	public WebElement txtBoxPassword() {
		return txtBoxPassword;
	}

	public WebElement btnLogin() {
		return btnLogin;
	}
}
