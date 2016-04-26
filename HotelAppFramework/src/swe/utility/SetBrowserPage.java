package swe.utility;

public class SetBrowserPage extends SetWebDriverClass{
  
	public void setBrowser(String url){
			driver.get(url);
	}
	
	public void closeBrowser(){
		driver.quit();
	}
	
}
