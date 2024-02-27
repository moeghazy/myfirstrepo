package com.neotech.com25_Practic;

public class Apple extends Fruit implements Peelable , Washable {

    public void tasty () {
    	System.out.println("all apples are very delicious");
    }
	
	
	public void color () {
    	System.out.println("all apple have diferent color ");
    }

	@Override
	public void peel() {
		// TODO Auto-generated method stub
		System.out.println("all apples are peelables ");
	}

	@Override
	public void wash() {
		// TODO Auto-generated method stub
		System.out.println("all apples are washables ");
	}






}
