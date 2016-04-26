package swe.testcases;

import org.openqa.selenium.WebDriver;

import swe.pageobjects.MyItinerary_Page;
import swe.pageobjects.Page_BaseClass;
import swe.utility.ExcelUtils;
import swe.utility.MyItinerary_Const;
import swe.utility.PrintMessages;

public class TC0006_MyItinerary extends TC_BaseClass{
	WebDriver driver;
	
	String strActResult;
	String strExpResult;
	String strExtraResult;

	public TC0006_MyItinerary(WebDriver driver){
		this.driver = driver;
	}
	public void MyItinerary_BasicFlow(){
		PrintMessages.printMsgEmptyLn(1); 
		PrintMessages.printMsg("*************TC0006_MyItinerary_BasicFlow**************");
		//MyItinerary_Page.chkBx_MyIteineraryByXpath(driver).click();
		MyItinerary_Page.lnk_BookedItinById(driver).click();
	}
	
	@Override
	public void verifyTitle() {
		PrintMessages.printMsg("My Iterniary Title - Verify the title of the Page");
		Page_BaseClass.txt_PagetTitleById(driver);
		Page_BaseClass.compare_Title(MyItinerary_Const.myIternirTitle);
		PrintMessages.printMsgEmptyLn(1);
	}
	
	public void verify_AllCorrectInfo(){
		PrintMessages.printMsg("Order Id: ");
		strActResult =  MyItinerary_Page.getLastRowElementByXpath(driver, 2).getAttribute("value");
		strExpResult = strBkConf_OrderNo;
		strExtraResult = "for Order Id in My Itinerary Page same as on Booking Page: ";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
				
		PrintMessages.printMsg("Hotel Name compared to My Itinerary Page and Booking Page: ");//4
		strActResult =  MyItinerary_Page.getLastRowElementByXpath(driver, 4).getAttribute("value");
		strExpResult = strBkConf_HotName;
		strExtraResult = "";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		
		PrintMessages.printMsg("Location compared to My Itinerary Page and Booking Page: ");//5
		strActResult =  MyItinerary_Page.getLastRowElementByXpath(driver, 5).getAttribute("value");
		strExpResult = strBkConf_Loc;
		strExtraResult = "";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		
		PrintMessages.printMsg("No. of Rooms compared to My Itinerary Page and Booking Page: "); //6
		strActResult =  MyItinerary_Page.getLastRowElementByXpath(driver, 6).getAttribute("value");
		strExpResult = strBkConf_TotRm;
		strExtraResult = "";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		
		PrintMessages.printMsg("First Name compared to My Itinerary Page and Booking Page: ");//7
		strActResult =  MyItinerary_Page.getLastRowElementByXpath(driver, 7).getAttribute("value");
		strExpResult = strBkConf_FName;
		strExtraResult = "";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		
		PrintMessages.printMsg("Last Name compared to My Itinerary Page and Booking Page: ");//8
		strActResult =  MyItinerary_Page.getLastRowElementByXpath(driver, 8).getAttribute("value");
		strExpResult = strBkConf_LName;
		strExtraResult = "";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		
		PrintMessages.printMsg("Arrival Date compared to My Itinerary Page and Booking Page: ");//9
		strActResult =  MyItinerary_Page.getLastRowElementByXpath(driver, 9).getAttribute("value");
		strExpResult = strBkConf_ArrDt;
		strExtraResult = "";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		
		PrintMessages.printMsg("Departure Date compared to My Itinerary Page and Booking Page: ");//10
		strActResult =  MyItinerary_Page.getLastRowElementByXpath(driver, 10).getAttribute("value");
		strExpResult = strBkConf_DepDt;
		strExtraResult = "";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		
		PrintMessages.printMsg("No. of Days compared to My Itinerary Page and Booking Page: ");//11
		strActResult =  MyItinerary_Page.getLastRowElementByXpath(driver, 11).getAttribute("value");
		strExpResult = strBkHot_TotDays;
		strExtraResult = "";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		
		PrintMessages.printMsg("Room Type compared to My Itinerary Page and Booking Page: ");//12
		strActResult =  MyItinerary_Page.getLastRowElementByXpath(driver, 12).getAttribute("value");
		strExpResult = strBkConf_RmType;
		strExtraResult = "";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		
		PrintMessages.printMsg("Price Per Night compared to My Itinerary Page and Booking Page: ");//13
		strActResult =  MyItinerary_Page.getLastRowElementByXpath(driver, 13).getAttribute("value");
		strExpResult = strBkConf_PrcPRm;
		strExtraResult = "";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		
		PrintMessages.printMsg("Total Price compared to My Itinerary Page and Booking Page: ");//14
		strActResult =  MyItinerary_Page.getLastRowElementByXpath(driver, 14).getAttribute("value");
		strExpResult = strBkConf_FinBill;
		strExtraResult = "";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
	}
	
