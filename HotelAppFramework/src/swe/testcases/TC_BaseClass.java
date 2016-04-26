package swe.testcases;

import org.openqa.selenium.WebElement;

import swe.utility.PrintMessages;

public abstract class TC_BaseClass {
	
	public static String strSH_SeldLoc;
	public static String strSH_SeledLoc;
	public static String strSH_SeledHot;
	public static String strSH_SeledRoomTpe;
	public static String strSH_SeledRoomNum; 
	public static String strSH_EntdChkInDt;
	public static String strSH_EntChkOutDt;
	public static String strSH_SeledAdultRm;
	public static String strSH_SeledChildRm;
		
	public static String strSelHot_ArrDate;
	public static String strSelHot_HotName;
	public static String strSelHot_Loc;
	public static String strSelHot_Rooms;
	public static String strSelHot_DepDate;
	public static String strSelHot_NoDays;
	public static String strSelHot_RoomType;
	public static String strSelHot_PrcNigh;
	public static String strSelHot_TotPrc;
	
	public static String strBkHot_HotName;
	public static String strBkHot_Loc;
	public static String strBkHot_RmType;
	public static String strBkHot_NoRm;
	public static String strBkHot_TotDays;
	public static String strBkHot_PricePerNight;
	public static String strBkHot_GST;
	public static String strBkHot_FinalBill;
	public static String strBkHot_FName;
	public static String strBkHot_LName;
	public static String strBkHot_BillAdd;
		
	public static String strBkConf_HotName;
	public static String strBkConf_Loc;
	public static String strBkConf_RmType;
	public static String strBkConf_ArrDt;
	public static String strBkConf_DepDt;
	public static String strBkConf_TotRm;
	public static String strBkConf_PrcPRm;
	public static String strBkConf_TotPc;
	public static String strBkConf_GST;
	public static String strBkConf_FinBill;
	public static String strBkConf_FName;
	public static String strBkConf_LName;
	public static String strBkConf_BillAdd;
	public static String strBkConf_OrderNo;
	
	public static String strMyIt_OrderID;
	public static String strMyIt_HotName;
	public static String strMyIt_Location;
	public static String strMyIt_NoOfRooms;
	public static String strMyIt_FName;
	public static String strMyIt_LName;
	public static String strMyIt_ArrDt;
	public static String strMyIt_DepDt;
	public static String strMyIt_NoOfDays;
	public static String strMyIt_RmType;
	public static String strMyIt_PrPNgt;
	public static String strMyIt_FinBillPr;
	
	public abstract void verifyTitle();
	
	public void compareActToExpected(String strExtraMsg, String strActMsg, String strExpMsg){
		PrintMessages.printMsg("The Expected Result is: "+strExpMsg);
		if (strActMsg.equals(strExpMsg))
			PrintMessages.printMsg("The Actual Result " +strExtraMsg +" : " + strActMsg +" - Test Case Passed!!");
		else
			PrintMessages.printMsg("The Actual Result " + strExtraMsg+" : " + strActMsg +" - Test Case Failed!!");
	}
	
	
	public void fieldIsDisabled(WebElement element,String strWhichText){
		if (element.isEnabled())
			 PrintMessages.printMsg(strWhichText+" is Enabled. The Test Case Failed!");
		 else 
			 PrintMessages.printMsg(strWhichText+" is Disabled. The Test Case Passed!");
	}
	
	
}
