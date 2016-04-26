package swe.testsuites;

import swe.testcases.TC0007_Cancel_Ticket;

public class TestSuite_CancelTickets extends TestSuite_BaseClass{
	public static void main(String args[]) throws Exception{
		
		initialize_Site();
		loginToSite("Test_Data1");
			 
		 //Cancel Tickets
		 TC0007_Cancel_Ticket cancelOneTicket = new TC0007_Cancel_Ticket(driver1);
		 
		 int iNoofCancelTick = 1; 
		 cancelOneTicket.cancelTicketByNumofRows(iNoofCancelTick);
		 
		 int iRowNum = 1;
		 cancelOneTicket.cancelTicketByButton(iRowNum);
		 
		//TC-119 - To verify that the order gets cancelled after click on Cancel order number link
		 //Expected - Order number should not longer be present in booked itinerary page after cancellation
		 
		 logoutToSite();
		 
	 } //end of main
}//end of class
