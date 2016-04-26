package swe.testsuites;

import org.openqa.selenium.WebDriver;

import swe.testcases.TC0001_LoginToWebSite;
import swe.testcases.TC0008_Logout;
import swe.utility.Const_BaseClass;
import swe.utility.ExcelUtils;
import swe.utility.SetBrowserPage;

public class TestSuite_BaseClass {
	public static SetBrowserPage setBrowserDriver1;
	public static WebDriver driver1;
	public static String strName =null;
	
	public static void initialize_Site(){
		setBrowserDriver1 = new SetBrowserPage();
		driver1 = setBrowserDriver1.createDriverFireFox();
		setBrowserDriver1.setBrowser(Const_BaseClass.URL); 
		try
			{
			 	//Set Excel Sheet
			  	ExcelUtils.setExcelFile(Const_BaseClass.path_TestData + Const_BaseClass.File_TestData);
			 
			 }catch (InterruptedException e) {
					e.printStackTrace();
			 } catch (Exception e) {
				 e.printStackTrace();
			}
		}
	
	
		 
	public static void loginToSite(String strSheetName){
		 try {
		 	 	ExcelUtils.setExcelSheet(strSheetName);
			 
		 	 	//Login to web page - Basic Flow
		 	 	TC0001_LoginToWebSite loginTC = new TC0001_LoginToWebSite(driver1);
		 	 	loginTC.loginToWebPage();
		 }catch (InterruptedException e) {
				e.printStackTrace();
		 } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 public static void logoutToSite(){
		 TC0008_Logout logoutTC = new TC0008_Logout(driver1);
		 logoutTC.logout_BasicFlow();
	}
	 
	 public static void goToNextTestSuite(String strTestSuiteName){
		 strName = strTestSuiteName;
	 }
	 
	}


