package swe.testcases;

import org.openqa.selenium.WebDriver;

import swe.pageobjects.Book_Hotel_Page;
import swe.pageobjects.Page_BaseClass;
import swe.utility.Book_Hotel_Const;
import swe.utility.ExcelUtils;
import swe.utility.PrintMessages;

public class TC0004_Book_Hotel extends TC_BaseClass{
		WebDriver driver;
		PrintMessages print;
		
		 String strActResult;
		 String strExpResult;
		 String strExtraResult;
		
		public TC0004_Book_Hotel(WebDriver driver){
			this.driver = driver;
		}
		
		public void Book_Hotel_BasicFlow() throws Exception{
			PrintMessages.printMsgEmptyLn(2); 
			PrintMessages.printMsg("TC0004_Book_Hotel_BasicFlow");
			
			Book_Hotel_Page.txtbx_FirstNameById(driver).sendKeys(ExcelUtils.getCellData(12, 0));
			Book_Hotel_Page.txtbx_LastNameById(driver).sendKeys(ExcelUtils.getCellData(12, 1));
			Book_Hotel_Page.txtbx_BillingAddressById(driver).sendKeys(ExcelUtils.getCellData(12, 2));
			Book_Hotel_Page.txtbx_CreditCardNoById(driver).sendKeys(ExcelUtils.getCellData(12, 3));
			Book_Hotel_Page.sel_CreditCardTypeById(driver).selectByVisibleText(ExcelUtils.getCellData(12, 4));	
			Book_Hotel_Page.sel_ExpMonById(driver).selectByVisibleText(ExcelUtils.getCellData(12, 5));
			//Book_Hotel_Page.sel_ExpYearById(driver).selectByVisibleText(ExcelUtils.getCellData(12, 6));
			Book_Hotel_Page.sel_ExpYearById(driver).selectByVisibleText("2017");
			//Book_Hotel_Page.txtbx_CVVNumById(driver).sendKeys(ExcelUtils.getCellData(12, 7));
			Book_Hotel_Page.txtbx_CVVNumById(driver).sendKeys("123");
			saveSelection();
			Book_Hotel_Page.bttn_BookNowById(driver).click();
			
		}
		
		private void saveSelection(){
			strBkHot_HotName = Book_Hotel_Page.txt_HotelNameById(driver).getAttribute("value");
			strBkHot_Loc = Book_Hotel_Page.txt_LocationById(driver).getAttribute("value");
			strBkHot_RmType = Book_Hotel_Page.txt_RoomTypeById(driver).getAttribute("value");
			strBkHot_NoRm = Book_Hotel_Page.txt_RoomNumById(driver).getAttribute("value");
			strBkHot_TotDays = Book_Hotel_Page.txt_TotalDaysById(driver).getAttribute("value");
			strBkHot_PricePerNight = Book_Hotel_Page.txt_PricePerNightById(driver).getAttribute("value");
			strBkHot_GST = Book_Hotel_Page.txt_GSTById(driver).getAttribute("value");
			strBkHot_FinalBill = Book_Hotel_Page.txt_FinalBillerPriceById(driver).getAttribute("value");
			strBkHot_FName = Book_Hotel_Page.txtbx_FirstNameById(driver).getText();
			strBkHot_LName = Book_Hotel_Page.txtbx_LastNameById(driver).getText();
			strBkHot_BillAdd = Book_Hotel_Page.txt_FinalBillerPriceById(driver).getText();
			
		}

		@Override
		public void verifyTitle() {
			PrintMessages.printMsg("Alternate Flow Book Hotel - Verify the title of the Page");
			Page_BaseClass.txt_PagetTitleById(driver);
			Page_BaseClass.compare_Title(Book_Hotel_Const.bookPgTitle);
			PrintMessages.printMsgEmptyLn(1);
			
		}
		
