package stepdefinationcode ;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hook_Step_Codes{
	StepCodesHelper helper;
	public Hook_Step_Codes(StepCodesHelper helper) {
		this.helper = helper;
		
	}
	
	
	///hook for before
	@Before
	public void RampUp() {
		
	}
	
	
	//hook for after
	@After
	public void TearDown(Scenario scenario) {
		
			if (scenario.isFailed()) {
				
				byte[] screenshot = ((TakesScreenshot)helper.GetBrowser().driver).getScreenshotAs(OutputType.BYTES);
				
			scenario.attach(screenshot,"image/png", "ScreenShots");
				
			}
		
		
		helper.GetRegAccountPage().JavaWait(1000);
		
		helper.GetBrowser().driver.close();
		//helper.GetBrowser().driver.quit();;
	}

}
