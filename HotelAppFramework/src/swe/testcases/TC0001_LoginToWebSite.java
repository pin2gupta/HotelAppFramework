package swe.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import swe.pageobjects.Login_Page;
import swe.pageobjects.Page_BaseClass;
import swe.utility.ExcelUtils;
import swe.utility.Login_Const;
import swe.utility.PrintMessages;

public class TC0001_LoginToWebSite extends TC_BaseClass{
	
	WebDriver driver;
		
	public TC0001_LoginToWebSite(WebDriver driver1){
		this.driver = driver1;
	}
	
	public void loginToWebPage() throws Exception{
		
		PrintMessages.printMsg("TC0001_LoginToWebSite");
		
		String sUserName = ExcelUtils.getCellData(1, 0);
		String sPassword = ExcelUtils.getCellData(1, 1);
		
		Login_Page.lnk_Build2ByLinkTxt(driver).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Login_Page.txtbx_UserNameByID(driver).sendKeys(sUserName);
		Login_Page.txtbx_PwdByID(driver).sendKeys(sPassword);
		Thread.sleep(5000);
		//Login_Page.bttn_LoginById(driver).click();
		
		WebElement element = Login_Page.bttn_LoginById(driver);
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		
		PrintMessages.printMsg("Login is Successfull!!!");
		PrintMessages.printMsgEmptyLn(1);

	}
	
	public void verify_AfterLoginStr() throws Exception{
		String strExpAfterLogin = Login_Const.afterLoginStr+" "+ ExcelUtils.getCellData(1, 0)+"!";
		
		//PrintMessages.printMsgEmptyLn(1);
		PrintMessages.printMsg("Test Case - Verify After Login String");
		String strPageLogin = Login_Page.txt_AfterLoginByID(driver);
		PrintMessages.printMsg("The Actual Login String from Browser-"+ strPageLogin );
		
		if (strPageLogin.equals(strExpAfterLogin))
			PrintMessages.printMsg("The After Login String is as Expected: Test Case is Passed!!");
		else
			PrintMessages.printMsg("The After Login String is not as Expected: Test case is Failed!!");
		PrintMessages.printMsgEmptyLn(1);
		
	}
	
	@Override
	public void verifyTitle() {
		PrintMessages.printMsg("TC0001_Search Hotel - Verify the title of the Page");
		Page_BaseClass.txt_PagetTitleById(driver);
		Page_BaseClass.compare_Title(Login_Const.strLoginTitle);
		
	}
}