		 //Verify that Hotel Name, Location, Room Type, Number of Rooms, Total Days, 
		 //Price Per Night, Total Price, GST, Final Billed Price is same as in search Hotel Page
		 public void verifyAllSelectPage(){
		
			PrintMessages.printMsg("Hotel Name Compared: ");
			strActResult = Book_Hotel_Page.txt_HotelNameById(driver).getAttribute("value");
			strExpResult =  strSelHot_HotName;
			strExtraResult = "for Hotel Name in Select Page is same as on Booking Page: ";
			//compareActToExpected(strExtraResult, strActResult, strExpResult);
			PrintMessages.printMsgEmptyLn(1);
		 
			PrintMessages.printMsg("Location Compared: ");
			strActResult = Book_Hotel_Page.txt_LocationById(driver).getAttribute("value");
			strExpResult = strSelHot_Loc;
			strExtraResult = "for Location in Select Page is same as on Booking Page: ";
			compareActToExpected(strExtraResult, strActResult, strExpResult);
			PrintMessages.printMsgEmptyLn(1);
			
			PrintMessages.printMsg("Room Type Compared: ");
			strActResult = Book_Hotel_Page.txt_RoomTypeById(driver).getAttribute("value").substring(0,6);
			strExpResult = strSelHot_RoomType;
			strExtraResult = "for Room Type in Select Page is same as on Booking Page: ";
			compareActToExpected(strExtraResult, strActResult, strExpResult);
			PrintMessages.printMsgEmptyLn(1);
			
			PrintMessages.printMsg("No. Of Rooms Compared: ");
			strActResult = Book_Hotel_Page.txt_RoomNumById(driver).getAttribute("value").substring(0, 6);
			strExpResult = strSelHot_Rooms;
			strExtraResult = "for No. of Rooms in Select Page is same as on Booking Page: ";
			compareActToExpected(strExtraResult, strActResult, strExpResult);
			PrintMessages.printMsgEmptyLn(1);
			
			PrintMessages.printMsg("No. Of Days Compared: ");
			strActResult = Book_Hotel_Page.txt_TotalDaysById(driver).getAttribute("value");
			strExpResult = strSelHot_NoDays;
			strExtraResult = "for No. of Days in Select Page is same as on Booking Page: ";
			compareActToExpected(strExtraResult, strActResult, strExpResult);
			PrintMessages.printMsgEmptyLn(1);
			
			PrintMessages.printMsg("Price Per Night Compared: ");
			strActResult = Book_Hotel_Page.txt_PricePerNightById(driver).getAttribute("value");
			strExpResult = strSelHot_PrcNigh;
			strExtraResult = "for Price Per Night in Select Page is same as on Booking Page: ";
			compareActToExpected(strExtraResult, strActResult, strExpResult);
			PrintMessages.printMsgEmptyLn(1);
			
			PrintMessages.printMsg("Total Price Compared: ");
			strActResult = Book_Hotel_Page.txt_TotalPriceById(driver).getAttribute("value");
			strExpResult = strSelHot_TotPrc;
			strExtraResult = "for Total Price in Select Page is same as on Booking Page: ";
			compareActToExpected(strExtraResult, strActResult, strExpResult);
			PrintMessages.printMsgEmptyLn(1);
				
		 }
		 
