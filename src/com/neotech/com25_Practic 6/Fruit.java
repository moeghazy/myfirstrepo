package com.neotech.com25_Practic;

public class Fruit {


  public void tasty () {
	  
	  System.out.println("all fruits are tasty");
  }

}
class orange extends Fruit implements Peelable , Washable {

	public void sizes() {
		System.out.println("ALL ORANGES HAVE DEF  SIZES ");
	}
	
	
	public void tasty () {
		System.out.println("all ORANGES are tasty");
	}
	
	
	
	@Override
	public void wash() {
		// TODO Auto-generated method stub
		System.out.println("ALL ORANGES ARE WASHABLE");
		
	}

	@Override
	public void peel() {
		// TODO Auto-generated method stub
		System.out.println("ALL ORANGES ARE PEELABLE");
		
	}
	
}



