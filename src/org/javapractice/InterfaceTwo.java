package org.javapractice;

public class InterfaceTwo implements InterfaceOne{

	@Override
	public void m1() {
		System.out.println("10");	
	}

	@Override
	public void m2() {
		System.out.println("20");	
		
	}

	@Override
	public void m3() {
		System.out.println("30");	
		
	}
	public static void main(String[] args) {
		InterfaceTwo o = new InterfaceTwo();
		o.m1();
		o.m2();
		o.m3();
	}
	

	
}