		 //Verify that Hotel Name, Location, Room Type, Number of Rooms, Total Days, 
		 //Price Per Night, Total Price, GST, Final Billed Price field is disabled
		 public void verifyAllFieldDisabled(){
			 fieldIsDisabled(Book_Hotel_Page.txt_LocationById(driver),"Location");
			 fieldIsDisabled(Book_Hotel_Page.txt_RoomTypeById(driver), "Room Type");
			 fieldIsDisabled(Book_Hotel_Page.txt_RoomNumById(driver), "Number of Rooms");
			 fieldIsDisabled(Book_Hotel_Page.txt_TotalDaysById(driver), "Total Days");
			 fieldIsDisabled(Book_Hotel_Page.txt_PricePerNightById(driver), "Price Per Night");
			 fieldIsDisabled(Book_Hotel_Page.txt_TotalPriceById(driver), "Total Price");
			 fieldIsDisabled(Book_Hotel_Page.txt_GSTById(driver), "GST");
			 fieldIsDisabled(Book_Hotel_Page.txt_FinalBillerPriceById(driver), "Final Billed Price");
				
		 }
		 
		
		 public void verifyAllEmpty(){
			PrintMessages.printMsg("Alternate Flow Book Hotel - Verify to book a hotel when all fields are empty");
			Book_Hotel_Page.bttn_BookNowById(driver).click();
			 
			strActResult = Book_Hotel_Page.msg_EntFNameEmptyByid(driver);
			strExpResult = Book_Hotel_Const.errFNameEmpty;
			strExtraResult = "When Firstname is Empty";
			compareActToExpected(strExtraResult, strActResult, strExpResult);
			
			strActResult = Book_Hotel_Page.msg_EntLNameEmptyByid(driver);
			strExpResult = Book_Hotel_Const.errLNameEmpty;
			strExtraResult = "When Last Name is Empty";
			compareActToExpected(strExtraResult, strActResult, strExpResult);
			
			strActResult = Book_Hotel_Page.msg_EntAddEmptyByid(driver);
			strExpResult = Book_Hotel_Const.errAddEmpty;
			strExtraResult = "When Address is Empty";
			compareActToExpected(strExtraResult, strActResult, strExpResult);
			
			strActResult = Book_Hotel_Page.msg_EntCrdCarNoByid(driver);
			strExpResult = Book_Hotel_Const.errCrdCardEmpty;
			strExtraResult = "When Credit Card is Empty";
			compareActToExpected(strExtraResult, strActResult, strExpResult);
			
			strActResult = Book_Hotel_Page.msg_EntCrdCarTypeByid(driver);
			strExpResult = Book_Hotel_Const.errSelCrdType;
			strExtraResult = "When Credit Card Type is Empty";
			compareActToExpected(strExtraResult, strActResult, strExpResult);
			
			strActResult = Book_Hotel_Page.msg_SelMonYrByid(driver);
			strExpResult = Book_Hotel_Const.errSelExpMonth;
			strExtraResult = "When Expirary Month is Empty";
			compareActToExpected(strExtraResult, strActResult, strExpResult);
			
			strActResult = Book_Hotel_Page.msg_EntCVVByid(driver);
			strExpResult = Book_Hotel_Const.errCrdCardCVV;
			strExtraResult = "When CVV is Empty";
			compareActToExpected(strExtraResult, strActResult, strExpResult);
			 
			 PrintMessages.printMsgEmptyLn(1);
			 
		 }
		 
		 //Check is user enters a credit card number less than 16 digits 
		 //Expected - a message is selected
		 public void verifyIncorrectCC() throws Exception{
			PrintMessages.printMsg("Alternate Flow Book Hotel - Verify that Credit Card is entered incorrect");
			 
			Book_Hotel_Page.txtbx_FirstNameById(driver).sendKeys(ExcelUtils.getCellData(12, 0));
			Book_Hotel_Page.txtbx_LastNameById(driver).sendKeys(ExcelUtils.getCellData(12, 1));
			Book_Hotel_Page.txtbx_BillingAddressById(driver).sendKeys(ExcelUtils.getCellData(12, 2));
			Book_Hotel_Page.txtbx_CreditCardNoById(driver).sendKeys(ExcelUtils.getCellData(14, 3));
			Book_Hotel_Page.sel_CreditCardTypeById(driver).selectByVisibleText(ExcelUtils.getCellData(12, 4));	
			Book_Hotel_Page.sel_ExpMonById(driver).selectByVisibleText(ExcelUtils.getCellData(12, 5));
			Book_Hotel_Page.sel_ExpYearById(driver).selectByVisibleText(ExcelUtils.getCellData(12, 6));
			Book_Hotel_Page.txtbx_CVVNumById(driver).sendKeys(ExcelUtils.getCellData(12, 7));
			
			Book_Hotel_Page.bttn_BookNowById(driver).click();
			
			strActResult = Book_Hotel_Page.msg_EntCrdCarNoByid(driver);
			strExpResult = Book_Hotel_Const.errCCLength;
			strExtraResult = "When Credit Card is less than 16";
			compareActToExpected(strExtraResult, strActResult, strExpResult);
			
			
			PrintMessages.printMsgEmptyLn(1);
		 }
		 
