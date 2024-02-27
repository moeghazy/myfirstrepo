package com.neotech.review08_Polymorphism;
class human {


 void  talk() {
	System.out.println("all human can talk ");
}


}
class egyptian extends human {
	
   @Override
	public void  talk() {
		System.out.println("all egyptians  can talk Bs ");
	}
	
	public void working () {
		System.out.println("all egyptians  can  work ");
	}
}	
class American extends human {
	
	public void payTax () {
		
	}
	public void  talk() {
		System.out.println("all  American  can talk Bs ");
	}
  


	
	
	
	


}

























