package com.syntax.class13;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="This class is easy";
		System.out.println(name.contains("class"));
		System.out.println(name.contains("lemon"));
		System.out.println(name.contains("i"));
		
		System.out.println("- - - - - - - - - - - - - - - - - - - - -");
		
		String str2="Hello";
		String str3="helhyjhuylo";
		System.out.println(str2.equals(str3));
		System.out.println(str2.equalsIgnoreCase(str3));
		
		System.out.println(str2.charAt(0));
		System.out.println(str3.indexOf('l',str3.indexOf('l')+1));
		
		System.out.println(name.substring(5));
		System.out.println(name.substring(5,11));
	}

}
