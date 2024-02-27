package com.neotech.com28;

import java.util.ArrayList;
import java.util.Iterator;

public class AaryLst_Hw02 {

	/**
	 * Create an arrayList of even numbers from 1 to 50. Using Iterator remove any
	 * number that is divisible by 5 from that arrayList. 
	 **/
	public static void main(String[] args) {

	
	ArrayList <Integer> evenNum = new ArrayList<Integer>();
	 for (int i = 0 ; i <= 50 ; i++) {
		 if ( i % 2 == 0) {
			evenNum .add(i);
		 }
		 
	 }System.out.println(evenNum); 
	
	Iterator<Integer> iterator = evenNum.iterator();
	 while (iterator.hasNext()) {
		 if(iterator.next()%5 == 0) {
			 iterator.remove();
			 
		 }
		 
	 }System.out.println(evenNum);
	
	
	
	
	
	}

}
