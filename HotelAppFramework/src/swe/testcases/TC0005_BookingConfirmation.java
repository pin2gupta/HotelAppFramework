package swe.testcases;

import org.openqa.selenium.WebDriver;

import swe.pageobjects.Booking_Confirm_Page;
import swe.pageobjects.Page_BaseClass;
import swe.utility.MyItinerary_Const;
import swe.utility.PrintMessages;

public class TC0005_BookingConfirmation extends TC_BaseClass{
	WebDriver driver;
	
	String strActResult;
	String strExpResult;
	String strExtraResult;
		
	public TC0005_BookingConfirmation(WebDriver driver){
		this.driver = driver;
	}
	
	public void Booking_confirmation_BasicFlow(){
		PrintMessages.printMsgEmptyLn(1); 
		
		saveBookConfirmation();
		Booking_Confirm_Page.bttn_MyItineraryById(driver).click();
	}
	
	public void saveBookConfirmation(){
		strBkConf_HotName = Booking_Confirm_Page.txt_HotelNameById(driver).getAttribute("value");
		strBkConf_Loc = Booking_Confirm_Page.txt_LocationById(driver).getAttribute("value");
		strBkConf_RmType = Booking_Confirm_Page.txt_RoomTypeById(driver).getAttribute("value");
		strBkConf_ArrDt = Booking_Confirm_Page.txt_ArrDateById(driver).getAttribute("value");
		strBkConf_DepDt = Booking_Confirm_Page.txt_DepDateByName(driver).getAttribute("value");
		strBkConf_TotRm = Booking_Confirm_Page.txt_TotalRoomsById(driver).getAttribute("value");
		strBkConf_PrcPRm = Booking_Confirm_Page.txt_PricePerNightById(driver).getAttribute("value");
		strBkConf_TotPc = Booking_Confirm_Page.txt_TotalPriceById(driver).getAttribute("value");
		strBkConf_GST = Booking_Confirm_Page.txt_GSTById(driver).getAttribute("value");
		strBkConf_FinBill = Booking_Confirm_Page.txt_FinalBillerPriceById(driver).getAttribute("value");
		strBkConf_FName = Booking_Confirm_Page.txtbx_FirstNameById(driver).getAttribute("value");
		strBkConf_LName = Booking_Confirm_Page.txtbx_LastNameById(driver).getAttribute("value");
		strBkConf_BillAdd = Booking_Confirm_Page.txtbx_BillingAddressById(driver).getAttribute("value");
		strBkConf_OrderNo = Booking_Confirm_Page.txt_OrderNumById(driver).getAttribute("value");
	}

	@Override
	public void verifyTitle() {
	 		PrintMessages.printMsg("AlternativeFlow - Verify the title of the Page");
			Page_BaseClass.txt_PagetTitleById(driver);
			Page_BaseClass.compare_Title(MyItinerary_Const.myIternirTitle);
			PrintMessages.printMsgEmptyLn(1);
		
	}
	
	//TC-111 - check Hotel name, Location, room type, Total Day, price per night are same in Booking confirmation page as they were selected in previous screen
	 //Expected Result - Data should be same as selected in previous screen
	 //TC113 - verify whether the data displayed is same as the selected data in Book hotel page
	 //Expected Result - Hotel: hotel Creek ;  Room type: Standard  ; No-of-rooms:2 ; Check-in-date:27/07/2012 ; Checkoutdate:28/07/2012 ;	 No-of-adults:1 ; No-of-children: 0
	
