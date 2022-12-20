// Create a Mobile Security Pattern Using Method Overloading
package com.polymorphism.overloading;

public class MobilePattern {
	
	// Create a method 01
	
	public void security(int pinNumber, String character) {
		System.out.println("User Pin-Number :" + pinNumber);
		System.out.println("User Character-Pin :" + character);
	}
	
	// Create a method 2
	
	public void security(int pinNumber, String character, String thumb, String faceUnlock) {
		System.out.println("User Pin-Number :" + pinNumber);
		System.out.println("User Character-Pin :" + character);
		System.out.println("User thumb :" + thumb);
		System.out.println("User faceUnlock :" + faceUnlock);
	}
	

	public static void main(String[] args) {
		
		// Create an Object
		MobilePattern pattern = new MobilePattern();
		// Call Method 01 By object
		pattern.security(246800, "HuzefaSiddiqui");
		// Call Method 02 By object
		pattern.security(246800, "HuzefaSiddiqui", "Add Your Finger", "Add Your Face");

	}

}