	public void verify_SearchCorrectOrderId() throws Exception{
		//retrieve the data for that Row id
		PrintMessages.printMsg("********verify_SearchCorrectOrderId()********");
		strMyIt_OrderID = ExcelUtils.getCellData(19,0);
		strMyIt_HotName =  MyItinerary_Page.getRowByOrderIdByXpath(driver, strMyIt_OrderID,4).getAttribute("value");
		strMyIt_Location = MyItinerary_Page.getRowByOrderIdByXpath(driver, strMyIt_OrderID,5).getAttribute("value");
		strMyIt_NoOfRooms = MyItinerary_Page.getRowByOrderIdByXpath(driver, strMyIt_OrderID,6).getAttribute("value");
		strMyIt_FName = MyItinerary_Page.getRowByOrderIdByXpath(driver, strMyIt_OrderID,7).getAttribute("value");
		strMyIt_LName = MyItinerary_Page.getRowByOrderIdByXpath(driver, strMyIt_OrderID,8).getAttribute("value");
		strMyIt_ArrDt = MyItinerary_Page.getRowByOrderIdByXpath(driver, strMyIt_OrderID,9).getAttribute("value");
		strMyIt_DepDt = MyItinerary_Page.getRowByOrderIdByXpath(driver, strMyIt_OrderID,10).getAttribute("value");
		strMyIt_NoOfDays = MyItinerary_Page.getRowByOrderIdByXpath(driver, strMyIt_OrderID,11).getAttribute("value");
		strMyIt_RmType = MyItinerary_Page.getRowByOrderIdByXpath(driver, strMyIt_OrderID,12).getAttribute("value");
		strMyIt_PrPNgt = MyItinerary_Page.getRowByOrderIdByXpath(driver, strMyIt_OrderID,13).getAttribute("value");
		strMyIt_FinBillPr = MyItinerary_Page.getLastRowElementByXpath(driver, 14).getAttribute("value");
		
		MyItinerary_Page.txt_SearchOrdById(driver).sendKeys(ExcelUtils.getCellData(19,0));
		MyItinerary_Page.but_SearchHotelByid(driver).click();
				
		//Get the data room browser and compare
		PrintMessages.printMsg("Hotel Name compared to Retrieved Data on My Itinarary: ");//4
		strActResult =  MyItinerary_Page.getLastRowElementByXpath(driver, 4).getAttribute("value");
		strExpResult = strMyIt_HotName;
		strExtraResult = "";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		
		PrintMessages.printMsg("Location compared to Retrieved Data on My Itinarary: ");//4
		strActResult =  MyItinerary_Page.getLastRowElementByXpath(driver, 5).getAttribute("value");
		strExpResult = strMyIt_Location;
		strExtraResult = "";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		
		PrintMessages.printMsg("No. of Rooms compared to Retrieved Data on My Itinarary: ");//4
		strActResult =  MyItinerary_Page.getLastRowElementByXpath(driver, 6).getAttribute("value");
		strExpResult = strMyIt_NoOfRooms;
		strExtraResult = "";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		
		PrintMessages.printMsg("First name compared to Retrieved Data on My Itinarary: ");//4
		strActResult =  MyItinerary_Page.getLastRowElementByXpath(driver, 7).getAttribute("value");
		strExpResult = strMyIt_FName;
		strExtraResult = "";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		
		PrintMessages.printMsg("Last name compared to Retrieved Data on My Itinarary: ");//4
		strActResult =  MyItinerary_Page.getLastRowElementByXpath(driver, 8).getAttribute("value");
		strExpResult = strMyIt_LName;
		strExtraResult = "";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		
		PrintMessages.printMsg("Arrival Date compared to Retrieved Data on My Itinarary: ");//4
		strActResult =  MyItinerary_Page.getLastRowElementByXpath(driver, 9).getAttribute("value");
		strExpResult = strMyIt_ArrDt;
		strExtraResult = "";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		//click Show all
		
		PrintMessages.printMsg("Departure Date compared to Retrieved Data on My Itinarary: ");//4
		strActResult =  MyItinerary_Page.getLastRowElementByXpath(driver, 10).getAttribute("value");
		strExpResult = strMyIt_DepDt;
		strExtraResult = "";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		
		PrintMessages.printMsg("No. of Days compared to Retrieved Data on My Itinarary: ");//4
		strActResult =  MyItinerary_Page.getLastRowElementByXpath(driver, 11).getAttribute("value");
		strExpResult = strMyIt_NoOfDays;
		strExtraResult = "";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		
		PrintMessages.printMsg("Room Type compared to Retrieved Data on My Itinarary: ");//4
		strActResult =  MyItinerary_Page.getLastRowElementByXpath(driver, 12).getAttribute("value");
		strExpResult = strMyIt_RmType;
		strExtraResult = "";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		
		PrintMessages.printMsg("Price Per Night compared to Retrieved Data on My Itinarary: ");//4
		strActResult =  MyItinerary_Page.getLastRowElementByXpath(driver, 13).getAttribute("value");
		strExpResult = strMyIt_PrPNgt;
		strExtraResult = "";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		
		PrintMessages.printMsg("Final Billed Price compared to Retrieved Data on My Itinarary: ");//4
		strActResult =  MyItinerary_Page.getLastRowElementByXpath(driver, 14).getAttribute("value");
		strExpResult = strMyIt_FinBillPr;
		strExtraResult = "";
		compareActToExpected(strExtraResult, strActResult, strExpResult);
		
		MyItinerary_Page.lnk_ShowAllById(driver).click();
		PrintMessages.printMsgEmptyLn(1);
	}
	
	public void verify_SearchInCorrectOrderId()throws Exception{
		strMyIt_OrderID = ExcelUtils.getCellData(20,0);
		
		if (MyItinerary_Page.getRowByOrderIdByXpath(driver, strMyIt_OrderID,4)==null){
			strActResult = "";
			strExpResult = "";
			strExtraResult = "There is no Rows Retrieved";
			compareActToExpected(strExtraResult, strActResult, strExpResult);
		}
		//Search all
		MyItinerary_Page.txt_SearchOrdById(driver).sendKeys(ExcelUtils.getCellData(20,0));
		MyItinerary_Page.but_SearchHotelByid(driver).click();
		
		//Click Show All
		MyItinerary_Page.lnk_ShowAllById(driver).click();
	}
}
