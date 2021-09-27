package stepdefinationcode;

import browsersfactory.Browsers;
import pageobjectmodel.FooterSection;
import pageobjectmodel.Homepage;
import pageobjectmodel.MyAccountpage;
import pageobjectmodel.RegisterAccountpage;
import pageobjectmodel.Sellerloginpage;

public class StepCodesHelper {
	
	StepCodesHelper helper;
	
	
	/// Global Instance/Reference Variable
	Browsers browser;
	Homepage homepage;
	Sellerloginpage sellerloginpage;
	RegisterAccountpage regaccountpage;
	MyAccountpage myaccountpage;
	FooterSection footersection;
	
	public Browsers GetBrowser() {
		
		if (browser==null) {
			browser = new Browsers();
		}
		
		return browser;
	}
		
		public Homepage GetHomepage() {
			if (homepage==null) {
				
				homepage = new Homepage(browser.driver);
			}
			
			return homepage;
		
		
	}
		public Sellerloginpage GetSellerLoginPage() {
			if (sellerloginpage== null) {
				sellerloginpage = new Sellerloginpage(browser.driver);
			}
			return sellerloginpage;
		}
		public RegisterAccountpage GetRegAccountPage() {
			if (regaccountpage==null) {
				regaccountpage = new RegisterAccountpage(browser.driver);
			}
			return regaccountpage;
		}
		public MyAccountpage GetMyAccountPage() {
			if (myaccountpage==null) {
				myaccountpage = new MyAccountpage(browser.driver);
			}
			return myaccountpage;
		}
		public FooterSection GetFooterSection() {
			if(footersection==null) {
				footersection = new FooterSection(browser.driver);
			}
			return footersection;
		}
}
