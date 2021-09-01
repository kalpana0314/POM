package com.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.base.BaseClass;

public class LoginPage extends BaseClass {
	@FindBy(xpath = emailx)
	public WebElement emailtxt;
	@FindBy(xpath = passwordx)
	public WebElement passwordtxt;
	@FindBy(xpath = loginBtnx)
	public WebElement loginBtn;

	public LoginPage() {
		PageFactory.initElements(dr, this);
	}

	public void doLogin() {
		try {
			// System.out.println("val is " + config.getProperty("uName"));
			emailtxt.sendKeys(config.getProperty("uName"));
			passwordtxt.sendKeys(config.getProperty("passWord"));
			loginBtn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