	public void verifySameAPrevious(){
		PrintMessages.printMsg("Hotel Name Compared: ");
		strActResult =  Booking_Confirm_Page.txt_HotelNameById(driver).getAttribute("value");
		strExpResult = strBkConf_HotName;
		strExtraResult = "for Hotel Name in Confirmation Page same as on Booking Page: ";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		//PrintMessages.printMsgEmptyLn(1);
		
		PrintMessages.printMsg("Location Compared: ");
		strActResult =  Booking_Confirm_Page.txt_LocationById(driver).getAttribute("value");
		strExpResult = strBkConf_Loc;
		strExtraResult = "for Location in Confirmation Page same as on Booking Page: ";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		//PrintMessages.printMsgEmptyLn(1);
		
		PrintMessages.printMsg("Room Type Compared: ");
		strActResult =  Booking_Confirm_Page.txt_RoomTypeById(driver).getAttribute("value");
		strExpResult = strBkConf_RmType;
		strExtraResult = "for Room Type in Confirmation Page same as on Booking Page: ";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		//PrintMessages.printMsgEmptyLn(1);
		
		PrintMessages.printMsg("Arrival Date Compared: ");
		strActResult =  Booking_Confirm_Page.txt_ArrDateById(driver).getAttribute("value");
		strExpResult = strBkConf_ArrDt;
		strExtraResult = "for Arrival Date in Confirmation Page same as on Booking Page: ";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		//PrintMessages.printMsgEmptyLn(1);
		
		PrintMessages.printMsg("Departure Date Compared: ");
		strActResult =  Booking_Confirm_Page.txt_DepDateByName(driver).getAttribute("value");
		strExpResult = strBkConf_DepDt;
		strExtraResult = "for Departure Date in Confirmation Page same as on Booking Page: ";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		//PrintMessages.printMsgEmptyLn(1);
		
		PrintMessages.printMsg("Total Rooms Compared: ");
		strActResult =  Booking_Confirm_Page.txt_TotalRoomsById(driver).getAttribute("value");
		strExpResult = strBkConf_TotRm;
		strExtraResult = "for Total Rooms in Confirmation Page same as on Booking Page: ";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		//PrintMessages.printMsgEmptyLn(1);
		
		PrintMessages.printMsg("Adults Per Room Compared: ");
		strActResult =  Booking_Confirm_Page.txt_AdultsPerRoomById(driver).getAttribute("value").substring(0,2);
		strExpResult = strSH_SeledAdultRm.substring(0,2);
		strExtraResult = "for Adults Per Room in Confirmation Page same as on Booking Page: ";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		//PrintMessages.printMsgEmptyLn(1);
		
		PrintMessages.printMsg("Children Compared: ");
		strActResult =  Booking_Confirm_Page.txt_ChildPerRoomById(driver).getAttribute("value").substring(0,2);
		strExpResult = strSH_SeledChildRm.substring(0,2);
		strExtraResult = "for Children in Confirmation Page same as on Booking Page: ";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		//PrintMessages.printMsgEmptyLn(1);
		
		PrintMessages.printMsg("Price per Night Compared: ");
		strActResult =  Booking_Confirm_Page.txt_PricePerNightById(driver).getAttribute("value");
		strExpResult = strBkConf_PrcPRm;
		strExtraResult = "for Price per Night in Confirmation Page same as on Booking Page: ";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		//PrintMessages.printMsgEmptyLn(1);
		
		PrintMessages.printMsg("Total Price: ");
		strActResult =  Booking_Confirm_Page.txt_TotalPriceById(driver).getAttribute("value");
		strExpResult = strBkConf_TotPc;
		strExtraResult = "for Total Price in Confirmation Page same as on Booking Page: ";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		//PrintMessages.printMsgEmptyLn(1);
		
		PrintMessages.printMsg("GST: ");
		strActResult =  Booking_Confirm_Page.txt_GSTById(driver).getAttribute("value");
		strExpResult = strBkConf_GST;
		strExtraResult = "for GST in Confirmation Page same as on Booking Page: ";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		//PrintMessages.printMsgEmptyLn(1);
		
		PrintMessages.printMsg("First Name: ");
		strActResult =  Booking_Confirm_Page.txtbx_FirstNameById(driver).getAttribute("value");
		strExpResult = strBkConf_FName;
		strExtraResult = "for First Name in Confirmation Page same as on Booking Page: ";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		//PrintMessages.printMsgEmptyLn(1);
		
		PrintMessages.printMsg("Last Name: ");
		strActResult =  Booking_Confirm_Page.txtbx_LastNameById(driver).getAttribute("value");
		strExpResult = strBkConf_LName;
		strExtraResult = "for Last Name in Confirmation Page same as on Booking Page: ";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		//PrintMessages.printMsgEmptyLn(1);
		
		PrintMessages.printMsg("Billing Address: ");
		strActResult =  Booking_Confirm_Page.txtbx_BillingAddressById(driver).getAttribute("value");
		strExpResult = strBkConf_BillAdd;
		strExtraResult = "for Billing Address in Confirmation Page same as on Booking Page: ";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		//PrintMessages.printMsgEmptyLn(1);
		
	}
				 
