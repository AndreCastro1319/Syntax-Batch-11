package com.syntax.class13;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Jimmy";
		System.out.println(name.isEmpty());
		name= "";
		System.out.println(name.isEmpty());
	
		
		
		String str="           Batch 11 is ...  ";
		System.out.println(str.trim());
		
		String str2="This is a easy class";
		System.out.println(str2.toLowerCase().startsWith("t"));
		System.out.println(str2.startsWith("T"));
		System.out.println(str2.startsWith("This"));
		System.out.println(str2.startsWith("L"));
		System.out.println(str2.endsWith("s"));
		
		
		
	}
}
