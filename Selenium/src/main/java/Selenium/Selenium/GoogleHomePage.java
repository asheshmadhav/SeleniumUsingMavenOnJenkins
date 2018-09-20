package Selenium.Selenium;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
//import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class GoogleHomePage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@Override
	protected void openPage(PageLocator arg0, Object... arg1) {
		// TODO Auto-generated method stub
		//getTestBase().getDriver().get("http://www.google.com");
	}
	
	public void invoke() {
		driver.get("http://www.google.com");
		//getTestBase().getDriver().get("");
	}
	
	@FindBy(locator="xpath=//input[@title='Search']")
	public QAFWebElement searchBy;
	

}
