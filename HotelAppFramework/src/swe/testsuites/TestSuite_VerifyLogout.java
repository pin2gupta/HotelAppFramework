package swe.testsuites;

import swe.testcases.TC0008_Logout;

public class TestSuite_VerifyLogout extends TestSuite_BaseClass{
	public static void main(String args[])   {
		 initialize_Site();
		 
		 loginToSite("Test_Data1");
		 TC0008_Logout logoutTC = new TC0008_Logout(driver1);
		 //TC-120 - Verify Title of every Page reflects what the page objective is. 
		 //For example Title of Search Hotel page should have “Search Hotel”
		 //Expected - Title of each page should reflect its objective and the buttons should redirect as specified, to the relevant page.
		 logoutTC.login_verify2();
		
	     logoutTC.logout_BasicFlow();
	     
	     //TC109 - verify when pressed, logout button logs out from the application.
		 //Expected - User should logout from the application.
	     //Very that link is available
	     logoutTC.logout_Verify1();
		 

	}
	
}
