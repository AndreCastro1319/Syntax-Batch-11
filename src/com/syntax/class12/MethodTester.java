package com.syntax.class12;

import java.lang.reflect.Method;

public class MethodTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Line before method call ");
		Methods methods = new Methods();
		methods.times=3;
		//methods.sayHello();
		//methods.sayHelloManyTimes();
		//methods.sayHelloManyTimesWithState();
		methods.sayHelloManyTimesWithParameter(15);
		System.out.println("Line after method call");
		methods.sayHello();
	}

}
