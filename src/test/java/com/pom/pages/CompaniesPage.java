package com.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.base.BaseClass;

public class CompaniesPage extends BaseClass {
	@FindBy(xpath = createBtnx)
	public WebElement createBtn;
	@FindBy(xpath = namex)
	public WebElement companynametxt;
	@FindBy(xpath = webx)
	public WebElement webtxt;
	@FindBy(xpath = addressx)
	public WebElement addresstxt;
	@FindBy(xpath = cityx)
	public WebElement citytxt;
	@FindBy(xpath = statex)
	public WebElement statetxt;
	@FindBy(xpath = zipx)
	public WebElement ziptxt;
	@FindBy(xpath = countryx)
	public WebElement countrytxt;
	@FindBy(xpath = saveBtnx)
	public WebElement saveBtn;

	public CompaniesPage() {
		PageFactory.initElements(dr, this);
	}

	public void createCompany() {
		try {
			createBtn.click();
			companynametxt.sendKeys("Cyber");
			webtxt.sendKeys("www.crm.com");
			addresstxt.sendKeys("Road no:12");
			citytxt.sendKeys("HYD");
			statetxt.sendKeys("AP");
			ziptxt.sendKeys("012345");
			selectAutoDrop(countryx, "India");
			saveBtn.click();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
