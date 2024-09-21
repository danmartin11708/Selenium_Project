package org.javapractice;

public class OverLoad {
	
		
		 public void m1(int a) {
			
		}
		
		 public void m1(int a , String name) {
				
			}
		 public void m(int a , String name,float salary) {
				
			}
		 public static void main(String[] args) {
			 OverLoad or = new OverLoad();
			 or.m1(3);
			 or.m1(3, "daniel");
			 or.m(2, "tianan", 32.9087f);
			 
}
		
		
		
	}


