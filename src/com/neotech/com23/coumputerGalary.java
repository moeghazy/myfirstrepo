package com.neotech.com23;

public class coumputerGalary {

	public static void main(String[] args) {

		Computer dvs = new Computer();
		dvs.screen_Size();
		dvs.hard_Drive();
		dvs.memorySpeed();
		System.out.println("=========================");

		Apple_IMac Ap = new Apple_IMac();
		Ap.model_Name();
		Ap.hard_Drive();
		dvs.screen_Size();
		dvs.hard_Drive();
		dvs.memorySpeed();
		System.out.println("=========================");

		Computer UpCst = new Apple_IMac();
		UpCst.memorySpeed();
		UpCst.screen_Size();
       
		Computer UpCst2 = new lenovo();
		UpCst2.memorySpeed();
		UpCst2.hard_Drive();
		Computer UpCst3 = new Hp();
		Computer UpCst4 = new Dell();
		
		
		
		
		System.out.println("------------------------");
		
		Computer[] Aray = { UpCst, UpCst2, UpCst3, UpCst4 };

		for (int i = 0; i < Aray.length ; i++) {
			Computer aray = Aray[i];
			aray.memorySpeed();
			aray.screen_Size();
			aray.hard_Drive();
		   
		
		}

	}

}

