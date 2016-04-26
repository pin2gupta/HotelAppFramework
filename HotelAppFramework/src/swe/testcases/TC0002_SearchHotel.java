package swe.testcases;

import org.openqa.selenium.WebDriver;

import swe.pageobjects.Page_BaseClass;
import swe.pageobjects.Search_Hotel_Page;
import swe.utility.ExcelUtils;
import swe.utility.PrintMessages;
import swe.utility.Search_Hotel_Const;


public class TC0002_SearchHotel extends TC_BaseClass{
	
	WebDriver driver;
	
	
	public TC0002_SearchHotel(WebDriver driver1){
		this.driver = driver1;
	}
   
	public void searchHotel_BasicFlow() throws Exception{
	  PrintMessages.printMsg("TC0002_SearchHotel_BasicFlow");
	  Search_Hotel_Page.selBx_LocationByID(driver).selectByVisibleText(ExcelUtils.getCellData(4, 0));
	  Search_Hotel_Page.selBx_HotelsByID(driver).selectByVisibleText(ExcelUtils.getCellData(4,1));
	  Search_Hotel_Page.selBx_RoomTypeByID(driver).selectByVisibleText(ExcelUtils.getCellData(4,2));
	  Search_Hotel_Page.selBx_RoomsNumByID(driver).selectByVisibleText(ExcelUtils.getCellData(4,3));
	  Search_Hotel_Page.txtbx_CheckInDateByID(driver).sendKeys(ExcelUtils.getCellData(4,4));
	  Search_Hotel_Page.txtbx_CheckOutDateByID(driver).sendKeys(ExcelUtils.getCellData(4,5));
	  Search_Hotel_Page.selBx_AdultPerRoomByID(driver).selectByVisibleText(ExcelUtils.getCellData(4,6));
	  Search_Hotel_Page.selBx_ChildPerRoomByID(driver).selectByVisibleText(ExcelUtils.getCellData(4,7));
	  set_SearchHotelData();
	  Search_Hotel_Page.bttn_SubmitById(driver).click();
	  PrintMessages.printMsgEmptyLn(1);
	}
	
	public void searchHotel_ClickLink(){
		Search_Hotel_Page.lnk_SearchHotByid(driver).click();
	}
	
	public void set_SearchHotelData(){
		PrintMessages.printMsg("Setting Selected Data");
		strSH_SeledLoc = 		Search_Hotel_Page.selBx_LocationByID(driver).getFirstSelectedOption().getText();
		strSH_SeledHot = 		Search_Hotel_Page.selBx_HotelsByID(driver).getFirstSelectedOption().getText();
		strSH_SeledRoomTpe = 	Search_Hotel_Page.selBx_RoomTypeByID(driver).getFirstSelectedOption().getText();
		strSH_SeledRoomNum = 	Search_Hotel_Page.selBx_RoomsNumByID(driver).getFirstSelectedOption().getText();
		strSH_EntdChkInDt = 	Search_Hotel_Page.txtbx_CheckInDateByID(driver).getAttribute("value");
		strSH_EntChkOutDt =	Search_Hotel_Page.txtbx_CheckOutDateByID(driver).getAttribute("value");
		strSH_SeledAdultRm=	Search_Hotel_Page.selBx_AdultPerRoomByID(driver).getFirstSelectedOption().getText();
		strSH_SeledChildRm=	Search_Hotel_Page.selBx_ChildPerRoomByID(driver).getFirstSelectedOption().getText();
	}
	
	public void verify_MSG_AllEmpty(){
		
		PrintMessages.printMsg("Test Case - Verify_MSG_AllEmpty()");
		Search_Hotel_Page.bttn_SubmitById(driver).click();
		
		String strActMsg = Search_Hotel_Page.msg_SelLocByid(driver);
		String strExpMsg = Search_Hotel_Const.errSelLoc;
		String strExtraMsg = " when All fields are empty";
		compareActToExpected(strExtraMsg, strActMsg, strExpMsg);
		PrintMessages.printMsgEmptyLn(1);
	}
	
	public void verify_MSG_ChkInDateEmpty() throws Exception{
		PrintMessages.printMsg("Test Case - verify_MSG_ChkInDateEmpty()");
		
		Search_Hotel_Page.selBx_LocationByID(driver).selectByVisibleText(ExcelUtils.getCellData(4, 0));
		Search_Hotel_Page.txtbx_CheckInDateByID(driver).clear();
		Search_Hotel_Page.bttn_SubmitById(driver).click();
		
		String strActMsg = Search_Hotel_Page.msg_ChkInDateByid(driver);
		String strExpMsg = Search_Hotel_Const.errChkInDateEmpty;
		String strExtraMsg = "The Actual Warning message when CheckIn Date Empty is: ";
		compareActToExpected(strExtraMsg, strActMsg, strExpMsg);
		PrintMessages.printMsgEmptyLn(1);
	}
	
	@Override
	public void verifyTitle() {
		PrintMessages.printMsg("TC0002_Search Hotel - Verify the title of the Page");
		Page_BaseClass.txt_PagetTitleById(driver);
		Page_BaseClass.compare_Title(Search_Hotel_Const.searchTitle);
		PrintMessages.printMsgEmptyLn(1);
	}
	
	public void verify_MSG_ChkOutDateMore(){
		PrintMessages.printMsg("Test Case - ChkOutDateMore()");
		
		try {
			Search_Hotel_Page.selBx_LocationByID(driver).selectByVisibleText(ExcelUtils.getCellData(4, 0));
			Search_Hotel_Page.txtbx_CheckInDateByID(driver).clear();
			Search_Hotel_Page.txtbx_CheckInDateByID(driver).sendKeys(ExcelUtils.getCellData(5,4));
			Search_Hotel_Page.txtbx_CheckOutDateByID(driver).clear();
			Search_Hotel_Page.txtbx_CheckOutDateByID(driver).sendKeys(ExcelUtils.getCellData(5,5));
		} catch (Exception e) {
			e.printStackTrace();
		}
		Search_Hotel_Page.bttn_SubmitById(driver).click();
		
		String strActMsg = Search_Hotel_Page.msg_ChkOutDateByid(driver);
		String strExpMsg = Search_Hotel_Const.errChkOutDateBefore;
		String strExtMsg = "when CheckOut Date is Less: ";
		
		compareActToExpected(strExtMsg, strActMsg, strExpMsg);
		PrintMessages.printMsgEmptyLn(1);
	}
	
	public void verify_MSG_ChkOutDateLess(){
		PrintMessages.printMsg("Test Case - ChkOutDateLess()");
		
		try {
			Search_Hotel_Page.selBx_LocationByID(driver).selectByVisibleText(ExcelUtils.getCellData(4, 0));
			Search_Hotel_Page.txtbx_CheckInDateByID(driver).clear();
			Search_Hotel_Page.txtbx_CheckInDateByID(driver).sendKeys("01/04/2016");
			Search_Hotel_Page.txtbx_CheckOutDateByID(driver).clear();
			Search_Hotel_Page.txtbx_CheckOutDateByID(driver).sendKeys("10/04/2016");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Search_Hotel_Page.bttn_SubmitById(driver).click();
		
		String strActMsg = Search_Hotel_Page.msg_ChkInDateByid(driver);
		String strExpMsg = Search_Hotel_Const.errchkOutDatePast;
		String strExtMsg = "when CheckOut Date is in Past: ";
		
		compareActToExpected(strExtMsg, strActMsg, strExpMsg);
		PrintMessages.printMsgEmptyLn(1);
	}
	
}
