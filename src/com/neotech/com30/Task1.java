package com.neotech.com30;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Task1 {

public static void main(String[] args) {
	
	Map< String , Integer > inventory = new LinkedHashMap<>();	
	
	inventory.put("BMW" ,1);
	inventory.put("TESLA" , 3);
	inventory.put("ASTON MARTIN" ,2);
	inventory.put(" MASERATI" , 5);
	inventory.put("BUGHAT", 6);
	inventory.put(" LAMBORGHINI" ,7);
	// HOW MANY ENTERS WE HAVE
	System.out.println("The Inventory Count Is ----------------------------> " + inventory .size() + "\n");
	System.out.println(inventory + "    ");
	
	inventory.put("Audi", 3);
	System.out.println("The Inventory After The AUDI was Aded is ----> " + inventory + "\n");
	
    System.out.println("The Dealer Just REPLACED  New AUDI And The Inventory Now Is ------> " + inventory + " \n" );
	inventory.replace("Audi", 2);
	
	inventory.remove("TESLA");
	System.out.println(" The Number Of BUGHATI Is   ----------> " + inventory .get("BUGHAT"));
  
	System.out.println("The Inventory After Tesla was sold is ----> " + inventory);

    Set <String> set = inventory.keySet();

     for (String key : set) {
    	 System.out.print(key + " -*-");
    	 
     }




}


}
