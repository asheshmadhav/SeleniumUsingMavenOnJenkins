package Selenium.Selenium;

import org.testng.annotations.Test;

public class test1 {
	
	@Test
	public void test() {
		
		GoogleHomePage googleHomePage = new GoogleHomePage();
		googleHomePage.invoke();
		googleHomePage.searchBy.sendKeys("Infostretch");
		
	}
	
	

}
