package com.pom.tests;

import org.testng.annotations.Test;

import com.pom.base.BaseClass;

public class Company_Test extends BaseClass {
	@Test
	public void TC1_CreateCompany() throws InterruptedException {
		lp.doLogin();
		Thread.sleep(3000);

		hp.companieslink.click();
		Thread.sleep(3000);
		cp.createCompany();

	}

}
