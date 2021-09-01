package com.pom.base;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

import com.pom.pages.CompaniesPage;
import com.pom.pages.HomePage;
import com.pom.pages.LoginPage;
import com.pom.repository.OR;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends OR {
	public static WebDriver dr;
	public static FileInputStream f;
	public static Properties config;
	public static LoginPage lp;
	public static HomePage hp;
	public static CompaniesPage cp;

	@BeforeMethod
	public void openApp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		dr = new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		dr.get("https://ui.cogmento.com/");
		lp = new LoginPage();
		hp = new HomePage();
		cp = new CompaniesPage();
	}

	public BaseClass() {
		try {
			f = new FileInputStream(
					"C:\\Users\\jaide\\eclipse-workspace\\DD1_Cart\\src\\test\\resources\\Config\\config.property");
			config = new Properties();
			config.load(f);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * @AfterMethod public void closeApp() {
	 * 
	 * }
	 */

	public static void selectAutoDrop(String dropx, String value) {
		dr.findElement(By.xpath(dropx)).click();
		List<WebElement> countries = dr.findElements(By.tagName("span"));
		for (WebElement country : countries) {
			if (country.getText().equals(value)) {
				country.click();
			}
		}
	}

}
