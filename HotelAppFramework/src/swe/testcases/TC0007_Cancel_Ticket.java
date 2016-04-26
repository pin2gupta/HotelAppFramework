package swe.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import swe.pageobjects.Header_Links;
import swe.pageobjects.MyItinerary_Page;
import swe.utility.PrintMessages;

	public class TC0007_Cancel_Ticket {
	
		WebDriver driver;
	
		public TC0007_Cancel_Ticket(WebDriver driver){
			this.driver = driver;
		}
		
		//Cancel Ticket based on number of Rows
		public void cancelTicketByNumofRows(int iNoofCancelTick){
			PrintMessages.printMsg("*************TC0007_Cancel_Ticket**************");
			
			try{
			//Select row to be canceled in Itinerary 
		    //Enter it or change it depending on the need. Good candidate for a Excel File
						
			PrintMessages.printMsg("Cancel Tickets: "+ iNoofCancelTick);
						
			//Click the row to be deleted
			Header_Links.lnk_BookedItineraryByTxt(driver).click();
			Thread.sleep(3000);
			
			//loop if ticket requested to cancel more than 1
			for (int i = 0;i<iNoofCancelTick;i++)
				MyItinerary_Page.getAll_MyIteineraryByXpath(driver, i+2).click();
			
			Thread.sleep(4000);
			
			//Click the main Cancel Button 
			PrintMessages.printMsg("Click Cancel Button Now");
			MyItinerary_Page.but_CancelSelectedByName(driver).click();
			
			Thread.sleep(6000);
			
			//Handle popup
			Alert confirmationAlert = driver.switchTo().alert();
			String alertText = confirmationAlert.getText();
			System.out.println("Alert text is " + alertText);
			confirmationAlert.accept();
			
			//Verify that ticket is no more listed in the list
			PrintMessages.printMsg("Clicked Done!!!"); 
			
			Thread.sleep(6000);
			 
		 } catch (InterruptedException e) {
				e.printStackTrace();
		 }
	}
		
		//Cancel Ticket after a click on Cancel button Ticket Number
		public void cancelTicketByButton(int iRowNum){
			
			try{
				
				PrintMessages.printMsgEmptyLn(1);
				PrintMessages.printMsg("Cancel Ticket Row: "+ iRowNum);
				
				//Click Header link
				Header_Links.lnk_BookedItineraryByTxt(driver).click();
				Thread.sleep(3000);
				
				//Click a Cancel Button
				MyItinerary_Page.butt_CancelButtonByXpath(driver, iRowNum).click();
				
				//Handle popup
				Alert confirmationAlert = driver.switchTo().alert();
				String alertText = confirmationAlert.getText();
				System.out.println("Alert text is " + alertText);
				confirmationAlert.accept();
				
				//Verify that a success message is displayed
				String strLbltxt = MyItinerary_Page.lbl_CancelConfirmByid(driver);
				if (strLbltxt.equalsIgnoreCase("The booking has been cancelled."))
					PrintMessages.printMsg("The message is displaying correctly:"+ strLbltxt);
				
				//Verify that ticket is no more listed in the list
				PrintMessages.printMsg("Clicked Done!!!"); 
				
				Thread.sleep(6000);
			}catch (InterruptedException e) {
				e.printStackTrace();
		 }
	}
}
