
/** Create a WebDriver Interface that will have the following unimplemented behaviour: 
	   openBrowser(), 
	   closeBrowser(), 
	   maximizeWindow(), 
	   findElement(). 
    Create another interface named Camera that will have the method:
	   takePicture();
   Create 2 classes that implements WebDriver and Camera interfaces: ChromeDriver and FirefoxDriver.
**/
package com.neotech.com25;

public interface Webdriver {
	void openBrowser();

	void closeBrowser();

	void maximizeWindow();

	void findElement();
}

interface Camera {

	public void takePicture();
}

class ChromeDriver implements Webdriver, Camera {

	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
		System.out.println("ChromeDriver can take a picture ");
	}

	@Override
	public void openBrowser() {
		// TODO Auto-generated method stub
		System.out.println("ChromeDriver is to open browsers ");
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		System.out.println("ChromeDriver can close browsers ");

	}

	@Override
	public void maximizeWindow() {
		// TODO Auto-generated method stub
		System.out.println("ChromeDriver can maximize Windows ");

	}

	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		System.out.println("ChromeDriver helps to find elements ");
	}

}
class  FirefoxDriver implements Webdriver, Camera {

	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
	       System.out.println(" FirefoxDriver can take a picture");
	}

	@Override
	public void openBrowser() {
		// TODO Auto-generated method stub
		 System.out.println(" FirefoxDriver can open Browsers ");
			}
	

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		 System.out.println(" FirefoxDriver can close Browsers ");
	}

	@Override
	public void maximizeWindow() {
		// TODO Auto-generated method stub
		 System.out.println(" FirefoxDriver can maximize Window  ");
	}

	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		System.out.println(" FirefoxDriver can  find Element ");
	}
	
	
	
	
	
	}



