		 //Verify by default a player can not enter text in CVV and Credit Card no. field
		 public void verifyStringCVV() throws Exception{
			 PrintMessages.printMsg("Alternate Flow Book Hotel - Verify that user can not enter credit card number");
			 
			 Book_Hotel_Page.txtbx_FirstNameById(driver).sendKeys(ExcelUtils.getCellData(12, 0));
			 Book_Hotel_Page.txtbx_LastNameById(driver).sendKeys(ExcelUtils.getCellData(12, 1));
				Book_Hotel_Page.txtbx_BillingAddressById(driver).sendKeys(ExcelUtils.getCellData(12, 2));
				Book_Hotel_Page.txtbx_CreditCardNoById(driver).sendKeys(ExcelUtils.getCellData(12, 3));
				Book_Hotel_Page.sel_CreditCardTypeById(driver).selectByVisibleText(ExcelUtils.getCellData(12, 4));	
				Book_Hotel_Page.sel_ExpMonById(driver).selectByVisibleText(ExcelUtils.getCellData(12, 5));
				Book_Hotel_Page.sel_ExpYearById(driver).selectByVisibleText(ExcelUtils.getCellData(12, 6));
				Book_Hotel_Page.txtbx_CVVNumById(driver).sendKeys(ExcelUtils.getCellData(16, 7));
				
				Book_Hotel_Page.bttn_BookNowById(driver).click();
				
				strActResult = Book_Hotel_Page.msg_EntCrdCarNoByid(driver);
				strExpResult = Book_Hotel_Const.errCCLength;
				strExtraResult = "When CVV is Text";
				compareActToExpected(strExtraResult, strActResult, strExpResult);
			 
			 PrintMessages.printMsgEmptyLn(1);
		 }
		
		 //Verify the digits are truncated, if user enters a credit card more than 16 digits
		public void verifymoreCCDigits() throws Exception{
			PrintMessages.printMsg("Alternate Flow Book Hotel - Verify that user can not enter a credit card mroe that 16 chars");
			
			 Book_Hotel_Page.txtbx_FirstNameById(driver).sendKeys(ExcelUtils.getCellData(12, 0));
			 Book_Hotel_Page.txtbx_LastNameById(driver).sendKeys(ExcelUtils.getCellData(12, 1));
			 Book_Hotel_Page.txtbx_BillingAddressById(driver).sendKeys(ExcelUtils.getCellData(12, 2));
			 Book_Hotel_Page.txtbx_CreditCardNoById(driver).sendKeys(ExcelUtils.getCellData(15, 3));
			 Book_Hotel_Page.sel_CreditCardTypeById(driver).selectByVisibleText(ExcelUtils.getCellData(12, 4));	
			 Book_Hotel_Page.sel_ExpMonById(driver).selectByVisibleText(ExcelUtils.getCellData(12, 5));
			 Book_Hotel_Page.sel_ExpYearById(driver).selectByVisibleText(ExcelUtils.getCellData(12, 6));
			 Book_Hotel_Page.txtbx_CVVNumById(driver).sendKeys(ExcelUtils.getCellData(16, 7));
			
			 Book_Hotel_Page.bttn_BookNowById(driver).click();
				
			 strActResult = Book_Hotel_Page.msg_EntCrdCarNoByid(driver);
			 strExpResult = Book_Hotel_Const.errCCLength;
			 strExtraResult = "";
			 compareActToExpected(strExtraResult, strActResult, strExpResult);
			 PrintMessages.printMsgEmptyLn(1);
		}
		 
		 //TC-110 - check correct total price is being calculated as “price per night*no of days*no of rooms in Book a hotel page
		 //Expected - Total-price should be calculated as (price-per-night*no-of-rooms*no-of-days  Total Price= 125*2*1 = 250$ In book a hotel page
		 public void verifyTotPrice(){
			PrintMessages.printMsg("Alternate Flow Book Hotel - Verify that correct price has been calculated");
			 
			int iNoofDays = Integer.parseInt((Book_Hotel_Page.txt_TotalDaysById(driver).getAttribute("value")).substring(0, 1));
			int iNoofRooms = Integer.parseInt((Book_Hotel_Page.txt_RoomNumById(driver).getAttribute("value")).substring(0, 1));
			int iPricePerNight = Integer.parseInt((Book_Hotel_Page.txt_PricePerNightById(driver).getAttribute("value")).substring(6));
			int iGST = Integer.parseInt((Book_Hotel_Page.txt_GSTById(driver).getAttribute("value")).substring(6));
			String strActResult = Book_Hotel_Page.txt_FinalBillerPriceById(driver).getAttribute("value").substring(6);
			String strExtraMsg = "Total Billed: ";
			
			String strExpResult = String.valueOf(iNoofDays*iNoofRooms*iPricePerNight+iGST);
			
			compareActToExpected(strExtraMsg, strActResult, strExpResult);
				
			PrintMessages.printMsgEmptyLn(1);
		 }
}
