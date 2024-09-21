package org.javapractice;

import java.util.Iterator;

public class Strin {
	public static void main(String[] args) {
		java.lang.String s ="Daniel Joseph";
		
		int length = s.length();
		System.out.println(length);
		
		boolean startsWith = s.startsWith("Daniel");
	    System.out.println(startsWith);
	    
	    boolean endsWith = s.endsWith("joseph");
	    System.out.println(endsWith);
	    
	    String upperCase = s.toUpperCase();
	    System.out.println(upperCase);
	    
	    String lowerCase = s.toLowerCase();
	    System.err.println(lowerCase);
	    
	    int indexOf = s.indexOf("a");
	    System.err.println(indexOf);
	    
	    int lastIndexOf = s.lastIndexOf("e");
	    System.err.println(lastIndexOf);
	    
	    char charAt = s.charAt(3);
	    System.out.println(charAt);
	    
	    boolean empty = s.isEmpty();
	    System.out.println(empty);
	    
	    boolean contains = s.contains("a");
	    System.out.println(contains);
	    
	    String replace = s.replace("Joseph", "Martin");
	    System.out.println(replace);
	    
	    String substring = s.substring(7);
	    System.out.println(substring);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

}
}