package swe.testsuites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;

import swe.testcases.TC0002_SearchHotel;
import swe.utility.PrintMessages;

public class TestSuite_VerifySearchHotelPage extends TestSuite_BaseClass{
	
	public static void main(String args[]){
		
			initialize_Site();
			loginToSite("Test_Data1");
			
			TC0002_SearchHotel serachHotel_AlternateFlow = new TC0002_SearchHotel(driver1);
			try {
					//Verify that mandatory fields when NOT selected displays a message
					serachHotel_AlternateFlow.verify_MSG_AllEmpty();
					driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
					//Verify if Check Dates are Empty then displays a message
					serachHotel_AlternateFlow.verify_MSG_ChkInDateEmpty();
					driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
						
					//TC-120 - Verify Title of every Page reflects what the page objective is. For example Title of Search Hotel page should have “Search Hotel”
					//Expected - Title of each page should reflect its objective and the buttons should redirect as specified, to the relevant page.
					serachHotel_AlternateFlow.verifyTitle();
					
					//TC-102 - verify whether the check-out date field accepts a later date than check-in date.
					//Expected - System should report an error message.
					serachHotel_AlternateFlow.verify_MSG_ChkOutDateMore();
					
					//TC - 103 - check if error is reported if check-out date field is in the past
					//Expected - System should report an error message ‘Enter Valid dates’.
					serachHotel_AlternateFlow.verify_MSG_ChkOutDateLess();
				
					logoutToSite();
				} catch (NoSuchElementException e) {
					PrintMessages.printMsg("Exception: NoSuchElementException: "+e.getMessage());
				}catch (Exception e) {
					PrintMessages.printMsg("Exception:"+ e.getMessage());
			}
		 }
			 
}
