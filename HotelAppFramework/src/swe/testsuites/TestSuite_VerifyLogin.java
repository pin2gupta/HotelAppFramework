package swe.testsuites;

import swe.testcases.TC0001_LoginToWebSite;
import swe.utility.PrintMessages;

public class TestSuite_VerifyLogin extends TestSuite_BaseClass{
	public static void main(String args[]){

		initialize_Site();
		loginToSite("Test_Data1");
		
		TC0001_LoginToWebSite login_alternate_Flow = new TC0001_LoginToWebSite(driver1);
		try {
				//Verify that after login it displays Hello<username>
				login_alternate_Flow.verify_AfterLoginStr();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//TC-120 - Verify Title of every Page reflects what the page objective is. For example Title of Search Hotel page should have “Search Hotel”
		//Expected - Title of each page should reflect its objective and the buttons should redirect as specified, to the relevant page.
		
		login_alternate_Flow.verifyTitle();
		PrintMessages.printMsg("********************************************");	 		
		
	}
}