	 //TC112 - check correct Final billed price is Total Price + 10% Total price in Book a Hotel page
	 //Expected Result - Final billed Price=125+12.5=137.5 in Book a Hotel page
	public void verifyFinalPrie(){
		PrintMessages.printMsg("Verify Final Billed Price: ");
		
		int iTotPrice = Integer.parseInt((Booking_Confirm_Page.txt_TotalPriceById(driver).getAttribute("value")).substring(6));
		strActResult = Booking_Confirm_Page.txt_FinalBillerPriceById(driver).getAttribute("value").substring(6);
			
		String strExpResult = String.valueOf(iTotPrice+((10*iTotPrice)/100));
		
		strExtraResult = "for Billing Address in Confirmation Page same as on Booking Page: ";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		PrintMessages.printMsgEmptyLn(1);
	}
	 
		 
	 //TC114 - Verify Order number is generated in booking confirmation page
	 //Expected Result - ORDER no should be generated
	 public void verifyOrdNoGen(){
		PrintMessages.printMsg("Order Num: " +Booking_Confirm_Page.txt_OrderNumById(driver).getAttribute("value"));
		
		PrintMessages.printMsg("Verify Order Number no. is generated: ");
		strActResult =  Booking_Confirm_Page.txt_OrderNumById(driver).getAttribute("value");
		strExpResult = strBkConf_OrderNo;
		strExtraResult = "for Order Number in Confirmation Page same as on Booking Page: ";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		PrintMessages.printMsgEmptyLn(1);
		
	 }
	 
	 //TC115 - verify whether the booked itinerary details are not editable.
	 //Expected Result - Details once accepted should not be editable
	 public void verifyFieldDisabled(){
		 fieldIsDisabled(Booking_Confirm_Page.txt_HotelNameById(driver), "Hotel Name");
		 fieldIsDisabled(Booking_Confirm_Page.txt_LocationById(driver),"Location");
		 fieldIsDisabled(Booking_Confirm_Page.txt_RoomTypeById(driver), "Room Type");
		 fieldIsDisabled(Booking_Confirm_Page.txt_ArrDateById(driver), "Arrival Date");
		 fieldIsDisabled(Booking_Confirm_Page.txt_ArrDateById(driver), "Departure Date");
		 fieldIsDisabled(Booking_Confirm_Page.txt_TotalRoomsById(driver), "Number of Rooms");
		 fieldIsDisabled(Booking_Confirm_Page.txt_AdultsPerRoomById(driver), "Adults Per Room");
		 fieldIsDisabled(Booking_Confirm_Page.txt_ChildPerRoomById(driver), "Children Per Room");
		 fieldIsDisabled(Booking_Confirm_Page.txt_PricePerNightById(driver), "Price Per Night");
		 fieldIsDisabled(Booking_Confirm_Page.txt_TotalPriceById(driver), "Total Price");
		 fieldIsDisabled(Booking_Confirm_Page.txt_GSTById(driver), "GST");
		 fieldIsDisabled(Booking_Confirm_Page.txt_FinalBillerPriceById(driver), "Final Billed Price");
		 fieldIsDisabled(Booking_Confirm_Page.txtbx_FirstNameById(driver),"First Name");
		 fieldIsDisabled(Booking_Confirm_Page.txtbx_LastNameById(driver),"Last Name");
		 fieldIsDisabled(Booking_Confirm_Page.txtbx_BillingAddressById(driver),"Billing Address");
		 fieldIsDisabled(Booking_Confirm_Page.txt_OrderNumById(driver), "Order no.");
	 }
}
