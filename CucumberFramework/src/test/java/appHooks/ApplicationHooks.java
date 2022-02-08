package appHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import qa.com.driversfactory.Driverfactory;
import qa.com.util.Configreader;

public class ApplicationHooks {
	
	private Driverfactory driverFactory;
	private Configreader configReader;
	private WebDriver driver;
	Properties prop;
	
	
	@Before(order=0)
	public void getProperty() {
		configReader = new Configreader();
		prop=configReader.init_Prop();
	}
	
	@Before(order=1)
	public void launchBrowser() {
		String browserName=prop.getProperty("browser");
		driverFactory = new Driverfactory();
		driver=driverFactory.init_driver(browserName);
		
	}
	
	@After(order=0)
	public void quiteBrowser() {
		driver.quit();
	}
	
//	@After(order=1)
//	public void takeScreenshot(Scenario scenario) {
//		if(scenario.isFailed()) {
//			String screenShotName=scenario.getName().replaceAll(" ", "_");
//			byte[] sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//			scenario.attach(sourcePath, "image/png", screenShotName);
//			
//			
//		}
//	}

}
