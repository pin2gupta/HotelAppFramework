package swe.testcases;

import org.openqa.selenium.WebDriver;

import swe.pageobjects.Logout_Page;
import swe.pageobjects.Page_BaseClass;
import swe.utility.Logout_Const;
import swe.utility.PrintMessages;

public class TC0008_Logout {
	WebDriver driver;
	
	public TC0008_Logout(WebDriver driver){
		this.driver = driver;
	}
	
	public void logout_BasicFlow(){
		PrintMessages.printMsg("TC0008_Logout_BasicFlow");
		Logout_Page.lnk_LogOutByLnkTxt(driver).click();
		PrintMessages.printMsgEmptyLn(1);
	}
	
	public void logout_Verify1(){
		PrintMessages.printMsg("TC0008_Logout_Verify1 - Link to Regon is available");
		//Verify that the correct Text is available
		String strlnkTxt = Logout_Page.lnk_ReLoginByLnkTxt(driver).getText();
		if (strlnkTxt.equals(Logout_Const.strReLoginLnk))
			PrintMessages.printMsg("The text Expected to be available is: "+strlnkTxt);
		else
			PrintMessages.printMsg("The text was not found: Test Failed!!!");
		PrintMessages.printMsgEmptyLn(1);
	}
	
	public void login_verify2(){
		PrintMessages.printMsg("TC0008_Logout_Verify2 - Verify the title of the Page");
		Page_BaseClass.txt_PagetTitleById(driver);
		Page_BaseClass.compare_Title(Logout_Const.strLogoutTitle);
	}
		    
}
