package swe.testcases;

import org.openqa.selenium.WebDriver;

import swe.pageobjects.Page_BaseClass;
import swe.pageobjects.Select_Hotel_Page;
import swe.utility.PrintMessages;
import swe.utility.Select_Hotel_Const;

public class TC0003_SelectHotel extends TC_BaseClass{
	WebDriver driver;
	

		
	public TC0003_SelectHotel(WebDriver driver){
		this.driver = driver;
	}
	
	public void SelectHotel_BasicFlow(){
		PrintMessages.printMsgEmptyLn(1); 
		PrintMessages.printMsg("************** TC0003_SelectHotel_BasicFlow *****************");
		
		saveSelection();
		
		Select_Hotel_Page.chkBx_SelectById(driver).click();
		Select_Hotel_Page.butt_Continue(driver).click();
		
		PrintMessages.printMsgEmptyLn(1);
	}
	
	private void saveSelection(){
		strSelHot_ArrDate = Select_Hotel_Page.txt_ArrDate(driver).getAttribute("value");
		strSelHot_HotName = Select_Hotel_Page.txt_HotelName(driver).getAttribute("value");
		strSelHot_Loc = Select_Hotel_Page.txt_Location(driver).getAttribute("value");
		strSelHot_Rooms = Select_Hotel_Page.txt_Rooms(driver).getAttribute("value");
		strSelHot_DepDate = Select_Hotel_Page.txt_DepDate(driver).getAttribute("value");
		strSelHot_NoDays = Select_Hotel_Page.txt_NoDays(driver).getAttribute("value");
		strSelHot_RoomType = Select_Hotel_Page.txt_RoomType(driver).getAttribute("value");
		strSelHot_PrcNigh = Select_Hotel_Page.txt_PricePerNight(driver).getAttribute("value");
		strSelHot_TotPrc = Select_Hotel_Page.txt_TotalPrice(driver).getAttribute("value");
	
	}
	
	//Check if ChekBox is not selected and User selects a Continue button then a message is displayed
	public void verifyNoChkSel(){
		PrintMessages.printMsg("Test Case - verifyNoChkSel()");
		Select_Hotel_Page.butt_Continue(driver).click();
		
		String strActMsg = Select_Hotel_Page.msg_SelAHotByid(driver);
		String strExpMsg = Select_Hotel_Const.errSelLoc;
		String strExtraMsg = "when CheckBox is Not Selected: ";
		compareActToExpected(strExtraMsg, strActMsg, strExpMsg);
		
		PrintMessages.printMsgEmptyLn(1);
	}
	
	//TC-120 - Verify Title of every Page reflects what the page objective is. For example Title of Search Hotel page should have “Search Hotel”
 	public void verifyTitle(){
 		PrintMessages.printMsg("TC0002_Select - Verify the title of the Page");
		Page_BaseClass.txt_PagetTitleById(driver);
		Page_BaseClass.compare_Title(Select_Hotel_Const.selectTitle);
		PrintMessages.printMsgEmptyLn(1);
 	}
	
 	// TC-104 - verify whether locations in Select Hotel page are displayed according to the location selected in Search Hotel
	public void verifyLocDisplayedCorrect(){
		PrintMessages.printMsg("Test Case - verifyLocDisplayedCorrect()");
		String strActMsg = Select_Hotel_Page.txt_Location(driver).getAttribute("value");
		String strExpMsg = strSH_SeledLoc;
		String strExtraMsg = "for Location in Search Page is same as on Select Page: ";
		
		if (strActMsg.equals(strExpMsg))
			compareActToExpected(strExtraMsg, strActMsg, strExpMsg);
			
		PrintMessages.printMsgEmptyLn(1);
			
	}
	
	// TC-105 - verify whether Check-in date and Check-out date are being displayed in Select Hotel page according to the dates selected in search
 	public void verifyDateDisplayedCorrect(){
 		PrintMessages.printMsg("Test Case - verifyCheck In Date Display is Correct()");
 		
 		String strActMsg1 = Select_Hotel_Page.txt_ArrDate(driver).getAttribute("value");
		String strExpMsg1 = strSH_EntdChkInDt;
		String strExtraMsg1 = "for CheckIn Date is Same as Arrival Date on Select page: ";
		
		if (strActMsg1.equals(strExpMsg1))
			compareActToExpected(strExtraMsg1, strActMsg1, strExpMsg1);
			
		PrintMessages.printMsgEmptyLn(1);
		
		PrintMessages.printMsg("Test Case - verify Check Out Date Display is Correct()");
 		
		String strActMsg2 = Select_Hotel_Page.txt_DepDate(driver).getAttribute("value");
		String strExpMsg2 = strSH_EntChkOutDt;
		String strExtraMsg2 = "for Check Out Date is Same as Departure Date on Select Page: ";
		
		if (strActMsg2.equals(strExpMsg2))
			compareActToExpected(strExtraMsg2, strActMsg2, strExpMsg2);
			
		PrintMessages.printMsgEmptyLn(1);
	
	}
 
 	// TC-106 - verify whether no. of rooms in Select Hotel page is same as the Number of rooms selected in search
 	public void verifyNoRoomDisplayedCorrect(){
 		PrintMessages.printMsg("Test Case - verifyNoRoomDisplayedCorrect");
 		
 		String strActMsg = (Select_Hotel_Page.txt_Rooms(driver).getAttribute("value")).substring(0, 1);
		String strExpMsg = strSH_SeledRoomNum.substring(0, 1);
		String strExtraMsg = "for no. of rooms Same as on Select Page: ";
		
		if (strActMsg.equals(strExpMsg))
			compareActToExpected(strExtraMsg, strActMsg, strExpMsg);
			
		PrintMessages.printMsgEmptyLn(1);
	}
 
 	// TC -107 verify whether Room Type in Select Hotel page is same as Room type selected in search hotel page
 	public void verifyRoomTypeDisplayedCorrect(){
 		PrintMessages.printMsg("Test Case - verifyRoomTypeDisplayedCorrect");
 		
 		String strActMsg = Select_Hotel_Page.txt_RoomType(driver).getAttribute("value");
		String strExpMsg = strSH_SeledRoomTpe;
		String strExtraMsg = "for Room Type is same as on Select Page: ";
		
		if (strActMsg.equals(strExpMsg))
			compareActToExpected(strExtraMsg, strActMsg, strExpMsg);
			
		PrintMessages.printMsgEmptyLn(1);
	}
 
 	//TC-108 - verify whether the total price (excl.GST) is calculated as “price per night * no. of nights* no of rooms”.
	public void CalculateTotalPrice(){
		int iNoofDays = Integer.parseInt(Select_Hotel_Page.txt_NoDays(driver).getAttribute("value").substring(0, 1));
		int iNoofRooms = Integer.parseInt((Select_Hotel_Page.txt_Rooms(driver).getAttribute("value")).substring(0, 1));
		int iPricePerNight = Integer.parseInt(Select_Hotel_Page.txt_PricePerNight(driver).getAttribute("value").substring(6));
		String strActResult = Select_Hotel_Page.txt_TotalPrice(driver).getAttribute("value").substring(6);
		String strExtraMsg = "AUD $";
		
		String strExpResult = String.valueOf(iNoofDays*iNoofRooms*iPricePerNight);
		
		if (strActResult.equals(strExpResult))
			compareActToExpected(strExtraMsg, strActResult, strExpResult);
			
		PrintMessages.printMsgEmptyLn(1);
	}

}
