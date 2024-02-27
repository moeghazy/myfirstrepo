package com.neotech.com25;

public class webAnd_Camera_Test {

	public static void main(String[] args) {
	
	
		Webdriver chrome = new ChromeDriver (); 
		Camera  chrome2 = new ChromeDriver ();
	    chrome.openBrowser();
	    chrome.closeBrowser();
	    chrome.maximizeWindow();
	    chrome.findElement();
	    chrome2.takePicture();
System.out.println("//////////////////////////////"); 
  
       Webdriver fox = new  FirefoxDriver ();
	   Camera    fox2 = new FirefoxDriver ();
	
	   fox.openBrowser();
	   fox.closeBrowser();
	   fox.findElement();
	   fox.maximizeWindow();
	   fox2.takePicture();
	
System.out.println("//////////////////////////////"); 
	
 Webdriver [] ary = { chrome , fox};
	
	for ( Webdriver brws : ary ) {
		brws.openBrowser();
		brws.findElement();
		brws.closeBrowser();
		brws.maximizeWindow();
		
	}
	
	 Camera [] camera = {chrome2 , fox2};
	 
	 for ( Camera pic: camera ) {
		 
		 pic.takePicture();		 
	    
	 }
	
	
	
	
	
	
	
	
	
	
	}

}
