package org.javapractice;

public class OverRideParent extends OverRideChild{
	public void m1() {
		System.out.println("80%");
		
		
	}
     public void m2() {
    	 System.out.println("90%");
		
	}
     public static void main(String[] args) {
    	 OverRideParent p =new OverRideParent();
    	 p.m1();
    	 p.m2();
	}

}
