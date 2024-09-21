package org.javapractice;

public  class ParentAbstract extends ChildAbstract {

	@Override
	public void m1() {
		System.out.println("abstract01");
		
	}

	@Override
	public void m3() {
		System.out.println("abstract03");
		
	}
	public static void main(String[] args) {
		ParentAbstract p = new ParentAbstract();
		p.m1();
		p.m2();
		p.m3();
	}
	
	

}
