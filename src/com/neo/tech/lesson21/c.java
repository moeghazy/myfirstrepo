
/*Write program for multilevel inheritance where class A is inherited by B
and class B is inherited by class c
*/

package com.neo.tech.lesson21;

class c {
	void behavior_1() {
		System.out.println("this class C  is the mother of class A and B ");

	}
}

class B extends c {
	void behavior_2() {
		System.out.println(" this class B inherites from class C ");
	}
}

class A extends B {
	void behavior_3() {
		System.out.println(" this class A inherites from class B and C ");

	}

}
