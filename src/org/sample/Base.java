package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	WebDriver driver;
public WebDriver getDriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiny\\eclipse-workspace\\BaseClassCreation\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	return driver;
}
private void loadUrl(String url) {
	driver.get(url);
}
private void type(WebElement element, String name) {
	element.sendKeys(name);
}
private void btnClick(WebElement element) {
	element.click();
}
private void quitBrowser() {
	driver.quit();
}

}
