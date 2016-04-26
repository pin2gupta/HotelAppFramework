package swe.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

    public class MyItinerary_Page {
	public static WebElement chkBx_MyIteineraryByXpath(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/input"));
	}
	
	public static WebElement lnk_BookedItinById(WebDriver driver){
		return driver.findElement(By.linkText("Booked Itinerary"));
	}
	
	public static WebElement getAll_MyIteineraryByXpath(WebDriver driver, int iRowtoDel){
			List<WebElement> rows_table = driver.findElements(By.xpath("//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr"));
			WebElement element = null;
			
			int iRowSize = rows_table.size();
			if (iRowtoDel <= iRowSize)
				element = driver.findElement(By.xpath("//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr["+iRowtoDel+"]/td[1]/input"));
			return element;
	}
	
	public static WebElement butt_CancelButtonByXpath(WebDriver driver, int iRowtoDel){
		List<WebElement> rows_table = driver.findElements(By.xpath("//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr"));
		WebElement element = null;
		
		int iRowSize = rows_table.size();
		
		if (iRowtoDel <= iRowSize){
			String strXPATH = "//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr["+iRowtoDel+"]/td[3]/input";
			element = driver.findElement(By.xpath(strXPATH));
			System.out.println("Ticket Number:"+ driver.findElement(By.xpath(strXPATH)).getText());
		}
		return element;
	}
	
	public static WebElement txt_OrderIDByxPath(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));
	}
	
	public static WebElement getLastRowElementByXpath(WebDriver driver, int colNum){
		List<WebElement> rows_table = driver.findElements(By.xpath("//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr"));
		WebElement element = null;
		
		int iRowSize = rows_table.size();
		element = driver.findElement(By.xpath("//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr["+iRowSize+"]/td["+colNum+"]/input"));
	
		return element;
	}
	
	public static WebElement getRowByOrderIdByXpath(WebDriver driver, String strOrdId,int colNum){
		List<WebElement> rows_table = driver.findElements(By.xpath("//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr"));
		WebElement element = null;
		
		int iRowSize = rows_table.size();
		if (iRowSize <=0)
			return null;
		
		String strXPATH;
		String strBrowOrdId;
				
		for(int i=2;i<=iRowSize;i++){
			strXPATH = "//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr["+i+"]/td[2]/input";
			strBrowOrdId = driver.findElement(By.xpath(strXPATH)).getAttribute("value");
			if (strBrowOrdId.equals(strOrdId)){
				element = driver.findElement(By.xpath("//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr["+iRowSize+"]/td["+colNum+"]/input"));
				return element;
			}
		}
		return null;
	}
	
	public static WebElement butt_CancelByXpath(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[3]/input"));
	}
	
	public static WebElement txt_HotelNameByXpath(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[4]/input"));
	}
	
	public static WebElement txt_LocationByXpath(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[5]/input"));
	}
	
	public static WebElement txt_FirstNameByXpath(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[6]/input"));
	}
	
	public static WebElement txt_LastNameByXpath(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[8]/input"));
	}
	
	public static WebElement txt_ArrDateByXpath(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[9]/input"));
	}
	public static WebElement txt_DepDateByXpath(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[10]/input"));
	}
	
	public static WebElement txt_NumofDateByXpath(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[11]/input"));
	}
	public static WebElement txt_RoomTypeByXpath(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[12]/input"));
	}
	public static WebElement txt_PriceNightByXpath(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[13]/input"));
	}
	public static WebElement txt_TotalPriceByXpath(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[14]/input"));
	}
	
	public static WebElement txt_RoomNumByXpath(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[7]/input"));
	}
	
	public static WebElement but_CancelSelectedByName(WebDriver driver){
		return driver.findElement(By.name("cancelall"));
	}
	
	public static WebElement but_SearchHotelByid(WebDriver driver){
		return driver.findElement(By.name("search_hotel"));
	}
	
	public static WebElement but_LogoutByid(WebDriver driver){
		return driver.findElement(By.name("logout"));
	}
	
	public static String lbl_CancelConfirmByid(WebDriver driver){
		return driver.findElement(By.id("search_result_error")).getText();
	}
	
	public static WebElement txt_SearchOrdById(WebDriver driver){
		return driver.findElement(By.id("order_id_text"));
	}
	
	public static WebElement but_GoById(WebDriver driver){
		return driver.findElement(By.id("search_hotel_id"));
	}
	
	public static WebElement lnk_ShowAllById(WebDriver driver){
		return driver.findElement(By.id("Show all"));
	}
	
}
