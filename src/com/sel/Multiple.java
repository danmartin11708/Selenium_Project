package com.sel;

import org.openqa.selenium.grid.Main;

public class Multiple extends Parent{

	static {
		System.out.println("static1");
		}
	
	
	{
		System.out.println("Instance1");
		
	}
	
	Multiple(){
		System.out.println("Constructor1");
		
		}
	private void m1() {
		System.out.println("Method01");
		
	
}
	public static void main(String[] args) {
		Multiple mul = new Multiple();
		mul.m1();
	}
}
	
	class Parent{
		static {
			System.out.println("static2");
			}
		
		
		{
			System.out.println("Instance2");
			
		}
		
		Parent(){
			System.out.println("Constructor2");
			
		
	}
		
		
	}

