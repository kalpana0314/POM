package com.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.base.BaseClass;

public class HomePage extends BaseClass {
	@FindBy(xpath = companieslinkx)
	public WebElement companieslink;
	@FindBy(xpath = dealslinkx)
	public WebElement dealslink;
	@FindBy(xpath = tasklinkx)
	public WebElement tasklink;

	public HomePage() {
		PageFactory.initElements(dr, this);
	}

}
