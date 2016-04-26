package swe.pageobjects;

import org.openqa.selenium.WebDriver;

import swe.utility.PrintMessages;

public class Page_BaseClass {
	static String strBrowTitle;
	
	public static String txt_PagetTitleById(WebDriver driver){
		strBrowTitle = driver.getTitle();
		PrintMessages.printMsg("The Actual Browser Title is: "+strBrowTitle);
		return strBrowTitle;
	}
	
	public static void compare_Title(String strTitle){
		PrintMessages.printMsg("The Expected Browser Title is:"+strTitle);
		if (strTitle.equals(strBrowTitle))
			PrintMessages.printMsg("The Titile is displayed correctly - Test Case Passed!!!");
		else
			PrintMessages.printMsg("The Titile is displayed incorrectly - Test Case Failed!!!");
		PrintMessages.printMsgEmptyLn(1);
	}
}


